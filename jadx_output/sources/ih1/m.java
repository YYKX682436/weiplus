package ih1;

/* loaded from: classes7.dex */
public final class m implements gq0.v, jc3.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f291510d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f291511e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f291512f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public volatile java.util.List f291513g = kz5.p0.f313996d;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f291514h;

    /* renamed from: i, reason: collision with root package name */
    public final ih1.j f291515i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291516m;

    public m(ih1.u uVar) {
        this.f291516m = uVar;
        this.f291515i = new ih1.j(uVar, this);
    }

    @Override // gq0.v
    public void S3(java.lang.String frameSetId) {
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId[");
        ih1.u uVar = this.f291516m;
        sb6.append(uVar.f291530a);
        sb6.append("], notifyFrameSetRemove, frameSetId: ");
        sb6.append(frameSetId);
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", sb6.toString());
        ((com.tencent.mm.plugin.appbrand.service.i0) uVar.f291531b).a();
    }

    @Override // gq0.v
    public java.util.List V2() {
        java.util.Collection values = this.f291510d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Collection<ih1.v> collection = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        for (ih1.v vVar : collection) {
            arrayList.add(new gq0.u(vVar.f291544c, vVar.f291545d));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r20.f291513g.isEmpty() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(mq0.z r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ih1.m.a(mq0.z, java.util.Map):void");
    }

    @Override // jc3.l0
    public void b1() {
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f291516m.f291530a + "], notifyConnException, hasDestroy[" + this.f291516m.f291534e + ']');
        java.util.Collection values = this.f291510d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            if (((ih1.v) obj).f291545d) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ih1.v) it.next()).f291544c);
        }
        this.f291513g = arrayList2;
        this.f291514h = false;
        ((com.tencent.mm.plugin.appbrand.service.i0) this.f291516m.f291531b).a();
    }

    @Override // qp0.c
    public void ca(java.lang.String event, java.util.HashMap hashMap, yz5.q callback) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(callback, "callback");
        boolean b17 = kotlin.jvm.internal.o.b("getAppBrandService", event);
        ih1.u uVar = this.f291516m;
        if (b17) {
            callback.invoke(0, "", kz5.c1.i(new jz5.l("service", ((com.tencent.mm.plugin.appbrand.service.i0) uVar.f291531b).f88685a)));
        } else if (kotlin.jvm.internal.o.b("postMessageToWeApp", event) && hashMap != null && kotlin.jvm.internal.o.b(hashMap.get("bizName"), "MagicAdMiniProgram")) {
            ((com.tencent.mm.plugin.appbrand.service.i0) uVar.f291531b).f88685a.g(hashMap.get("eventName") != null ? java.lang.String.valueOf(hashMap.get("eventName")) : null, hashMap.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE) != null ? java.lang.String.valueOf(hashMap.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) : null);
            callback.invoke(0, "", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0107  */
    @Override // jc3.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0(boolean r14) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ih1.m.d0(boolean):void");
    }

    @Override // gq0.v
    public void n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId[");
        ih1.u uVar = this.f291516m;
        sb6.append(uVar.f291530a);
        sb6.append("], onMainScriptInjected, notify frontend bizCreated");
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", sb6.toString());
        ((com.tencent.mm.plugin.appbrand.service.i0) uVar.f291531b).f88685a.g("mbAd_notifyBizCreated", "");
    }

    @Override // gq0.v
    public void og(org.json.JSONObject data, yz5.l callback) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        ym5.a1.f(new ih1.l(this.f291516m, data, this, callback));
    }

    @Override // jc3.l0
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f291516m.f291530a + "], notifyDestroyBiz, hasDestroy[" + this.f291516m.f291534e + ']');
        java.util.Collection values = this.f291512f.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            this.f291511e.removeCallbacks((java.lang.Runnable) it.next());
        }
        this.f291512f.clear();
        java.util.Collection<ih1.v> values2 = this.f291510d.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        ih1.u uVar = this.f291516m;
        for (ih1.v vVar : values2) {
            if (vVar.f291545d) {
                mq0.d0 d0Var = (mq0.d0) i95.n0.c(mq0.d0.class);
                java.lang.String str = vVar.f291542a;
                java.lang.String a17 = vVar.f291543b.a();
                java.lang.String str2 = vVar.f291544c;
                ((mq0.s0) d0Var).Ai(str, a17, str2, mq0.a.f330515g, true, str2, kz5.c1.k(new jz5.l("appId", uVar.f291530a), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "destroyBiz")));
            }
        }
        this.f291510d.clear();
    }

    @Override // gq0.v
    public jc3.m xc(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return this.f291515i;
    }
}
