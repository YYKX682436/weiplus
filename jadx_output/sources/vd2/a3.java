package vd2;

/* loaded from: classes2.dex */
public final class a3 extends vd2.y2 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader f435651f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader) {
        super(finderLiveRelatedLoader);
        this.f435651f = finderLiveRelatedLoader;
    }

    @Override // vd2.y2
    public com.tencent.mm.modelbase.m1 b() {
        r45.kd1 kd1Var;
        r45.nw1 nw1Var;
        r45.kv0 a17 = db2.t4.f228171a.a(6479);
        com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader = this.f435651f;
        a17.set(1, java.lang.Integer.valueOf(finderLiveRelatedLoader.f111733n.f309206k));
        r45.g40 g40Var = new r45.g40();
        g40Var.set(0, finderLiveRelatedLoader.f111733n.f309208m);
        a17.set(4, g40Var);
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(7, java.lang.Integer.valueOf(finderLiveRelatedLoader.f111733n.f309206k));
        qt2Var.set(5, java.lang.Integer.valueOf(finderLiveRelatedLoader.f111733n.f309206k));
        if (finderLiveRelatedLoader.f111728f) {
            km2.r rVar = finderLiveRelatedLoader.f111733n;
            r45.kd1 kd1Var2 = rVar.f309199d;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = rVar.f309200e;
            rVar.f309196a = finderObject != null ? finderObject.getLive_related_last_buffer() : null;
            finderLiveRelatedLoader.f111728f = false;
            kd1Var = kd1Var2;
        } else {
            kd1Var = null;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = finderLiveRelatedLoader.f111480p;
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        r45.o72 T = r4Var.T(context, (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0), getTAG());
        km2.r rVar2 = finderLiveRelatedLoader.f111733n;
        long j17 = rVar2.f309197b;
        java.lang.String str = rVar2.f309202g;
        java.lang.String str2 = rVar2.f309198c;
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.protobuf.g gVar = rVar2.f309196a;
        int i17 = rVar2.f309206k;
        float f17 = rVar2.f309204i;
        float f18 = rVar2.f309205j;
        r45.gy0 gy0Var = rVar2.f309209n;
        java.util.LinkedList linkedList = rVar2.f309211p;
        int i18 = rVar2.f309212q;
        int i19 = vd2.a2.f435638i;
        r45.o72 o72Var = vd2.a2.f435641l;
        if (o72Var == null) {
            o72Var = T;
        }
        db2.q5 q5Var = new db2.q5(j17, str, str2, gVar, i17, f17, f18, a17, kd1Var, qt2Var, gy0Var, linkedList, i18, o72Var, rVar2.f309213r, rVar2.f309216u);
        q5Var.O(2);
        q5Var.f228135q = finderLiveRelatedLoader.f111733n.f309210o;
        q5Var.f228132n = finderLiveRelatedLoader.f111730h;
        java.util.Iterator it = finderLiveRelatedLoader.f111733n.f309211p.iterator();
        while (it.hasNext()) {
            ((r45.d72) it.next()).getLong(0);
        }
        new java.lang.StringBuilder("curIndex:").append(finderLiveRelatedLoader.f111733n.f309212q);
        getTAG();
        return q5Var;
    }
}
