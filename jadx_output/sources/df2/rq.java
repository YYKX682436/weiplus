package df2;

/* loaded from: classes3.dex */
public final class rq implements ie2.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f231263d;

    public rq(df2.ar arVar) {
        this.f231263d = arVar;
    }

    @Override // ie2.h
    public void j() {
        df2.ar arVar = this.f231263d;
        com.tencent.mm.plugin.finder.live.util.y.o(arVar, null, null, new df2.qq(arVar, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ie2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof df2.oq
            if (r0 == 0) goto L13
            r0 = r7
            df2.oq r0 = (df2.oq) r0
            int r1 = r0.f230997f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230997f = r1
            goto L18
        L13:
            df2.oq r0 = new df2.oq
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f230995d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f230997f
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L40
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f230997f = r5
            if (r3 != r1) goto L40
            return r1
        L40:
            r0.f230997f = r4
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.k1.b(r4, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.rq.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        df2.ar arVar = this.f231263d;
        com.tencent.mm.view.MMPAGView b76 = arVar.b7();
        if (b76 != null) {
            b76.setProgress(1.0d);
        }
        arVar.h7();
    }
}
