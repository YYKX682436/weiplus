package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.i f173275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.d f173276e;

    public f(com.tencent.mm.plugin.textstatus.convert.topic.i iVar, com.tencent.mm.plugin.textstatus.convert.topic.d dVar) {
        this.f173275d = iVar;
        this.f173276e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f173275d.f173286e;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("clickArrowListener");
            throw null;
        }
        com.tencent.mm.plugin.textstatus.convert.topic.d dVar = this.f173276e;
        lVar.invoke(((mj4.k) ((mj4.h) dVar.f173264d.f337936d.f5135b.get(0))).c());
        mj4.k kVar = (mj4.k) ((mj4.h) dVar.f173264d.f337936d.f5135b.get(0));
        qj4.s.n(qj4.s.f363958a, 8L, kVar.h(), dVar.f173264d.f337936d.f5135b.size(), null, null, null, 0, 0L, 0L, xe0.j0.a(kVar, false, 1, null).f355218i, java.lang.Integer.valueOf(xe0.j0.a(kVar, false, 1, null).f355225s), null, null, null, 14840, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
