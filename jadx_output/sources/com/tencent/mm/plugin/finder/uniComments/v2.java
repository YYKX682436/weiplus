package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f130433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jv2.i f130435f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.uniComments.q3 q3Var, jv2.i iVar) {
        super(1);
        this.f130433d = linkedList;
        this.f130434e = q3Var;
        this.f130435f = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        pm0.v.X(new com.tencent.mm.plugin.finder.uniComments.u2(this.f130433d, this.f130434e, task, this.f130435f));
        return jz5.f0.f302826a;
    }
}
