package mi1;

/* loaded from: classes7.dex */
public final class x2 implements mi1.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final mi1.i2 f326725a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f326726b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f326727c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f326728d;

    public x2(mi1.i2 stateOwner) {
        kotlin.jvm.internal.o.g(stateOwner, "stateOwner");
        this.f326725a = stateOwner;
        this.f326726b = jz5.h.b(mi1.u2.f326701d);
        this.f326727c = jz5.h.b(mi1.w2.f326721d);
        this.f326728d = kz5.c0.k(1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // mi1.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mi1.v2
            if (r0 == 0) goto L13
            r0 = r6
            mi1.v2 r0 = (mi1.v2) r0
            int r1 = r0.f326718f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f326718f = r1
            goto L18
        L13:
            mi1.v2 r0 = new mi1.v2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f326716d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f326718f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            mi1.i2 r6 = r5.f326725a
            mi1.h2 r2 = r6.getF91045m()
            int r2 = r2.f326567a
            r4 = 2
            if (r2 != r4) goto L58
            jz5.g r2 = r5.f326726b
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            mi1.h2 r2 = (mi1.h2) r2
            r0.f326718f = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            java.lang.String r6 = "TipsAnimatorConsumer"
            java.lang.String r0 = "tips dismiss"
            com.tencent.mars.xlog.Log.i(r6, r0)
        L58:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.x2.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mi1.g2
    public java.lang.Object b(mi1.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (j0Var != null) {
            if (d(j0Var)) {
                com.tencent.mars.xlog.Log.i("TipsAnimatorConsumer", "tips transToTargetState but is same,ignore");
                return f0Var;
            }
            mi1.i2 i2Var = this.f326725a;
            if (i2Var.getF91045m().f326567a == 0) {
                jz5.g gVar = this.f326727c;
                ((mi1.h2) ((jz5.n) gVar).getValue()).f326568b = j0Var;
                com.tencent.mars.xlog.Log.i("TipsAnimatorConsumer", "tips adjustState: transTo expandedState");
                java.lang.Object a17 = i2Var.a((mi1.h2) ((jz5.n) gVar).getValue(), continuation);
                if (a17 == pz5.a.f359186d) {
                    return a17;
                }
            }
        }
        return f0Var;
    }

    @Override // mi1.g2
    public java.util.List c() {
        return this.f326728d;
    }

    @Override // mi1.g2
    public boolean d(mi1.j0 j0Var) {
        if (j0Var == null) {
            return true;
        }
        mi1.h2 f91045m = this.f326725a.getF91045m();
        java.util.Objects.toString(f91045m);
        if (f91045m.f326567a == 2) {
            mi1.j0 j0Var2 = (mi1.j0) f91045m.f326568b;
            if (kotlin.jvm.internal.o.b(j0Var.f326591g, j0Var2 != null ? j0Var2.f326591g : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // mi1.g2
    public boolean isShow() {
        return this.f326725a.getF91045m().f326567a != 0;
    }
}
