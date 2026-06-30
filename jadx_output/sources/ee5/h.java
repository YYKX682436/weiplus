package ee5;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.j f251893d;

    public h(ee5.j jVar) {
        this.f251893d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        de5.a.f229396a.g(104);
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        ee5.j jVar = this.f251893d;
        java.lang.String string = jVar.getActivity().getString(com.tencent.mm.R.string.gbc, com.tencent.mm.sdk.platformtools.m2.d(), obj, "setting", 0, 0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        c71.b.c(jVar.getActivity(), string, 0, true);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
