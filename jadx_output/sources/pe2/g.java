package pe2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f353625d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f353626e;

    /* renamed from: f, reason: collision with root package name */
    public int f353627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pe2.h f353628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mm2.j0 f353629h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pe2.h hVar, mm2.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353628g = hVar;
        this.f353629h = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pe2.g(this.f353628g, this.f353629h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.i30 i30Var;
        java.lang.String N6;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f353627f;
        jz5.f0 f0Var = jz5.f0.f302826a;
        pe2.h hVar = this.f353628g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean x07 = hVar.x0();
            mm2.j0 j0Var = this.f353629h;
            i30Var = x07 ? (r45.i30) j0Var.f329151a.getCustom(3) : (r45.i30) j0Var.f329151a.getCustom(4);
            N6 = ((mm2.l0) hVar.P0(mm2.l0.class)).N6(i30Var);
            if ((N6 == null || N6.length() == 0) || i30Var == null) {
                com.tencent.mars.xlog.Log.e("FinderLiveCheerAnimationPlugin", "getPagPath error : " + N6 + " resource: " + i30Var);
                return f0Var;
            }
            java.lang.String e17 = kk.k.e(N6);
            if (com.tencent.mm.vfs.w6.j(N6) && !kotlin.jvm.internal.o.b(i30Var.getString(1), e17)) {
                com.tencent.mars.xlog.Log.i("FinderLiveCheerAnimationPlugin", "showCheerAnimation delete file, md5 not match, tempMd5: " + e17);
                com.tencent.mm.vfs.w6.h(N6);
            }
            wh2.l lVar = wh2.l.f445955a;
            java.lang.String string = i30Var.getString(0);
            if (string == null) {
                string = "";
            }
            this.f353625d = i30Var;
            this.f353626e = N6;
            this.f353627f = 1;
            a17 = lVar.a(string, N6, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N6 = (java.lang.String) this.f353626e;
            i30Var = (r45.i30) this.f353625d;
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        java.lang.String str = N6;
        r45.i30 i30Var2 = i30Var;
        wh2.i iVar = (wh2.i) a17;
        java.lang.String e18 = kk.k.e(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCheerAnimation load pag isAnchorLive: ");
        sb6.append(zl2.r4.f473950a.w1());
        sb6.append(" resource: ");
        kotlin.jvm.internal.o.g(i30Var2, "<this>");
        sb6.append("url: " + i30Var2.getString(0) + " duration: " + i30Var2.getLong(2) + " md5: " + i30Var2.getString(1));
        sb6.append(" md5: ");
        sb6.append(e18);
        sb6.append(" result: ");
        sb6.append(iVar);
        sb6.append(" getVisible: ");
        sb6.append(hVar.w0());
        com.tencent.mars.xlog.Log.i("FinderLiveCheerAnimationPlugin", sb6.toString());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        pe2.f fVar = new pe2.f(iVar, i30Var2, e18, this.f353628g, str, this.f353629h, null);
        this.f353625d = null;
        this.f353626e = null;
        this.f353627f = 2;
        return kotlinx.coroutines.l.g(g3Var, fVar, this) == aVar ? aVar : f0Var;
    }
}
