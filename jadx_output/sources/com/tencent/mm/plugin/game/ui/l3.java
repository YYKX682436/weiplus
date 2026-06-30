package com.tencent.mm.plugin.game.ui;

/* loaded from: classes3.dex */
public class l3 extends android.widget.PopupWindow {
    public l3(android.content.Context context) {
        super(context);
        setWindowLayoutMode(-1, -2);
        setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable());
        setFocusable(true);
        setOutsideTouchable(true);
        setTouchInterceptor(new com.tencent.mm.plugin.game.ui.k3(this));
        setAnimationStyle(com.tencent.mm.R.anim.f477805bz);
    }
}
