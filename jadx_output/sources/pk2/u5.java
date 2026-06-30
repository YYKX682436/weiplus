package pk2;

/* loaded from: classes3.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.v5 f356285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f356287f;

    public u5(pk2.v5 v5Var, pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f356285d = v5Var;
        this.f356286e = o9Var;
        this.f356287f = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AssistantFastCommentOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk2.f.f(this.f356285d, false, 1, null);
        this.f356286e.j(qo0.b.L4, null);
        this.f356287f.h();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.D, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AssistantFastCommentOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
