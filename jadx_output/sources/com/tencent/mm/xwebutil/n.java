package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class n extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214854a;

    public n(java.lang.String str) {
        this.f214854a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            java.lang.String r4 = "XFilesAudioPlayerLogic"
            if (r5 != 0) goto L5
            goto L5c
        L5:
            java.lang.String r0 = r5.getAction()
            if (r0 == 0) goto L5c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L12
            goto L5c
        L12:
            java.lang.String r1 = "android.intent.action.HEADSET_PLUG"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L30
            java.lang.String r1 = "state"
            boolean r2 = r5.hasExtra(r1)
            if (r2 == 0) goto L30
            r2 = 2
            int r1 = r5.getIntExtra(r1, r2)
            if (r1 != 0) goto L30
            java.lang.String r5 = "isEarPhoneDisconnect ACTION_HEADSET_PLUG"
            com.tencent.mars.xlog.Log.i(r4, r5)
            goto L5a
        L30:
            java.lang.String r1 = "android.media.AUDIO_BECOMING_NOISY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3e
            java.lang.String r5 = "isEarPhoneDisconnect ACTION_AUDIO_BECOMING_NOISY"
            com.tencent.mars.xlog.Log.i(r4, r5)
            goto L5a
        L3e:
            java.lang.String r1 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
            java.lang.String r0 = "android.bluetooth.profile.extra.STATE"
            boolean r1 = r5.hasExtra(r0)
            if (r1 == 0) goto L5c
            r1 = -1
            int r5 = r5.getIntExtra(r0, r1)
            if (r5 != 0) goto L5c
            java.lang.String r5 = "isEarPhoneDisconnect ACTION_CONNECTION_STATE_CHANGED"
            com.tencent.mars.xlog.Log.i(r4, r5)
        L5a:
            r5 = 1
            goto L5d
        L5c:
            r5 = 0
        L5d:
            if (r5 != 0) goto L60
            return
        L60:
            java.lang.String r5 = r3.f214854a
            boolean r5 = com.tencent.mm.xwebutil.q.b(r5)
            if (r5 != 0) goto L6e
            java.lang.String r5 = "broadcastReceiver onReceive, sCurrentParams invalid"
            com.tencent.mars.xlog.Log.e(r4, r5)
            return
        L6e:
            com.tencent.mm.xwebutil.r r5 = com.tencent.mm.xwebutil.q.f214868a
            com.tencent.thumbplayer.api.ITPPlayer r5 = r5.f214877h
            if (r5 != 0) goto L7a
            java.lang.String r5 = "broadcastReceiver onReceive, tpPlayer invalid"
            com.tencent.mars.xlog.Log.e(r4, r5)
            return
        L7a:
            java.lang.String r0 = "broadcastReceiver earphone disconnect, try pause"
            com.tencent.mars.xlog.Log.i(r4, r0)     // Catch: java.lang.Throwable -> L8a
            int r0 = r5.getCurrentState()     // Catch: java.lang.Throwable -> L8a
            r1 = 5
            if (r0 != r1) goto La5
            r5.pause()     // Catch: java.lang.Throwable -> L8a
            goto La5
        L8a:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "broadcastReceiver pause error: "
            r0.<init>(r1)
            java.lang.String r1 = r5.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.e(r4, r0)
            java.lang.String r4 = "broadcastReceiver pause error "
            com.tencent.mm.xwebutil.q.d(r4, r5)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xwebutil.n.onReceive(android.content.Context, android.content.Intent):void");
    }
}
