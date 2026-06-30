package n12;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334101a;

    /* renamed from: b, reason: collision with root package name */
    public final n12.g f334102b;

    /* renamed from: c, reason: collision with root package name */
    public int f334103c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f334104d;

    public n(java.lang.String path, n12.g gVar) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f334101a = path;
        this.f334102b = gVar;
        this.f334104d = kotlinx.coroutines.flow.i3.a(new android.util.Size(0, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(n12.n r17, java.lang.String r18, java.lang.String r19, android.util.Size r20, android.graphics.Rect r21, android.util.Range r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n12.n.a(n12.n, java.lang.String, java.lang.String, android.util.Size, android.graphics.Rect, android.util.Range, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof n12.h
            if (r0 == 0) goto L13
            r0 = r6
            n12.h r0 = (n12.h) r0
            int r1 = r0.f334081g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f334081g = r1
            goto L18
        L13:
            n12.h r0 = new n12.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f334079e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f334081g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f334078d
            n12.n r0 = (n12.n) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310570c
            n12.i r2 = new n12.i
            r4 = 0
            r2.<init>(r5, r4)
            r0.f334078d = r5
            r0.f334081g = r3
            java.lang.Object r6 = kotlinx.coroutines.l.g(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "video metadata parsed"
            r6.<init>(r1)
            java.lang.String r1 = r0.f334101a
            r6.append(r1)
            java.lang.String r1 = ", resolution: "
            r6.append(r1)
            kotlinx.coroutines.flow.j2 r1 = r0.f334104d
            kotlinx.coroutines.flow.h3 r1 = (kotlinx.coroutines.flow.h3) r1
            java.lang.Object r1 = r1.getValue()
            r6.append(r1)
            java.lang.String r1 = ", duration: "
            r6.append(r1)
            int r0 = r0.f334103c
            r6.append(r0)
            java.lang.String r0 = "ms"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "MicroMsg.EmoticonCustomCreatePreprocessLogic"
            com.tencent.mars.xlog.Log.i(r0, r6)
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n12.n.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n12.n.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ n(java.lang.String str, n12.g gVar, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? null : gVar);
    }
}
