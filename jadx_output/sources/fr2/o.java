package fr2;

/* loaded from: classes2.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.p f265735d;

    public o(fr2.p pVar) {
        this.f265735d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC$showBottomBar$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fr2.p pVar = this.f265735d;
        fr2.p.P6(pVar, 2);
        dk2.of ofVar = pVar.f265739g;
        boolean z17 = false;
        if (ofVar != null && ofVar.f233868h == 2) {
            z17 = true;
        }
        if (z17) {
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            ml2.y3 y3Var = ml2.y3.f328277o;
            y4Var.getClass();
            y4Var.f328291c0 = y3Var;
        }
        pVar.getClass();
        pf5.e.launchUI$default(pVar, null, null, new fr2.f(pVar, null), 3, null);
        android.app.Activity context = pVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.plugin.finder.assist.a4.f102002a.b(java.lang.String.valueOf(V6.getInteger(5)), V6.getString(1), "chatroom_page_start_live", "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC$showBottomBar$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
