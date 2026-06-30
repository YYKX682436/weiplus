package ee5;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.j f251921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f251922e;

    public i(ee5.j jVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f251921d = jVar;
        this.f251922e = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        de5.a.f229396a.g(105);
        ee5.j jVar = this.f251921d;
        android.view.View inflate = com.tencent.mm.ui.id.b(jVar.getActivity()).inflate(com.tencent.mm.R.layout.bmb, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(jVar.getActivity(), 0, 0, false, false);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.czv)).setTextColor(jVar.getColor(com.tencent.mm.R.color.a0c));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cza)).setTextColor(jVar.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.cz7);
        weImageView.setIconColor(jVar.getColor(com.tencent.mm.R.color.FG_0));
        z2Var.j(inflate);
        z2Var.C();
        weImageView.setOnClickListener(new ee5.e(z2Var, jVar));
        this.f251922e.B();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
