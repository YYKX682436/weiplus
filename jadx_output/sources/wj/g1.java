package wj;

@j95.b(dependencies = {com.tencent.mm.plugin.magicbrush.s4.class})
/* loaded from: classes7.dex */
public final class g1 extends i95.w implements wj.m {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f446410d = jz5.h.b(wj.z0.f446554d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f446411e = jz5.h.b(wj.f1.f446404d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f446412f = jz5.h.b(wj.e1.f446398d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f446413g = jz5.h.b(wj.a1.f446374d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f446414h = jz5.h.b(wj.d1.f446395d);

    public boolean Ai(java.lang.String bizName, java.lang.String slotId) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(slotId, "slotId");
        hk.n nVar = hk.n.f281683a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27060, bizName, 2, slotId, 0);
        hk.b b17 = nVar.b();
        if (b17 == null) {
            return false;
        }
        int delete = b17.delete("AdvertisePushDBInfo", "message_slotid=?", new java.lang.String[]{slotId});
        if (delete >= 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AdvertisePushDBInfoStorage", "clearSpecificSlotMsg error,delete ret:" + delete);
        return false;
    }

    public java.util.List Bi(java.lang.String bizName, java.lang.String slotId) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(slotId, "slotId");
        java.util.List<hk.a> a17 = hk.n.f281683a.a(bizName, slotId);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (hk.a info : a17) {
            kotlin.jvm.internal.o.g(info, "info");
            int y07 = info.y0();
            long t07 = info.t0();
            long v07 = info.v0();
            long u07 = info.u0();
            java.lang.String w07 = info.w0();
            kotlin.jvm.internal.o.f(w07, "getMessage_traceid(...)");
            arrayList.add(new com.tencent.mm.advertise.util.MagicAdPushMsg(y07, t07, v07, u07, w07));
        }
        return arrayList;
    }

    public xj.p Di() {
        java.lang.Object obj;
        jz5.o oVar = (jz5.o) ((jz5.n) this.f446412f).getValue();
        int intValue = ((java.lang.Number) oVar.f302841d).intValue();
        if (!((java.lang.Boolean) oVar.f302843f).booleanValue() || intValue < 0) {
            com.tencent.mars.xlog.Log.i("MagicAdvertiseFeatureService", "[MBAd] navigate strategy: CONTROL (_0312 not hit)");
            return xj.p.f454766f;
        }
        xj.p.f454765e.getClass();
        java.util.Iterator it = ((kz5.h) xj.p.f454770m).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((xj.p) obj).f454771d == intValue) {
                break;
            }
        }
        xj.p pVar = (xj.p) obj;
        if (pVar == null) {
            pVar = xj.p.f454766f;
        }
        com.tencent.mars.xlog.Log.i("MagicAdvertiseFeatureService", "[MBAd] navigate strategy: " + pVar + " (from _0312, value=" + intValue + ')');
        return pVar;
    }

    public boolean Ni() {
        boolean z17;
        try {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
            e42.c0 c0Var = e42.c0.clicfg_miniprogram_reward_ad_mb_keep_alive_0427;
            h62.d dVar = (h62.d) e0Var;
            boolean mj6 = dVar.mj(c0Var, pInt, pInt2);
            int Ni = dVar.Ni(c0Var, 0);
            if (mj6) {
                z17 = true;
                if (Ni == 1) {
                    com.tencent.mars.xlog.Log.i("MagicAdvertiseFeatureService", "[MBAd] keepAlive0427 value:" + Ni + ", groupId:" + pInt2.value + ", hit:" + mj6 + ", enabled:" + z17);
                    return z17;
                }
            }
            z17 = false;
            com.tencent.mars.xlog.Log.i("MagicAdvertiseFeatureService", "[MBAd] keepAlive0427 value:" + Ni + ", groupId:" + pInt2.value + ", hit:" + mj6 + ", enabled:" + z17);
            return z17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MagicAdvertiseFeatureService", "[MBAd] keepAlive expt read failed: " + e17);
            return false;
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mm.plugin.magicbrush.s7 s7Var = (com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class));
        s7Var.bj("MagicAdPublicService", wj.b1.f446381a);
        s7Var.bj("MagicAdMiniProgram", wj.c1.f446383a);
    }

    public xj.k wi(java.lang.String bizName, java.lang.String adSlot) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(adSlot, "adSlot");
        if (kotlin.jvm.internal.o.b(bizName, "MagicAdMiniProgram") && kotlin.jvm.internal.o.b(adSlot, "rewardAD")) {
            return (xj.k) ((jz5.n) this.f446413g).getValue();
        }
        return new xj.k(false, 0);
    }
}
