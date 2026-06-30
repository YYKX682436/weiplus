package tn1;

/* loaded from: classes12.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f420814a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f420815b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f420816c = new java.util.HashSet();

    /* JADX WARN: Removed duplicated region for block: B:62:0x030c A[LOOP:0: B:7:0x0025->B:62:0x030c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0319 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.util.Map r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn1.e.a(java.util.Map, boolean):void");
    }

    public static int b(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || !str.substring(0, indexOf).contains("<")) {
            return indexOf;
        }
        return -1;
    }

    public static t21.v2 c(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return tn1.f.f().e().h().g(str);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupStorageLogic", "getVideoInfoByFileName fileName is null.");
        return null;
    }

    public static java.lang.String d(com.tencent.mm.storage.f9 f9Var, java.lang.String str, boolean z17) {
        return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(f9Var, str, z17);
    }

    public static com.tencent.mm.pluginsdk.model.app.d e(long j17, java.lang.String str, java.lang.String str2) {
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            return null;
        }
        java.lang.String f17 = com.tencent.mm.pluginsdk.model.app.k0.f(com.tencent.mm.vfs.q7.c("attachment") + '/', v17.n(), v17.f348690o);
        int i17 = v17.f348650e;
        java.lang.String str3 = v17.f348646d;
        java.lang.String str4 = v17.f348694p;
        long j18 = v17.f348682m;
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        dVar.field_fileFullPath = f17;
        dVar.field_appId = str3;
        dVar.field_sdkVer = i17;
        dVar.field_mediaSvrId = str4;
        dVar.field_totalLen = j18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = false, stack = ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        dVar.field_status = 101;
        dVar.field_isUpload = false;
        dVar.field_createTime = c01.id.a();
        dVar.field_lastModifyTime = c01.id.e();
        dVar.field_msgInfoId = j17;
        dVar.field_msgInfoTalker = str;
        dVar.field_netTimes = 0L;
        return dVar;
    }

    public static void f(java.lang.String str) {
        java.util.HashSet hashSet = (java.util.HashSet) f420814a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) tn1.f.f().e().c()).n(str, true);
        if (n17.k2()) {
            ((java.util.HashSet) f420815b).add(n17.d1());
        }
        if (n17.w2()) {
            ((java.util.HashSet) f420816c).add(n17.d1());
        }
        if (((int) n17.E2) == 0) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupStorageLogic", "insertAndPushContact push, talker = " + str);
                tn1.c d17 = tn1.f.f().d();
                d17.f420796a.add(new tn1.b(d17, 2, str));
                ((com.tencent.mm.storage.k4) tn1.f.f().e().c()).h0(new com.tencent.mm.storage.z3(str));
                return;
            }
            if (str.endsWith("@chatroom")) {
                tn1.d e17 = tn1.f.f().e();
                if (e17.f420812o == 0) {
                    throw new c01.c();
                }
                if (((com.tencent.mm.storage.b3) e17.f420806i).L0(str) == null) {
                    tn1.c d18 = tn1.f.f().d();
                    d18.f420796a.add(new tn1.b(d18, 2, str));
                }
            }
        }
    }

    public static long g(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        long R9 = z17 ? ((com.tencent.mm.storage.g9) tn1.f.f().e().g()).R9(f9Var) : ((com.tencent.mm.storage.g9) tn1.f.f().e().g()).Q9(f9Var);
        if (R9 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupStorageLogic", "insertMsgWithContact failed: type:%d, talker:%s", java.lang.Integer.valueOf(f9Var.getType()), f9Var.Q0());
        }
        return R9;
    }

    public static boolean h(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return com.tencent.mm.storage.z3.R4(str);
    }
}
