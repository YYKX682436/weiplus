package sz4;

/* loaded from: classes12.dex */
public class g0 extends sz4.u {
    public g0(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f414234i.setVisibility(0);
        this.f414231f.setVisibility(8);
        this.f414239q.setVisibility(8);
        this.f414234i.setTag(this);
        this.f414234i.setOnClickListener(this.f414244v);
    }

    @Override // sz4.a
    public int i() {
        return 0;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        this.f414237o.setImageResource(com.tencent.mm.R.raw.msg_state_fail_resend);
        iz4.j jVar = (iz4.j) cVar;
        this.f414235m.setText(jVar.f296128t);
        this.f414236n.setText(jVar.f296129u);
        super.j(cVar, i17, i18);
    }
}
