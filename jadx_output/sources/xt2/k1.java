package xt2;

/* loaded from: classes3.dex */
public final class k1 implements os5.v {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f456843b;

    /* renamed from: c, reason: collision with root package name */
    public final os5.u f456844c;

    /* renamed from: d, reason: collision with root package name */
    public xt2.p0 f456845d;

    /* renamed from: e, reason: collision with root package name */
    public yt2.g f456846e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f456847f;

    public k1(android.content.Context context, os5.u config) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        this.f456843b = context;
        this.f456844c = config;
        jz5.h.b(xt2.f1.f456738d);
        jz5.h.b(xt2.i1.f456787d);
        jz5.h.b(xt2.g1.f456764d);
        jz5.h.b(xt2.h1.f456773d);
        this.f456847f = new java.util.ArrayList();
    }

    public void b(java.lang.String tag, android.view.ViewGroup promoteGroup) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(promoteGroup, "promoteGroup");
        com.tencent.mars.xlog.Log.i(tag, "hide,promoteGroup:" + promoteGroup + '!');
        promoteGroup.removeAllViews();
        ((java.util.ArrayList) this.f456847f).clear();
        xt2.p0 p0Var = this.f456845d;
        if (p0Var != null) {
            p0Var.b(5);
        }
        yt2.g gVar = this.f456846e;
        if (gVar != null) {
            gVar.b(5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0599, code lost:
    
        if (0 == 0) goto L189;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0117. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x059d A[Catch: b -> 0x05d7, TryCatch #8 {b -> 0x05d7, blocks: (B:68:0x01b5, B:70:0x01e1, B:76:0x0204, B:78:0x020f, B:84:0x02c8, B:86:0x02ce, B:89:0x0320, B:91:0x032b, B:110:0x0400, B:112:0x0406, B:115:0x042b, B:118:0x045e, B:120:0x0483, B:122:0x0491, B:125:0x04b8, B:127:0x04ee, B:130:0x050c, B:132:0x051c, B:134:0x052c, B:135:0x0535, B:137:0x0539, B:138:0x053f, B:142:0x0548, B:144:0x054b, B:146:0x0551, B:147:0x0557, B:151:0x0574, B:152:0x059d, B:154:0x05a5, B:156:0x05b1, B:158:0x05c6), top: B:67:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102 A[Catch: b -> 0x05dc, TRY_LEAVE, TryCatch #2 {b -> 0x05dc, blocks: (B:20:0x00fc, B:22:0x0102, B:63:0x019f, B:65:0x01a5), top: B:19:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03b0 A[Catch: b -> 0x00aa, TRY_LEAVE, TryCatch #0 {b -> 0x00aa, blocks: (B:95:0x038b, B:97:0x03b0, B:179:0x00a2), top: B:178:0x00a2 }] */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x03d3 -> B:18:0x0599). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0590 -> B:18:0x0599). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0253 -> B:14:0x0263). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0298 -> B:17:0x029e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r31, java.util.List r32, boolean r33, android.view.ViewGroup r34, int r35, yz5.a r36, kotlin.coroutines.Continuation r37) {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.k1.c(java.lang.String, java.util.List, boolean, android.view.ViewGroup, int, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k1(android.content.Context r1, os5.u r2, int r3, kotlin.jvm.internal.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            os5.t r2 = os5.v.f348295a
            r2.getClass()
            os5.u r2 = os5.t.f348291b
        Lb:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.k1.<init>(android.content.Context, os5.u, int, kotlin.jvm.internal.i):void");
    }
}
