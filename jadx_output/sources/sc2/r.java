package sc2;

/* loaded from: classes2.dex */
public final class r extends sc2.f2 {
    public java.lang.String A;
    public double B;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f406180z = "CNYFeedLoadingJumperObserver";

    @Override // ad2.h
    public void E(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        f(250L, jumpView, z17, aVar);
        e(true, z17);
        ((com.tencent.mm.view.MMPAGView) jumpView.findViewById(com.tencent.mm.R.id.eae)).setVisibility(0);
    }

    @Override // sc2.f2, ad2.h
    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        return info.getBusiness_type() == 2 ? info.getExt_type() == 3 ? gs2.a.f275052h : gs2.a.f275054m : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f406180z;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public void n(android.view.View jumpView, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        g(250L, jumpView, z17, aVar);
        e(false, z17);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) jumpView.findViewById(com.tencent.mm.R.id.eae);
        mMPAGView.setVisibility(8);
        mMPAGView.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        r45.xa4 xa4Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        cl0.g gVar;
        r45.wf6 wf6Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        r45.wf6 wf6Var2 = this.f3149m;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = infoEx.f453234a;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> style = finderJumpInfo2.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                } else {
                    wf6Var = it.next();
                    if (((r45.wf6) wf6Var).getInteger(2) == 11) {
                        break;
                    }
                }
            }
            wf6Var2 = wf6Var;
        }
        if (!o(holder, finderJumpInfo2)) {
            D(8);
            com.tencent.mars.xlog.Log.i(this.f406180z, "[onBindView] priority not ok");
            return;
        }
        if (wf6Var2 == null || (xa4Var = (r45.xa4) wf6Var2.getCustom(17)) == null) {
            return;
        }
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) jumpView.findViewById(com.tencent.mm.R.id.eae);
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        cw2.da videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        int currentPlaySecond = (!kotlin.jvm.internal.o.b(source, "timeline") || finderThumbPlayerProxy == null) ? 0 : finderThumbPlayerProxy.getCurrentPlaySecond();
        int i17 = infoEx.F - infoEx.E;
        if ((mMPAGView != null ? mMPAGView.getComposition() : null) == null || !kotlin.jvm.internal.o.b(this.A, xa4Var.getString(0))) {
            if (mMPAGView != null) {
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                mMPAGView.o(((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Jg).getValue()).r()).booleanValue());
            }
            mMPAGView.setRepeatCount(1);
            boolean z17 = mMPAGView.getUseRfx();
            android.content.Context context = holder.f293121e;
            if (z17) {
                mMPAGView.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(context.getAssets(), "cny_redpack_loading.pag"));
            } else {
                mMPAGView.setComposition(org.libpag.PAGFile.Load(context.getAssets(), "cny_redpack_loading.pag"));
            }
            holder.j();
            kotlinx.coroutines.y0 y0Var = holder.f293120d;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new sc2.p(mMPAGView, xa4Var, this, null), 3, null);
            }
            if (currentPlaySecond < infoEx.E || currentPlaySecond >= infoEx.F) {
                finderJumpInfo = finderJumpInfo2;
            } else {
                finderJumpInfo = finderJumpInfo2;
                mMPAGView.setProgress((((r14 - i17) + currentPlaySecond) - infoEx.E) / (mMPAGView.c() / 1000000));
            }
            mMPAGView.g();
        } else {
            finderJumpInfo = finderJumpInfo2;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        xc2.p0 p0Var = this.f3147h;
        xc2.o0 o0Var = p0Var != null ? p0Var.f453246h : null;
        xc2.p pVar = o0Var instanceof xc2.p ? (xc2.p) o0Var : null;
        java.lang.Object opt = (pVar == null || (gVar = pVar.f453227f) == null) ? null : gVar.opt("report_extra_data");
        if (opt == null) {
            opt = "";
        }
        android.content.Context context2 = jumpView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.ra.class))).V6();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(jumpView, "red_preview_icon");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(jumpView, 40, 25496);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(jumpView, new sc2.q(itemId, opt, V6));
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.eaf);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xa4Var.getString(1))) {
            if (textView != null) {
                textView.setText(xa4Var.getString(1));
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        gs2.c.f275072a.e(holder, jumpView, j(finderJumpInfo), finderJumpInfo.getBusiness_type() == 2);
    }

    @Override // ad2.h
    public void y(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, ec2.f event) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(event, "event");
        super.y(holder, jumpView, infoEx, event);
        int i17 = event.f250959d;
        if (i17 == 11) {
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) jumpView.findViewById(com.tencent.mm.R.id.eae);
            this.B = mMPAGView.getProgress();
            mMPAGView.n();
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.view.MMPAGView mMPAGView2 = (com.tencent.mm.view.MMPAGView) jumpView.findViewById(com.tencent.mm.R.id.eae);
            if (mMPAGView2.f()) {
                return;
            }
            double progress = mMPAGView2.getProgress();
            double d17 = this.B;
            if (progress == d17) {
                mMPAGView2.setProgress(d17);
                mMPAGView2.g();
            }
        }
    }

    @Override // ad2.h
    public void z(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.z(holder, jumpView, infoEx, i17);
        if (i17 < infoEx.E || i17 >= infoEx.F) {
            return;
        }
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) jumpView.findViewById(com.tencent.mm.R.id.eae);
        long c17 = mMPAGView.c() / 1000000;
        if (java.lang.Math.abs((((i17 * 1000) * 1000) - infoEx.E) - (((int) (mMPAGView.getProgress() * mMPAGView.c())) - ((((int) (c17 - (infoEx.F - infoEx.E))) * 1000) * 1000))) >= 1000000) {
            mMPAGView.setProgress(((i17 + r12) - infoEx.E) / c17);
        }
        if (mMPAGView.f()) {
            return;
        }
        mMPAGView.g();
    }
}
