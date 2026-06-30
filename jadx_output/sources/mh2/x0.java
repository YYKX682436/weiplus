package mh2;

/* loaded from: classes10.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(mh2.f1 f1Var) {
        super(0);
        this.f326489d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mh2.f1 f1Var = this.f326489d;
        f1Var.f326342q = false;
        f1Var.f326341p = 0;
        f1Var.A = 0;
        f1Var.B = false;
        com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView ktvRenderLayoutView = (com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView) f1Var.f326331f;
        ktvRenderLayoutView.f111680o = 0;
        ktvRenderLayoutView.f111678m = -1L;
        ktvRenderLayoutView.f111679n = -1;
        ktvRenderLayoutView.f111677i = true;
        ktvRenderLayoutView.G = false;
        ktvRenderLayoutView.f111675g.b();
        oh2.r rVar = ktvRenderLayoutView.f111676h;
        rVar.f345421l = 0;
        rVar.f345411b.clear();
        ktvRenderLayoutView.f111683r.setVisibility(8);
        ktvRenderLayoutView.f111682q.setVisibility(8);
        f1Var.f326347v = 0;
        com.tencent.mm.view.MMPAGView mMPAGView = f1Var.f326334i;
        mMPAGView.n();
        mMPAGView.setVisibility(4);
        android.widget.TextView textView = f1Var.f326335j;
        textView.setText("");
        textView.setVisibility(8);
        return jz5.f0.f302826a;
    }
}
