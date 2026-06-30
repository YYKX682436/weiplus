package sg2;

/* loaded from: classes13.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final sg2.x f407955a = new sg2.x();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f407956b = lp0.b.h() + "live/gestures_0/";

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f407957c = jz5.h.b(sg2.c.f407888d);

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.sync.d f407958d = kotlinx.coroutines.sync.l.a(false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f407959e;

    static {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            pm0.v.K(null, sg2.f.f407895d);
        }
        f407959e = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.String r12, java.lang.String r13, boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg2.x.a(java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg2.x.b(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(r45.ir1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof sg2.j
            if (r0 == 0) goto L13
            r0 = r10
            sg2.j r0 = (sg2.j) r0
            int r1 = r0.f407909h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f407909h = r1
            goto L18
        L13:
            sg2.j r0 = new sg2.j
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f407907f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f407909h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r9 = r0.f407906e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.f407905d
            r45.ir1 r0 = (r45.ir1) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6f
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r0.f407906e
            r45.ir1 r9 = (r45.ir1) r9
            java.lang.Object r2 = r0.f407905d
            sg2.x r2 = (sg2.x) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L5c
        L46:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = 3
            java.lang.String r10 = r9.getString(r10)
            r0.f407905d = r8
            r0.f407906e = r9
            r0.f407909h = r4
            java.lang.Object r10 = r8.g(r10, r0)
            if (r10 != r1) goto L5b
            return r1
        L5b:
            r2 = r8
        L5c:
            java.lang.String r10 = (java.lang.String) r10
            r0.f407905d = r9
            r0.f407906e = r10
            r0.f407909h = r3
            java.lang.Object r0 = r2.h(r10, r0)
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r7 = r0
            r0 = r9
            r9 = r10
            r10 = r7
        L6f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r1 = 0
            if (r10 == 0) goto Lbe
            r10 = 11
            long r2 = r0.getLong(r10)
            int r10 = tq5.i.f421269a
            r4 = 2014500(0x1ebd24, float:2.822916E-39)
            if (r10 != 0) goto L87
            tq5.i.f421269a = r4
        L87:
            int r10 = tq5.i.f421269a
            long r5 = (long) r10
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 > 0) goto Lb8
            int r10 = tq5.i.f421269a
            if (r10 != 0) goto L94
            tq5.i.f421269a = r4
        L94:
            int r10 = tq5.i.f421269a
            long r2 = (long) r10
            r10 = 12
            long r4 = r0.getLong(r10)
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 > 0) goto Lb8
            sg2.a r1 = new sg2.a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "/lua"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r1.<init>(r9)
            goto Lbe
        Lb8:
            sg2.a r9 = new sg2.a
            r9.<init>(r1)
            r1 = r9
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sg2.x.c(r45.ir1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(r45.ir1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof sg2.k
            if (r0 == 0) goto L13
            r0 = r8
            sg2.k r0 = (sg2.k) r0
            int r1 = r0.f407913g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f407913g = r1
            goto L18
        L13:
            sg2.k r0 = new sg2.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f407911e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f407913g
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r7 = r0.f407910d
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L61
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r0.f407910d
            sg2.x r7 = (sg2.x) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L51
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r7 = r7.getString(r4)
            r0.f407910d = r6
            r0.f407913g = r3
            java.lang.Object r8 = r6.g(r7, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r7 = r6
        L51:
            java.lang.String r8 = (java.lang.String) r8
            r0.f407910d = r8
            r0.f407913g = r4
            java.lang.Object r7 = r7.h(r8, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            r5 = r8
            r8 = r7
            r7 = r5
        L61:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto La2
            sg2.b r8 = new sg2.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "/color.png"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = "/darkmode.png"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r7 = "/lightmode.png"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r8.<init>(r0, r1, r7)
            goto La3
        La2:
            r8 = 0
        La3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sg2.x.d(r45.ir1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(r45.ir1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof sg2.l
            if (r0 == 0) goto L13
            r0 = r9
            sg2.l r0 = (sg2.l) r0
            int r1 = r0.f407917g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f407917g = r1
            goto L18
        L13:
            sg2.l r0 = new sg2.l
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f407915e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f407917g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.f407914d
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L62
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.f407914d
            sg2.x r8 = (sg2.x) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L52
        L3e:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = 6
            java.lang.String r8 = r8.getString(r9)
            r0.f407914d = r7
            r0.f407917g = r4
            java.lang.Object r9 = r7.g(r8, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            r8 = r7
        L52:
            java.lang.String r9 = (java.lang.String) r9
            r0.f407914d = r9
            r0.f407917g = r3
            java.lang.Object r8 = r8.h(r9, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r6 = r9
            r9 = r8
            r8 = r6
        L62:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lc6
            sg2.d r9 = new sg2.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = "/gifting.pag"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r2 = "/primary.pag"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r3 = "/sound.mp3"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r4 = "/primary-lua"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "/gifting-lua"
            r0.append(r8)
            java.lang.String r5 = r0.toString()
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            goto Lc7
        Lc6:
            r9 = 0
        Lc7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sg2.x.e(r45.ir1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(r45.ir1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof sg2.m
            if (r0 == 0) goto L13
            r0 = r8
            sg2.m r0 = (sg2.m) r0
            int r1 = r0.f407921g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f407921g = r1
            goto L18
        L13:
            sg2.m r0 = new sg2.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f407919e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f407921g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.f407918d
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L62
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r0.f407918d
            sg2.x r7 = (sg2.x) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = 5
            java.lang.String r7 = r7.getString(r8)
            r0.f407918d = r6
            r0.f407921g = r4
            java.lang.Object r8 = r6.g(r7, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            r7 = r6
        L52:
            java.lang.String r8 = (java.lang.String) r8
            r0.f407918d = r8
            r0.f407921g = r3
            java.lang.Object r7 = r7.h(r8, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r5 = r8
            r8 = r7
            r7 = r5
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L81
            sg2.e r8 = new sg2.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "/tips-icon.png"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            goto L82
        L81:
            r8 = 0
        L82:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sg2.x.f(r45.ir1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object g(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new sg2.n(str, null), continuation);
    }

    public final java.lang.Object h(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new sg2.p(str, null), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(5:(2:3|(10:5|6|(1:(1:(5:10|11|12|13|14)(2:20|21))(1:22))(2:40|(1:42))|(1:24)|25|26|28|29|(1:31)|(1:33)(3:34|13|14)))|28|29|(0)|(0)(0))|43|6|(0)(0)|(0)|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v13, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof sg2.q
            if (r0 == 0) goto L13
            r0 = r10
            sg2.q r0 = (sg2.q) r0
            int r1 = r0.f407930i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f407930i = r1
            goto L18
        L13:
            sg2.q r0 = new sg2.q
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f407928g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f407930i
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r8 = r0.f407925d
            kotlinx.coroutines.sync.d r8 = (kotlinx.coroutines.sync.d) r8
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L31
            goto L96
        L31:
            r9 = move-exception
            goto La2
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            boolean r9 = r0.f407927f
            java.lang.Object r8 = r0.f407926e
            kotlinx.coroutines.sync.d r8 = (kotlinx.coroutines.sync.d) r8
            java.lang.Object r2 = r0.f407925d
            java.util.List r2 = (java.util.List) r2
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r8
            r8 = r2
            goto L62
        L4c:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.sync.d r10 = sg2.x.f407958d
            r0.f407925d = r8
            r0.f407926e = r10
            r0.f407927f = r9
            r0.f407930i = r5
            kotlinx.coroutines.sync.k r10 = (kotlinx.coroutines.sync.k) r10
            java.lang.Object r2 = r10.b(r6, r0)
            if (r2 != r1) goto L62
            return r1
        L62:
            if (r9 == 0) goto L65
            goto L66
        L65:
            r5 = 0
        L66:
            r0.f407925d = r10     // Catch: java.lang.Throwable -> La0
            r0.f407926e = r6     // Catch: java.lang.Throwable -> La0
            r0.f407930i = r4     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "#refreshInner newGestures.size="
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L9e
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L9e
            r9.append(r2)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "FinderGesturesFilesManager"
            com.tencent.mars.xlog.Log.i(r2, r9)     // Catch: java.lang.Throwable -> L9e
            kotlinx.coroutines.p0 r9 = kotlinx.coroutines.q1.f310570c     // Catch: java.lang.Throwable -> L9e
            sg2.v r2 = new sg2.v     // Catch: java.lang.Throwable -> L9e
            r2.<init>(r8, r5, r6)     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r8 = kotlinx.coroutines.l.g(r9, r2, r0)     // Catch: java.lang.Throwable -> L9e
            if (r8 != r1) goto L91
            goto L92
        L91:
            r8 = r3
        L92:
            if (r8 != r1) goto L95
            return r1
        L95:
            r8 = r10
        L96:
            kotlinx.coroutines.sync.k r8 = (kotlinx.coroutines.sync.k) r8
            r8.d(r6)
            return r3
        L9c:
            r9 = r8
            goto La1
        L9e:
            r8 = move-exception
            goto L9c
        La0:
            r9 = move-exception
        La1:
            r8 = r10
        La2:
            kotlinx.coroutines.sync.k r8 = (kotlinx.coroutines.sync.k) r8
            r8.d(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sg2.x.i(java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
