package sc2;

/* loaded from: classes2.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.j0 f405813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f405814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.v6 f405815f;

    public c7(androidx.lifecycle.j0 j0Var, com.tencent.mm.ui.MMActivity mMActivity, sc2.v6 v6Var) {
        this.f405813d = j0Var;
        this.f405814e = mMActivity;
        this.f405815f = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pm0.v.y(this.f405813d, this.f405814e, this.f405815f);
    }
}
