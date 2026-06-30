package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class kh extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.kh f209048d = new com.tencent.mm.ui.kh();

    public kh() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) it;
        java.lang.String string = mMSwitchBtn.getContext().getResources().getString(com.tencent.mm.R.string.hca);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = mMSwitchBtn.getContext().getResources().getString(com.tencent.mm.R.string.hc_);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return mMSwitchBtn.f211363x ? string : string2;
    }
}
