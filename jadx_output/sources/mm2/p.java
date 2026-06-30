package mm2;

/* loaded from: classes10.dex */
public final class p implements mn0.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f329341d;

    public p(mm2.w wVar) {
        this.f329341d = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.getPlayer().isPlaying() == true) goto L8;
     */
    @Override // mn0.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j6() {
        /*
            r3 = this;
            mm2.w r0 = r3.f329341d
            mm2.h r1 = r0.f329504p
            if (r1 == 0) goto L12
            rh3.o r1 = r1.getPlayer()
            boolean r1 = r1.isPlaying()
            r2 = 1
            if (r1 != r2) goto L12
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L1c
            mm2.h r0 = r0.f329504p
            if (r0 == 0) goto L1c
            r0.q()
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.p.j6():void");
    }

    @Override // mn0.c0
    public void u() {
        r45.ce2 curLiveAdInfo;
        mm2.w wVar = this.f329341d;
        mm2.h hVar = wVar.f329504p;
        if (hVar == null || (curLiveAdInfo = hVar.getCurLiveAdInfo()) == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long curStartPlayTime = currentTimeMillis - hVar.getCurStartPlayTime();
        java.lang.Long valueOf = java.lang.Long.valueOf(hVar.getVideoTotalTime());
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : curLiveAdInfo.getLong(2);
        com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "onLive PlayerResume startPos: " + curStartPlayTime + " curTime: " + currentTimeMillis + " startTime: " + curLiveAdInfo.getLong(1) + " duration: " + longValue + " curStartPlayTime: " + hVar.getCurStartPlayTime() + " live_ad_id: " + curLiveAdInfo.getString(0));
        if (curStartPlayTime > longValue) {
            java.lang.String string = curLiveAdInfo.getString(0);
            if (string == null) {
                string = "";
            }
            mm2.w.N6(wVar, string);
            return;
        }
        int state = hVar.getPlayer().getState();
        if (state != 0) {
            if (state != 1 && state != 2) {
                switch (state) {
                    case 6:
                        hVar.getPlayer().start();
                        break;
                }
                hVar.getPlayer().seekTo(curStartPlayTime);
            }
            com.tencent.mars.xlog.Log.i(hVar.getFTPPTag(), "pause return for state:" + state);
            hVar.getPlayer().seekTo(curStartPlayTime);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hVar.getPlayer().seekTo(curStartPlayTime);
    }
}
