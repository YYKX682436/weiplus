package mi5;

/* loaded from: classes9.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l15.c f326922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326923e;

    public u(l15.c cVar, android.content.Context context) {
        this.f326922d = cVar;
        this.f326923e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        y05.c cVar;
        y05.d j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingGameCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l15.c cVar2 = this.f326922d;
        z05.d p17 = cVar2.p();
        java.lang.String string = p17 != null ? p17.getString(p17.f368365d + 0) : null;
        boolean z17 = string == null || string.length() == 0;
        android.content.Context context = this.f326923e;
        if (z17) {
            v05.b k17 = cVar2.k();
            java.lang.String k18 = (k17 == null || (cVar = (y05.c) k17.getCustom(k17.f432315e + 40)) == null || (j17 = cVar.j()) == null) ? null : j17.k();
            if (!(k18 == null || k18.length() == 0)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", k18);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        } else {
            q80.d0 d0Var = new q80.d0();
            d0Var.f360649a = string;
            z05.d p18 = cVar2.p();
            d0Var.f360650b = p18 != null ? p18.n() : null;
            z05.d p19 = cVar2.p();
            d0Var.f360651c = p19 != null ? p19.o() : null;
            z05.d p27 = cVar2.p();
            d0Var.f360654f = p27 != null ? p27.l() : null;
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new mi5.t(d0Var, cVar2, context));
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingGameCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
