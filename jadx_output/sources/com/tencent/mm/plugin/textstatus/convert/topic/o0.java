package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.y0 f173333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.textstatus.convert.topic.y0 y0Var, android.content.Context context) {
        super(1);
        this.f173333d = y0Var;
        this.f173334e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String topicId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(topicId, "topicId");
        this.f173333d.p(this.f173334e, topicId);
        return jz5.f0.f302826a;
    }
}
