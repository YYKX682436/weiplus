package r10;

@j95.b
/* loaded from: classes9.dex */
public final class q extends i95.w implements pq.q {
    public void Ai(pq.a context, java.lang.String jumpInfoBase64Str, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfoBase64Str, "jumpInfoBase64Str");
        try {
            byte[] decode = android.util.Base64.decode(jumpInfoBase64Str, 0);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            Bi(context, decode, lVar);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.service", e17, "hy: invalid base64", new java.lang.Object[0]);
        }
    }

    public void Bi(pq.a context, byte[] jumpInfoBytes, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfoBytes, "jumpInfoBytes");
        try {
            bw5.x7 parseFrom = new bw5.x7().parseFrom(jumpInfoBytes);
            jz5.f0 f0Var = null;
            if (!(parseFrom instanceof bw5.x7)) {
                parseFrom = null;
            }
            if (parseFrom != null) {
                wi(context, parseFrom, lVar);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mm.sdk.platformtools.Log.c("ECS_O.service", "hy: can not parse bytes to EcsJumpInfo with size " + jumpInfoBytes.length, new java.lang.Object[0]);
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.service", e17, "hy: failed when parse", new java.lang.Object[0]);
        }
    }

    public final void Di(pq.a aVar, yz5.q qVar, yz5.l lVar) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        com.tencent.mm.ipcinvoker.extension.l.a(str, 0, s00.a.class, null);
        java.lang.String valueOf = java.lang.String.valueOf(aVar.f357555e);
        z20.e eVar = z20.e.f469542d;
        z20.b bVar = new z20.b();
        bVar.f469537a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f31999d = "ecso_open";
        q9Var.f32013u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f469538b = q9Var;
        bVar.f(valueOf);
        bVar.c("native_start");
        bVar.a();
        int i17 = y02.j0.f458609d;
        y02.h0 h0Var = (y02.h0) urgen.ur_E2DE.UR_4D54.UR_1332();
        if (h0Var != null) {
            r10.p pVar = new r10.p(aVar, qVar, h0Var, valueOf, lVar);
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsOpenAsyncInfo", "fetchAsyncInfo direct, already in main process");
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsOpenAsyncInfo", "fetchDirectly, executing in main process");
                pVar.invoke((com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult) new r10.f().a());
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsOpenAsyncInfo", "fetchAsyncInfo via IPC, switching to main process");
                r10.g gVar = new r10.g(pVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsOpenAsyncInfo", "invokeAsync via IPC, task: ".concat(r10.f.class.getSimpleName()));
                com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsAsyncRequest(0, 1, null), r10.f.class, new r10.h(r10.f.class, gVar));
                return;
            }
        }
        z20.e eVar2 = z20.e.f469545g;
        z20.b bVar2 = new z20.b();
        bVar2.f469537a = eVar2;
        bw5.q9 q9Var2 = new bw5.q9();
        q9Var2.f31999d = "ecso_open";
        q9Var2.f32013u[1] = true;
        q9Var2.c(java.lang.System.currentTimeMillis());
        q9Var2.b(2);
        bVar2.f469538b = q9Var2;
        bVar2.f(valueOf);
        bVar2.c("native_failed");
        bVar2.a();
        com.tencent.mars.xlog.Log.e("ECS_O.service", "EcsOpenService_UrCpp is null");
    }

    public void Ni(pq.a context, bw5.x7 jumpInfo, bw5.l8 l8Var, yz5.l lVar) {
        y02.o1 o1Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        int i17 = y02.j0.f458609d;
        y02.h0 h0Var = (y02.h0) urgen.ur_E2DE.UR_4D54.UR_1332();
        if (h0Var == null) {
            com.tencent.mars.xlog.Log.e("ECS_O.service", "EcsOpenService_UrCpp is null");
            return;
        }
        y02.d0 c17 = r10.j.c(context);
        if (l8Var == null) {
            l8Var = new bw5.l8();
        }
        y02.j0 j0Var = (y02.j0) h0Var;
        byte[] byteArray = jumpInfo.toByteArray();
        byte[] byteArray2 = l8Var.toByteArray();
        if (lVar == null) {
            o1Var = null;
        } else {
            o1Var = new y02.o1();
            o1Var.f458621g = lVar;
        }
        long cppPointer = j0Var.getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        kotlin.jvm.internal.o.d(byteArray2);
        urgen.ur_E2DE.UR_4D54.UR_E604(cppPointer, byteArray, c17, byteArray2, o1Var);
    }

    public void Ri(pq.a context, java.lang.String jumpInfoBase64Str, bw5.l8 l8Var, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfoBase64Str, "jumpInfoBase64Str");
        try {
            byte[] decode = android.util.Base64.decode(jumpInfoBase64Str, 0);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            Ui(context, decode, l8Var, lVar);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.service", e17, "hy: invalid base64", new java.lang.Object[0]);
        }
    }

    public void Ui(pq.a context, byte[] jumpInfoBytes, bw5.l8 l8Var, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfoBytes, "jumpInfoBytes");
        try {
            bw5.x7 parseFrom = new bw5.x7().parseFrom(jumpInfoBytes);
            jz5.f0 f0Var = null;
            if (!(parseFrom instanceof bw5.x7)) {
                parseFrom = null;
            }
            if (parseFrom != null) {
                Ni(context, parseFrom, l8Var, lVar);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mm.sdk.platformtools.Log.c("ECS_O.service", "hy: can not parse bytes to EcsJumpInfo with size " + jumpInfoBytes.length, new java.lang.Object[0]);
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.service", e17, "hy: failed when parse", new java.lang.Object[0]);
        }
    }

    public void wi(pq.a context, bw5.x7 jumpInfo, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        Di(context, new r10.m(jumpInfo), lVar);
    }
}
