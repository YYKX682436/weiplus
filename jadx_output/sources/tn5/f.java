package tn5;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.refreshLayout.WxRefreshLayout f420868a;

    /* renamed from: b, reason: collision with root package name */
    public final tn5.a f420869b;

    /* renamed from: c, reason: collision with root package name */
    public mn5.b f420870c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f420871d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ValueAnimator f420872e;

    public f(com.tencent.mm.view.refreshLayout.WxRefreshLayout layout, tn5.a stateCenter) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(stateCenter, "stateCenter");
        this.f420868a = layout;
        this.f420869b = stateCenter;
    }

    public final android.animation.ValueAnimator a(int i17, int i18, android.view.animation.Interpolator interpolator, int i19) {
        mn5.b bVar = this.f420870c;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("cValues");
            throw null;
        }
        if (bVar.f330209b == i17) {
            return null;
        }
        b();
        this.f420871d = null;
        int[] iArr = new int[2];
        mn5.b bVar2 = this.f420870c;
        if (bVar2 == null) {
            kotlin.jvm.internal.o.o("cValues");
            throw null;
        }
        iArr[0] = bVar2.f330209b;
        iArr[1] = i17;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(iArr);
        ofInt.setDuration(i19);
        ofInt.setInterpolator(interpolator);
        ofInt.addListener(new tn5.d(this));
        ofInt.addUpdateListener(new tn5.e(this));
        ofInt.setStartDelay(i18);
        ofInt.start();
        this.f420872e = ofInt;
        return ofInt;
    }

    public final void b() {
        android.animation.ValueAnimator valueAnimator = this.f420872e;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            valueAnimator.cancel();
            this.f420872e = null;
        }
    }

    public final boolean c(int i17) {
        if (i17 == 0) {
            android.animation.ValueAnimator valueAnimator = this.f420872e;
            if (valueAnimator != null) {
                tn5.a aVar = this.f420869b;
                sn5.b bVar = aVar.f420851b;
                if (!bVar.f410172h) {
                    if (!(bVar == sn5.b.f410163v)) {
                        if (!(bVar == sn5.b.f410155n)) {
                            if (bVar == sn5.b.f410158q) {
                                aVar.e(sn5.b.f410159r);
                            } else {
                                if (bVar == sn5.b.f410160s) {
                                    aVar.e(sn5.b.f410161t);
                                }
                            }
                            valueAnimator.setDuration(0L);
                            valueAnimator.cancel();
                            this.f420872e = null;
                        }
                    }
                }
                return true;
            }
            this.f420871d = null;
        }
        return this.f420872e != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r5.n(r5.getCommonConfig().f330194d) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e9, code lost:
    
        if (r6 <= r5.getHeaderConfig().f330235a) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        if (r6 >= (-r5.getFooterConfig().f330231a)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0072, code lost:
    
        if (r5.n(r5.getCommonConfig().f330194d) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009e, code lost:
    
        if (r12.f330209b > r5.getHeaderConfig().f330235a) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008a, code lost:
    
        if (r12.f330209b >= (-r5.getFooterConfig().f330231a)) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(float r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn5.f.d(float, boolean):void");
    }
}
