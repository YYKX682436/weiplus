package eb2;

/* loaded from: classes2.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.m0 f250791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f250792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f250793f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f250794g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f250795h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rn5.a f250796i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f250797m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ db2.v3 f250798n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.e f250799o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f250800p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ db2.u3 f250801q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(eb2.m0 m0Var, int i17, com.tencent.mm.protobuf.g gVar, java.util.List list, boolean z17, rn5.a aVar, com.tencent.mm.protobuf.g gVar2, db2.v3 v3Var, com.tencent.mm.plugin.finder.feed.model.e eVar, boolean z18, db2.u3 u3Var) {
        super(0);
        this.f250791d = m0Var;
        this.f250792e = i17;
        this.f250793f = gVar;
        this.f250794g = list;
        this.f250795h = z17;
        this.f250796i = aVar;
        this.f250797m = gVar2;
        this.f250798n = v3Var;
        this.f250799o = eVar;
        this.f250800p = z18;
        this.f250801q = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList;
        boolean z17;
        eb2.m0 m0Var = this.f250791d;
        int i17 = m0Var.f250822g;
        int i18 = this.f250792e;
        com.tencent.mm.protobuf.g gVar = this.f250793f;
        r45.qt2 qt2Var = m0Var.f250823h;
        java.util.List list = this.f250794g;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it.next()).getFeedObject().getFeedObject());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        boolean z18 = m0Var.f250830r.f257452l;
        boolean z19 = this.f250795h;
        int i19 = m0Var.f250827o;
        if (this.f250792e == 0) {
            eb2.f0 f0Var = m0Var.f250824i;
            if (f0Var != null && f0Var.f250753l) {
                z17 = true;
                db2.n3 n3Var = new db2.n3(i17, i18, gVar, qt2Var, arrayList, false, z18, z19, i19, z17, null, this.f250796i, this.f250797m);
                db2.v3 v3Var = this.f250798n;
                com.tencent.mm.plugin.finder.feed.model.e eVar = this.f250799o;
                int i27 = this.f250792e;
                boolean z27 = this.f250800p;
                db2.u3 u3Var = this.f250801q;
                n3Var.e(new fb2.a(), 0);
                n3Var.e(new fb2.k(), 1);
                n3Var.e(new fb2.f(), 2);
                n3Var.e(new fb2.g(), 3);
                n3Var.e(new fb2.e(), 4);
                im5.c keeper = m0Var.f250825m;
                kotlin.jvm.internal.o.g(keeper, "keeper");
                n3Var.f228094v = keeper;
                n3Var.f228092t = new eb2.h0(m0Var, v3Var, eVar, i27, n3Var);
                n3Var.f228091s = new eb2.j0(i27, n3Var, m0Var, z27, u3Var);
                return n3Var;
            }
        }
        z17 = false;
        db2.n3 n3Var2 = new db2.n3(i17, i18, gVar, qt2Var, arrayList, false, z18, z19, i19, z17, null, this.f250796i, this.f250797m);
        db2.v3 v3Var2 = this.f250798n;
        com.tencent.mm.plugin.finder.feed.model.e eVar2 = this.f250799o;
        int i272 = this.f250792e;
        boolean z272 = this.f250800p;
        db2.u3 u3Var2 = this.f250801q;
        n3Var2.e(new fb2.a(), 0);
        n3Var2.e(new fb2.k(), 1);
        n3Var2.e(new fb2.f(), 2);
        n3Var2.e(new fb2.g(), 3);
        n3Var2.e(new fb2.e(), 4);
        im5.c keeper2 = m0Var.f250825m;
        kotlin.jvm.internal.o.g(keeper2, "keeper");
        n3Var2.f228094v = keeper2;
        n3Var2.f228092t = new eb2.h0(m0Var, v3Var2, eVar2, i272, n3Var2);
        n3Var2.f228091s = new eb2.j0(i272, n3Var2, m0Var, z272, u3Var2);
        return n3Var2;
    }
}
