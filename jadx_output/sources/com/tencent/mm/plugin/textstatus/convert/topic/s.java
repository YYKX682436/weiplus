package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.d f173364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.u f173365e;

    public s(com.tencent.mm.plugin.textstatus.convert.topic.d dVar, com.tencent.mm.plugin.textstatus.convert.topic.u uVar) {
        this.f173364d = dVar;
        this.f173365e = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareSameTopicFriendItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.convert.topic.d dVar = this.f173364d;
        mj4.k kVar = (mj4.k) ((mj4.h) dVar.f173264d.f337936d.f5135b.get(0));
        java.lang.String c17 = kVar.c();
        if (kVar.y()) {
            c17 = kVar.h();
        }
        yz5.l lVar = this.f173365e.f173374e;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("clickArrowListener");
            throw null;
        }
        lVar.invoke(c17);
        mj4.k kVar2 = (mj4.k) ((mj4.h) dVar.f173264d.f337936d.f5135b.get(0));
        qj4.s.n(qj4.s.f363958a, 8L, kVar2.h(), dVar.f173264d.f337936d.f5135b.size(), null, null, null, 0, 0L, 0L, xe0.j0.a(kVar2, false, 1, null).f355218i, java.lang.Integer.valueOf(xe0.j0.a(kVar2, false, 1, null).f355225s), null, null, null, 14840, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareSameTopicFriendItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
