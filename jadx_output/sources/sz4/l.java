package sz4;

/* loaded from: classes12.dex */
public class l extends sz4.u {
    public l(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f414234i.setVisibility(0);
        this.f414231f.setVisibility(8);
        this.f414239q.setVisibility(8);
        this.f414234i.setTag(this);
        this.f414234i.setOnClickListener(this.f414244v);
    }

    @Override // sz4.a
    public int i() {
        return 3;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        this.f414237o.setImageResource(com.tencent.mm.R.raw.app_attach_file_icon_location);
        iz4.g gVar = (iz4.g) cVar;
        this.f414235m.setText(gVar.f296148t);
        this.f414236n.setText(gVar.f296152x);
        super.j(cVar, i17, i18);
    }

    @Override // sz4.u
    public android.view.View k() {
        return this.f414237o;
    }
}
