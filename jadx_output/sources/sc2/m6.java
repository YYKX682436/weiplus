package sc2;

/* loaded from: classes2.dex */
public final class m6 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f406081w = jz5.h.b(new sc2.e6(this));

    public final yc2.c G() {
        return (yc2.c) ((jz5.n) this.f406081w).getValue();
    }

    public final void H(in5.s0 s0Var, xc2.p0 p0Var, yc2.b bVar) {
        sc2.q8 q8Var = p0Var.f453233J;
        if (q8Var != null) {
            q8Var.f406177a = false;
        }
        by2.c.f36368a.b(s0Var.itemView, 2, sc2.i6.f405974d);
        com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout = (com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout) s0Var.p(com.tencent.mm.R.id.tw9);
        com.tencent.mars.xlog.Log.i("FinderFeedBottomBubbleObserver", "[realHide] feedId:" + ((java.lang.Object) jz5.x.a(this.f3145f)) + ' ');
        kotlin.jvm.internal.o.d(trackTipsFrameLayout);
        n(trackTipsFrameLayout, true, new sc2.j6(this, trackTipsFrameLayout));
        I(trackTipsFrameLayout, "view_clk", bVar);
    }

    public final void I(android.view.View view, java.lang.String str, yc2.b bVar) {
        java.lang.String str2;
        yc2.c G = G();
        if (G == null || (str2 = G.y()) == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        yc2.c G2 = G();
        hc2.v0.d(view, str3, str, false, G2 != null ? G2.x(bVar) : null, null, 20, null);
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
    }

    @Override // ad2.h, ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
    }

    @Override // ad2.h
    public java.lang.String k() {
        return "FinderFeedBottomBubbleObserver";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m(xc2.p0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "infoEx"
            kotlin.jvm.internal.o.g(r7, r0)
            r45.wf6 r0 = r6.f3149m
            r1 = 52
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L1a
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            r45.on r0 = (r45.on) r0
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.getString(r3)
            goto L1b
        L1a:
            r0 = r2
        L1b:
            r4 = 1
            if (r0 == 0) goto L27
            int r0 = r0.length()
            if (r0 != 0) goto L25
            goto L27
        L25:
            r0 = r3
            goto L28
        L27:
            r0 = r4
        L28:
            if (r0 != 0) goto L4c
            r45.wf6 r0 = r6.f3149m
            if (r0 == 0) goto L3b
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            r45.on r0 = (r45.on) r0
            if (r0 == 0) goto L3b
            java.lang.String r0 = r0.getString(r4)
            goto L3c
        L3b:
            r0 = r2
        L3c:
            if (r0 == 0) goto L47
            int r0 = r0.length()
            if (r0 != 0) goto L45
            goto L47
        L45:
            r0 = r3
            goto L48
        L47:
            r0 = r4
        L48:
            if (r0 != 0) goto L4c
            r0 = r4
            goto L4d
        L4c:
            r0 = r3
        L4d:
            if (r0 != 0) goto L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "[hasWording], checkWordingValid failed, style="
            r1.<init>(r5)
            r45.wf6 r5 = r6.f3149m
            if (r5 == 0) goto L5e
            org.json.JSONObject r2 = r5.toJSON()
        L5e:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderFeedBottomBubbleObserver"
            com.tencent.mars.xlog.Log.e(r2, r1)
        L6a:
            boolean r7 = super.m(r7)
            if (r7 != 0) goto L72
            if (r0 == 0) goto L73
        L72:
            r3 = r4
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.m6.m(xc2.p0):boolean");
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.lang.String v17;
        java.lang.String w17;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        r45.wf6 wf6Var = this.f3149m;
        r45.on onVar = wf6Var != null ? (r45.on) wf6Var.getCustom(52) : null;
        android.content.Context context = holder.f293121e;
        android.content.res.Resources resources = context.getResources();
        com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout = (com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout) holder.p(com.tencent.mm.R.id.tw9);
        if (trackTipsFrameLayout == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindView], tipsView null, not added, style=");
            r45.wf6 wf6Var2 = this.f3149m;
            sb6.append(wf6Var2 != null ? wf6Var2.toJSON() : null);
            com.tencent.mars.xlog.Log.e("FinderFeedBottomBubbleObserver", sb6.toString());
            return;
        }
        trackTipsFrameLayout.a(new sc2.f6(holder));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.qsy);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.qsz);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.qsw);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f484987qt0);
        android.view.ViewGroup.LayoutParams layoutParams = trackTipsFrameLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479654bs);
        layoutParams2.gravity = 80;
        trackTipsFrameLayout.setLayoutParams(layoutParams2);
        if (textView != null) {
            if (onVar == null || (w17 = onVar.getString(0)) == null) {
                yc2.c G = G();
                w17 = G != null ? G.w() : null;
            }
            textView.setText(w17);
        }
        if (textView2 != null) {
            if (onVar == null || (v17 = onVar.getString(1)) == null) {
                yc2.c G2 = G();
                v17 = G2 != null ? G2.v() : null;
            }
            textView2.setText(v17);
        }
        if (textView2 != null) {
            textView2.setBackgroundResource(com.tencent.mm.R.drawable.f481626yf);
        }
        if (textView2 != null) {
            textView2.setTextColor(context.getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        }
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onBindView], feedId=");
        sb7.append((java.lang.Object) jz5.x.a(feed.getItemId()));
        sb7.append(", position:");
        sb7.append(holder.getAdapterPosition());
        sb7.append(" infoEx=");
        sb7.append(infoEx);
        sb7.append(", jumpInfo=");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        sb7.append(finderJumpInfo.toJSON());
        sb7.append(", snap_shot_init_data=");
        r45.k74 lite_app_info = finderJumpInfo.getLite_app_info();
        sb7.append(lite_app_info != null ? lite_app_info.getString(12) : null);
        com.tencent.mars.xlog.Log.i("FinderFeedBottomBubbleObserver", sb7.toString());
        textView2.setOnClickListener(new sc2.g6(this, holder, infoEx));
        p17.setOnClickListener(new sc2.h6(this, holder, infoEx));
    }

    @Override // ad2.h
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.v(holder, jumpView, infoEx);
        jz5.x.a(this.f3145f);
        com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout = (com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout) holder.p(com.tencent.mm.R.id.tw9);
        long j17 = this.f3145f;
        kotlin.jvm.internal.o.d(trackTipsFrameLayout);
        boolean z17 = false;
        if (trackTipsFrameLayout.getVisibility() == 0) {
            jz5.x.a(j17);
            return;
        }
        sc2.q8 q8Var = infoEx.f453233J;
        if (q8Var != null && q8Var.f406177a) {
            jz5.x.a(j17);
            return;
        }
        if (q8Var != null && q8Var.f406178b) {
            z17 = true;
        }
        if (z17) {
            jz5.x.a(j17);
            return;
        }
        if (!trackTipsFrameLayout.visibilityManager.O6(trackTipsFrameLayout.f109065e)) {
            jz5.x.a(j17);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderFeedBottomBubbleObserver", "[realShow] feedId:" + ((java.lang.Object) jz5.x.a(j17)) + ' ');
        sc2.q8 q8Var2 = infoEx.f453233J;
        if (q8Var2 != null) {
            q8Var2.f406177a = true;
        }
        by2.c.f36368a.b(holder.itemView, 2, sc2.k6.f406022d);
        E(holder, trackTipsFrameLayout, infoEx, true, new sc2.l6(this, j17, trackTipsFrameLayout));
        I(trackTipsFrameLayout, "view_exp", null);
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.w(holder, jumpView, infoEx);
        H(holder, infoEx, null);
        jz5.x.a(this.f3145f);
    }
}
