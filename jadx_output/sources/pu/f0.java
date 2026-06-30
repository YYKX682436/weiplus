package pu;

/* loaded from: classes5.dex */
public final class f0 extends jm0.g {

    /* renamed from: m, reason: collision with root package name */
    public static final pu.t f358300m = new pu.t(null);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f358301n = jz5.h.b(pu.s.f358374d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f358302f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f358303g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f358304h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f358305i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f358302f = jz5.h.b(new pu.d0(service));
        this.f358303g = jz5.h.b(new pu.e0(service));
        this.f358304h = jz5.h.b(new pu.c0(service));
        this.f358305i = jz5.h.b(new pu.w(service));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0086 -> B:10:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T6(com.tencent.mm.plugin.msg.MsgIdTalker r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pu.v
            if (r0 == 0) goto L13
            r0 = r8
            pu.v r0 = (pu.v) r0
            int r1 = r0.f358393h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f358393h = r1
            goto L18
        L13:
            pu.v r0 = new pu.v
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f358391f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f358393h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.f358390e
            java.lang.Object r2 = r0.f358389d
            qi3.b0 r2 = (qi3.b0) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L89
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            jz5.g r8 = pu.f0.f358301n
            jz5.n r8 = (jz5.n) r8
            java.lang.Object r8 = r8.getValue()
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            java.lang.String r7 = r7.toString()
            java.lang.Object r7 = r8.get(r7)
            d75.c r7 = (d75.c) r7
            if (r7 == 0) goto L55
            java.lang.Object r7 = r7.get()
            qi3.b0 r7 = (qi3.b0) r7
            goto L56
        L55:
            r7 = 0
        L56:
            if (r7 != 0) goto L5b
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L5b:
            r8 = r7
            qi3.c r8 = (qi3.c) r8
            qi3.g0 r8 = r8.f363677f
            qi3.g0 r2 = qi3.g0.f363712n
            if (r8 != r2) goto L67
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L67:
            r7.x()
            r8 = 0
            r2 = r7
            r7 = r8
        L6d:
            r8 = 12001(0x2ee1, float:1.6817E-41)
            if (r7 >= r8) goto L8b
            r8 = r2
            qi3.c r8 = (qi3.c) r8
            qi3.g0 r8 = r8.f363677f
            qi3.g0 r4 = qi3.g0.f363712n
            if (r8 == r4) goto L8b
            r0.f358389d = r2
            r0.f358390e = r7
            r0.f358393h = r3
            r4 = 10
            java.lang.Object r8 = kotlinx.coroutines.k1.b(r4, r0)
            if (r8 != r1) goto L89
            return r1
        L89:
            int r7 = r7 + r3
            goto L6d
        L8b:
            qi3.c r2 = (qi3.c) r2
            qi3.g0 r7 = r2.f363677f
            qi3.g0 r8 = qi3.g0.f363712n
            if (r7 != r8) goto L96
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L96:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.f0.T6(com.tencent.mm.plugin.msg.MsgIdTalker, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
