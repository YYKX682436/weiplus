package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.q f173296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.textstatus.convert.topic.q qVar, android.content.Context context) {
        super(1);
        this.f173296d = qVar;
        this.f173297e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String topicId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(topicId, "topicId");
        this.f173296d.p(this.f173297e, topicId);
        return jz5.f0.f302826a;
    }
}
