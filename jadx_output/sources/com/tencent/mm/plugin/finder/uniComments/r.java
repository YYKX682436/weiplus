package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f130389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.r f130391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jv2.d f130392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.uniComments.o0 o0Var, fp0.r rVar, jv2.d dVar) {
        super(0);
        this.f130389d = linkedList;
        this.f130390e = o0Var;
        this.f130391f = rVar;
        this.f130392g = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList level2Comments = this.f130389d;
        kotlin.jvm.internal.o.f(level2Comments, "$level2Comments");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = level2Comments.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130390e;
            jv2.d dVar = this.f130392g;
            if (!hasNext) {
                com.tencent.mm.plugin.finder.uniComments.o0.b(o0Var, arrayList, dVar, true);
                this.f130391f.b(fp0.u.f265290f);
                return jz5.f0.f302826a;
            }
            com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) it.next();
            hv2.b bVar = hv2.b.f285286a;
            kotlin.jvm.internal.o.d(finderCommentInfo);
            if (o0Var.f130328m == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            arrayList.add(bVar.b(finderCommentInfo, r2.f295123f, dVar.getItemId()));
        }
    }
}
