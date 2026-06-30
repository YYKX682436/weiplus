package zx0;

/* loaded from: classes5.dex */
public final class f implements com.tencent.maas.camstudio.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f477003a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.j0 f477004b;

    /* renamed from: c, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f477005c;

    /* renamed from: d, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f477006d;

    /* renamed from: e, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f477007e;

    public f(java.lang.ref.WeakReference weakReference, androidx.lifecycle.j0 aigcTaskInfo) {
        kotlin.jvm.internal.o.g(weakReference, "weakReference");
        kotlin.jvm.internal.o.g(aigcTaskInfo, "aigcTaskInfo");
        this.f477003a = weakReference;
        this.f477004b = aigcTaskInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof zx0.a
            if (r0 == 0) goto L13
            r0 = r8
            zx0.a r0 = (zx0.a) r0
            int r1 = r0.f476987g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f476987g = r1
            goto L18
        L13:
            zx0.a r0 = new zx0.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f476985e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f476987g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L47
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            java.lang.Object r2 = r0.f476984d
            zx0.f r2 = (zx0.f) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L69
        L3f:
            java.lang.Object r2 = r0.f476984d
            zx0.f r2 = (zx0.f) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L47:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.r2 r8 = r7.f477005c
            if (r8 == 0) goto L59
            r0.f476984d = r7
            r0.f476987g = r6
            java.lang.Object r8 = kotlinx.coroutines.v2.d(r8, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r7
        L5a:
            kotlinx.coroutines.r2 r8 = r2.f477006d
            if (r8 == 0) goto L69
            r0.f476984d = r2
            r0.f476987g = r5
            java.lang.Object r8 = kotlinx.coroutines.v2.d(r8, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            kotlinx.coroutines.r2 r8 = r2.f477007e
            if (r8 == 0) goto L7b
            r2 = 0
            r0.f476984d = r2
            r0.f476987g = r4
            kotlinx.coroutines.c3 r8 = (kotlinx.coroutines.c3) r8
            java.lang.Object r8 = r8.C(r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zx0.f.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
