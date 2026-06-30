package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes10.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.j2 f115579a = new com.tencent.mm.plugin.finder.live.util.j2();

    /* renamed from: b, reason: collision with root package name */
    public static wl2.b f115580b = new wl2.b(false, "");

    /* renamed from: c, reason: collision with root package name */
    public static wl2.b f115581c = new wl2.b(false, "");

    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, int r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.j2.a(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final wl2.b b(int i17, int i18) {
        int ordinal = ((i17 == 2 && i18 == 2) ? com.tencent.mm.plugin.finder.live.util.e2.f115491e : (i17 == 1 && i18 == 1) ? com.tencent.mm.plugin.finder.live.util.e2.f115490d : com.tencent.mm.plugin.finder.live.util.e2.f115492f).ordinal();
        if (ordinal == 0) {
            return f115580b;
        }
        if (ordinal == 1) {
            return f115581c;
        }
        if (ordinal == 2) {
            return f115580b.a(f115581c);
        }
        throw new jz5.j();
    }

    public final wl2.b c(int i17) {
        return com.tencent.mm.plugin.finder.live.util.f2.f115509a[(i17 == 2 ? com.tencent.mm.plugin.finder.live.util.e2.f115491e : com.tencent.mm.plugin.finder.live.util.e2.f115490d).ordinal()] == 2 ? f115581c : f115580b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.tencent.mm.plugin.finder.live.util.e2 r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.j2.d(com.tencent.mm.plugin.finder.live.util.e2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(wl2.d r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.tencent.mm.plugin.finder.live.util.i2
            if (r0 == 0) goto L13
            r0 = r6
            com.tencent.mm.plugin.finder.live.util.i2 r0 = (com.tencent.mm.plugin.finder.live.util.i2) r0
            int r1 = r0.f115550g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115550g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.finder.live.util.i2 r0 = new com.tencent.mm.plugin.finder.live.util.i2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f115548e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f115550g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f115547d
            wl2.d r5 = (wl2.d) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f115547d = r5
            r0.f115550g = r3
            java.lang.Object r6 = r5.a(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            wl2.b r6 = (wl2.b) r6
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct
            r0.<init>()
            r1 = 200(0xc8, float:2.8E-43)
            r0.f57145e = r1
            cl0.g r1 = new cl0.g
            r1.<init>()
            boolean r2 = r6.f447045a
            java.lang.String r3 = "result"
            r1.o(r3, r2)
            java.lang.String r2 = r5.f447052a
            java.lang.String r3 = "soLoader"
            r1.h(r3, r2)
            java.lang.String r2 = "innerVersion"
            int r5 = r5.d()
            r1.o(r2, r5)
            java.lang.String r5 = "errMsg"
            java.lang.String r2 = r6.f447046b
            r1.h(r5, r2)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.o.f(r5, r1)
            r1 = 0
            java.lang.String r2 = ","
            java.lang.String r3 = ";"
            java.lang.String r5 = r26.i0.t(r5, r2, r3, r1)
            r0.p(r5)
            r0.k()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.j2.e(wl2.d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
