package defpackage;

/* loaded from: classes5.dex */
public final class t implements com.tencent.maas.camstudio.j {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f414254d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashSet f414251a = new java.util.LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f414252b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f414253c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f414255e = jz5.h.b(new defpackage.r(this));

    @Override // com.tencent.maas.camstudio.j
    public void a(java.lang.String taskKey) {
        kotlin.jvm.internal.o.g(taskKey, "taskKey");
        com.tencent.mars.xlog.Log.e("MaasTemplateCdnManager", "should not reach here onCancelUpload");
    }

    @Override // com.tencent.maas.camstudio.j
    public void b(com.tencent.maas.camstudio.MJCDNDownloadRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        synchronized (this.f414253c) {
            java.util.LinkedHashSet linkedHashSet = this.f414251a;
            boolean z17 = false;
            if (!(linkedHashSet instanceof java.util.Collection) || !linkedHashSet.isEmpty()) {
                java.util.Iterator it = linkedHashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (kotlin.jvm.internal.o.b(((com.tencent.maas.camstudio.MJCDNDownloadRequest) it.next()).f47865a, request.f47865a)) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                com.tencent.mars.xlog.Log.e("MaasTemplateCdnManager", "already add to waiting tasks");
                return;
            }
            if (this.f414252b.containsKey(request.f47865a)) {
                com.tencent.mars.xlog.Log.e("MaasTemplateCdnManager", "already add to running tasks");
                return;
            }
            if (this.f414252b.size() >= 6) {
                this.f414251a.add(request);
            } else {
                java.lang.String str = request.f47867c;
                kotlin.jvm.internal.o.f(str, "getCDNURL(...)");
                java.lang.String str2 = request.f47868d;
                kotlin.jvm.internal.o.f(str2, "getResultFilePath(...)");
                dn.m e17 = e(str, str2);
                java.util.HashMap hashMap = this.f414252b;
                java.lang.String field_mediaId = e17.field_mediaId;
                kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                java.lang.String str3 = request.f47865a;
                kotlin.jvm.internal.o.f(str3, "getTaskKey(...)");
                hashMap.put(field_mediaId, str3);
                java.lang.String str4 = request.f47865a;
                kotlin.jvm.internal.o.f(str4, "getTaskKey(...)");
                g(e17, str4);
            }
        }
    }

    @Override // com.tencent.maas.camstudio.j
    public void c(com.tencent.maas.camstudio.MJCDNUploadRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.e("MaasTemplateCdnManager", "should not reach here onBeginUpload");
    }

    @Override // com.tencent.maas.camstudio.j
    public void d(java.lang.String taskKey) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(taskKey, "taskKey");
        if (this.f414254d == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MaasTemplateCdnManager", "on cancel ".concat(taskKey));
        synchronized (this.f414253c) {
            if (!pm0.v.c0(this.f414251a, new defpackage.q(taskKey))) {
                java.util.Set entrySet = this.f414252b.entrySet();
                kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
                java.util.Iterator it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((java.util.Map.Entry) obj).getValue(), taskKey)) {
                            break;
                        }
                    }
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (entry != null) {
                    java.lang.Object key = entry.getKey();
                    kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                    java.lang.String str = (java.lang.String) key;
                    ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).wi(str, new java.lang.ref.WeakReference((defpackage.p) ((jz5.n) this.f414255e).getValue()));
                    this.f414252b.remove(str);
                    f();
                }
            }
        }
    }

    public final dn.m e(java.lang.String str, java.lang.String str2) {
        dn.j jVar = new dn.j();
        jVar.f241785d = "task_FinderCdnDownloader";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder-template-down-");
        byte[] bytes = ("" + str).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        jVar.field_mediaId = sb6.toString();
        jVar.G1 = str2;
        jVar.field_fullpath = str2;
        jVar.E1 = new java.net.URL(str).getHost();
        jVar.D1 = str;
        jVar.field_fileType = 5;
        jVar.field_talker = "";
        jVar.field_priority = 2;
        jVar.field_needStorage = true;
        jVar.field_isStreamMedia = false;
        jVar.field_appType = com.tencent.mm.plugin.appbrand.jsapi.pay.k2.CTRL_INDEX;
        jVar.field_bzScene = 2;
        return jVar;
    }

    public final void f() {
        synchronized (this.f414253c) {
            while (this.f414252b.size() < 6) {
                com.tencent.maas.camstudio.MJCDNDownloadRequest mJCDNDownloadRequest = (com.tencent.maas.camstudio.MJCDNDownloadRequest) pm0.v.a0(this.f414251a, new defpackage.s(this));
                if (mJCDNDownloadRequest == null) {
                    return;
                }
                java.lang.String str = mJCDNDownloadRequest.f47867c;
                kotlin.jvm.internal.o.f(str, "getCDNURL(...)");
                java.lang.String str2 = mJCDNDownloadRequest.f47868d;
                kotlin.jvm.internal.o.f(str2, "getResultFilePath(...)");
                dn.m e17 = e(str, str2);
                java.util.HashMap hashMap = this.f414252b;
                java.lang.String field_mediaId = e17.field_mediaId;
                kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                java.lang.String str3 = mJCDNDownloadRequest.f47865a;
                kotlin.jvm.internal.o.f(str3, "getTaskKey(...)");
                hashMap.put(field_mediaId, str3);
                java.lang.String str4 = mJCDNDownloadRequest.f47865a;
                kotlin.jvm.internal.o.f(str4, "getTaskKey(...)");
                g(e17, str4);
            }
        }
    }

    public final void g(dn.m mVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MaasTemplateCdnManager", "add key " + str + " success");
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference((defpackage.p) ((jz5.n) this.f414255e).getValue()));
    }
}
