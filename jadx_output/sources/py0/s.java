package py0;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f359011d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ py0.y f359013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(py0.y yVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f359013f = yVar;
        this.f359014g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        py0.s sVar = new py0.s(this.f359013f, this.f359014g, continuation);
        sVar.f359012e = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((py0.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x008b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f359011d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 2
            r4 = 1
            py0.y r5 = r12.f359013f
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r12.f359012e
            kotlinx.coroutines.y0 r0 = (kotlinx.coroutines.y0) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L88
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f359012e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L5f
        L28:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.f359012e
            r1 = r13
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            android.app.Activity r13 = r5.getContext()
            java.lang.String r6 = "context"
            kotlin.jvm.internal.o.g(r13, r6)
            pf5.z r6 = pf5.z.f353948a
            boolean r7 = r13 instanceof androidx.appcompat.app.AppCompatActivity
            if (r7 == 0) goto La8
            androidx.appcompat.app.AppCompatActivity r13 = (androidx.appcompat.app.AppCompatActivity) r13
            pf5.v r13 = r6.a(r13)
            java.lang.Class<dz0.l> r6 = dz0.l.class
            pf5.c r13 = r13.c(r6)
            r6 = r13
            dz0.l r6 = (dz0.l) r6
            java.lang.String r7 = r12.f359014g
            r8 = 0
            r10 = 2
            r11 = 0
            r12.f359012e = r1
            r12.f359011d = r4
            r9 = r12
            java.lang.Object r13 = dz0.l.n4(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L5f
            return r0
        L5f:
            kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.j) r13
            r4 = 0
            if (r13 == 0) goto L89
            py0.p r6 = new py0.p
            r6.<init>(r5, r4)
            kotlinx.coroutines.flow.g0 r7 = new kotlinx.coroutines.flow.g0
            r7.<init>(r13, r6)
            py0.q r13 = new py0.q
            r13.<init>(r5, r4)
            kotlinx.coroutines.flow.l0 r4 = new kotlinx.coroutines.flow.l0
            r4.<init>(r7, r13)
            py0.r r13 = new py0.r
            r13.<init>(r5)
            r12.f359012e = r1
            r12.f359011d = r3
            java.lang.Object r13 = r4.a(r13, r12)
            if (r13 != r0) goto L88
            return r0
        L88:
            r4 = r2
        L89:
            if (r4 != 0) goto La7
            java.lang.String r13 = "MaasBaseUILogicUIC"
            java.lang.String r0 = "recreateWithMusicID return null"
            com.tencent.mars.xlog.Log.e(r13, r0)
            py0.f0 r13 = r5.P6()
            r13.dismiss()
            android.app.Activity r13 = r5.getContext()
            r0 = 2131757756(0x7f100abc, float:1.9146457E38)
            java.lang.String r0 = r5.getString(r0)
            db5.t7.g(r13, r0)
        La7:
            return r2
        La8:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: py0.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
