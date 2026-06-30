package ln1;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f319743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f319744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f319745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f319746g;

    public d(ln1.g gVar, boolean z17, int i17, int i18, byte[] bArr) {
        this.f319743d = z17;
        this.f319744e = i17;
        this.f319745f = i18;
        this.f319746g = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        boolean z17 = this.f319743d;
        int i17 = this.f319744e;
        int i18 = this.f319745f;
        byte[] bArr = this.f319746g;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sn1.i.f410013g;
        sn1.i iVar = concurrentHashMap.containsKey(java.lang.Integer.valueOf(i17)) ? (sn1.i) concurrentHashMap.remove(java.lang.Integer.valueOf(i17)) : null;
        if (z17) {
            if (bArr == null) {
                str = "null";
            } else {
                try {
                    str = new java.lang.String(bArr);
                } catch (java.lang.Exception unused) {
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.BackupBaseScene", "callback error buf content : ".concat(str));
            sn1.i.f410014h.post(new sn1.b(z17, i18, bArr, i17));
            return;
        }
        sn1.i0 i0Var = sn1.i.f410018o;
        if (i0Var != null) {
            i0Var.c();
        }
        if (iVar != null) {
            try {
                if (bArr == null) {
                    throw new java.lang.Exception("buf is null");
                }
                iVar.N().parseFrom(bArr);
                iVar.P(i17);
                return;
            } catch (java.lang.Exception e17) {
                iVar.J(3, -1, "buf to resq fail");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupBaseScene", e17, "%s ", e17.toString());
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupBaseScene", "notify scene null type:%d", java.lang.Integer.valueOf(i18));
        if (i18 != 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupBaseScene", "notify seq:%d, type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            sn1.i.f410014h.post(new sn1.b(z17, i18, bArr, i17));
            return;
        }
        synchronized (concurrentHashMap) {
            java.util.Iterator it = new java.util.HashSet(concurrentHashMap.keySet()).iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = sn1.i.f410013g;
                sn1.i iVar2 = (sn1.i) concurrentHashMap2.get(num);
                if (iVar2 != null) {
                    iVar2.getType();
                }
                if (iVar2 != null && iVar2.getType() == 15) {
                    int intValue = num.intValue();
                    if (concurrentHashMap2.containsKey(java.lang.Integer.valueOf(intValue))) {
                    }
                    try {
                        iVar2.N().parseFrom(bArr);
                        iVar2.P(i17);
                    } catch (java.lang.Exception e18) {
                        iVar2.J(3, -1, "buf to tagResp fail");
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupBaseScene", e18, "buf to tagResp error, type[%d], errMsg:%s ", java.lang.Integer.valueOf(iVar2.getType()), e18.toString());
                    }
                }
            }
        }
    }
}
