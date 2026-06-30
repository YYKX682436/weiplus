package xe2;

/* loaded from: classes3.dex */
public final class i extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453868c = "LiveAudioBgInfoInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        r45.pk1 pk1Var = new r45.pk1();
        jz5.f0 f0Var = null;
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                pk1Var.parseFrom(byteString != null ? byteString.g() : null);
            }
        }
        r45.ba4 ba4Var = (r45.ba4) pk1Var.getCustom(0);
        gk2.e eVar = this.f445267a;
        boolean z17 = ((mm2.c1) eVar.a(mm2.c1.class)).l7();
        boolean w17 = zl2.r4.f473950a.w1();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive audio bg info = ");
        sb6.append(ba4Var != null ? pm0.b0.g(ba4Var) : null);
        sb6.append(", isAudioModeNow = ");
        sb6.append(z17);
        sb6.append(", isAnchor = ");
        sb6.append(w17);
        com.tencent.mars.xlog.Log.i(this.f453868c, sb6.toString());
        ((mm2.c1) eVar.a(mm2.c1.class)).A1 = ba4Var;
        ((mm2.c1) eVar.a(mm2.c1.class)).I4 = null;
        if (w17 || !z17) {
            return;
        }
        dk2.ef.f233372a.R();
        dt2.t tVar = ws2.k1.f449066r.a().f449074f;
        if (tVar != null) {
            tVar.n();
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.f365366i4;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
            k0Var.statusChange(bVar, bundle);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            ((mm2.c1) eVar.a(mm2.c1.class)).B1.postValue(ba4Var);
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20071};
    }
}
