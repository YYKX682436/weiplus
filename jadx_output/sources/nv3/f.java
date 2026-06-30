package nv3;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: l, reason: collision with root package name */
    public static final nv3.d f340658l = new nv3.d(null);

    /* renamed from: a, reason: collision with root package name */
    public final im5.b f340659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f340660b;

    /* renamed from: c, reason: collision with root package name */
    public long f340661c;

    /* renamed from: d, reason: collision with root package name */
    public final int f340662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f340663e;

    /* renamed from: f, reason: collision with root package name */
    public final int f340664f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f340665g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f340666h;

    /* renamed from: i, reason: collision with root package name */
    public wt3.i0 f340667i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f340668j;

    /* renamed from: k, reason: collision with root package name */
    public int f340669k;

    public f(im5.b lifeCycleKeeper, int i17, long j17, int i18, int i19, int i27, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, wt3.i0 i0Var) {
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        this.f340659a = lifeCycleKeeper;
        this.f340660b = i17;
        this.f340661c = j17;
        this.f340662d = i18;
        this.f340663e = i19;
        this.f340664f = i27;
        this.f340665g = gVar;
        this.f340666h = gVar2;
        this.f340667i = i0Var;
    }

    public final void a(boolean z17, com.tencent.mm.protobuf.g gVar, java.util.List list) {
        java.util.ArrayList arrayList;
        if (z17) {
            this.f340668j = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetListenVideoBgmList bgmListType:");
        sb6.append(this.f340662d);
        sb6.append(" loadFirstPage:");
        sb6.append(z17);
        sb6.append(" cgiSessionBuffer:");
        sb6.append(this.f340668j != null);
        sb6.append(" idList:");
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) it.next());
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        sb6.append(" hasCurrentClassifyResultData:");
        sb6.append(gVar != null);
        sb6.append(" hasInnerClassifyResultData:");
        com.tencent.mm.protobuf.g gVar2 = this.f340665g;
        sb6.append(gVar2 != null);
        sb6.append(" hasPromptRawText:");
        sb6.append(this.f340666h != null);
        com.tencent.mars.xlog.Log.i("GetListenVideoBgmListHelper", sb6.toString());
        nv3.d dVar = f340658l;
        wt3.i0 i0Var = this.f340667i;
        org.json.JSONObject a17 = nv3.d.a(dVar, i0Var != null ? i0Var.getActivity() : null, null, 2, null);
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = java.lang.System.currentTimeMillis();
        pq5.g l17 = new jv3.a(this.f340662d, this.f340660b, this.f340668j, this.f340661c, gVar == null ? gVar2 : gVar, null, list, a17.toString(), null, null, this.f340663e, this.f340669k, this.f340664f, this.f340666h, 800, null).l();
        if (l17 != null) {
            l17.f(this.f340659a);
            l17.h(new nv3.e(g0Var, this, z17));
        }
    }

    public /* synthetic */ f(im5.b bVar, int i17, long j17, int i18, int i19, int i27, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, wt3.i0 i0Var, int i28, kotlin.jvm.internal.i iVar) {
        this(bVar, i17, j17, (i28 & 8) != 0 ? 1 : i18, (i28 & 16) != 0 ? 0 : i19, (i28 & 32) != 0 ? 0 : i27, (i28 & 64) != 0 ? null : gVar, (i28 & 128) != 0 ? null : gVar2, (i28 & 256) != 0 ? null : i0Var);
    }
}
