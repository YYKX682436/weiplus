package yr3;

/* loaded from: classes11.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr3.i f464995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f464996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f464997f;

    public r(wr3.i iVar, r45.s5 s5Var, yz5.l lVar) {
        this.f464995d = iVar;
        this.f464996e = s5Var;
        this.f464997f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList linkedList;
        r45.o5 o5Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initFeaturedBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f464995d.f448816f = true;
        yr3.o0[] o0VarArr = yr3.o0.f464965d;
        r45.s5 s5Var = this.f464996e;
        s5Var.f385516n = 2;
        r45.p5 p5Var = s5Var.f385514i;
        java.lang.String str = (p5Var == null || (linkedList = p5Var.f382754e) == null || (o5Var = (r45.o5) kz5.n0.Z(linkedList)) == null) ? null : o5Var.f381917h;
        if (str == null) {
            str = "";
        }
        tr3.b bVar = new tr3.b();
        bVar.f421430a = 1903;
        bVar.f421431b = true;
        bVar.f421432c = str;
        tr3.a aVar = tr3.a.f421426a;
        java.util.Map map = tr3.a.f421428c;
        ((java.util.HashMap) map).remove(1901);
        ((java.util.HashMap) map).remove(1902);
        aVar.a(bVar);
        com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "user click feature tips to expand");
        this.f464997f.invoke(java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initFeaturedBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
