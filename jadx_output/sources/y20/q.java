package y20;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.test.EcsTestUI f459021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI) {
        super(2);
        this.f459021d = ecsTestUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qq.f item = (qq.f) obj;
        android.content.Context context = (android.content.Context) obj2;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = com.tencent.mm.feature.ecs.test.EcsTestUI.n;
        com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI = this.f459021d;
        ecsTestUI.getClass();
        com.tencent.mars.xlog.Log.i("EcsTestUI", "handleItemClick: " + item.a());
        if (item instanceof qq.d) {
            try {
                ((qq.d) item).f365864c.invoke(context);
                com.tencent.mars.xlog.Log.i("EcsTestUI", "Button action executed: " + ((qq.d) item).f365863b);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EcsTestUI", "Button action failed: " + ((qq.d) item).f365863b, e17);
            }
        } else if (item instanceof qq.g) {
            qq.g gVar = (qq.g) item;
            y20.p pVar = new y20.p(item, ecsTestUI);
            qq.c0 c0Var = (qq.c0) i95.n0.c(qq.c0.class);
            java.lang.String str = gVar.f365867a;
            java.util.List list = gVar.f365869c;
            kotlin.jvm.internal.o.d(c0Var);
            y20.f fVar = new y20.f(context, str, list, ((qq.s) c0Var).Ai(gVar.f365871e, gVar.f365870d), new y20.o(gVar, c0Var, pVar));
            android.content.Context context2 = fVar.f458999a;
            android.view.View inflate = android.view.LayoutInflater.from(context2).inflate(com.tencent.mm.R.layout.e4m, (android.view.ViewGroup) null);
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.unh);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.czu)).setText(fVar.f459000b);
            y20.c cVar = new y20.c(fVar.f459001c, fVar.f459002d, new y20.e(fVar));
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context2));
            recyclerView.setAdapter(cVar);
            androidx.appcompat.app.l lVar = new androidx.appcompat.app.l(context2);
            androidx.appcompat.app.h hVar = lVar.f9193a;
            hVar.f9144p = inflate;
            y20.d dVar = y20.d.f458997d;
            hVar.f9137i = "取消";
            hVar.f9138j = dVar;
            androidx.appcompat.app.m a17 = lVar.a();
            fVar.f459004f = a17;
            a17.show();
        } else if (item instanceof qq.e) {
            item.b();
        }
        return jz5.f0.f302826a;
    }
}
