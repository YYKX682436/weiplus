package ny3;

/* loaded from: classes.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f341440e = {l75.n0.getCreateSQLs(ny3.a.f341439p, "RtosQuickReplyInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f341441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, ny3.a.f341439p, "RtosQuickReplyInfo", null);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f341441d = db6;
    }

    public final boolean D0(java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertList size = ");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", sb6.toString());
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        l75.k0 k0Var = this.f341441d;
        long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (k0Var.m("RtosQuickReplyInfo", "orderIndex", ((ny3.a) it.next()).convertTo()) < 0) {
                if (k0Var != null) {
                    k0Var.w(java.lang.Long.valueOf(F));
                }
                return false;
            }
        }
        if (k0Var == null) {
            return true;
        }
        k0Var.w(java.lang.Long.valueOf(F));
        return true;
    }

    public final boolean J0(ny3.a info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (com.tencent.mm.sdk.platformtools.t8.K0(info.field_quickMsg)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "insertOrUpdate fail. msg is empty.");
            return false;
        }
        if (get(info, new java.lang.String[0])) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "insertOrUpdate exist update");
            return super.replace(info, false);
        }
        boolean insertNotify = super.insertNotify(info, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "insertOrUpdate ret=" + insertNotify);
        return insertNotify;
    }

    public final boolean y0() {
        int delete = this.f341441d.delete("RtosQuickReplyInfo", "", null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "deleteAll result=" + delete);
        return delete >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r10 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r10.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r1 = new ny3.a();
        r1.convertFrom(r10);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r10.moveToNext() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList z0() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r8 = "orderIndex ASC"
            r10 = 0
            l75.k0 r1 = r11.f341441d     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.lang.String r2 = "RtosQuickReplyInfo"
            r3 = 0
            r6 = 0
            r7 = 0
            r9 = 2
            android.database.Cursor r10 = r1.D(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r10 == 0) goto L30
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r1 == 0) goto L30
        L1f:
            ny3.a r1 = new ny3.a     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r1.<init>()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r1.convertFrom(r10)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r0.add(r1)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r1 != 0) goto L1f
        L30:
            if (r10 == 0) goto L47
        L32:
            r10.close()
            goto L47
        L36:
            r0 = move-exception
            goto L48
        L38:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.Rtos.RtosQuickReplyInfoStorage"
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z3.c(r1)     // Catch: java.lang.Throwable -> L36
            com.tencent.mars.xlog.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto L47
            goto L32
        L47:
            return r0
        L48:
            if (r10 == 0) goto L4d
            r10.close()
        L4d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ny3.b.z0():java.util.ArrayList");
    }
}
