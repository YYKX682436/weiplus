package k41;

/* loaded from: classes11.dex */
public final class h1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final k41.h1 f304007d = new k41.h1();

    /* renamed from: e, reason: collision with root package name */
    public static final kk.j f304008e = new jt0.j(200);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f304009f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f304010g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f304011h = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(j41.h0 h0Var, j41.w wVar) {
        if (h0Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getContact start username: ");
        java.lang.String str = h0Var.f297633c;
        sb6.append(str);
        sb6.append(", needGetFromRemote: ");
        sb6.append(h0Var.f297634d);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuGetContactService", sb6.toString());
        k41.d1 d1Var = new k41.d1(wVar);
        if (str == null || str.length() == 0) {
            d1Var.a(null);
            return;
        }
        k41.g0 c17 = k41.o0.c(str);
        if (c17 != null && c17.f303997x1 != 0) {
            java.lang.String str2 = c17.field_nickname;
            if (!(str2 == null || str2.length() == 0)) {
                j41.i0 i0Var = new j41.i0();
                i0Var.f297643d = c17;
                d1Var.a(i0Var);
                return;
            }
        }
        if (h0Var.f297634d) {
            b(h0Var, d1Var);
        } else {
            d1Var.a(null);
        }
    }

    public static final void b(j41.h0 request, j41.w wVar) {
        kotlin.jvm.internal.o.g(request, "request");
        k41.e1 e1Var = new k41.e1(request);
        java.lang.String str = request.f297639i;
        if (!(str == null || str.length() == 0)) {
            ((ku5.t0) ku5.t0.f312615d).b(new k41.c1(str, false, wVar, e1Var), "getOpenImKefuContact");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuGetContactService", "checkAddGetContactTask username invalid");
        if (wVar != null) {
            wVar.a(null);
        }
    }

    public static final int c(java.lang.String str) {
        k41.g0 c17;
        k41.o0 o0Var = k41.o0.f304031a;
        if (!com.tencent.mm.storage.z3.p4(str) || (c17 = k41.o0.c(str)) == null) {
            return 0;
        }
        return c17.field_kefuType;
    }

    public static final boolean d(java.lang.String str) {
        if (!com.tencent.mm.storage.z3.p4(str)) {
            return false;
        }
        int c17 = c(str);
        return c17 == 2 || c17 == 3 || c17 == 4;
    }

    public final void e(boolean z17, int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        j41.x xVar;
        j41.x xVar2;
        android.os.Bundle bundle = new android.os.Bundle();
        if (m1Var instanceof l41.p) {
            l41.p pVar = (l41.p) m1Var;
            str2 = pVar.f315892f;
            if (z17) {
                bundle.putInt("key_op_contact_result_source", pVar.f315890d);
                bundle.putInt("key_op_contact_result_time_cost", pVar.f315891e);
            }
        } else {
            str2 = m1Var instanceof l41.s ? ((l41.s) m1Var).f315916d : "";
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        objArr[1] = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
        objArr[2] = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuGetContactService", "onOpContactEnd success: %s, type: %s, key: %s", objArr);
        j41.j0 j0Var = (j41.j0) f304011h.remove(str2);
        if (z17) {
            if (j0Var == null || (xVar2 = j0Var.f297650d) == null) {
                return;
            }
            xVar2.a(j0Var.f297648b, bundle);
            return;
        }
        if (j0Var == null || (xVar = j0Var.f297650d) == null) {
            return;
        }
        xVar.b(j0Var.f297648b, i17, i18, str, null);
    }

    public final void f(j41.j0 j0Var) {
        java.lang.String str = j0Var.f297647a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f304011h;
        if (concurrentHashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuGetContactService", "opContact is already running key: " + str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuGetContactService", "opContact username: " + str + ", opType: " + j0Var.f297648b);
        concurrentHashMap.put(str, j0Var);
        int i17 = j0Var.f297648b;
        if (i17 != 1) {
            if (i17 == 2) {
                gm0.j1.d().g(new l41.s(j0Var.f297647a));
                return;
            }
            return;
        }
        r45.s4 s4Var = new r45.s4();
        android.os.Bundle bundle = j0Var.f297649c;
        byte[] byteArray = bundle != null ? bundle.getByteArray("key_add_contact_context") : null;
        if (byteArray != null) {
            try {
                if (true ^ (byteArray.length == 0)) {
                    s4Var.parseFrom(byteArray);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenIMKefuGetContactService", e17, "opContact exception", new java.lang.Object[0]);
            }
        }
        gm0.j1.d().g(new l41.p(j0Var, s4Var));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd errType: ");
        sb6.append(i17);
        sb6.append(", errCode: ");
        sb6.append(i18);
        sb6.append(", errMsg: ");
        sb6.append(str);
        sb6.append(", type: ");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuGetContactService", sb6.toString());
        if (!(m1Var instanceof l41.y)) {
            if ((m1Var instanceof l41.p) || (m1Var instanceof l41.s)) {
                if (i17 == 0 && i18 == 0) {
                    e(true, i17, i18, str, m1Var);
                    return;
                } else {
                    e(false, i17, i18, str, m1Var);
                    return;
                }
            }
            return;
        }
        if (i17 != 0 || i18 != 0) {
            java.lang.String str2 = ((l41.y) m1Var).f315968h.f297639i;
            kotlin.jvm.internal.o.f(str2, "key(...)");
            ((ku5.t0) ku5.t0.f312615d).b(new k41.g1(str2, i17, i18, str, null, null), "getOpenImKefuContact");
        } else {
            l41.y yVar = (l41.y) m1Var;
            k41.g0 g0Var = yVar.f315964d;
            r45.gk3 gk3Var = yVar.f315965e;
            java.lang.String str3 = yVar.f315968h.f297639i;
            kotlin.jvm.internal.o.f(str3, "key(...)");
            ((ku5.t0) ku5.t0.f312615d).b(new k41.g1(str3, i17, i18, str, g0Var, gk3Var), "getOpenImKefuContact");
        }
    }
}
