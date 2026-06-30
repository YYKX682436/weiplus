package un2;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f429461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ un2.k f429462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z41 f429463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f429464g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, un2.k kVar, r45.z41 z41Var, int i17) {
        super(0);
        this.f429461d = j17;
        this.f429462e = kVar;
        this.f429463f = z41Var;
        this.f429464g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        un2.a aVar;
        un2.a aVar2;
        un2.a aVar3;
        un2.k kVar = this.f429462e;
        if (this.f429461d == kVar.c().getFeedObject().getId()) {
            long j17 = kVar.f429474d;
            r45.z41 z41Var = this.f429463f;
            long j18 = z41Var.getLong(3);
            int i17 = this.f429464g;
            if (j17 == j18 && kVar.f429475e == z41Var.getLong(4)) {
                com.tencent.mars.xlog.Log.i("FinderBulletLoader", "onGetBulletCgiSuccess: hasMore = false, id=" + pm0.v.u(kVar.c().getFeedObject().getId()) + ", pullType=" + i17 + ", minBulletTime = " + kVar.f429474d + ", maxBulletTime = " + kVar.f429475e);
                kVar.f429476f = false;
            } else {
                long j19 = 1000;
                un2.k.a(kVar, (int) (z41Var.getLong(3) / j19), (int) (z41Var.getLong(4) / j19));
                kVar.f429474d = z41Var.getLong(3);
                kVar.f429475e = z41Var.getLong(4);
                kVar.f429472b = z41Var.getByteString(2);
                java.util.LinkedList list = z41Var.getList(6);
                if ((list != null && (list.isEmpty() ^ true)) && (aVar3 = kVar.f429473c) != null) {
                    kotlin.jvm.internal.o.d(list);
                    bb2.f1 f1Var = (bb2.f1) aVar3;
                    cq.k1.a();
                    com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    if (!((java.lang.Boolean) t70Var.N0().r()).booleanValue()) {
                        cq.k1.a();
                        if (((java.lang.Boolean) t70Var.P().r()).booleanValue()) {
                            cq.k1.a();
                            lb2.j jVar = (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127857o6).getValue();
                            jVar.l();
                            if (((java.lang.Boolean) jVar.r()).booleanValue()) {
                                bb2.w1 w1Var = f1Var.f18860a;
                                w1Var.f19051p = list;
                                if (!kotlin.jvm.internal.o.b(xp.d.f().f455864u, list)) {
                                    xp.d.f().f455864u = list;
                                    w1Var.d().j5();
                                }
                                com.tencent.mars.xlog.Log.i("FinderBulletManager", "setFollowInfoList: size=" + java.lang.Integer.valueOf(list.size()));
                            }
                        }
                    }
                }
                java.util.LinkedList<r45.oo> list2 = z41Var.getList(1);
                kotlin.jvm.internal.o.f(list2, "getComment_list(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (r45.oo ooVar : list2) {
                    kotlin.jvm.internal.o.d(ooVar);
                    arrayList.add(new bb2.o(ooVar));
                }
                if ((!arrayList.isEmpty()) && (aVar2 = kVar.f429473c) != null) {
                    bb2.w1 w1Var2 = ((bb2.f1) aVar2).f18860a;
                    w1Var2.b(w1Var2.e().k2(arrayList), "onBulletIncrease", false);
                }
                java.lang.String string = z41Var.getString(5);
                if (string != null && (aVar = kVar.f429473c) != null) {
                    ((bb2.f1) aVar).f18860a.f19054s = string;
                }
                kVar.f429476f = true;
                com.tencent.mars.xlog.Log.i("FinderBulletLoader", "onGetBulletCgiSuccess: size = " + arrayList.size() + ", hasMore = " + kVar.f429476f + ", id=" + pm0.v.u(kVar.c().getFeedObject().getId()) + ", pullType=" + i17 + ", minBulletTime = " + kVar.f429474d + ", maxBulletTime = " + kVar.f429475e);
                kVar.f429477g = false;
            }
        }
        return jz5.f0.f302826a;
    }
}
