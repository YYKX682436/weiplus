package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.d f173278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f173279f;

    public g(in5.s0 s0Var, com.tencent.mm.plugin.textstatus.convert.topic.d dVar, android.widget.ImageView imageView) {
        this.f173277d = s0Var;
        this.f173278e = dVar;
        this.f173279f = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
        android.content.Context context = this.f173277d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.textstatus.convert.topic.d dVar = this.f173278e;
        com.tencent.mm.plugin.textstatus.ui.h4.b(h4Var, context, dVar.f173265e, 1002, null, null, this.f173279f, null, null, 216, null);
        qj4.s sVar = qj4.s.f363958a;
        mj4.h hVar = dVar.f173267g;
        java.lang.String h17 = hVar != null ? ((mj4.k) hVar).h() : "";
        java.lang.String str = dVar.f173265e;
        int size = dVar.f173264d.f337936d.f5135b.size();
        mj4.h hVar2 = dVar.f173267g;
        java.lang.String str2 = hVar2 != null ? xe0.j0.a(hVar2, false, 1, null).f355218i : null;
        mj4.h hVar3 = dVar.f173267g;
        qj4.s.n(sVar, 7L, h17, size, str, null, null, 0, 0L, 0L, str2, hVar3 != null ? java.lang.Integer.valueOf(xe0.j0.a(hVar3, false, 1, null).f355225s) : null, null, null, null, 14832, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
