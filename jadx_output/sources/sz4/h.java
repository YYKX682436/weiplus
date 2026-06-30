package sz4;

/* loaded from: classes12.dex */
public class h extends sz4.u {
    public h(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f414234i.setVisibility(0);
        this.f414231f.setVisibility(8);
        this.f414239q.setVisibility(8);
        this.f414234i.setTag(this);
        this.f414234i.setOnClickListener(this.f414244v);
    }

    @Override // sz4.a
    public int i() {
        return 5;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        iz4.d dVar = (iz4.d) cVar;
        java.lang.String str = dVar.f296158v;
        kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
        this.f414237o.setImageResource(o25.y.a(str));
        this.f414235m.setText(dVar.f296156t);
        this.f414236n.setText(dVar.f296157u);
        super.j(cVar, i17, i18);
    }

    @Override // sz4.u
    public android.view.View k() {
        return this.f414237o;
    }
}
