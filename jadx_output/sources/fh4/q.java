package fh4;

/* loaded from: classes15.dex */
public class q implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.talkroom.ui.TalkRoomUI f262704d;

    public q(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI) {
        this.f262704d = talkRoomUI;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    @Override // com.tencent.mm.sdk.platformtools.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTimerExpired() {
        /*
            r7 = this;
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r0 = r7.f262704d
            int r1 = r0.f172471v
            java.lang.String r2 = "MicroMsg.TalkRoomServer"
            java.lang.String r3 = ""
            r4 = 3
            r5 = 0
            if (r1 != r4) goto L23
            dh4.f0 r1 = dh4.l.Di()
            ah4.k r1 = r1.f232526u
            if (r1 != 0) goto L16
        L14:
            r1 = r5
            goto L44
        L16:
            int r1 = r1.o1()     // Catch: android.os.RemoteException -> L1c
        L1a:
            short r1 = (short) r1
            goto L44
        L1c:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r1, r3, r4)
            goto L14
        L23:
            java.lang.String r1 = r0.f172469t
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 == 0) goto L2f
            r0.Q6()
            return r5
        L2f:
            dh4.f0 r1 = dh4.l.Di()
            ah4.n r1 = r1.f232525t
            if (r1 != 0) goto L38
            goto L14
        L38:
            int r1 = r1.o1()     // Catch: android.os.RemoteException -> L3d
            goto L1a
        L3d:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r1, r3, r4)
            goto L14
        L44:
            r2 = 15
            r3 = 1
            if (r1 > r2) goto L5d
            boolean r1 = r0.f172474y
            if (r1 == 0) goto L4e
            goto L4f
        L4e:
            r2 = r5
        L4f:
            int r4 = r0.f172475z
            int r4 = r4 + r3
            r0.f172475z = r4
            r6 = 5
            if (r4 < r6) goto L5c
            r1 = r1 ^ r3
            r0.f172474y = r1
            r0.f172475z = r5
        L5c:
            r1 = r2
        L5d:
            r0.Q6()
            com.tencent.mm.plugin.talkroom.ui.TalkRoomVolumeMeter r0 = r0.f172464o
            r0.setValue(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fh4.q.onTimerExpired():boolean");
    }
}
