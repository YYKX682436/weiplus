package sc2;

/* loaded from: classes2.dex */
public final class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f405840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f405841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.v6 f405842f;

    public d7(androidx.lifecycle.g0 g0Var, com.tencent.mm.ui.MMActivity mMActivity, sc2.v6 v6Var) {
        this.f405840d = g0Var;
        this.f405841e = mMActivity;
        this.f405842f = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pm0.v.y(this.f405840d, this.f405841e, this.f405842f);
    }
}
