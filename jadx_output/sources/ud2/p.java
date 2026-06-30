package ud2;

/* loaded from: classes10.dex */
public final class p extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public int f426646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f426647e;

    public p(ud2.c0 c0Var) {
        this.f426647e = c0Var;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
        ud2.c0 c0Var = this.f426647e;
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(c0Var.f426590a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNetStatus curPlayStatus:");
        sb6.append(this.f426646d);
        sb6.append(", netQuality:");
        sb6.append(netType);
        sb6.append(", isPlaying:");
        mn0.b0 b0Var = c0Var.f426598i;
        boolean z17 = false;
        if (b0Var != null && ((mn0.y) b0Var).b(false)) {
            z17 = true;
        }
        sb6.append(z17);
        java.lang.System.out.print((java.lang.Object) sb6.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (((mn0.y) r0).b(false) == true) goto L12;
     */
    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPlayEvent(int r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud2.p.onPlayEvent(int, android.os.Bundle):void");
    }
}
