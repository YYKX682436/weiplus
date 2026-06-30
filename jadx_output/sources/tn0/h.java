package tn0;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f420674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(byte[] bArr, tn0.w0 w0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f420674d = bArr;
        this.f420675e = w0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tn0.h(this.f420674d, this.f420675e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tn0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kn0.g gVar;
        cl0.g gVar2;
        org.json.JSONObject jSONObject;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        byte[] bArr = this.f420674d;
        if (bArr != null) {
            boolean z17 = true;
            if (!(bArr.length == 0)) {
                tn0.w0 w0Var = this.f420675e;
                java.lang.String t17 = tn0.w0.t(w0Var, bArr);
                if (r26.n0.D(t17, "TencentStreamSEI", false, 2, null)) {
                    t17 = null;
                }
                if (t17 == null) {
                    return f0Var;
                }
                try {
                    gVar2 = new cl0.g(t17);
                    java.lang.String optString = gVar2.optString("lm");
                    if (optString == null) {
                        optString = "";
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                        jSONObject = new org.json.JSONObject();
                    } else {
                        try {
                            jSONObject = new org.json.JSONObject(optString);
                        } catch (org.json.JSONException unused) {
                            jSONObject = new org.json.JSONObject();
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.LiveCore", "handleSeiMessage seiData Exception:" + e17.getMessage() + " seiMessage:" + t17);
                    z17 = false;
                }
                if (jSONObject.optInt("lm") != 2) {
                    return f0Var;
                }
                w0Var.Z = t17;
                tn0.w0.w(w0Var, gVar2, t17);
                if (!z17) {
                    kn0.i iVar = w0Var.C;
                    w0Var.t0((iVar == null || (gVar = iVar.f309558b) == null) ? 0 : gVar.f309547n, bArr, false);
                }
                return f0Var;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "skip handleSeiMessageWithNoRestrict seiData: " + bArr);
        return f0Var;
    }
}
