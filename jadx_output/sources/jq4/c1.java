package jq4;

/* loaded from: classes14.dex */
public final class c1 extends jq4.y {
    public com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView B;
    public java.lang.ref.WeakReference C = new java.lang.ref.WeakReference(null);

    @Override // jq4.z0
    public void h() {
        super.h();
        com.tencent.mm.plugin.voip.ui.g gVar = (com.tencent.mm.plugin.voip.ui.g) this.C.get();
        if (gVar != null) {
            gVar.x(false);
        }
    }

    @Override // jq4.z0
    public void i(android.content.Intent intent, java.lang.String toUser) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        super.i(intent, toUser);
        android.view.View view = this.f301236e;
        if (view == null || !this.f301225z || this.f301249r == 3) {
            return;
        }
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = (com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView) view.findViewById(com.tencent.mm.R.id.kg9);
        voIPRenderTextureView.setVisibility(0);
        com.tencent.mm.plugin.voip.ui.g gVar = (com.tencent.mm.plugin.voip.ui.g) this.C.get();
        if (gVar != null) {
            gVar.h(voIPRenderTextureView, 0);
        }
        this.B = voIPRenderTextureView;
        view.post(new jq4.a1(voIPRenderTextureView, view));
    }

    @Override // jq4.z0
    public boolean j() {
        return gq4.v.Bi().f176563f;
    }

    @Override // jq4.y, jq4.z0
    public void k(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if (this.f301249r == 0) {
            com.tencent.mars.xlog.Log.w("MircoMsg.VoipFloatCardManager", "onAccept, cardType is null, ignore");
            return;
        }
        super.k(intent);
        if (this.f301225z) {
            com.tencent.mm.plugin.voip.ui.g gVar = (com.tencent.mm.plugin.voip.ui.g) this.C.get();
            if (gVar != null) {
                gVar.i();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.voip.ui.g gVar2 = (com.tencent.mm.plugin.voip.ui.g) this.C.get();
        if (gVar2 != null) {
            gVar2.l();
        }
    }

    @Override // jq4.y, jq4.z0
    public void o() {
        if (this.f301249r == 1) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            jq4.b1 b1Var = new jq4.b1(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(b1Var, 200L, false);
        }
    }

    @Override // jq4.z0
    public void r() {
        if (this.f301225z) {
            rq4.s.f399098a.a(this.f301238g, 3, 2);
        } else {
            rq4.s.f399098a.a(this.f301238g, 3, 1);
        }
        if (this.f301225z) {
            com.tencent.mm.plugin.voip.ui.g gVar = (com.tencent.mm.plugin.voip.ui.g) this.C.get();
            if (gVar != null) {
                gVar.r();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.voip.ui.g gVar2 = (com.tencent.mm.plugin.voip.ui.g) this.C.get();
        if (gVar2 != null) {
            gVar2.U();
        }
    }

    @Override // jq4.y
    public void x(android.content.Context context, android.content.Intent intent, long j17, int i17, boolean z17, java.lang.String toUser, boolean z18, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        this.f301249r = i18;
        this.f301225z = z17;
        if (i18 != 3) {
            gq4.v.wi().f365977k = false;
        }
        super.x(context, intent, j17, i17, z17, toUser, z18, i18);
        com.tencent.mm.plugin.voip.ui.g gVar = (com.tencent.mm.plugin.voip.ui.g) this.C.get();
        if (gVar != null) {
            gVar.X(z17, false, toUser);
        }
    }
}
