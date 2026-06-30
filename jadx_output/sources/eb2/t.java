package eb2;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f250846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f250847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f250848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f250849g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f250850h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f250851i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f250852m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f250853n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f250854o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u26.w f250855p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i17, r45.qt2 qt2Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.util.List list, java.util.List list2, int i18, int i19, long j17, com.tencent.mm.protobuf.g gVar, u26.w wVar) {
        super(1);
        this.f250846d = i17;
        this.f250847e = qt2Var;
        this.f250848f = finderObject;
        this.f250849g = list;
        this.f250850h = list2;
        this.f250851i = i18;
        this.f250852m = i19;
        this.f250853n = j17;
        this.f250854o = gVar;
        this.f250855p = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(this.f250846d), "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        new db2.g0(this.f250847e, this.f250848f, com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17)), this.f250849g, this.f250850h, this.f250846d, this.f250851i, this.f250852m, this.f250853n, this.f250854o).l().H(new eb2.s(task, this.f250855p));
        return jz5.f0.f302826a;
    }
}
