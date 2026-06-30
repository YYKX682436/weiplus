package xt2;

/* loaded from: classes3.dex */
public final class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f456952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.r4 f456953e;

    public p4(xt2.b5 b5Var, xt2.r4 r4Var) {
        this.f456952d = b5Var;
        this.f456953e = r4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f456952d.f456638m;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setSwitchListener(this.f456953e);
        } else {
            kotlin.jvm.internal.o.o("productReplaySwitchBtn");
            throw null;
        }
    }
}
