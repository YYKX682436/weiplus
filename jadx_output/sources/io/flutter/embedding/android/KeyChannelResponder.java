package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class KeyChannelResponder implements io.flutter.embedding.android.KeyboardManager.Responder {
    private static final java.lang.String TAG = "KeyChannelResponder";
    private final io.flutter.embedding.android.KeyboardManager.CharacterCombiner characterCombiner = new io.flutter.embedding.android.KeyboardManager.CharacterCombiner();
    private final io.flutter.embedding.engine.systemchannels.KeyEventChannel keyEventChannel;

    public KeyChannelResponder(io.flutter.embedding.engine.systemchannels.KeyEventChannel keyEventChannel) {
        this.keyEventChannel = keyEventChannel;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(android.view.KeyEvent keyEvent, final io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.keyEventChannel.sendFlutterKeyEvent(new io.flutter.embedding.engine.systemchannels.KeyEventChannel.FlutterKeyEvent(keyEvent, this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar())), action != 0, new io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler() { // from class: io.flutter.embedding.android.KeyChannelResponder$$a
                @Override // io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler
                public final void onFrameworkResponse(boolean z17) {
                    io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback.this.onKeyEventHandled(z17);
                }
            });
        } else {
            onKeyEventHandledCallback.onKeyEventHandled(false);
        }
    }
}
