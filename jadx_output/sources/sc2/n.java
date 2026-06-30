package sc2;

/* loaded from: classes2.dex */
public final class n extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f406087w = "CNYFeedBariableButtonJumperObserver";

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f406088x;

    @Override // ad2.h
    public void E(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        android.view.View a17;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        xc2.p0 p0Var = this.f3147h;
        if (p0Var != null) {
            G(p0Var, jumpView);
        }
        e(true, z17);
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue()) {
            in5.s0 s0Var = this.f3148i;
            if (s0Var != null) {
                bw2.o oVar = bw2.o.f24869a;
                a17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24880l).getValue()).invoke(s0Var)).a();
            }
            a17 = null;
        } else {
            in5.s0 s0Var2 = this.f3148i;
            if (s0Var2 != null) {
                a17 = s0Var2.p(com.tencent.mm.R.id.e_2);
            }
            a17 = null;
        }
        if (a17 == null) {
            return;
        }
        int dimensionPixelOffset = holder.f293121e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        android.view.ViewTreeObserver viewTreeObserver = a17.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new sc2.k(a17, jumpView, dimensionPixelOffset));
        }
        f(500L, jumpView, z17, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    public final void G(xc2.p0 p0Var, android.view.View view) {
        r45.xd xdVar;
        java.lang.Object obj;
        r45.fq fqVar;
        r45.wf6 wf6Var;
        r45.wf6 wf6Var2 = this.f3149m;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                } else {
                    wf6Var = it.next();
                    if (((r45.wf6) wf6Var).getInteger(2) == 13) {
                        break;
                    }
                }
            }
            wf6Var2 = wf6Var;
        }
        if (wf6Var2 == null || (xdVar = (r45.xd) wf6Var2.getCustom(21)) == null) {
            return;
        }
        fe0.t3 t3Var = (fe0.t3) i95.n0.c(fe0.t3.class);
        java.lang.String group_key = p0Var.f453234a.getGroup_key();
        ((ee0.p3) t3Var).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        java.lang.String d17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j0.d(group_key);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        int i17 = com.tencent.mm.sdk.platformtools.t8.K0(d17) ^ true ? 2 : 1;
        java.util.LinkedList list = xdVar.getList(1);
        kotlin.jvm.internal.o.f(list, "getBraiable_button_list(...)");
        java.util.Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it6.next();
                if (((r45.wd) obj).getInteger(0) == i17) {
                    break;
                }
            }
        }
        r45.wd wdVar = (r45.wd) obj;
        if (wdVar == null || (fqVar = (r45.fq) wdVar.getCustom(1)) == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.eez);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.eey);
        if (textView != null) {
            textView.setText(fqVar.getString(0));
        }
        if (findViewById != null) {
            try {
                findViewById.setBackgroundColor(android.graphics.Color.parseColor(fqVar.getString(2)));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("CNYFeedBariableButton", th6, "parse color crash, bg_color=" + fqVar.getString(2) + "， font_color=" + fqVar.getString(1), new java.lang.Object[0]);
            }
        }
        if (textView != null) {
            textView.setTextColor(android.graphics.Color.parseColor(fqVar.getString(1)));
        }
        com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindView refreshButtonStatus buttonTv=");
        sb6.append((java.lang.Object) (textView != null ? textView.getText() : null));
        com.tencent.mars.xlog.Log.i(this.f406087w, sb6.toString());
    }

    @Override // ad2.h
    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        return info.getBusiness_type() == 2 ? info.getExt_type() == 3 ? gs2.a.f275052h : gs2.a.f275054m : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f406087w;
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
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        cl0.g gVar;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        java.lang.Object obj = null;
        if (this.f406088x == null) {
            android.content.Context context = jumpView.getContext();
            final com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCnyEggCardEvent> iListener = mMActivity != null ? new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCnyEggCardEvent>(mMActivity) { // from class: com.tencent.mm.plugin.finder.feed.component.CNYFeedBariableButtonJumperObserver$createListener$1
                {
                    this.__eventId = 1918656061;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.FinderCnyEggCardEvent finderCnyEggCardEvent) {
                    com.tencent.mm.autogen.events.FinderCnyEggCardEvent event = finderCnyEggCardEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    ((ku5.t0) ku5.t0.f312615d).B(new sc2.j(this));
                    return true;
                }
            } : null;
            this.f406088x = iListener;
            if (iListener != null) {
                iListener.alive();
            }
        }
        G(infoEx, jumpView);
        xc2.p0 p0Var = this.f3147h;
        xc2.o0 o0Var = p0Var != null ? p0Var.f453246h : null;
        xc2.p pVar = o0Var instanceof xc2.p ? (xc2.p) o0Var : null;
        if (pVar != null && (gVar = pVar.f453227f) != null) {
            obj = gVar.opt("report_extra_data");
        }
        java.lang.Object obj2 = obj == null ? "" : obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        android.content.Context context2 = jumpView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.ra.class))).V6();
        fe0.t3 t3Var = (fe0.t3) i95.n0.c(fe0.t3.class);
        java.lang.String group_key = infoEx.f453234a.getGroup_key();
        ((ee0.p3) t3Var).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        java.lang.String d17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j0.d(group_key);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        boolean z17 = !(d17 == null || d17.length() == 0);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(jumpView, "finder_bariable_button");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(jumpView, 40, 25496);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(jumpView, 40, 1, false);
        java.lang.Object obj3 = obj2;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(jumpView, new sc2.l(V6, itemId, infoEx, obj3, z17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(jumpView, 40, new sc2.m(this, itemId, z17, obj3, V6));
    }
}
