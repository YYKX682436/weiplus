package df2;

/* loaded from: classes.dex */
public final class ux extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f231564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f231565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.cy f231566g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var, df2.cy cyVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231564e = f0Var;
        this.f231565f = h0Var;
        this.f231566g = cyVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ux(this.f231564e, this.f231565f, this.f231566g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ux) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003c -> B:5:0x003f). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f231563d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L3f
        Le:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L16:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
        L1a:
            kotlin.jvm.internal.f0 r1 = r8.f231564e
            int r1 = r1.f310116d
            r3 = 0
            kotlin.jvm.internal.h0 r4 = r8.f231565f
            if (r1 <= 0) goto L48
            java.lang.Object r1 = r4.f310123d
            com.tencent.mm.ui.widget.dialog.j0 r1 = (com.tencent.mm.ui.widget.dialog.j0) r1
            if (r1 == 0) goto L31
            boolean r1 = r1.isShowing()
            if (r1 != r2) goto L31
            r1 = r2
            goto L32
        L31:
            r1 = r3
        L32:
            if (r1 == 0) goto L48
            r8.f231563d = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = kotlinx.coroutines.k1.b(r3, r8)
            if (r1 != r0) goto L3f
            return r0
        L3f:
            kotlin.jvm.internal.f0 r1 = r8.f231564e
            int r3 = r1.f310116d
            int r3 = r3 + (-1)
            r1.f310116d = r3
            goto L1a
        L48:
            df2.cy r8 = r8.f231566g
            java.lang.String r0 = r8.f229915m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "showAlertDialog "
            r1.<init>(r5)
            java.lang.Object r6 = r4.f310123d
            com.tencent.mm.ui.widget.dialog.j0 r6 = (com.tencent.mm.ui.widget.dialog.j0) r6
            int r6 = r6.hashCode()
            r1.append(r6)
            java.lang.String r6 = " countDown"
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.Object r0 = r4.f310123d
            com.tencent.mm.ui.widget.dialog.j0 r0 = (com.tencent.mm.ui.widget.dialog.j0) r0
            if (r0 == 0) goto L77
            boolean r0 = r0.isShowing()
            if (r0 != r2) goto L77
            goto L78
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L9f
            java.lang.Object r0 = r4.f310123d
            com.tencent.mm.ui.widget.dialog.j0 r0 = (com.tencent.mm.ui.widget.dialog.j0) r0
            r0.dismiss()
            java.lang.String r8 = r8.f229915m
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            java.lang.Object r1 = r4.f310123d
            com.tencent.mm.ui.widget.dialog.j0 r1 = (com.tencent.mm.ui.widget.dialog.j0) r1
            int r1 = r1.hashCode()
            r0.append(r1)
            java.lang.String r1 = " auto dismiss"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r8, r0)
        L9f:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ux.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
