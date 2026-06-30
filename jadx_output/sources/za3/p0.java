package za3;

/* loaded from: classes15.dex */
public class p0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.u0 f471002d;

    public p0(za3.u0 u0Var) {
        this.f471002d = u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    @Override // com.tencent.mm.sdk.platformtools.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTimerExpired() {
        /*
            r7 = this;
            za3.u0 r0 = r7.f471002d
            int r1 = r0.f471033p
            r2 = 3
            java.lang.String r3 = "MicroMsg.TalkRoomServer"
            java.lang.String r4 = ""
            r5 = 0
            p21.c r6 = r0.f471039v
            if (r1 != r2) goto L22
            dh4.f0 r6 = (dh4.f0) r6
            ah4.k r1 = r6.f232526u
            if (r1 != 0) goto L15
            goto L3d
        L15:
            int r1 = r1.o1()     // Catch: android.os.RemoteException -> L1b
        L19:
            short r5 = (short) r1
            goto L3d
        L1b:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r1, r4, r2)
            goto L3d
        L22:
            java.lang.String r1 = r0.f471029i
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 == 0) goto L2b
            return r5
        L2b:
            dh4.f0 r6 = (dh4.f0) r6
            ah4.n r1 = r6.f232525t
            if (r1 != 0) goto L32
            goto L3d
        L32:
            int r1 = r1.o1()     // Catch: android.os.RemoteException -> L37
            goto L19
        L37:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r1, r4, r2)
        L3d:
            float r1 = (float) r5
            r2 = 1092616192(0x41200000, float:10.0)
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L45
            r1 = r2
        L45:
            r2 = 1120403456(0x42c80000, float:100.0)
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L4c
            r1 = r2
        L4c:
            com.tencent.mm.plugin.location.ui.VolumeMeter r3 = r0.f471026f
            float r1 = r1 / r2
            r3.setVolume(r1)
            com.tencent.mm.plugin.location.ui.VolumeMeter r0 = r0.f471026f
            r0.invalidate()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: za3.p0.onTimerExpired():boolean");
    }
}
