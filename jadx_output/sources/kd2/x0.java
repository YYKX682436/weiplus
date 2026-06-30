package kd2;

/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f306858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f306859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f306860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f306861g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f306862h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(kd2.p1 p1Var, long j17, float f17, boolean z17, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        super(0);
        this.f306858d = p1Var;
        this.f306859e = j17;
        this.f306860f = f17;
        this.f306861g = z17;
        this.f306862h = finderThumbPlayerProxy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r1.f306808i == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if ((r1 != null && r1.f306808i) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r9 = this;
            kd2.p1 r0 = r9.f306858d
            cw2.da r1 = r0.f306788y
            boolean r2 = r1 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r2 == 0) goto Lb
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L74
            long r2 = r9.f306859e
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 1
            if (r6 <= 0) goto L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "initVideoView onPlay seekToMs: targetTimeMs = "
            r6.<init>(r8)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "FinderVideoPassive"
            com.tencent.mars.xlog.Log.i(r8, r6)
            r6 = 3
            r1.f0(r2, r7, r6)
        L2e:
            float r2 = r9.f306860f
            r1.setPlaySpeed(r2)
            java.lang.Class<pv.d0> r1 = pv.d0.class
            i95.m r1 = i95.n0.c(r1)
            pv.d0 r1 = (pv.d0) r1
            ov.i0 r1 = (ov.i0) r1
            boolean r1 = r1.Di()
            r2 = 0
            if (r1 == 0) goto L4d
            kd2.q0 r1 = r0.C
            if (r1 == 0) goto L5f
            boolean r1 = r1.f306808i
            if (r1 != r7) goto L5f
            goto L60
        L4d:
            boolean r1 = r9.f306861g
            if (r1 != 0) goto L60
            kd2.q0 r1 = r0.C
            if (r1 == 0) goto L5b
            boolean r1 = r1.f306808i
            if (r1 != r7) goto L5b
            r1 = r7
            goto L5c
        L5b:
            r1 = r2
        L5c:
            if (r1 == 0) goto L5f
            goto L60
        L5f:
            r7 = r2
        L60:
            if (r7 == 0) goto L6d
            kd2.w0 r0 = new kd2.w0
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = r9.f306862h
            r0.<init>(r1)
            pm0.v.V(r4, r0)
            goto L74
        L6d:
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r0.k0()
            r0.getClass()
        L74:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.x0.invoke():java.lang.Object");
    }
}
