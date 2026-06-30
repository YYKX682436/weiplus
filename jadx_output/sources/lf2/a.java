package lf2;

/* loaded from: classes10.dex */
public final class a extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public lf2.s f318273m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(int i17, int i18) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.I2;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("pos", i18);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void a7(int i17) {
        lf2.s sVar = this.f318273m;
        if (sVar != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.W(sVar, null, false, 0, 7, null);
            gk2.e eVar = sVar.H;
            sVar.T = ((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346293i).getValue()).intValue();
            sVar.f0();
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = sVar.W;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("intonationScoreSwitch");
                throw null;
            }
            mMSwitchBtn.setCheck(((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346294m).getValue()).booleanValue());
            mMSwitchBtn.setSwitchListener(new lf2.q(sVar));
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = sVar.V;
            if (mMSwitchBtn2 == null) {
                kotlin.jvm.internal.o.o("earSwitch");
                throw null;
            }
            mMSwitchBtn2.setCheck(((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346295n).getValue()).booleanValue());
            mMSwitchBtn2.setSwitchListener(new lf2.r(sVar));
            if (!(((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346298q).getValue()).intValue() == 2)) {
                mMSwitchBtn2.setCheck(false);
                ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346295n).k(java.lang.Boolean.FALSE);
            }
            android.widget.SeekBar seekBar = sVar.X;
            if (seekBar == null) {
                kotlin.jvm.internal.o.o("voiceVolume");
                throw null;
            }
            seekBar.setProgress(((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346291g).getValue()).intValue());
            android.widget.SeekBar seekBar2 = sVar.Y;
            if (seekBar2 == null) {
                kotlin.jvm.internal.o.o("accompanyVolume");
                throw null;
            }
            seekBar2.setProgress(((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346292h).getValue()).intValue());
            for (lf2.b bVar : sVar.e0()) {
                bVar.f318275b = bVar.f318274a.f346356d == ((om2.m) ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346297p).getValue()).f346356d;
            }
            ((lf2.l) ((jz5.n) sVar.M).getValue()).notifyDataSetChanged();
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = sVar.W;
            if (mMSwitchBtn3 == null) {
                kotlin.jvm.internal.o.o("intonationScoreSwitch");
                throw null;
            }
            mMSwitchBtn3.setEnabled(true);
            om2.s sVar2 = ((om2.g) eVar.a(om2.g.class)).f346308o;
            if (sVar2 != null && !sVar2.f346379b.f346369c) {
                com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn4 = sVar.W;
                if (mMSwitchBtn4 == null) {
                    kotlin.jvm.internal.o.o("intonationScoreSwitch");
                    throw null;
                }
                mMSwitchBtn4.setEnabled(false);
            }
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn5 = sVar.V;
            if (mMSwitchBtn5 == null) {
                kotlin.jvm.internal.o.o("earSwitch");
                throw null;
            }
            mMSwitchBtn5.setEnabled(((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346298q).getValue()).intValue() == 2);
            kotlinx.coroutines.y0 y0Var = sVar.E;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new lf2.f(sVar, null), 3, null);
            }
            int P6 = ((om2.l) eVar.a(om2.l.class)).P6();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("sdk_type", P6);
            if (zl2.r4.f473950a.x1()) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.Z1, jSONObject.toString(), null, 4, null);
            } else {
                if (i17 != -1) {
                    jSONObject.put(ya.b.SOURCE, i17);
                }
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.hj((ml2.r0) c18, ml2.b4.f327263r2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            }
            sVar.K = i17;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        this.f318273m = new lf2.s(O6(), getStore().getLiveRoomData(), this);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f318273m = null;
    }
}
