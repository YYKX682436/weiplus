package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.d f173280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173281e;

    public h(com.tencent.mm.plugin.textstatus.convert.topic.d dVar, in5.s0 s0Var) {
        this.f173280d = dVar;
        this.f173281e = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n                        userName: ");
        com.tencent.mm.plugin.textstatus.convert.topic.d dVar = this.f173280d;
        mj4.h hVar = dVar.f173267g;
        sb6.append(hVar != null ? ((mj4.k) hVar).o() : null);
        sb6.append(",\n                        statusId: ");
        mj4.h hVar2 = dVar.f173267g;
        sb6.append(hVar2 != null ? ((mj4.k) hVar2).l() : null);
        sb6.append(",\n                        iconId: ");
        mj4.h hVar3 = dVar.f173267g;
        sb6.append(hVar3 != null ? ((mj4.k) hVar3).h() : null);
        sb6.append(",    iconDesc: ");
        bk4.f0 f0Var = bk4.f0.f21465a;
        mj4.h hVar4 = dVar.f173267g;
        sb6.append(f0Var.l(hVar4 != null ? ((mj4.k) hVar4).h() : null));
        sb6.append(",  \n                        clusterId: ");
        mj4.h hVar5 = dVar.f173267g;
        sb6.append(hVar5 != null ? ((mj4.k) hVar5).m() : null);
        sb6.append(",\n                        topicId: ");
        mj4.h hVar6 = dVar.f173267g;
        sb6.append(hVar6 != null ? ((mj4.k) hVar6).m() : null);
        sb6.append(",\n                    ");
        java.lang.String b17 = r26.b0.b(sb6.toString());
        android.content.Context context = this.f173281e.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.tencent.mm.ui.widget.dialog.y3.a((android.app.Activity) context, 0, 0, 0, b17, com.tencent.mm.R.drawable.b76, null, null, null);
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
