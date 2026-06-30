package ln1;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f319844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f319845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ln1.x f319846f;

    public v(ln1.x xVar, java.lang.String str, java.lang.String str2) {
        this.f319846f = xVar;
        this.f319844d = str;
        this.f319845e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f319846f.f319855i) {
            ln1.x xVar = this.f319846f;
            if (xVar.f319847a) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupRecoverMerger", "startMergeImpl cancel, msgDataId[%s], transferMsgList[%d], totalMsgList[%d], transferSessions[%d], totalSession[%d]", this.f319844d, java.lang.Long.valueOf(xVar.f319854h), java.lang.Long.valueOf(this.f319846f.f319853g), java.lang.Integer.valueOf(this.f319846f.f319851e.size()), java.lang.Integer.valueOf(this.f319846f.f319852f));
                if (!this.f319846f.f319848b) {
                    this.f319846f.f319848b = true;
                    tn1.e.a(this.f319846f.f319865s, true);
                    ln1.x xVar2 = this.f319846f;
                    ln1.x.a(xVar2, xVar2.f319872z, xVar2.A);
                }
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                try {
                    java.lang.String str = kn1.k.m(this.f319844d) + this.f319844d;
                    com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
                    com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
                    android.util.Pair pair = new android.util.Pair(new com.tencent.mm.pointers.PLong(-1L), new com.tencent.mm.pointers.PLong(-1L));
                    this.f319846f.f319864r = ln1.x.b(r5, str, r5.f319865s, pair, this.f319845e, pString, pBool);
                    oo1.o.f347151a.f(pString.value);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "recoverMsgLists, sessionName = " + pString + ", mMsgListMsgCount = " + this.f319846f.f319864r);
                    try {
                        ln1.x xVar3 = this.f319846f;
                        long j17 = xVar3.f319864r;
                        xVar3.f319858l += j17 > 0 ? j17 : 0L;
                        int size = xVar3.f319851e.size();
                        ln1.x xVar4 = this.f319846f;
                        xVar4.f319851e.add((java.lang.String) xVar4.f319850d.get(this.f319844d));
                        this.f319846f.f319854h++;
                        this.f319846f.f319856j.e().f309609a = 26;
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        kn1.g e17 = this.f319846f.f319856j.e();
                        long j18 = this.f319846f.f319854h;
                        ln1.x xVar5 = this.f319846f;
                        e17.f309612d = (int) (j18 > xVar5.f319853g ? 100L : (xVar5.f319854h * 100) / this.f319846f.f319853g);
                        this.f319846f.i(26);
                        if (this.f319846f.f319851e.size() > size) {
                            ln1.x xVar6 = this.f319846f;
                            xVar6.f319862p.f55370g = xVar6.f319851e.size();
                            ln1.x xVar7 = this.f319846f;
                            xVar7.f319861o.D("MMKV_BACKUP_ERROR_CACHE", xVar7.f319862p.m());
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "transferMsgList = " + this.f319846f.f319854h + ", totalMsgList = " + this.f319846f.f319853g);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImpl msgDataId[%s] merge finish, transferMsgList[%d], transferSessions[%d], msgListMsgCount:%d, receiveMsgCount:%d, costTime:%d", this.f319844d, java.lang.Long.valueOf(this.f319846f.f319854h), java.lang.Integer.valueOf(this.f319846f.f319851e.size()), java.lang.Long.valueOf(this.f319846f.f319864r), java.lang.Long.valueOf(this.f319846f.f319858l), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupRecoverMerger", e18, "startMergeImpl msgDataId[%s] error", this.f319844d);
                    if (z65.c.a()) {
                        throw e18;
                    }
                    try {
                        ln1.x xVar8 = this.f319846f;
                        long j19 = xVar8.f319864r;
                        xVar8.f319858l += j19 > 0 ? j19 : 0L;
                        int size2 = xVar8.f319851e.size();
                        ln1.x xVar9 = this.f319846f;
                        xVar9.f319851e.add((java.lang.String) xVar9.f319850d.get(this.f319844d));
                        this.f319846f.f319854h++;
                        this.f319846f.f319856j.e().f309609a = 26;
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        kn1.g e19 = this.f319846f.f319856j.e();
                        long j27 = this.f319846f.f319854h;
                        ln1.x xVar10 = this.f319846f;
                        e19.f309612d = (int) (j27 > xVar10.f319853g ? 100L : (xVar10.f319854h * 100) / this.f319846f.f319853g);
                        this.f319846f.i(26);
                        if (this.f319846f.f319851e.size() > size2) {
                            ln1.x xVar11 = this.f319846f;
                            xVar11.f319862p.f55370g = xVar11.f319851e.size();
                            ln1.x xVar12 = this.f319846f;
                            xVar12.f319861o.D("MMKV_BACKUP_ERROR_CACHE", xVar12.f319862p.m());
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "transferMsgList = " + this.f319846f.f319854h + ", totalMsgList = " + this.f319846f.f319853g);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImpl msgDataId[%s] merge finish, transferMsgList[%d], transferSessions[%d], msgListMsgCount:%d, receiveMsgCount:%d, costTime:%d", this.f319844d, java.lang.Long.valueOf(this.f319846f.f319854h), java.lang.Integer.valueOf(this.f319846f.f319851e.size()), java.lang.Long.valueOf(this.f319846f.f319864r), java.lang.Long.valueOf(this.f319846f.f319858l), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (java.lang.Throwable th6) {
                try {
                    ln1.x xVar13 = this.f319846f;
                    long j28 = xVar13.f319864r;
                    xVar13.f319858l += j28 > 0 ? j28 : 0L;
                    int size3 = xVar13.f319851e.size();
                    ln1.x xVar14 = this.f319846f;
                    xVar14.f319851e.add((java.lang.String) xVar14.f319850d.get(this.f319844d));
                    this.f319846f.f319854h++;
                    this.f319846f.f319856j.e().f309609a = 26;
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    kn1.g e27 = this.f319846f.f319856j.e();
                    long j29 = this.f319846f.f319854h;
                    ln1.x xVar15 = this.f319846f;
                    e27.f309612d = (int) (j29 > xVar15.f319853g ? 100L : (xVar15.f319854h * 100) / this.f319846f.f319853g);
                    this.f319846f.i(26);
                    if (this.f319846f.f319851e.size() > size3) {
                        ln1.x xVar16 = this.f319846f;
                        xVar16.f319862p.f55370g = xVar16.f319851e.size();
                        ln1.x xVar17 = this.f319846f;
                        xVar17.f319861o.D("MMKV_BACKUP_ERROR_CACHE", xVar17.f319862p.m());
                    }
                } catch (java.lang.Exception unused3) {
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "transferMsgList = " + this.f319846f.f319854h + ", totalMsgList = " + this.f319846f.f319853g);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImpl msgDataId[%s] merge finish, transferMsgList[%d], transferSessions[%d], msgListMsgCount:%d, receiveMsgCount:%d, costTime:%d", this.f319844d, java.lang.Long.valueOf(this.f319846f.f319854h), java.lang.Integer.valueOf(this.f319846f.f319851e.size()), java.lang.Long.valueOf(this.f319846f.f319864r), java.lang.Long.valueOf(this.f319846f.f319858l), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                throw th6;
            }
        }
    }
}
