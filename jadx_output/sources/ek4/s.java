package ek4;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f253685a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f253686b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f253687c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f253688d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f253689e;

    public s() {
        new java.util.HashMap();
        new java.util.HashMap();
        this.f253687c = new java.util.HashMap();
        this.f253688d = new java.util.HashMap();
        this.f253689e = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public static final /* synthetic */ java.lang.String a(ek4.s sVar) {
        sVar.getClass();
        return "MicroMsg.TP.CdnTaskController";
    }

    public static final int b(ek4.s sVar, dn.o oVar) {
        java.util.HashMap hashMap = sVar.f253686b;
        java.lang.String field_mediaId = oVar.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        hashMap.put(field_mediaId, oVar);
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).getClass();
        int k17 = com.tencent.mm.modelcdntran.s1.cj().k(oVar);
        if (k17 != 0) {
            hashMap.remove(oVar.field_mediaId);
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = sVar.f253689e;
        java.lang.String field_mediaId2 = oVar.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId2, "field_mediaId");
        ek4.t.c(copyOnWriteArrayList, field_mediaId2, k17, oVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "startJniPreloadTask " + oVar.field_mediaId + ' ' + k17);
        return k17;
    }

    public static final java.util.HashMap c(ek4.s sVar) {
        java.util.HashMap hashMap = sVar.f253685a;
        if (hashMap.size() <= 0) {
            return null;
        }
        java.lang.Object clone = hashMap.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.tencent.mm.cdn.keep_VideoTaskInfo>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.tencent.mm.cdn.keep_VideoTaskInfo> }");
        java.util.HashMap hashMap2 = (java.util.HashMap) clone;
        for (java.util.Map.Entry entry : hashMap2.entrySet()) {
            dn.b bVar = new dn.b();
            sVar.i((java.lang.String) entry.getKey(), bVar);
            sVar.f253687c.put(entry.getKey(), entry.getValue());
            sVar.f253688d.put(entry.getKey(), bVar);
        }
        return hashMap2;
    }

    public static final int d(ek4.s sVar, java.lang.String str, dn.c cVar) {
        dn.l lVar;
        sVar.getClass();
        int aj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).aj(str, cVar);
        dn.o oVar = (dn.o) sVar.f253686b.remove(str);
        if (oVar != null && (lVar = oVar.f241796p0) != null) {
            if (aj6 == 0) {
                cVar.field_recvedTotalBytes = cVar.field_recvedBytes;
                lVar.x(str, cVar);
            } else {
                lVar.x(str, null);
            }
        }
        ek4.t.d(sVar.f253689e, str, aj6, cVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopJniPreloadTask ");
        sb6.append(str);
        sb6.append(' ');
        sb6.append(aj6);
        sb6.append(" preloadCallback is null?");
        sb6.append((oVar != null ? oVar.f241796p0 : null) == null);
        sb6.append(" result:");
        sb6.append(cVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", sb6.toString());
        return aj6;
    }

    public void e(ek4.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f253689e;
        if (copyOnWriteArrayList.contains(callback)) {
            return;
        }
        copyOnWriteArrayList.add(callback);
    }

    public int f(java.lang.String mediaId, long j17, long j18, int i17, ek4.v vVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (this.f253685a.containsKey(mediaId)) {
            pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.l(this, mediaId, j17, j18, i17, vVar));
            return 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "requestVideoData not running id mediaId:" + mediaId + " offset:" + j17 + " length:" + j18);
        return 0;
    }

    public boolean g(dn.o task, ek4.w wVar) {
        kotlin.jvm.internal.o.g(task, "task");
        if (com.tencent.mm.sdk.platformtools.t8.K0(task.field_mediaId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TP.CdnTaskController", "add download task, but task mediaId is null.");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "startPreloadDownloadTask: " + task.field_mediaId + " current run tasks " + this.f253686b.size());
        if (task.field_fileId == null) {
            task.field_fileId = "";
        }
        if (task.field_aesKey == null) {
            task.field_aesKey = "";
        }
        task.f241786e = false;
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.m(this, task, wVar));
        return true;
    }

    public boolean h(java.lang.String mediaId, ek4.u createCallback, ek4.x xVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(createCallback, "createCallback");
        if (mediaId.length() == 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "startStreamDownloadTaskAsync mediaId:".concat(mediaId));
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.o(createCallback, mediaId, this, xVar));
        return true;
    }

    public final int i(java.lang.String str, dn.b bVar) {
        int aj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).aj(str, bVar);
        if (aj6 == -21008 || aj6 == -21007 || aj6 == 0) {
            this.f253685a.remove(str);
        }
        ek4.t.d(this.f253689e, str, aj6, bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "stopJniStreamTask " + str + ' ' + aj6);
        return aj6;
    }

    public boolean j(java.lang.String mediaId, ek4.y yVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.p(this, mediaId, yVar));
        return true;
    }

    public boolean k(java.lang.String mediaId, ek4.z zVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "stopStreamDownloadTask " + mediaId + ' ' + zVar + " runningStreamTask:" + this.f253685a.size());
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.q(this, mediaId, zVar));
        return true;
    }
}
