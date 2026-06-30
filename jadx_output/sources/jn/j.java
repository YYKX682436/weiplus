package jn;

/* loaded from: classes11.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.Future f300469a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f300470b = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f300471c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300472d = "";

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f300473e = new jn.h(this, "OpenImMigrateService");

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f300474f = new jn.i(this);

    public static void a(jn.j jVar, java.lang.String str) {
        jVar.getClass();
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 != null) {
            z07.field_openIMRoomMigrateStatus = 3;
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(z07);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.autogen.mmdata.rpt.OpenImMigrateStruct openImMigrateStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenImMigrateStruct();
        openImMigrateStruct.f59803d = openImMigrateStruct.b("roomID", str, true);
        openImMigrateStruct.f59804e = openImMigrateStruct.b("oldRoomID", str2, true);
        openImMigrateStruct.f59805f = i17;
        openImMigrateStruct.k();
    }

    public void b(java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = str2 == null ? "" : str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.openIm.OpenImMigrateService", "addFirstMigrateTask %s %s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str2, this.f300472d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.openIm.OpenImMigrateService", "addFirstMigrateTask in curChatName");
            return;
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f300470b;
        if (concurrentLinkedDeque.contains(str)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = str != null ? str : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.openIm.OpenImMigrateService", "addFirstMigrateTask %s exist", objArr2);
            concurrentLinkedDeque.remove(str);
        } else {
            this.f300471c.put(str, str2);
        }
        concurrentLinkedDeque.addFirst(str);
        e();
    }

    public void c(java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = str2 == null ? "" : str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.openIm.OpenImMigrateService", "addMigrateTask %s %s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str2, this.f300472d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.openIm.OpenImMigrateService", "addMigrateTask in curChatName");
            return;
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f300470b;
        if (!concurrentLinkedDeque.contains(str)) {
            this.f300471c.put(str, str2);
            concurrentLinkedDeque.add(str);
            e();
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            if (str == null) {
                str = "";
            }
            objArr2[0] = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.openIm.OpenImMigrateService", "addMigrateTask %s exist", objArr2);
        }
    }

    public final void e() {
        java.util.concurrent.Future future = this.f300469a;
        if (future != null && !future.isDone()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.w("MicroMsg.openIm.OpenImMigrateService", "running stack:%s", new com.tencent.mm.sdk.platformtools.z3());
            return;
        }
        this.f300469a = ((ku5.t0) ku5.t0.f312615d).h(this.f300474f, "migrate_tag");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.openIm.OpenImMigrateService", "run stack:%s", new com.tencent.mm.sdk.platformtools.z3());
    }
}
