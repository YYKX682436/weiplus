package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj4.c f173282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.l0 f173283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f173284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f173285g;

    public h0(nj4.c cVar, com.tencent.mm.plugin.textstatus.convert.topic.l0 l0Var, android.view.View view, mj4.h hVar) {
        this.f173282d = cVar;
        this.f173283e = l0Var;
        this.f173284f = view;
        this.f173285g = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int size = this.f173282d.f337931f.f337936d.f5135b.size();
        kotlin.jvm.internal.o.f(this.f173284f.getContext(), "getContext(...)");
        mj4.h hVar = this.f173285g;
        java.lang.String topicId = ((mj4.k) hVar).c();
        com.tencent.mm.plugin.textstatus.convert.topic.l0 l0Var = this.f173283e;
        l0Var.getClass();
        if (!(topicId == null || r26.n0.N(topicId))) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = (com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity) l0Var.f173313e;
            textStatusOtherTopicFriendsActivity.getClass();
            kotlin.jvm.internal.o.g(topicId, "topicId");
            androidx.appcompat.app.AppCompatActivity context = textStatusOtherTopicFriendsActivity.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((java.util.HashMap) ((com.tencent.mm.plugin.textstatus.ui.mg) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.textstatus.ui.mg.class)).f174107d).put(topicId, java.lang.Boolean.FALSE);
            pm0.v.O("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", new com.tencent.mm.plugin.textstatus.ui.oe(textStatusOtherTopicFriendsActivity));
        }
        qj4.s.n(qj4.s.f363958a, 8L, ((mj4.k) hVar).h(), size, null, null, null, 0, 0L, 0L, xe0.j0.a(hVar, false, 1, null).f355218i, java.lang.Integer.valueOf(xe0.j0.a(hVar, false, 1, null).f355225s), null, null, null, 14840, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
