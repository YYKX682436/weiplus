package d83;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class})
/* loaded from: classes15.dex */
public final class u extends i95.w implements e70.z {

    /* renamed from: d, reason: collision with root package name */
    public final int f227029d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f227030e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final int f227031f = 3;

    /* renamed from: g, reason: collision with root package name */
    public final int f227032g = 4;

    /* renamed from: h, reason: collision with root package name */
    public final int f227033h = 5;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f227034i = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f227035m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f227036n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f227037o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.ilink.NetworkManager f227038p;

    public final void Ai(java.util.List list, java.util.Map map, java.util.List list2, java.util.Map map2, e70.t tVar, int i17, long j17, int i18, int i19, com.tencent.mm.protobuf.g gVar, e70.s sVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (tVar != e70.t.f249855d) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                hashMap.put((java.lang.String) it.next(), java.lang.Integer.valueOf(tVar.ordinal()));
            }
        } else if (map2 != null) {
            hashMap.putAll(map2);
        }
        if (sVar != null) {
            sVar.d(list, map, list2, hashMap, tVar, i17, j17, i18, i19, gVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Bi(e70.w r12, e70.s r13) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d83.u.Bi(e70.w, e70.s):void");
    }

    public void Di() {
        d83.e0 e0Var = d83.e0.f226958a;
        e0Var.getClass();
        synchronized (d83.e0.f226960c) {
            if (!d83.e0.f226959b) {
                e0Var.a();
                d83.e0.f226959b = true;
            }
        }
    }

    public final void Ni() {
        synchronized (this.f227034i) {
            com.tencent.ilink.NetworkManager networkManager = this.f227038p;
            if (networkManager == null && networkManager == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkFeatureService", "initNetworkManager!");
                com.tencent.ilink.CloudSession cloudSession = d83.e0.f226963f;
                kotlin.jvm.internal.o.d(cloudSession);
                com.tencent.ilink.NetworkManager newNetworkManager = cloudSession.newNetworkManager();
                this.f227038p = newNetworkManager;
                if (newNetworkManager != null) {
                    newNetworkManager.subscribeReceiveAppMessageEvent("ILinkFeatureService.initNetworkManager", new d83.t(this));
                }
            }
        }
    }

    public final java.util.ArrayList Ri(java.util.LinkedList linkedList) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.tq6 tq6Var = (r45.tq6) it.next();
            f83.b bVar = new f83.b();
            int i17 = tq6Var.f386714p;
            bVar.field_resourceRet = i17;
            bVar.field_projectId = tq6Var.f386705d;
            bVar.field_resourceName = tq6Var.f386706e;
            if (i17 >= 0) {
                bVar.field_resourceVersion = tq6Var.f386707f;
                bVar.field_resourceSize = tq6Var.f386708g;
                bVar.field_url = tq6Var.f386710i;
                bVar.field_md5 = tq6Var.f386709h;
                bVar.field_createTime = tq6Var.f386711m;
                bVar.field_resourceType = tq6Var.f386715q;
                bVar.field_resourceExpireTime = tq6Var.f386716r;
                bVar.field_resourceStoreType = tq6Var.f386717s;
                r45.qk0 qk0Var = tq6Var.f386718t;
                if (qk0Var != null) {
                    bVar.field_encryptAlgo = qk0Var.f384069d;
                    bVar.field_encryptFileSize = qk0Var.f384070e;
                    bVar.field_encryptMd5 = qk0Var.f384071f;
                    bVar.field_encryptUrl = qk0Var.f384072g;
                    com.tencent.mm.protobuf.g gVar = qk0Var.f384073h;
                    bVar.field_encryptKey = gVar != null ? gVar.g() : null;
                    com.tencent.mm.protobuf.g gVar2 = qk0Var.f384074i;
                    bVar.field_encryptIv = gVar2 != null ? gVar2.g() : null;
                    com.tencent.mm.protobuf.g gVar3 = qk0Var.f384075m;
                    bVar.field_encryptTag = gVar3 != null ? gVar3.g() : null;
                    com.tencent.mm.protobuf.g gVar4 = qk0Var.f384076n;
                    bVar.field_encryptAad = gVar4 != null ? gVar4.g() : null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int size = tq6Var.f386712n.f382456d.size();
                for (int i18 = 0; i18 < size; i18++) {
                    arrayList2.add(kz5.b1.e(new jz5.l(((r45.yq6) tq6Var.f386712n.f382456d.get(i18)).f391308d, ((r45.yq6) tq6Var.f386712n.f382456d.get(i18)).f391309e)));
                }
                bVar.v0(arrayList2);
                r45.xq6 xq6Var = tq6Var.f386713o;
                if (xq6Var != null) {
                    bVar.field_baseVersion = xq6Var.f390342d;
                    bVar.field_diffAlgo = xq6Var.f390343e;
                    bVar.field_diffSize = xq6Var.f390344f;
                    bVar.field_diffMd5 = xq6Var.f390345g;
                    bVar.field_diffUrl = xq6Var.f390346h;
                    r45.qk0 qk0Var2 = xq6Var.f390347i;
                    if (qk0Var2 != null) {
                        bVar.field_diffEncryptAlgo = qk0Var2.f384069d;
                        bVar.field_diffEncryptFileSize = qk0Var2.f384070e;
                        bVar.field_diffEncryptMd5 = qk0Var2.f384071f;
                        bVar.field_diffEncryptUrl = qk0Var2.f384072g;
                        com.tencent.mm.protobuf.g gVar5 = qk0Var2.f384073h;
                        bVar.field_diffEncryptKey = gVar5 != null ? gVar5.g() : null;
                        com.tencent.mm.protobuf.g gVar6 = qk0Var2.f384074i;
                        bVar.field_diffEncryptIv = gVar6 != null ? gVar6.g() : null;
                        com.tencent.mm.protobuf.g gVar7 = qk0Var2.f384075m;
                        bVar.field_diffEncryptTag = gVar7 != null ? gVar7.g() : null;
                        com.tencent.mm.protobuf.g gVar8 = qk0Var2.f384076n;
                        bVar.field_diffEncryptAad = gVar8 != null ? gVar8.g() : null;
                    }
                }
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkFeatureService", "onAccountReleased!");
        super.onAccountReleased(context);
        synchronized (this.f227034i) {
            com.tencent.ilink.NetworkManager networkManager = this.f227038p;
            if (networkManager != null) {
                networkManager.manualDestroy();
                this.f227038p = null;
            }
        }
        d83.e0 e0Var = d83.e0.f226958a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "logout: " + d83.e0.f226959b);
        if (d83.e0.f226959b && com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "logout: real logout");
            com.tencent.ilink.CloudSession cloudSession = d83.e0.f226963f;
            if (cloudSession != null) {
                cloudSession.logoutAsync(d83.c0.f226954a);
            }
        }
        synchronized (d83.e0.f226960c) {
            if (d83.e0.f226959b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "unInitILink");
                com.tencent.mars.xlog.Log.i(((wx.q) ((wx.c1) i95.n0.c(wx.c1.class))).f450429d, "releaseAffAsync");
                wx.o.f450424a.b();
                ((jp5.o) i95.n0.c(jp5.o.class)).j();
                ((fa0.t) ((fa0.q) i95.n0.c(fa0.q.class))).getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "unInit ret:" + com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.UnInit());
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).getClass();
                    if (yn1.z0.f463933a.n()) {
                        com.tencent.wechat.aff.migration.f.f217390b.n(bw5.he0.MOBILE);
                    } else {
                        com.tencent.mars.xlog.Log.w("MM.Mig.RoamMigrationService", "[closeCDNConnection] GlobalHolder is not initialized");
                    }
                }
                com.tencent.ilink.CloudSession cloudSession2 = d83.e0.f226963f;
                kotlin.jvm.internal.o.d(cloudSession2);
                cloudSession2.manualDestroy();
                d83.e0.f226963f = null;
                com.tencent.ilink.IlinkContext.getInstance().uninit();
                com.tencent.mm.app.w.INSTANCE.p(d83.e0.f226965h);
                ((com.tencent.mm.plugin.ilink.net_change.a) ((jz5.n) d83.e0.f226964g).getValue()).b();
                d83.e0.f226959b = false;
            }
        }
        kotlinx.coroutines.z0.e(d83.e0.f226961d, null, 1, null);
        d83.e0.f226961d = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public final void wi(java.util.List list, java.util.Map map, java.util.Map map2, java.util.List list2, java.util.Map map3, e70.t tVar, int i17, long j17, e70.s sVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (tVar != e70.t.f249855d) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                hashMap.put((java.lang.String) it.next(), java.lang.Integer.valueOf(tVar.ordinal()));
            }
        } else if (map3 != null) {
            hashMap.putAll(map3);
        }
        if (sVar != null) {
            sVar.a(list, map, map2, list2, hashMap, tVar, i17, j17);
        }
    }
}
