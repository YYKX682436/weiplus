package tf2;

/* loaded from: classes10.dex */
public final class k extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f418932m;

    /* renamed from: n, reason: collision with root package name */
    public u26.w f418933n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f418934o;

    /* renamed from: p, reason: collision with root package name */
    public xh2.b f418935p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f418936q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f418937r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f418932m = new java.util.LinkedHashMap();
        this.f418937r = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x060f, code lost:
    
        if (kotlinx.coroutines.k1.b(300, r8) != r12) goto L254;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(tf2.k r33, tf2.a r34, p05.x0 r35, kotlin.coroutines.Continuation r36) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf2.k.Z6(tf2.k, tf2.a, p05.x0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Float[] d7(tf2.k kVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        km2.q qVar = (km2.q) h0Var.f310123d;
        java.lang.Float[] e76 = kVar.e7(qVar != null ? qVar.f309170a : null);
        km2.q qVar2 = (km2.q) h0Var2.f310123d;
        java.lang.Float[] e77 = kVar.e7(qVar2 != null ? qVar2.f309170a : null);
        float f17 = 0.5f;
        if (e76 == null || e77 == null) {
            com.tencent.mars.xlog.Log.e("FinderLivePkGiftAnimationScheduleController", "#computatioStartPosBoundary something null. just return direct");
            return new java.lang.Float[]{java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(0.5f)};
        }
        float f18 = e76[0].floatValue() < e77[0].floatValue() ? 0.0f : e76[0].floatValue() > e77[0].floatValue() ? 1.0f : 0.5f;
        if (e76[1].floatValue() < e77[1].floatValue()) {
            f17 = 0.0f;
        } else if (e76[1].floatValue() > e77[1].floatValue()) {
            f17 = 1.0f;
        }
        return new java.lang.Float[]{java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17)};
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        this.f418935p = micInfoData;
        tn0.w0 Q6 = Q6();
        if ((Q6 != null && Q6.X()) && !this.f418936q) {
            this.f418936q = true;
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftAnimationScheduleController", "#onMicInfoChanged isCurrentVisitorOnMic=" + this.f418936q);
            c7();
            b7();
            return;
        }
        tn0.w0 Q62 = Q6();
        if (((Q62 == null || Q62.X()) ? false : true) && this.f418936q) {
            this.f418936q = false;
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftAnimationScheduleController", "#onMicInfoChanged isCurrentVisitorOnMic=" + this.f418936q);
            c7();
            b7();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(com.tencent.mm.plugin.finder.live.util.l1 r37) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf2.k.a7(com.tencent.mm.plugin.finder.live.util.l1):void");
    }

    public final void b7() {
        mn0.b0 b0Var;
        nn0.o oVar;
        tn0.w0 Q6 = Q6();
        if (Q6 != null && (Q6 instanceof co0.s) && (b0Var = ((co0.s) Q6).R1.f282409a) != null && (b0Var instanceof mn0.y)) {
            com.tencent.rtmp.TXLivePlayer p17 = ((mn0.y) b0Var).p();
            if ((p17 instanceof nn0.i) && (oVar = ((nn0.i) p17).f338584b) != null) {
                oVar.bc(null);
            }
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f418932m;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            ((go0.w1) ((tf2.b) entry.getValue()).f418896a).b();
            p05.d2 d2Var = (p05.d2) ((tf2.b) entry.getValue()).f418897b;
            d2Var.getClass();
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#destroy");
            p05.z0 z0Var = d2Var.f350486a;
            z0Var.getClass();
            p05.c2 c17 = d2Var.f350494i;
            kotlin.jvm.internal.o.g(c17, "c");
            z0Var.f350739a.remove(c17);
            d2Var.f350490e = null;
            d2Var.f350492g = null;
            tn0.w0 Q62 = Q6();
            if (Q62 != null) {
                Q62.j0((java.lang.String) entry.getKey(), null);
            }
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftAnimationScheduleController", "#destroyAndClearAllWeEffectInstance sdkId=" + ((java.lang.String) entry.getKey()));
        }
        linkedHashMap.clear();
    }

    public final void c7() {
        kotlinx.coroutines.r2 r2Var = this.f418934o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        u26.w wVar = this.f418933n;
        if (wVar != null) {
            u26.x0.a(wVar, null, 1, null);
        }
        ((java.util.LinkedHashMap) this.f418937r).clear();
    }

    public final java.lang.Float[] e7(java.lang.String str) {
        xh2.b bVar;
        android.graphics.Rect rect;
        if ((str == null || str.length() == 0) || (bVar = this.f418935p) == null || (rect = (android.graphics.Rect) bVar.f454522a.get(str)) == null) {
            return null;
        }
        android.graphics.Rect rect2 = bVar.f454524c;
        float f17 = rect2.right - rect2.left;
        float f18 = rect2.bottom - rect2.top;
        return new java.lang.Float[]{java.lang.Float.valueOf(f17 > 0.0f ? (rect.left - r4) / f17 : 0.0f), java.lang.Float.valueOf(f18 > 0.0f ? (rect.top - r2) / f18 : 0.0f), java.lang.Float.valueOf(f17 > 0.0f ? (rect.right - rect.left) / f17 : 0.0f), java.lang.Float.valueOf(f18 > 0.0f ? (rect.bottom - rect.top) / f18 : 0.0f)};
    }

    public final tf2.b f7(java.lang.String str) {
        if (str.length() == 0) {
            return null;
        }
        java.util.Map map = this.f418932m;
        tf2.b bVar = (tf2.b) ((java.util.LinkedHashMap) map).get(str);
        if (bVar != null) {
            return bVar;
        }
        p05.z0 z0Var = new p05.z0();
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.d2 d2Var = new p05.d2(z0Var);
        go0.w1 w1Var = new go0.w1();
        w1Var.a(d2Var);
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftOnlyProcess", "#setJsonMessageCallback " + w1Var.hashCode() + " cb=" + java.lang.Integer.valueOf(z0Var.hashCode()));
        w1Var.f273899d = z0Var;
        rh0.d0 d0Var = w1Var.f273896a;
        if (d0Var != null) {
            ((p05.l4) d0Var).E(z0Var);
        }
        tf2.b bVar2 = new tf2.b(w1Var, d2Var);
        map.put(str, bVar2);
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftAnimationScheduleController", "#getOrCreateEffectInstance sdkId=".concat(str));
        return bVar2;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        c7();
        b7();
    }
}
