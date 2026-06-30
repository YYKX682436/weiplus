package w32;

/* loaded from: classes13.dex */
public class a implements w32.c {

    /* renamed from: a, reason: collision with root package name */
    public final i32.d f442667a;

    /* renamed from: b, reason: collision with root package name */
    public w32.d f442668b;

    /* renamed from: c, reason: collision with root package name */
    public w32.o f442669c = null;

    public a(i32.d dVar, w32.d dVar2) {
        this.f442667a = null;
        this.f442667a = dVar;
        this.f442668b = dVar2;
    }

    public boolean b(u32.n0 n0Var) {
        long j17;
        if (n0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceTask", "dispatcher is null");
            return false;
        }
        if (this.f442669c != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceTask", "Prev task is still working!!!");
            return false;
        }
        i32.d dVar = this.f442667a;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceTask", "------startTask begin------cmdReqId = %d, cmdRespId = %d, deviceId = %d", java.lang.Short.valueOf(dVar.b()), java.lang.Short.valueOf(dVar.f288120b), java.lang.Long.valueOf(dVar.f288119a));
        w32.o oVar = new w32.o(dVar, this);
        try {
            j17 = ((u32.k1) n0Var).f424318a.L1(oVar);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "startTask failed!!! %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
            j17 = -1;
        }
        if (-1 == j17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceTask", "dispatcher.startTask Failed!!!");
            return false;
        }
        this.f442669c = oVar;
        w32.n nVar = oVar.f442697e;
        iz5.a.d(null, nVar);
        nVar.f442694f = false;
        gm0.j1.e().d().postDelayed(nVar.f442695g, 15000L);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (((u32.k1) u32.h1.c().f99006a).e(r7.f288119a) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r9, int r11, int r12, java.lang.String r13, u32.w0 r14) {
        /*
            r8 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            i32.d r7 = r8.f442667a
            long r3 = r7.f288119a
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            short r3 = r7.b()
            java.lang.Short r5 = java.lang.Short.valueOf(r3)
            short r3 = r7.f288120b
            java.lang.Short r6 = java.lang.Short.valueOf(r3)
            r3 = r13
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6}
            java.lang.String r1 = "MicroMsg.exdevice.ExDeviceTask"
            java.lang.String r2 = "------onTaskEnd------ taskId = %d, errType = %d, errCode = %d, errMsg = %s, deviceId = %d, reqCmdId = %d, respCmdId = %d"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            long r2 = r7.f288119a
            r0 = 1
            r4 = 0
            if (r11 != 0) goto L36
            r5 = r0
            goto L37
        L36:
            r5 = r4
        L37:
            t32.a.a(r2, r5)
            if (r14 == 0) goto L47
            w32.o r2 = r8.f442669c
            if (r14 == r2) goto L47
            java.lang.String r9 = "netCmd != mRemoteTask"
            com.tencent.mars.xlog.Log.e(r1, r9)
            return
        L47:
            r14 = -1
            if (r14 != r11) goto L52
            r14 = -2
            if (r14 != r12) goto L52
            java.lang.String r14 = "Time Out in local!!!"
            com.tencent.mars.xlog.Log.e(r1, r14)
        L52:
            o32.e r14 = r7.f288121c
            if (r14 == 0) goto L59
            int r2 = r14.f342694d
            goto L5a
        L59:
            r2 = r4
        L5a:
            r3 = -5
            if (r3 == r2) goto L63
            r3 = -3
            if (r3 == r2) goto L63
            r3 = -4
            if (r3 != r2) goto L9a
        L63:
            int r14 = r14.f342694d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            long r2 = r7.f288119a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r2}
            java.lang.String r2 = "ErrorCode = %d, destroy channel(deviceId = %d)"
            com.tencent.mars.xlog.Log.w(r1, r2, r14)
            com.tencent.mm.plugin.exdevice.model.o r14 = u32.h1.c()
            u32.n0 r14 = r14.f99006a
            if (r14 == 0) goto L91
            com.tencent.mm.plugin.exdevice.model.o r14 = u32.h1.c()
            u32.n0 r14 = r14.f99006a
            long r2 = r7.f288119a
            u32.k1 r14 = (u32.k1) r14
            boolean r14 = r14.e(r2)
            if (r14 == 0) goto L91
            goto L92
        L91:
            r0 = r4
        L92:
            if (r0 != 0) goto L9a
            java.lang.String r14 = "stopChannel Failed!!!"
            com.tencent.mars.xlog.Log.e(r1, r14)
        L9a:
            w32.d r2 = r8.f442668b
            if (r2 == 0) goto La5
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r2.a(r3, r5, r6, r7)
        La5:
            r9 = 0
            r8.f442669c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w32.a.c(long, int, int, java.lang.String, u32.w0):void");
    }
}
