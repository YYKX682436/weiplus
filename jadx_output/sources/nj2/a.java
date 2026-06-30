package nj2;

/* loaded from: classes3.dex */
public final class a implements pj2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nj2.b f337821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337822b;

    public a(nj2.b bVar, android.content.Context context) {
        this.f337821a = bVar;
        this.f337822b = context;
    }

    @Override // pj2.a
    public void a() {
        nj2.b bVar = this.f337821a;
        android.view.View view = bVar.f337828p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorInviteVisitorPanel$inviteWidget$1", "notifyLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorInviteVisitorPanel$inviteWidget$1", "notifyLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = bVar.f337827o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorInviteVisitorPanel$inviteWidget$1", "notifyLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorInviteVisitorPanel$inviteWidget$1", "notifyLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = bVar.f337825m;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorInviteVisitorPanel$inviteWidget$1", "notifyLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorInviteVisitorPanel$inviteWidget$1", "notifyLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String string = this.f337822b.getResources().getString(com.tencent.mm.R.string.hky);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        bVar.f118384g.d(string);
    }

    @Override // pj2.a
    public boolean b() {
        return this.f337821a.q();
    }

    @Override // pj2.a
    public void c(boolean z17, int i17, r45.il4 il4Var) {
        nj2.b bVar = this.f337821a;
        android.view.View view = bVar.f337827o;
        int i18 = i17 > 0 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorInviteVisitorPanel$inviteWidget$1", "notifyResponse", "(ZILcom/tencent/mm/protocal/protobuf/MicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorInviteVisitorPanel$inviteWidget$1", "notifyResponse", "(ZILcom/tencent/mm/protocal/protobuf/MicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = bVar.f337828p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorInviteVisitorPanel$inviteWidget$1", "notifyResponse", "(ZILcom/tencent/mm/protocal/protobuf/MicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorInviteVisitorPanel$inviteWidget$1", "notifyResponse", "(ZILcom/tencent/mm/protocal/protobuf/MicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            java.lang.String string = this.f337822b.getResources().getString(com.tencent.mm.R.string.lz9, java.lang.Integer.valueOf(i17));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            r45.il4 il4Var2 = il4Var == null ? ((mm2.o4) bVar.f337823h.a(mm2.o4.class)).U : il4Var;
            android.content.res.Resources resources = bVar.f118381d.getResources();
            kotlin.jvm.internal.o.g(il4Var2, "<this>");
            java.lang.String string2 = resources.getString(com.tencent.mm.R.string.fvz, ei2.f.a(il4Var2.f377129d));
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            bVar.x(string, string2);
        }
    }
}
