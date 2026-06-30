package tn0;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f420668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f420669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, byte[] bArr, tn0.w0 w0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f420668d = i17;
        this.f420669e = bArr;
        this.f420670f = w0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tn0.g(this.f420668d, this.f420669e, this.f420670f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tn0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        cl0.g gVar;
        int optInt;
        cl0.g b17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        byte[] bArr = this.f420669e;
        int i17 = this.f420668d;
        if (i17 != 0 && bArr != null) {
            boolean z17 = false;
            if (!(bArr.length == 0)) {
                tn0.w0 w0Var = this.f420670f;
                java.lang.String t17 = tn0.w0.t(w0Var, bArr);
                if (r26.n0.D(t17, "TencentStreamSEI", false, 2, null)) {
                    t17 = null;
                }
                if (t17 == null) {
                    return f0Var;
                }
                ko0.d0.f309840a.a("handleSeiMessage", 2, "MicroMsg.LiveCore", "handleSeiMessage seiMode:" + i17 + " anchorId:" + w0Var.D.f309586f + " seiMessage:" + t17);
                try {
                    gVar = new cl0.g(t17);
                    w0Var.Z = t17;
                    optInt = gVar.optInt("wxT");
                    try {
                    } catch (java.lang.Exception unused) {
                        z17 = false;
                    }
                } catch (java.lang.Exception unused2) {
                }
                if (optInt == 0 || com.tencent.mm.sdk.platformtools.t8.K0(gVar.optString("d"))) {
                    hn0.u uVar = hn0.u.f282437e;
                    if (pm0.v.z(i17, 1) && r26.n0.B(t17, "sgame", false)) {
                        w0Var.q0(1, t17);
                    }
                    if (pm0.v.z(i17, 2) && r26.n0.B(t17, "subtitle", false) && gVar.optInt("wxT") == 2) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("live_cdn_sei_msg", t17);
                        hn0.i iVar = w0Var.A;
                        if (iVar != null) {
                            iVar.callback(21, bundle);
                        }
                    }
                    z17 = true;
                    if (!z17) {
                        w0Var.t0(i17, bArr, true);
                    }
                    return f0Var;
                }
                hn0.u uVar2 = hn0.u.f282437e;
                if (pm0.v.z(optInt, 8) && (b17 = gVar.b("d")) != null) {
                    long optLong = b17.optLong("anchorT");
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("live_cdn_sei_msg", gVar.optString("d"));
                    bundle2.putLong("live_cdn_sei_msg_time", optLong);
                    hn0.i iVar2 = w0Var.A;
                    if (iVar2 != null) {
                        iVar2.callback(29, bundle2);
                    }
                }
                if (pm0.v.z(optInt, 32)) {
                    java.lang.String optString = gVar.optString("d");
                    kotlin.jvm.internal.o.d(optString);
                    if (!(optString.length() > 0)) {
                        optString = null;
                    }
                    if (optString != null) {
                        tn0.w0.u(w0Var, optString);
                    }
                }
                if (pm0.v.z(optInt, 16)) {
                    java.lang.String optString2 = gVar.optString("rs");
                    kotlin.jvm.internal.o.d(optString2);
                    java.lang.String str = optString2.length() > 0 ? optString2 : null;
                    if (str != null) {
                        tn0.w0.v(w0Var, new org.json.JSONObject(str));
                    }
                }
                if (pm0.v.z(i17, 4) && pm0.v.z(optInt, 4)) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString("live_cdn_sei_msg", gVar.optString("d"));
                    hn0.i iVar3 = w0Var.A;
                    if (iVar3 != null) {
                        iVar3.callback(18, bundle3);
                    }
                } else if (pm0.v.z(i17, 16) && pm0.v.z(optInt, 16)) {
                    tn0.w0.w(w0Var, gVar, t17);
                }
                return f0Var;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "skip handleSeiMessage seiMode " + i17 + " seiData: " + bArr);
        return f0Var;
    }
}
