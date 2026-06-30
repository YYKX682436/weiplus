package t00;

/* loaded from: classes9.dex */
public abstract class b implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f414265a;

    public b(java.lang.Class classZ) {
        kotlin.jvm.internal.o.g(classZ, "classZ");
        this.f414265a = classZ;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CommonCgiEcsActionHandler", "handleAction params is null");
        }
        com.tencent.mm.protobuf.f fVar = null;
        try {
            if (this instanceof t00.h) {
                java.lang.String optString = jSONObject != null ? jSONObject.optString("mmModel") : null;
                try {
                    java.lang.reflect.Constructor declaredConstructor = this.f414265a.getDeclaredConstructor(new java.lang.Class[0]);
                    declaredConstructor.setAccessible(true);
                    fVar = (com.tencent.mm.protobuf.f) declaredConstructor.newInstance(new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                }
                if (fVar != null) {
                    fVar.parseFrom(android.util.Base64.decode(optString, 2));
                }
            } else {
                fVar = h(context, optJSONObject, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonCgiEcsActionHandler", "handleAction error:" + e17);
        }
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonCgiEcsActionHandler", "handleAction model is null");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("error", "MicroMsg.CommonCgiEcsActionHandler params error. model is null");
            callback.d(jSONObject2);
            return;
        }
        t00.h hVar = (t00.h) this;
        bw5.ef0 ef0Var = (bw5.ef0) fVar;
        java.lang.String b17 = ef0Var.b();
        if (!(b17 == null || b17.length() == 0)) {
            z20.e eVar = z20.e.f469543e;
            z20.b bVar = new z20.b();
            bVar.f469537a = eVar;
            bw5.q9 q9Var = new bw5.q9();
            q9Var.f31999d = "commonCgi";
            q9Var.f32013u[1] = true;
            q9Var.c(java.lang.System.currentTimeMillis());
            q9Var.b(2);
            bVar.f469538b = q9Var;
            bVar.c("Native_reqStart");
            bVar.f(ef0Var.b());
            bVar.a();
        }
        int i18 = y02.h.f458606d;
        y02.g gVar = (y02.g) urgen.ur_E2DE.UR_9148.UR_1332();
        if (gVar != null) {
            t00.g gVar2 = new t00.g(hVar, ef0Var, callback);
            byte[] byteArray = ef0Var.toByteArray();
            y02.o1 o1Var = new y02.o1();
            o1Var.f458624m = gVar2;
            long cppPointer = ((y02.h) gVar).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            urgen.ur_E2DE.UR_9148.UR_D39D(cppPointer, byteArray, o1Var);
        }
    }

    public abstract com.tencent.mm.protobuf.f h(android.content.Context context, org.json.JSONObject jSONObject, c00.q3 q3Var);
}
