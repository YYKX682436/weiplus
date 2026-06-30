package dt2;

/* loaded from: classes3.dex */
public final class x implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f243210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f243211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dt2.a0 f243212f;

    public x(int i17, byte[] bArr, dt2.a0 a0Var) {
        this.f243210d = i17;
        this.f243211e = bArr;
        this.f243212f = a0Var;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "Live_Replay_Sei";
    }

    @Override // java.lang.Runnable
    public void run() {
        ao0.b a17;
        dk2.rg rgVar;
        je2.y yVar;
        je2.y yVar2;
        int i17 = this.f243210d;
        if (i17 != 242 && i17 != 243 && i17 != 100) {
            zl2.r4.f473950a.M2("FinderLiveReplayerWidget", "handleSeiMessage seiType:" + i17);
            return;
        }
        byte[] bArr = this.f243211e;
        if (bArr != null) {
            boolean z17 = true;
            if (!(bArr.length == 0)) {
                java.lang.String str = new java.lang.String(bArr, r26.c.f368865a);
                int P = r26.n0.P(str, "\\0", 0, false, 6, null);
                if (P != -1 && P == str.length() - 2) {
                    str = str.substring(0, P);
                    kotlin.jvm.internal.o.f(str, "substring(...)");
                }
                if (r26.n0.B(str, "TencentStreamSEI", false)) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", "handleSeiMessage final seiMessage:".concat(str));
                try {
                    cl0.g gVar = new cl0.g(str);
                    int optInt = gVar.optInt("wxT");
                    if (optInt != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(gVar.optString("d"))) {
                        hn0.u uVar = hn0.u.f282437e;
                        boolean z18 = pm0.v.z(optInt, 4);
                        dt2.a0 a0Var = this.f243212f;
                        if (z18) {
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("live_cdn_sei_msg", gVar.optString("d"));
                            dk2.rg rgVar2 = a0Var.f243159b;
                            if (rgVar2 != null && (yVar2 = (je2.y) ((ws2.x0) rgVar2).f449154a.e(je2.y.class)) != null) {
                                yVar2.s6(18, bundle);
                            }
                        } else {
                            hn0.u uVar2 = hn0.u.f282437e;
                            if (pm0.v.z(optInt, 16)) {
                                android.os.Bundle bundle2 = new android.os.Bundle();
                                bundle2.putString("live_cdn_sei_msg", gVar.optString("d"));
                                bundle2.putString("live_link_mic_info_in_anchor_sei_msg", gVar.optString("m"));
                                bundle2.putString("LIVE_LINK_MIC_INFO_FULL_SEI_MSG", str);
                                dk2.rg rgVar3 = a0Var.f243159b;
                                if (rgVar3 != null && (yVar = (je2.y) ((ws2.x0) rgVar3).f449154a.e(je2.y.class)) != null) {
                                    yVar.s6(20, bundle2);
                                }
                            } else {
                                hn0.u uVar3 = hn0.u.f282437e;
                                if (pm0.v.z(optInt, 32)) {
                                    java.lang.String optString = gVar.optString("d");
                                    kotlin.jvm.internal.o.d(optString);
                                    if (optString.length() <= 0) {
                                        z17 = false;
                                    }
                                    if (!z17) {
                                        optString = null;
                                    }
                                    if (optString != null && (a17 = ao0.c.f12524a.a(optString)) != null && (rgVar = a0Var.f243159b) != null) {
                                        ((ws2.x0) rgVar).a(a17.f12514a, a17.f12515b, a17.f12516c, a17.f12517d, a17.f12518e, a17.f12519f, a17.f12520g, a17.f12521h, a17.f12522i, a17.f12523j);
                                    }
                                }
                            }
                        }
                    }
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("FinderLiveReplayerWidget", "handleSeiMessage Exception:" + e17.getMessage() + " seiMessage:" + str);
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", "handleSeiMessage seiData:" + bArr);
    }
}
