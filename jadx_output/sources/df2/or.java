package df2;

/* loaded from: classes10.dex */
public final class or extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f230998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.h f230999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f231000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231001g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f231002h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(java.util.Set set, dk2.h hVar, com.tencent.mm.sdk.platformtools.o4 o4Var, df2.lt ltVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        super(0);
        this.f230998d = set;
        this.f230999e = hVar;
        this.f231000f = o4Var;
        this.f231001g = ltVar;
        this.f231002h = finderObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.bm1 bm1Var;
        dk2.h hVar = this.f230999e;
        java.util.Set set = this.f230998d;
        if (set != null) {
            set.add((hVar == null || (bm1Var = hVar.f233545h) == null) ? null : bm1Var.getString(0));
        }
        java.lang.String str = df2.lt.W;
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f231000f;
        o4Var.putStringSet(str, set);
        df2.lt ltVar = this.f231001g;
        ltVar.getClass();
        if (hVar != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = hVar.f233541d;
            if (finderJumpInfo.getJumpinfo_type() == 3) {
                com.tencent.mm.protocal.protobuf.NativeInfo native_info = finderJumpInfo.getNative_info();
                java.lang.Integer valueOf = native_info != null ? java.lang.Integer.valueOf(native_info.getNative_type()) : null;
                if (valueOf != null && valueOf.intValue() == 28) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = ltVar.E;
                    com.tencent.mm.plugin.finder.live.util.y.o(ltVar, null, null, new df2.dt(ltVar, constraintLayout != null ? (android.view.ViewGroup) constraintLayout.findViewById(com.tencent.mm.R.id.r2k) : null, null), 3, null);
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c17;
                    ml2.u1 u1Var = ml2.u1.C1;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                    java.lang.String b17 = b52.b.b();
                    if (b17 == null) {
                        b17 = "";
                    }
                    zy2.zb.I8(zbVar, u1Var, linkedHashMap, b17, null, null, null, false, 120, null);
                } else if (valueOf != null) {
                    valueOf.intValue();
                }
            }
        }
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(this.f231002h, 16384);
        a17.setEcSource(((mm2.c1) ltVar.business(mm2.c1.class)).f328786c3);
        o4Var.H(df2.lt.X, a17.getFinderLive().toByteArray());
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "mmkv liveinfo : " + a17.getFinderLive().getString(0) + ", " + a17.getFinderLive().getString(12) + ", " + a17.getFinderLive().getString(3) + " , " + a17.getFinderLive().getString(4));
        return jz5.f0.f302826a;
    }
}
