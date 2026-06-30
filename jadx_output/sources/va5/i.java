package va5;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va5.p f434413d;

    public i(va5.p pVar) {
        this.f434413d = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1.computeScrollOffset() == true) goto L8;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            va5.p r0 = r3.f434413d
            android.widget.OverScroller r1 = r0.A
            if (r1 == 0) goto Le
            boolean r1 = r1.computeScrollOffset()
            r2 = 1
            if (r1 != r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L18
            android.widget.OverScroller r0 = r0.A
            if (r0 == 0) goto L18
            r0.abortAnimation()
        L18:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va5.i.run():void");
    }
}
