package st2;

/* loaded from: classes3.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f412226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f412228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(xg2.h hVar, kotlin.coroutines.Continuation continuation, st2.h1 h1Var, boolean z17) {
        super(2, continuation);
        this.f412226d = hVar;
        this.f412227e = h1Var;
        this.f412228f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new st2.b1(this.f412226d, continuation, this.f412227e, this.f412228f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        st2.b1 b1Var = (st2.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        st2.h1 h1Var = this.f412227e;
        int w07 = h1Var.f412337h.w0();
        boolean z17 = this.f412228f;
        if (w07 == 0 || h1Var.v(z17)) {
            if (h1Var.v(z17)) {
                h1Var.L();
            }
            h1Var.o().setVisibility(0);
            h1Var.l().setVisibility(8);
            android.view.View t17 = h1Var.k().t();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onGetShoppingListFail", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onGetShoppingListFail", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h1Var.q().setVisibility(8);
            ut2.a4 a4Var = h1Var.f412345r;
            if (a4Var != null) {
                a4Var.b(false, h1Var.w(), false);
            }
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "onGetShoppingListFail");
            h1Var.k().e();
        }
        return jz5.f0.f302826a;
    }
}
