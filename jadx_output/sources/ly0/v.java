package ly0;

/* loaded from: classes5.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f322246a;

    /* renamed from: b, reason: collision with root package name */
    public ly0.n f322247b;

    public v(java.util.List filePaths) {
        kotlin.jvm.internal.o.g(filePaths, "filePaths");
        this.f322246a = filePaths;
    }

    public abstract ly0.n a(java.util.List list, yz5.l lVar);

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r8, ly0.o r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ly0.q
            if (r0 == 0) goto L13
            r0 = r10
            ly0.q r0 = (ly0.q) r0
            int r1 = r0.f322234g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322234g = r1
            goto L18
        L13:
            ly0.q r0 = new ly0.q
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f322232e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f322234g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            long r8 = r0.f322231d
            kotlin.ResultKt.throwOnFailure(r10)
            goto L51
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            kotlin.ResultKt.throwOnFailure(r10)
            long r5 = java.lang.System.currentTimeMillis()
            ky0.h r10 = ky0.h.f313479a
            ly0.p r2 = r7.d()
            kotlinx.coroutines.f1 r8 = r10.a(r8, r2, r9, r3)
            r0.f322231d = r5
            r0.f322234g = r4
            kotlinx.coroutines.g1 r8 = (kotlinx.coroutines.g1) r8
            java.lang.Object r10 = r8.k(r0)
            if (r10 != r1) goto L50
            return r1
        L50:
            r8 = r5
        L51:
            java.util.List r10 = (java.util.List) r10
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r8
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r8 = oy0.a.f349833a
            if (r8 != 0) goto L5d
            goto L5f
        L5d:
            r8.f58975j = r0
        L5f:
            boolean r8 = r10.isEmpty()
            if (r8 != 0) goto L85
            java.util.Iterator r8 = r10.iterator()
        L69:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L82
            java.lang.Object r9 = r8.next()
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 != 0) goto L7e
            r0 = r4
            goto L7f
        L7e:
            r0 = 0
        L7f:
            if (r0 == 0) goto L69
            r3 = r9
        L82:
            if (r3 != 0) goto L85
            return r10
        L85:
            ky0.e r8 = new ky0.e
            r9 = -5
            java.lang.String r10 = "AIMediaSnsGenerator requestGenerating error"
            r8.<init>(r9, r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ly0.v.b(java.util.List, ly0.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(1:(1:(1:(3:11|12|13)(2:15|16))(3:17|18|(2:20|(4:22|(1:24)|25|(1:27)(3:28|12|13))(2:29|30))(4:31|(1:33)|34|35)))(1:36))(2:47|(1:49)(1:50))|37|38|39|40|(1:42)(3:43|18|(0)(0))))|51|6|(0)(0)|37|38|39|40|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        r8 = kotlin.Result.INSTANCE;
        kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ly0.o r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ly0.v.c(ly0.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract ly0.p d();

    public abstract java.lang.Object e(java.lang.String str, java.util.List list);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r8, ly0.o r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ly0.u
            if (r0 == 0) goto L13
            r0 = r10
            ly0.u r0 = (ly0.u) r0
            int r1 = r0.f322245f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322245f = r1
            goto L18
        L13:
            ly0.u r0 = new ly0.u
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f322243d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f322245f
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L29
            kotlin.ResultKt.throwOnFailure(r10)
            goto L7a
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.Iterator r10 = r8.iterator()
        L38:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r10.next()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = com.tencent.mm.vfs.w6.j(r6)
            r6 = r6 ^ r5
            if (r6 == 0) goto L38
            goto L4e
        L4d:
            r2 = r4
        L4e:
            java.lang.String r2 = (java.lang.String) r2
            r10 = -1
            if (r2 != 0) goto Lb8
            bm5.o1 r2 = bm5.o1.f22719a
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAITemplatePostError r6 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAITemplatePostError
            r6.<init>()
            int r2 = r2.h(r6)
            if (r2 != r5) goto L62
            r2 = r5
            goto L63
        L62:
            r2 = r3
        L63:
            if (r2 != 0) goto Lab
            ky0.h r10 = ky0.h.f313479a
            ly0.p r2 = r7.d()
            kotlinx.coroutines.f1 r8 = r10.b(r8, r2, r9)
            r0.f322245f = r5
            kotlinx.coroutines.g1 r8 = (kotlinx.coroutines.g1) r8
            java.lang.Object r10 = r8.k(r0)
            if (r10 != r1) goto L7a
            return r1
        L7a:
            java.util.List r10 = (java.util.List) r10
            boolean r8 = r10.isEmpty()
            if (r8 != 0) goto La2
            java.util.Iterator r8 = r10.iterator()
        L86:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9f
            java.lang.Object r9 = r8.next()
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 != 0) goto L9b
            r0 = r5
            goto L9c
        L9b:
            r0 = r3
        L9c:
            if (r0 == 0) goto L86
            r4 = r9
        L9f:
            if (r4 != 0) goto La2
            return r10
        La2:
            ky0.e r8 = new ky0.e
            r9 = -2
            java.lang.String r10 = "upload fail"
            r8.<init>(r9, r10)
            throw r8
        Lab:
            java.lang.String r8 = "MicroMsg.AIGC.AIMediaGenerator"
            java.lang.String r9 = "RepairerLogic Make Local Error"
            com.tencent.mars.xlog.Log.e(r8, r9)
            ky0.e r8 = new ky0.e
            r8.<init>(r10, r9)
            throw r8
        Lb8:
            ky0.e r8 = new ky0.e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "File:"
            r9.<init>(r0)
            r9.append(r2)
            java.lang.String r0 = " upload fail"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r10, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ly0.v.f(java.util.List, ly0.o, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
