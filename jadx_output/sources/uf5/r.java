package uf5;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.x f427292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(uf5.x xVar) {
        super(1);
        this.f427292d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        uf5.l state = (uf5.l) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        uf5.x xVar = this.f427292d;
        if (dVar != null && (dVar instanceof uf5.x0)) {
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = xVar.P6();
            if (P6 != null) {
                P6.enableOptionMenu(2, false);
            }
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = xVar.P6();
            if (P62 != null) {
                P62.showOptionMenu(2, false);
            }
            android.view.View view = xVar.f427321d;
            if (view == null) {
                kotlin.jvm.internal.o.o("batchBottomBar");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            uf5.x.V6(xVar, al5.q.f5992h);
            uf5.x.U6(xVar, state);
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof uf5.y0)) {
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P63 = xVar.P6();
            if (P63 != null) {
                P63.enableOptionMenu(2, true);
            }
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P64 = xVar.P6();
            if (P64 != null) {
                P64.showOptionMenu(2, true);
            }
            android.view.View view2 = xVar.f427321d;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("batchBottomBar");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = xVar.f427323f;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("batchExpandIcon");
                throw null;
            }
            imageView.setVisibility(8);
            uf5.x.V6(xVar, al5.q.f5991g);
        }
        j75.d dVar3 = state.f298066d;
        java.util.List list = state.f427267f;
        if (dVar3 != null && (dVar3 instanceof uf5.c)) {
            uf5.u1 u1Var = xVar.f427325h;
            if (u1Var == null) {
                kotlin.jvm.internal.o.o("avatarAdapter");
                throw null;
            }
            u1Var.notifyDataSetChanged();
            android.widget.ImageView imageView2 = xVar.f427323f;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("batchExpandIcon");
                throw null;
            }
            imageView2.setVisibility(((java.util.ArrayList) list).isEmpty() ? 8 : 0);
            uf5.x.U6(xVar, state);
        }
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof uf5.d)) {
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P65 = xVar.P6();
            if (P65 != null) {
                P65.enableOptionMenu(2, true);
            }
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P66 = xVar.P6();
            if (P66 != null) {
                P66.showOptionMenu(2, true);
            }
            android.view.View view3 = xVar.f427321d;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("batchBottomBar");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView3 = xVar.f427323f;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("batchExpandIcon");
                throw null;
            }
            imageView3.setVisibility(8);
            uf5.x.V6(xVar, al5.q.f5991g);
        }
        j75.d dVar5 = state.f298066d;
        if (dVar5 != null && (dVar5 instanceof uf5.c2)) {
            uf5.u1 u1Var2 = xVar.f427325h;
            if (u1Var2 == null) {
                kotlin.jvm.internal.o.o("avatarAdapter");
                throw null;
            }
            u1Var2.notifyDataSetChanged();
            uf5.x.U6(xVar, state);
            android.widget.ImageView imageView4 = xVar.f427323f;
            if (imageView4 == null) {
                kotlin.jvm.internal.o.o("batchExpandIcon");
                throw null;
            }
            imageView4.setVisibility(((java.util.ArrayList) list).isEmpty() ? 8 : 0);
        }
        j75.d dVar6 = state.f298066d;
        if (dVar6 != null && (dVar6 instanceof uf5.a)) {
            uf5.u1 u1Var3 = xVar.f427325h;
            if (u1Var3 == null) {
                kotlin.jvm.internal.o.o("avatarAdapter");
                throw null;
            }
            u1Var3.notifyDataSetChanged();
            uf5.x.U6(xVar, state);
            android.widget.ImageView imageView5 = xVar.f427323f;
            if (imageView5 == null) {
                kotlin.jvm.internal.o.o("batchExpandIcon");
                throw null;
            }
            imageView5.setVisibility(((java.util.ArrayList) list).isEmpty() ? 8 : 0);
        }
        return jz5.f0.f302826a;
    }
}
