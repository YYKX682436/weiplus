package ek5;

/* loaded from: classes9.dex */
public final class j extends ek5.c {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        ec5.a aVar = new ec5.a();
        param.a(aVar);
        l15.c cVar = new l15.c();
        cVar.fromXml(param.d());
        aVar.k(cVar);
        java.lang.String stringExtra = intent.getStringExtra("reportSessionId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVar.n(stringExtra);
        java.lang.String stringExtra2 = intent.getStringExtra("Retr_File_Name");
        aVar.l(stringExtra2 != null ? stringExtra2 : "");
        e35.g gVar = e35.g.f247590a;
        ez.v0 v0Var = ez.v0.f257777a;
        l15.c j17 = aVar.j();
        java.lang.String g17 = v0Var.g(j17 != null ? j17.k() : null);
        java.util.HashMap hashMap = e35.g.f247591b;
        if (g17 == null || !(!r26.n0.N(g17))) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(aVar.getFilePath());
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.lang.String str2 = a17.f213279f;
            int lastIndexOf = str2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            kotlin.jvm.internal.o.f(str2, "getName(...)");
            if (!r26.n0.N(str2)) {
                hashMap.put(str2, 201);
            }
        } else {
            hashMap.put(g17, 201);
        }
        return aVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return k50.j.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return r50.b.class;
    }

    @Override // ek5.b
    public int g() {
        return 49;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return ec5.a.class;
    }

    @Override // ek5.b
    public java.util.List i() {
        return kz5.c0.i(6, 130);
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.b0.c(3);
    }
}
