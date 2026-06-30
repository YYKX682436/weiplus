package io.flutter.plugin.editing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class ImeSyncDeferringInsetsCallback {
    private android.view.WindowInsets lastWindowInsets;
    private android.view.View view;
    private final int deferredInsetTypes = android.view.WindowInsets.Type.ime();
    private boolean animating = false;
    private boolean needsSave = false;
    private io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.AnimationCallback animationCallback = new io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.AnimationCallback();
    private io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.InsetsListener insetsListener = new io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.InsetsListener();

    /* loaded from: classes14.dex */
    public class AnimationCallback extends android.view.WindowInsetsAnimation.Callback {
        public AnimationCallback() {
            super(1);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            if (!io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating || (windowInsetsAnimation.getTypeMask() & io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) == 0) {
                return;
            }
            io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating = false;
            if (io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.lastWindowInsets == null || io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view == null) {
                return;
            }
            io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.needsSave = true;
            if ((windowInsetsAnimation.getTypeMask() & io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List<android.view.WindowInsetsAnimation> list) {
            if (io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating && !io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.needsSave) {
                java.util.Iterator<android.view.WindowInsetsAnimation> it = list.iterator();
                boolean z17 = false;
                while (it.hasNext()) {
                    if ((it.next().getTypeMask() & io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                int i17 = ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) ? windowInsets.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom : 0;
                android.view.WindowInsets.Builder builder = new android.view.WindowInsets.Builder(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                builder.setInsets(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, android.graphics.Insets.of(0, 0, 0, java.lang.Math.max(windowInsets.getInsets(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes).bottom - i17, 0)));
                io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(builder.build());
            }
            return windowInsets;
        }
    }

    /* loaded from: classes14.dex */
    public class InsetsListener implements android.view.View.OnApplyWindowInsetsListener {
        private InsetsListener() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
            io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view = view;
            if (io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.needsSave) {
                io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            return io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating ? android.view.WindowInsets.CONSUMED : view.onApplyWindowInsets(windowInsets);
        }
    }

    public ImeSyncDeferringInsetsCallback(android.view.View view) {
        this.view = view;
    }

    public android.view.WindowInsetsAnimation.Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public android.view.View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }
}
