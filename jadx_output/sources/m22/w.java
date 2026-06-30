package m22;

/* loaded from: classes15.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m22.x f323070d;

    public w(m22.x xVar) {
        this.f323070d = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            m22.x r0 = r8.f323070d
            m22.u r1 = r0.f323077m
            m22.u r2 = m22.u.f323067f
            if (r1 != r2) goto L9
            return
        L9:
            long r1 = r0.f323079o
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L20
            long r1 = android.os.SystemClock.uptimeMillis()
            long r3 = r0.f323079o
            long r1 = r1 - r3
            r3 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L20
            float r1 = (float) r1
            goto L23
        L20:
            r1 = 1099257173(0x41855555, float:16.666666)
        L23:
            m22.u r2 = r0.f323077m
            m22.u r3 = m22.u.f323065d
            r4 = 1000(0x3e8, float:1.401E-42)
            r5 = 0
            r6 = 0
            java.lang.String r7 = "recyclerView"
            if (r2 != r3) goto L44
            androidx.recyclerview.widget.RecyclerView r2 = r0.f323072e
            if (r2 == 0) goto L40
            int r3 = r0.f323078n
            int r3 = -r3
            float r3 = (float) r3
            float r4 = (float) r4
            float r1 = r1 / r4
            float r3 = r3 * r1
            int r1 = (int) r3
            r2.scrollBy(r5, r1)
            goto L52
        L40:
            kotlin.jvm.internal.o.o(r7)
            throw r6
        L44:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f323072e
            if (r2 == 0) goto L71
            int r3 = r0.f323078n
            float r3 = (float) r3
            float r4 = (float) r4
            float r1 = r1 / r4
            float r3 = r3 * r1
            int r1 = (int) r3
            r2.scrollBy(r5, r1)
        L52:
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.f323079o = r1
            androidx.recyclerview.widget.RecyclerView r1 = r0.f323072e
            if (r1 == 0) goto L6d
            r1.removeCallbacks(r8)
            androidx.recyclerview.widget.RecyclerView r0 = r0.f323072e
            if (r0 == 0) goto L69
            java.util.WeakHashMap r1 = n3.l1.f334362a
            n3.u0.m(r0, r8)
            return
        L69:
            kotlin.jvm.internal.o.o(r7)
            throw r6
        L6d:
            kotlin.jvm.internal.o.o(r7)
            throw r6
        L71:
            kotlin.jvm.internal.o.o(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m22.w.run():void");
    }
}
