package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class KeyboardManager implements io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate, io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler {
    private static final java.lang.String TAG = "KeyboardManager";
    private final java.util.HashSet<android.view.KeyEvent> redispatchedEvents = new java.util.HashSet<>();
    protected final io.flutter.embedding.android.KeyboardManager.Responder[] responders;
    private io.flutter.embedding.android.KeyboardManager.ViewDelegate viewDelegate;

    /* loaded from: classes15.dex */
    public static class CharacterCombiner {
        private int combiningCharacter = 0;

        public java.lang.Character applyCombiningCharacterToBaseCharacter(int i17) {
            char c17 = (char) i17;
            if ((Integer.MIN_VALUE & i17) != 0) {
                int i18 = i17 & Integer.MAX_VALUE;
                int i19 = this.combiningCharacter;
                if (i19 != 0) {
                    this.combiningCharacter = android.view.KeyCharacterMap.getDeadChar(i19, i18);
                } else {
                    this.combiningCharacter = i18;
                }
            } else {
                int i27 = this.combiningCharacter;
                if (i27 != 0) {
                    int deadChar = android.view.KeyCharacterMap.getDeadChar(i27, i17);
                    if (deadChar > 0) {
                        c17 = (char) deadChar;
                    }
                    this.combiningCharacter = 0;
                }
            }
            return java.lang.Character.valueOf(c17);
        }
    }

    /* loaded from: classes15.dex */
    public class PerEventCallbackBuilder {
        boolean isEventHandled = false;
        final android.view.KeyEvent keyEvent;
        int unrepliedCount;

        /* loaded from: classes15.dex */
        public class Callback implements io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback {
            boolean isCalled;

            private Callback() {
                this.isCalled = false;
            }

            @Override // io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback
            public void onKeyEventHandled(boolean z17) {
                if (this.isCalled) {
                    throw new java.lang.IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.isCalled = true;
                io.flutter.embedding.android.KeyboardManager.PerEventCallbackBuilder perEventCallbackBuilder = io.flutter.embedding.android.KeyboardManager.PerEventCallbackBuilder.this;
                int i17 = perEventCallbackBuilder.unrepliedCount - 1;
                perEventCallbackBuilder.unrepliedCount = i17;
                boolean z18 = z17 | perEventCallbackBuilder.isEventHandled;
                perEventCallbackBuilder.isEventHandled = z18;
                if (i17 != 0 || z18) {
                    return;
                }
                io.flutter.embedding.android.KeyboardManager.this.onUnhandled(perEventCallbackBuilder.keyEvent);
            }
        }

        public PerEventCallbackBuilder(android.view.KeyEvent keyEvent) {
            this.unrepliedCount = io.flutter.embedding.android.KeyboardManager.this.responders.length;
            this.keyEvent = keyEvent;
        }

        public io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback buildCallback() {
            return new io.flutter.embedding.android.KeyboardManager.PerEventCallbackBuilder.Callback();
        }
    }

    /* loaded from: classes15.dex */
    public interface Responder {

        /* loaded from: classes15.dex */
        public interface OnKeyEventHandledCallback {
            void onKeyEventHandled(boolean z17);
        }

        void handleEvent(android.view.KeyEvent keyEvent, io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback);
    }

    /* loaded from: classes15.dex */
    public interface ViewDelegate {
        io.flutter.plugin.common.BinaryMessenger getBinaryMessenger();

        boolean onTextInputKeyEvent(android.view.KeyEvent keyEvent);

        void redispatch(android.view.KeyEvent keyEvent);
    }

    public KeyboardManager(io.flutter.embedding.android.KeyboardManager.ViewDelegate viewDelegate) {
        this.viewDelegate = viewDelegate;
        this.responders = new io.flutter.embedding.android.KeyboardManager.Responder[]{new io.flutter.embedding.android.KeyEmbedderResponder(viewDelegate.getBinaryMessenger()), new io.flutter.embedding.android.KeyChannelResponder(new io.flutter.embedding.engine.systemchannels.KeyEventChannel(viewDelegate.getBinaryMessenger()))};
        new io.flutter.embedding.engine.systemchannels.KeyboardChannel(viewDelegate.getBinaryMessenger()).setKeyboardMethodHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUnhandled(android.view.KeyEvent keyEvent) {
        io.flutter.embedding.android.KeyboardManager.ViewDelegate viewDelegate = this.viewDelegate;
        if (viewDelegate == null || viewDelegate.onTextInputKeyEvent(keyEvent)) {
            return;
        }
        this.redispatchedEvents.add(keyEvent);
        this.viewDelegate.redispatch(keyEvent);
        if (this.redispatchedEvents.remove(keyEvent)) {
            io.flutter.Log.w(TAG, "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    public void destroy() {
        io.flutter.Log.i(TAG, "destroy KeyboardManager");
        int size = this.redispatchedEvents.size();
        if (size > 0) {
            io.flutter.Log.w(TAG, "A KeyboardManager was destroyed with " + java.lang.String.valueOf(size) + " unhandled redispatch event(s).");
        }
        this.viewDelegate = null;
    }

    @Override // io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler
    public java.util.Map<java.lang.Long, java.lang.Long> getKeyboardState() {
        return ((io.flutter.embedding.android.KeyEmbedderResponder) this.responders[0]).getPressedState();
    }

    @Override // io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate
    public boolean handleEvent(android.view.KeyEvent keyEvent) {
        if (this.redispatchedEvents.remove(keyEvent)) {
            return false;
        }
        if (this.responders.length <= 0) {
            onUnhandled(keyEvent);
            return true;
        }
        io.flutter.embedding.android.KeyboardManager.PerEventCallbackBuilder perEventCallbackBuilder = new io.flutter.embedding.android.KeyboardManager.PerEventCallbackBuilder(keyEvent);
        for (io.flutter.embedding.android.KeyboardManager.Responder responder : this.responders) {
            responder.handleEvent(keyEvent, perEventCallbackBuilder.buildCallback());
        }
        return true;
    }
}
