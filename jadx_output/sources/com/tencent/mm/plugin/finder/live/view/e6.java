package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class e6 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView f116273d;

    public e6(com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView finderLiveLocationView) {
        this.f116273d = finderLiveLocationView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r1.getLongitude() == -1000.0f) != false) goto L15;
     */
    @Override // i11.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGetLocation(boolean r1, float r2, float r3, int r4, double r5, double r7, double r9) {
        /*
            r0 = this;
            r4 = 1
            if (r1 != 0) goto L4
            return r4
        L4:
            com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView r1 = r0.f116273d
            r1.getTAG()
            java.lang.Class<v90.x> r5 = v90.x.class
            i95.m r5 = i95.n0.c(r5)
            v90.x r5 = (v90.x) r5
            r6 = 2015(0x7df, float:2.824E-42)
            u90.v r5 = (u90.v) r5
            r7 = 0
            r5.wi(r6, r2, r3, r7)
            float r5 = r1.getLatitude()
            r6 = -1029046272(0xffffffffc2aa0000, float:-85.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L25
            r5 = r4
            goto L26
        L25:
            r5 = r7
        L26:
            if (r5 != 0) goto L36
            float r5 = r1.getLongitude()
            r6 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L33
            goto L34
        L33:
            r4 = r7
        L34:
            if (r4 == 0) goto L3c
        L36:
            r1.setLatitude(r3)
            r1.setLongitude(r2)
        L3c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.e6.onGetLocation(boolean, float, float, int, double, double, double):boolean");
    }
}
