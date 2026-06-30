package qe2;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe2.c f362041d;

    public d(android.content.Context context, qe2.c cVar) {
        this.f362041d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ya2.b2 b2Var = new ya2.b2();
        qe2.c cVar = this.f362041d;
        java.lang.String field_nickname = cVar.f362036b;
        kotlin.jvm.internal.o.g(field_nickname, "field_nickname");
        b2Var.field_nickname = field_nickname;
        java.lang.String field_username = cVar.f362035a;
        kotlin.jvm.internal.o.g(field_username, "field_username");
        b2Var.field_username = field_username;
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb.R8((c61.yb) c17, new r45.qt2(), cVar.f362035a, 1, 0L, false, null, null, 0, 11, null, null, null, null, 7776, null);
        com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = new com.tencent.mm.autogen.events.FollowUserEvent();
        java.lang.String D0 = b2Var.D0();
        am.zd zdVar = followUserEvent.f54346g;
        zdVar.f8551a = D0;
        zdVar.f8552b = 4;
        zdVar.f8553c = true;
        followUserEvent.e();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
