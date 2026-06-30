package kr3;

/* loaded from: classes11.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f311406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f311407e;

    public l0(kr3.q0 q0Var, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f311406d = q0Var;
        this.f311407e = mMActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f311406d.V6()) {
            this.f311407e.finish();
        }
    }
}
