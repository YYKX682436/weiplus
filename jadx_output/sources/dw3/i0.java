package dw3;

/* loaded from: classes5.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244216e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244216e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dw3.i0(this.f244216e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dw3.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244215d;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemuxCheckThirdPartyVideo", e17, "miaojian cgi error:" + e17, new java.lang.Object[0]);
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f244216e;
            java.lang.String videoMetaData = com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoMetaData(str);
            if (videoMetaData == null || videoMetaData.length() == 0) {
                return null;
            }
            try {
                java.lang.String optString = new org.json.JSONObject(videoMetaData).optString("description");
                if (kotlin.jvm.internal.o.b(optString != null ? r26.n0.u0(optString).toString() : null, "miaojian")) {
                    java.lang.String Di = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Di(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemuxCheckThirdPartyVideo", "checkThirdPartyVideo md5:" + Di + ", videoPath:" + str);
                    w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
                    kotlin.jvm.internal.o.d(Di);
                    ((qs2.q) eVar).getClass();
                    db2.c1 c1Var = new db2.c1(Di);
                    this.f244215d = 1;
                    obj = rm0.h.a(c1Var, 0L, null, this, 3, null);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            return null;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        r45.p81 p81Var = (r45.p81) obj;
        if (p81Var == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxCheckThirdPartyVideo", "checkThirdPartyVideo exist:" + p81Var.getBoolean(1) + ", jianTongKuanMeta:" + p81Var.getString(2));
        boolean z17 = p81Var.getBoolean(1);
        java.lang.String string = p81Var.getString(2);
        if (string == null) {
            string = "";
        }
        return new dw3.h0(z17, string);
    }
}
