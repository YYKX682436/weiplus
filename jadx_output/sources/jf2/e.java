package jf2;

/* loaded from: classes3.dex */
public final class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f299365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jf2.g f299366e;

    public e(android.content.Context context, jf2.g gVar) {
        this.f299365d = context;
        this.f299366e = gVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f299366e.f299371J.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        jf2.a holder = (jf2.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        jf2.g gVar = this.f299366e;
        jf2.o oVar = (jf2.o) kz5.n0.a0(gVar.f299371J, i17);
        android.view.View view = holder.f299351d;
        if (oVar != null) {
            jf2.l lVar = oVar instanceof jf2.l ? (jf2.l) oVar : null;
            if (lVar != null) {
                holder.f299352e.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), ((java.lang.Number) lVar.d().f302833d).intValue(), ((java.lang.Number) ((jz5.n) gVar.K).getValue()).intValue()));
                holder.f299353f.setText(view.getContext().getString(((java.lang.Number) lVar.d().f302834e).intValue()));
            }
        }
        if (oVar != null) {
            jf2.m mVar = oVar instanceof jf2.m ? (jf2.m) oVar : null;
            if (mVar != null) {
                view.setOnClickListener(new jf2.c(mVar, i17, gVar));
            }
        }
        if (oVar != null) {
            jf2.n nVar = oVar instanceof jf2.n ? (jf2.n) oVar : null;
            if (nVar != null) {
                view.setOnTouchListener(new jf2.d(nVar));
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f299365d).inflate(com.tencent.mm.R.layout.dr9, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new jf2.a(inflate);
    }
}
