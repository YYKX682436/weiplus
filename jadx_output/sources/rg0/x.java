package rg0;

/* loaded from: classes8.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg0.z f395200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(rg0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f395200d = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rg0.x(this.f395200d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rg0.x xVar = (rg0.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f17;
        java.lang.String str;
        java.lang.reflect.Method method;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qg0.e0 e0Var = (qg0.e0) i95.n0.c(qg0.e0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ((pg0.l3) e0Var).getClass();
        jSONObject.put("HonorRootFlag", (int) v75.c.f433953a.a());
        jz5.g gVar = v75.j.f433966a;
        java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.j.f433966a).getValue();
        if (cls != null) {
            try {
                java.lang.reflect.Method method2 = cls.getMethod("getDetectResult", new java.lang.Class[0]);
                if (method2 == null) {
                    f17 = -5.0f;
                } else {
                    java.lang.Object invoke = method2.invoke(((jz5.n) v75.j.f433967b).getValue(), new java.lang.Object[0]);
                    if (invoke != null) {
                        java.lang.Class<?> cls2 = invoke.getClass();
                        java.lang.reflect.Method method3 = cls2.getMethod("getErrorCode", new java.lang.Class[0]);
                        if (kotlin.jvm.internal.o.b(method3 != null ? method3.invoke(invoke, new java.lang.Object[0]) : null, 0)) {
                            java.lang.reflect.Method method4 = cls2.getMethod("getResult", new java.lang.Class[0]);
                            java.lang.Object invoke2 = method4 != null ? method4.invoke(invoke, new java.lang.Object[0]) : null;
                            java.lang.Float f18 = invoke2 instanceof java.lang.Float ? (java.lang.Float) invoke2 : null;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Honor.RiskDetect", "risk app result:" + f18);
                            f17 = f18 != null ? f18.floatValue() : -4.0f;
                        }
                    }
                    f17 = -3.0f;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Honor.RiskDetect", th6, "getRiskAppResult", new java.lang.Object[0]);
                f17 = -2.0f;
            }
        } else {
            f17 = -1.0f;
        }
        jSONObject.put("HonorRiskAppFlag", (int) f17);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            v75.g gVar2 = v75.g.f433959a;
            java.lang.Class cls3 = (java.lang.Class) ((jz5.n) v75.g.f433961c).getValue();
            if (cls3 != null) {
                try {
                    if (gVar2.a() == 0 && (method = cls3.getMethod("getDetectResult", new java.lang.Class[0])) != null) {
                        str = gVar2.b(method.invoke(v75.g.f433960b, new java.lang.Object[0]));
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Honor.FraudAppDetect", th7, "getFraudAppResult", new java.lang.Object[0]);
                }
            }
            str = "error";
        } else {
            str = "os version not support";
        }
        jSONObject.put("HonorFraudAppInfo", new org.json.JSONObject(str));
        rg0.z zVar = this.f395200d;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        zVar.f395203d = jSONObject2;
        return jz5.f0.f302826a;
    }
}
