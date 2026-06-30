package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f130399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jv2.d f130401f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.uniComments.o0 o0Var, jv2.d dVar) {
        super(1);
        this.f130399d = linkedList;
        this.f130400e = o0Var;
        this.f130401f = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        pm0.v.X(new com.tencent.mm.plugin.finder.uniComments.r(this.f130399d, this.f130400e, task, this.f130401f));
        return jz5.f0.f302826a;
    }
}
