package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f130423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.r f130425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jv2.i f130426g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.uniComments.q3 q3Var, fp0.r rVar, jv2.i iVar) {
        super(0);
        this.f130423d = linkedList;
        this.f130424e = q3Var;
        this.f130425f = rVar;
        this.f130426g = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList level2Comments = this.f130423d;
        kotlin.jvm.internal.o.f(level2Comments, "$level2Comments");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = level2Comments.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130424e;
            jv2.i iVar = this.f130426g;
            if (!hasNext) {
                com.tencent.mm.plugin.finder.uniComments.q3.g(q3Var, arrayList, iVar, true);
                this.f130425f.b(fp0.u.f265290f);
                return jz5.f0.f302826a;
            }
            com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) it.next();
            hv2.c cVar = hv2.c.f285287a;
            kotlin.jvm.internal.o.d(finderCommentInfo);
            if (q3Var.f130371h == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            arrayList.add(cVar.b(finderCommentInfo, r2.f295130f, iVar.getItemId()));
        }
    }
}
