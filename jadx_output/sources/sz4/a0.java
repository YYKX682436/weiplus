package sz4;

/* loaded from: classes12.dex */
public class a0 extends sz4.u {

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f414184y;

    public a0(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f414234i.setVisibility(8);
        this.f414231f.setVisibility(8);
        this.f414239q.setVisibility(8);
        this.f414234i.setOnClickListener(null);
        this.f414240r.setOnClickListener(new sz4.z(this));
    }

    @Override // sz4.a
    public int i() {
        return -1;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        super.j(cVar, i17, i18);
        if (cVar.d() != -1) {
            return;
        }
        android.widget.LinearLayout linearLayout = this.f414241s;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        linearLayout.setLayoutParams(layoutParams);
        this.f414240r.setVisibility(0);
        this.f414184y = this.itemView.findViewById(com.tencent.mm.R.id.f486162kf0);
    }
}
