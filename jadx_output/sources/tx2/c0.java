package tx2;

/* loaded from: classes.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f422538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f422539e;

    public c0(r45.h32 h32Var, tx2.i0 i0Var) {
        this.f422538d = h32Var;
        this.f422539e = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#tv_do_not_show_notice click noticeid=");
        r45.h32 h32Var = this.f422538d;
        sb6.append(h32Var.getString(4));
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeBigCardWidget", sb6.toString());
        r45.ll1 ll1Var = new r45.ll1();
        ll1Var.set(1, db2.t4.f228171a.a(8652));
        ll1Var.set(2, 1);
        java.util.LinkedList list = ll1Var.getList(3);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 0);
        r45.nl1 nl1Var = new r45.nl1();
        nl1Var.set(0, h32Var.getString(4));
        nl1Var.set(1, 1);
        hx0Var.set(1, com.tencent.mm.protobuf.g.b(nl1Var.toByteArray()));
        list.add(hx0Var);
        pq5.g l17 = ll1Var.d().l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        pm0.v.T(l17, new tx2.b0(h32Var, this.f422539e));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
