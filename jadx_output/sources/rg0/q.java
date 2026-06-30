package rg0;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f395187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f395188e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f395187d = str;
        this.f395188e = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rg0.q(this.f395187d, this.f395188e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rg0.q qVar = (rg0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str = this.f395188e;
        java.lang.String str2 = this.f395187d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rg0.t tVar = rg0.t.f395191a;
        try {
            java.lang.String str3 = str2 + "/pkg/assets";
            java.lang.String str4 = com.tencent.mm.vfs.q7.c("PublicResource") + "/anops";
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str4);
            java.lang.String str5 = a17.f213279f;
            if (str5 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str4);
                java.lang.String str6 = a18.f213279f;
                if (str6 != null) {
                    java.lang.String l18 = com.tencent.mm.vfs.e8.l(str6, false, false);
                    if (!str6.equals(l18)) {
                        a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a18, null);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            com.tencent.mm.vfs.r6[] G = new com.tencent.mm.vfs.r6(str3).G();
            if (G != null) {
                java.util.Iterator a19 = kotlin.jvm.internal.c.a(G);
                while (true) {
                    kotlin.jvm.internal.b bVar = (kotlin.jvm.internal.b) a19;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) bVar.next();
                    if (r6Var != null) {
                        java.lang.String name = r6Var.getName();
                        kotlin.jvm.internal.o.f(name, "getName(...)");
                        if (r26.i0.n(name, "up.img", false)) {
                            tVar.i(str4, r6Var, str);
                        } else {
                            tVar.b(str4, r6Var);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "copyAssetsToWXPublicResource failed: %s", e17.getLocalizedMessage());
            rg0.t tVar2 = rg0.t.f395191a;
        }
        if (rg0.t.f395193c) {
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            if (L != null) {
                L.putString("WXANOPSLAVR", str);
            }
            com.tencent.mm.sdk.platformtools.o4 L2 = com.tencent.mm.sdk.platformtools.o4.L();
            if (L2 != null) {
                L2.putString("WXANOPSLAPH", str2);
            }
            rg0.d0 d0Var = rg0.d0.f395168a;
            synchronized (rg0.d0.f395171d) {
                d0Var.a();
            }
        }
        return jz5.f0.f302826a;
    }
}
