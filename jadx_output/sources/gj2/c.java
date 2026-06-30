package gj2;

/* loaded from: classes10.dex */
public class c extends gi2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // gi2.d
    public gi2.g b() {
        lj2.v0 v0Var = this.f272270d;
        if (v0Var.f() == lj2.w0.f318958d) {
            dk2.u4 K = v0Var.a0().K();
            if (K != null) {
                if (K.f234160g == 1) {
                    jz5.g gVar = hj2.f.f281584c;
                    gi2.g gVar2 = (gi2.g) ((jz5.n) hj2.f.f281584c).getValue();
                    kotlin.jvm.internal.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.custom.IMicLayout<Layout of com.tencent.mm.plugin.finder.live.mic.voiceroom.adapter.FinderLiveMultiVoiceRoomAdapter.getMicLayout$lambda$1>");
                    return gVar2;
                }
                jz5.g gVar3 = hj2.i.f281586b;
                gi2.g gVar4 = (gi2.g) ((jz5.n) hj2.i.f281586b).getValue();
                kotlin.jvm.internal.o.e(gVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.custom.IMicLayout<Layout of com.tencent.mm.plugin.finder.live.mic.voiceroom.adapter.FinderLiveMultiVoiceRoomAdapter.getMicLayout$lambda$1>");
                return gVar4;
            }
        } else {
            int a17 = v0Var.a0().a();
            if (a17 == 4) {
                jz5.g gVar5 = hj2.f.f281584c;
                gi2.g gVar6 = (gi2.g) ((jz5.n) hj2.f.f281584c).getValue();
                kotlin.jvm.internal.o.e(gVar6, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.custom.IMicLayout<Layout of com.tencent.mm.plugin.finder.live.mic.voiceroom.adapter.FinderLiveMultiVoiceRoomAdapter.getMicLayout>");
                return gVar6;
            }
            if (a17 == 5) {
                jz5.g gVar7 = hj2.i.f281586b;
                gi2.g gVar8 = (gi2.g) ((jz5.n) hj2.i.f281586b).getValue();
                kotlin.jvm.internal.o.e(gVar8, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.custom.IMicLayout<Layout of com.tencent.mm.plugin.finder.live.mic.voiceroom.adapter.FinderLiveMultiVoiceRoomAdapter.getMicLayout>");
                return gVar8;
            }
        }
        gi2.g gVar9 = (gi2.g) ((jz5.n) hj2.c.f281582b).getValue();
        kotlin.jvm.internal.o.e(gVar9, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.custom.IMicLayout<Layout of com.tencent.mm.plugin.finder.live.mic.voiceroom.adapter.FinderLiveMultiVoiceRoomAdapter.getMicLayout>");
        return gVar9;
    }

    @Override // gi2.d
    public void d(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (view instanceof lj2.j) {
            ((lj2.j) view).l(pm2.a.f356862r, g(i17));
        }
    }

    @Override // gi2.e
    public android.view.View f(xh2.a data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        lj2.x0 x0Var = this.f272271e;
        lj2.v0 v0Var = this.f272270d;
        android.content.Context context = this.f272269c;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.view.View(context) : new kj2.e0(context, v0Var, x0Var) : new kj2.j0(context, v0Var, x0Var) : new kj2.s(context, v0Var, x0Var);
    }

    @Override // gi2.e
    public java.lang.String i() {
        return "MultiVoiceRoomAdapter";
    }
}
