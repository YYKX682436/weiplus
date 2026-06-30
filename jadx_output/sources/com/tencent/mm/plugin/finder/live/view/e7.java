package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k7 f116274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f116275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f116276f;

    public e7(com.tencent.mm.plugin.finder.live.view.k7 k7Var, android.view.View view, android.view.View view2) {
        this.f116274d = k7Var;
        this.f116275e = view;
        this.f116276f = view2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.k7 k7Var = this.f116274d;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = k7Var.f116441J;
        if (finderContact != null) {
            r45.kv0 a17 = db2.t4.f228171a.a(5874);
            android.view.View view2 = this.f116275e;
            android.content.Context context = view2.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ek2.c2 c2Var = new ek2.c2(a17, xy2.c.e(context), null, 0L, 0L, 0, 0L, 2, null, 120, null);
            android.content.Context context2 = view2.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            az2.j.u(c2Var, context2, null, 0L, 6, null);
            pq5.g l17 = c2Var.l();
            android.content.Context context3 = view2.getContext();
            kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) context3).h(new com.tencent.mm.plugin.finder.live.view.d7(k7Var, this.f116276f, finderContact, view2));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
