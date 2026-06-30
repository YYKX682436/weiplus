package com.tencent.mm.plugin.game.ui;

/* loaded from: classes4.dex */
public class c7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f141087d = android.graphics.Color.argb(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, 136, 136, 136);

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/ViewChangeBgListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            boolean z17 = view instanceof android.widget.ImageView;
            int i17 = this.f141087d;
            if (z17) {
                android.widget.ImageView imageView = (android.widget.ImageView) view;
                android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    drawable.setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
                    imageView.setImageDrawable(drawable);
                }
            } else if (view.getBackground() != null) {
                view.getBackground().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
            }
        } else if (action == 1 || action == 3) {
            if (view instanceof android.widget.ImageView) {
                android.graphics.drawable.Drawable drawable2 = ((android.widget.ImageView) view).getDrawable();
                if (drawable2 != null) {
                    drawable2.clearColorFilter();
                }
            } else {
                android.graphics.drawable.Drawable background = view.getBackground();
                if (background != null) {
                    background.clearColorFilter();
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/game/ui/ViewChangeBgListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
