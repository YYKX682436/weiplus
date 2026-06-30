package xm3;

/* loaded from: classes.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f455338d;

    /* renamed from: e, reason: collision with root package name */
    public int f455339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f455340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455341g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f455342h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f455343i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(int i17, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, yz5.l lVar, kotlinx.coroutines.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455340f = i17;
        this.f455341g = mvvmList;
        this.f455342h = lVar;
        this.f455343i = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.k0(this.f455340f, this.f455341g, this.f455342h, this.f455343i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xm3.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003d -> B:5:0x003e). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f455339e
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            int r1 = r6.f455338d
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r1
            r1 = r6
            goto L3e
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = 0
            r1 = r6
        L1e:
            int r3 = r7 + 1
            int r4 = r1.f455340f
            com.tencent.mm.plugin.mvvmlist.MvvmList r5 = r1.f455341g
            if (r7 >= r4) goto L52
            java.util.ArrayList r7 = r5.f152066p
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L52
            if (r3 >= r4) goto L52
            r1.f455338d = r3
            r1.f455339e = r2
            r4 = 10
            java.lang.Object r7 = kotlinx.coroutines.k1.b(r4, r1)
            if (r7 != r0) goto L3d
            return r0
        L3d:
            r7 = r3
        L3e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "syncGetSnapshotList retry countL"
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.Mvvm.MvvmList"
            com.tencent.mars.xlog.Log.i(r4, r3)
            goto L1e
        L52:
            java.util.ArrayList r7 = r5.f152066p
            kz5.g0.s(r7)
            java.util.ArrayList r7 = r5.f152066p
            yz5.l r0 = r1.f455342h
            java.lang.Object r7 = r0.invoke(r7)
            xm3.d r7 = (xm3.d) r7
            r0 = 0
            kotlinx.coroutines.q r1 = r1.f455343i
            kotlinx.coroutines.r r1 = (kotlinx.coroutines.r) r1
            r1.s(r7, r0)
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xm3.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
