package di5;

/* loaded from: classes12.dex */
public final class s extends pf3.g implements fg3.a {

    /* renamed from: v, reason: collision with root package name */
    public t40.d f232810v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f232811w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f232812x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.FinderPostVideoBottomBarLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f232811w = "";
        this.f232812x = "";
    }

    public static final void g0(di5.s sVar, java.lang.String clickId) {
        jz5.l h07;
        ml2.t1 t1Var;
        sVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportReplayHighlightsClick: clickId: ");
        sb6.append(clickId);
        sb6.append(" clipId: ");
        sb6.append(sVar.f232811w);
        sb6.append(" liveId: ");
        sb6.append(sVar.f232812x);
        sb6.append(",scene: ");
        t40.d dVar = sVar.f232810v;
        sb6.append(dVar != null ? dVar.name() : null);
        com.tencent.mars.xlog.Log.i("MediaGallery.FinderPostVideoBottomBarLayer", sb6.toString());
        if (sVar.f232811w.length() == 0) {
            return;
        }
        if ((sVar.f232812x.length() == 0) || (h07 = sVar.h0()) == null) {
            return;
        }
        int intValue = ((java.lang.Number) h07.f302833d).intValue();
        java.lang.Integer num = (java.lang.Integer) h07.f302834e;
        zy2.ac acVar = (zy2.ac) i95.n0.c(zy2.ac.class);
        java.lang.String clipId = sVar.f232811w;
        java.lang.String liveId = sVar.f232812x;
        ((ml2.l0) acVar).getClass();
        kotlin.jvm.internal.o.g(clickId, "clickId");
        kotlin.jvm.internal.o.g(clipId, "clipId");
        kotlin.jvm.internal.o.g(liveId, "liveId");
        ml2.t1[] values = ml2.t1.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                t1Var = null;
                break;
            }
            ml2.t1 t1Var2 = values[i17];
            if (kotlin.jvm.internal.o.b(t1Var2.f328013d, clickId)) {
                t1Var = t1Var2;
                break;
            }
            i17++;
        }
        if (t1Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveReplayHighlightsReportUtil", "elementClickId is null");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("live_id", liveId);
        if (intValue == 2) {
            linkedHashMap.put("lianmai_replay_id", clipId);
        } else if (intValue != 3) {
            linkedHashMap.put("clip_id", clipId);
        } else {
            linkedHashMap.put("sing_replay_id", clipId);
        }
        linkedHashMap.put(ya.b.CONTENT_TYPE, java.lang.String.valueOf(intValue));
        if (num != null) {
            linkedHashMap.put("source_type", num.toString());
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, t1Var, linkedHashMap, null, "378", null, null, false, 52, null);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        i0("live_playback_high_clip_save");
        i0("live_playback_high_clip_share");
        i0("live_playback_high_clip_publish");
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejf, (android.view.ViewGroup) null);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryLocatePreviewEnabled()) == 1) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.bhi)).setImageResource(com.tencent.mm.R.raw.icons_gallery_filled);
        }
        ((android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.b0y)).setVisibility(8);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.smw);
        kotlin.jvm.internal.o.f(frameLayout, "getBtnSave(...)");
        pf3.d.U(this, frameLayout, null, new di5.p(this), 1, null);
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.f483505sn0);
        kotlin.jvm.internal.o.f(frameLayout2, "getBtnShare(...)");
        pf3.d.U(this, frameLayout2, null, new di5.q(this), 1, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.tzi);
        kotlin.jvm.internal.o.f(linearLayout, "getGalleryFinderPostBtn(...)");
        pf3.d.U(this, linearLayout, null, new di5.r(this), 1, null);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // fg3.a
    public void b() {
    }

    public final jz5.l h0() {
        int i17;
        t40.d dVar = this.f232810v;
        int i18 = dVar == null ? -1 : di5.o.f232806a[dVar.ordinal()];
        java.lang.Integer num = null;
        if (i18 == 1) {
            i17 = 1;
        } else if (i18 == 2) {
            i17 = 2;
            num = 1;
        } else if (i18 == 3) {
            i17 = 2;
            num = 2;
        } else if (i18 == 4) {
            i17 = 3;
            num = 1;
        } else {
            if (i18 != 5) {
                return null;
            }
            i17 = 3;
            num = 2;
        }
        return new jz5.l(i17, num);
    }

    public final void i0(java.lang.String clickId) {
        jz5.l h07;
        ml2.u1 u1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportReplayHighlightsExpose: clickId: ");
        sb6.append(clickId);
        sb6.append(" clipId: ");
        sb6.append(this.f232811w);
        sb6.append(" liveId: ");
        sb6.append(this.f232812x);
        sb6.append(",scene: ");
        t40.d dVar = this.f232810v;
        sb6.append(dVar != null ? dVar.name() : null);
        com.tencent.mars.xlog.Log.i("MediaGallery.FinderPostVideoBottomBarLayer", sb6.toString());
        if (this.f232811w.length() == 0) {
            return;
        }
        if ((this.f232812x.length() == 0) || (h07 = h0()) == null) {
            return;
        }
        int intValue = ((java.lang.Number) h07.f302833d).intValue();
        java.lang.Integer num = (java.lang.Integer) h07.f302834e;
        zy2.ac acVar = (zy2.ac) i95.n0.c(zy2.ac.class);
        java.lang.String clipId = this.f232811w;
        java.lang.String liveId = this.f232812x;
        ((ml2.l0) acVar).getClass();
        kotlin.jvm.internal.o.g(clickId, "clickId");
        kotlin.jvm.internal.o.g(clipId, "clipId");
        kotlin.jvm.internal.o.g(liveId, "liveId");
        ml2.u1[] values = ml2.u1.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                u1Var = null;
                break;
            }
            ml2.u1 u1Var2 = values[i17];
            if (kotlin.jvm.internal.o.b(u1Var2.f328108d, clickId)) {
                u1Var = u1Var2;
                break;
            }
            i17++;
        }
        if (u1Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveReplayHighlightsReportUtil", "elementExposeId is null");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("live_id", liveId);
        if (intValue == 2) {
            linkedHashMap.put("lianmai_replay_id", clipId);
        } else if (intValue != 3) {
            linkedHashMap.put("clip_id", clipId);
        } else {
            linkedHashMap.put("sing_replay_id", clipId);
        }
        linkedHashMap.put(ya.b.CONTENT_TYPE, java.lang.String.valueOf(intValue));
        if (num != null) {
            linkedHashMap.put("source_type", num.toString());
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, u1Var, linkedHashMap, null, "378", null, null, false, 52, null);
    }

    @Override // mf3.l
    public void onResume() {
        e0();
        i0("live_playback_high_clip_save");
        i0("live_playback_high_clip_share");
        i0("live_playback_high_clip_publish");
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        mf3.s sVar = this.f326110m;
        mf3.k kVar = sVar != null ? sVar.f326117a : null;
        ci5.e eVar = kVar instanceof ci5.e ? (ci5.e) kVar : null;
        if (eVar != null) {
            this.f232810v = eVar.f41726b.f415474h;
            com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams finderLiveGalleryParams = eVar.f41725a;
            this.f232811w = finderLiveGalleryParams.f66604e;
            this.f232812x = finderLiveGalleryParams.f66608i;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bind: ");
        t40.d dVar = this.f232810v;
        sb6.append(dVar != null ? dVar.name() : null);
        sb6.append(" clipId: ");
        sb6.append(this.f232811w);
        sb6.append(" liveId: ");
        sb6.append(this.f232812x);
        com.tencent.mars.xlog.Log.i("MediaGallery.FinderPostVideoBottomBarLayer", sb6.toString());
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
    }
}
