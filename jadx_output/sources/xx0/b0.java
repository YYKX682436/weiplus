package xx0;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f457859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f457860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(xx0.d0 d0Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457859d = d0Var;
        this.f457860e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xx0.b0(this.f457859d, this.f457860e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xx0.b0 b0Var = (xx0.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xx0.d0 d0Var = this.f457859d;
        xx0.t tVar = d0Var.f457881i;
        tVar.getClass();
        java.util.List data = this.f457860e;
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = (java.util.ArrayList) tVar.f457941g;
        arrayList.clear();
        arrayList.addAll(data);
        tVar.notifyDataSetChanged();
        androidx.recyclerview.widget.RecyclerView recyclerView = d0Var.f457880h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$updateFavoriteTab$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$updateFavoriteTab$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
        return jz5.f0.f302826a;
    }
}
