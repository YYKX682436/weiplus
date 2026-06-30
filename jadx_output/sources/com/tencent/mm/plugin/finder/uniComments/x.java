package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class x implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jv2.d f130446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130447b;

    public x(jv2.d dVar, com.tencent.mm.plugin.finder.uniComments.o0 o0Var) {
        this.f130446a = dVar;
        this.f130447b = o0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String b17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "loadMoreLevel2Comments resp null");
            return new jz5.l(-2, p0Var);
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0 || fVar.f70618d == null) {
            return fVar.f70616b == -4032 ? new jz5.l(-1, p0Var) : new jz5.l(0, p0Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreLevel2Comments after lastBuffer ");
        jv2.d dVar = this.f130446a;
        if (dVar.f302207d.u0().getLastBuffer() == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g lastBuffer = dVar.f302207d.u0().getLastBuffer();
            b17 = com.tencent.mm.sdk.platformtools.w2.b(lastBuffer != null ? lastBuffer.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> comment_info = ((r45.z03) fVar.f70618d).f391565d;
        kotlin.jvm.internal.o.f(comment_info, "comment_info");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(comment_info, 10));
        for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : comment_info) {
            hv2.b bVar = hv2.b.f285286a;
            kotlin.jvm.internal.o.d(finderCommentInfo);
            if (this.f130447b.f130328m == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            arrayList.add(bVar.b(finderCommentInfo, r3.f295123f, dVar.getItemId()));
        }
        return new jz5.l(0, arrayList);
    }
}
