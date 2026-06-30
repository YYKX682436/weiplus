package df2;

/* loaded from: classes3.dex */
public final class ot extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.pt f231005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot(df2.pt ptVar, java.lang.Class cls) {
        super(cls);
        this.f231005b = ptVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.wc2 result = (r45.wc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.util.LinkedList list = result.getList(0);
        kotlin.jvm.internal.o.f(list, "getReddot_infos(...)");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.vs2 vs2Var = (r45.vs2) ((r45.hq1) it.next()).getCustom(0);
            if (vs2Var != null) {
                java.lang.String str = this.f231005b.f231110m;
                java.util.LinkedList show_infos = vs2Var.f388489g;
                kotlin.jvm.internal.o.f(show_infos, "show_infos");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(show_infos, 10));
                java.util.Iterator it6 = show_infos.iterator();
                while (it6.hasNext()) {
                    arrayList.add(((r45.f03) it6.next()).f373892i);
                }
                arrayList.toString();
                zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var, "FinderLiveSync", null, true, null, 20, null);
            }
        }
    }
}
