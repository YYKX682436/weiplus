package lt3;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hi0 f321256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.de f321257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f321259g;

    public m(r45.hi0 hi0Var, r45.de deVar, android.content.Context context, android.view.ViewGroup viewGroup) {
        this.f321256d = hi0Var;
        this.f321257e = deVar;
        this.f321258f = context;
        this.f321259g = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.hi0 hi0Var = this.f321256d;
        long j17 = hi0Var.f376182f - hi0Var.f376181e;
        r45.de it = this.f321257e;
        kotlin.jvm.internal.o.f(it, "$it");
        zu3.t tVar = new zu3.t(it);
        tVar.i(j17);
        lt3.n nVar = lt3.n.f321260a;
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the position item view");
        zu3.v vVar = new zu3.v(this.f321258f);
        this.f321259g.addView(vVar, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        vVar.R = tVar;
        vVar.setViewMatrix(tVar.f475763f);
        vVar.q(tVar.f475830g);
        vVar.c();
        vVar.I = zu3.e.f475800i;
    }
}
