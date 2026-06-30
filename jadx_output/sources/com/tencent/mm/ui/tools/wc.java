package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class wc implements yz5.l {
    public wc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((android.view.MotionEvent) obj).getPointerCount() > 1 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }
}
