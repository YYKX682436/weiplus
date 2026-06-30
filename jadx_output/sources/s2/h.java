package s2;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f402229d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f402230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f402231f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s2.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f402231f = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        s2.h hVar = new s2.h(this.f402231f, continuation);
        hVar.f402230e = obj;
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0042 -> B:5:0x0045). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f402229d
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r9.f402230e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            goto L45
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f402230e
            kotlinx.coroutines.y0 r10 = (kotlinx.coroutines.y0) r10
            r1 = r10
            r10 = r9
        L23:
            boolean r3 = kotlinx.coroutines.z0.h(r1)
            if (r3 == 0) goto L5f
            s2.g r3 = s2.g.f402222d
            r10.f402230e = r1
            r10.f402229d = r2
            oz5.l r4 = r10.getContext()
            int r5 = androidx.compose.ui.platform.b3.f10515c0
            androidx.compose.ui.platform.a3 r5 = androidx.compose.ui.platform.a3.f10509d
            oz5.i r4 = r4.get(r5)
            android.support.v4.media.f.a(r4)
            java.lang.Object r3 = n0.s2.b(r3, r10)
            if (r3 != r0) goto L45
            return r0
        L45:
            s2.b0 r3 = r10.f402231f
            int[] r4 = r3.D
            r5 = 0
            r6 = r4[r5]
            r7 = r4[r2]
            android.view.View r8 = r3.f402200q
            r8.getLocationOnScreen(r4)
            r5 = r4[r5]
            if (r6 != r5) goto L5b
            r4 = r4[r2]
            if (r7 == r4) goto L23
        L5b:
            r3.l()
            goto L23
        L5f:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
