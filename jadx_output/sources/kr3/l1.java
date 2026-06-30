package kr3;

/* loaded from: classes11.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f311408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f311409e;

    public l1(kr3.q1 q1Var, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f311408d = q1Var;
        this.f311409e = mMActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f311408d.V6()) {
            this.f311409e.finish();
        }
    }
}
