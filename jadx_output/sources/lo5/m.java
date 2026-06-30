package lo5;

/* loaded from: classes14.dex */
public final class m extends jq4.y {
    public final lo5.j B;
    public final lo5.i C;
    public int D;
    public int E;
    public com.tencent.mm.voipmp.v2.render.VoIPMPVoIPVideoView F;
    public java.util.ArrayList G;
    public er4.r H;
    public final java.util.Map I;

    public m(lo5.j userActionHandler, lo5.i renderViewOp) {
        kotlin.jvm.internal.o.g(userActionHandler, "userActionHandler");
        kotlin.jvm.internal.o.g(renderViewOp, "renderViewOp");
        this.B = userActionHandler;
        this.C = renderViewOp;
        this.D = -1;
        this.H = er4.r.MP_ROOM_TYPE_VIDEO;
        this.I = new java.util.LinkedHashMap();
    }

    @Override // jq4.y, jq4.z0
    public void b(boolean z17, boolean z18, boolean z19) {
        android.widget.FrameLayout frameLayout;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPFloatCardManager", "dismissCard() called with: quickHide = " + z17 + ", releaseViewAndIntent = " + z18 + ", keepIncomingCard = " + z19 + ", mid: " + this.D + ", renderView: " + this.F);
        super.b(z17, z18, z19);
        if (this.f301225z) {
            com.tencent.mm.voipmp.v2.render.VoIPMPVoIPVideoView voIPMPVoIPVideoView = this.F;
            if (voIPMPVoIPVideoView != null) {
                int i17 = this.D;
                lo5.d dVar = (lo5.d) this.C;
                dVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPFloatCardController", "unbindRenderTarget() called with: mid = " + i17 + ", renderTarget = " + voIPMPVoIPVideoView);
                lo5.a aVar = dVar.f320210a.f320214a;
                if (aVar != null) {
                    ((fo5.l0) aVar).b(i17, voIPMPVoIPVideoView, false);
                }
                android.view.View view = this.f301248q;
                if (view != null && (frameLayout = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.f486171kg3)) != null) {
                    frameLayout.removeView(voIPMPVoIPVideoView);
                }
            }
            this.F = null;
        }
        this.f301223x = false;
        this.A = false;
        ((java.util.LinkedHashMap) this.I).clear();
        this.G = null;
        this.E = 0;
    }

    @Override // jq4.z0
    public void h() {
        if (this.f301249r == 1) {
            ((jp5.o) i95.n0.c(jp5.o.class)).we(this.H);
        }
        super.h();
    }

    @Override // jq4.z0
    public void i(android.content.Intent intent, java.lang.String toUser) {
        android.view.View view;
        android.widget.FrameLayout frameLayout;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        super.i(intent, toUser);
        intent.toString();
        java.util.Objects.toString(this.F);
        if (!this.f301225z || this.D < 0 || this.F != null || this.f301249r == 3) {
            if (!this.A || (view = this.f301236e) == null) {
                return;
            }
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486169kg1);
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.R.string.f492588h22);
            android.widget.GridLayout gridLayout = (android.widget.GridLayout) view.findViewById(com.tencent.mm.R.id.f486170kg2);
            gridLayout.setVisibility(0);
            gridLayout.setColumnCount(13);
            view.post(new lo5.l(this, gridLayout, toUser));
            return;
        }
        android.view.View view2 = this.f301236e;
        if (view2 == null || (frameLayout = (android.widget.FrameLayout) view2.findViewById(com.tencent.mm.R.id.f486171kg3)) == null) {
            return;
        }
        android.content.Context context = frameLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.voipmp.v2.render.VoIPMPVoIPVideoView voIPMPVoIPVideoView = new com.tencent.mm.voipmp.v2.render.VoIPMPVoIPVideoView(context, null);
        int i17 = this.D;
        lo5.d dVar = (lo5.d) this.C;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPFloatCardController", "startVideoPreview() called with: mid = " + i17 + ", renderTarget = " + voIPMPVoIPVideoView);
        lo5.a aVar = dVar.f320210a.f320214a;
        if (aVar != null) {
            fo5.r0 r0Var = ((fo5.l0) aVar).f265016a;
            voIPMPVoIPVideoView.setOnSurfaceTextureChanged(new fo5.k0(r0Var, i17, voIPMPVoIPVideoView));
            ro5.b bVar = r0Var.f265097p;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("renderController");
                throw null;
            }
            bVar.i(i17, voIPMPVoIPVideoView);
        }
        this.F = voIPMPVoIPVideoView;
        view2.post(new lo5.k(frameLayout, voIPMPVoIPVideoView));
    }

    @Override // jq4.z0
    public boolean j() {
        return this.H == er4.r.MP_ROOM_TYPE_VIDEO;
    }

    @Override // jq4.y, jq4.z0
    public void k(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPFloatCardManager", "onAccept: ");
        super.k(intent);
        lo5.a aVar = ((lo5.c) this.B).f320209a.f320214a;
        if (aVar != null) {
            ((fo5.l0) aVar).a(lo5.b.f320205e);
        }
    }

    @Override // jq4.z0
    public boolean m() {
        lo5.a aVar = ((lo5.c) this.B).f320209a.f320214a;
        if (aVar == null) {
            return true;
        }
        ((fo5.l0) aVar).a(lo5.b.f320207g);
        return true;
    }

    @Override // jq4.z0
    public void r() {
        lo5.a aVar;
        if (this.f301225z) {
            rq4.s.f399098a.a(this.f301238g, 3, 2);
        } else {
            rq4.s.f399098a.a(this.f301238g, 3, 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPFloatCardManager", "onReject: mid " + this.D);
        if (this.f301225z) {
            int i17 = this.D;
            com.tencent.mm.voipmp.v2.render.VoIPMPVoIPVideoView voIPMPVoIPVideoView = this.F;
            lo5.d dVar = (lo5.d) this.C;
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPFloatCardController", "stopVideoPreview() called with: mid = " + i17 + ", renderTarget = " + voIPMPVoIPVideoView);
            if (voIPMPVoIPVideoView != null && (aVar = dVar.f320210a.f320214a) != null) {
                ((fo5.l0) aVar).b(i17, voIPMPVoIPVideoView, true);
            }
        }
        lo5.a aVar2 = ((lo5.c) this.B).f320209a.f320214a;
        if (aVar2 != null) {
            ((fo5.l0) aVar2).a(lo5.b.f320206f);
        }
    }

    @Override // jq4.z0
    public boolean t() {
        lo5.a aVar = ((lo5.c) this.B).f320209a.f320214a;
        if (aVar == null) {
            return true;
        }
        ((fo5.l0) aVar).a(lo5.b.f320204d);
        return true;
    }
}
