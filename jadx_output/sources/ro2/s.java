package ro2;

/* loaded from: classes2.dex */
public abstract class s {
    public static final java.lang.CharSequence a(com.tencent.mm.plugin.finder.convert.qe qeVar, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18) {
        boolean z17;
        int i19;
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479693cs);
        ya2.b2 contact = item.getContact();
        java.lang.String w07 = contact != null ? contact.w0() : "";
        if (item.getFeedObject().getFeedObject().getObjectType() == 1) {
            i19 = i17;
            z17 = true;
        } else {
            z17 = false;
            i19 = i17;
        }
        int i27 = i19 == 1 ? z17 ? com.tencent.mm.R.raw.icons_outlined_channels_fire_medium : com.tencent.mm.R.raw.heart_medium : com.tencent.mm.R.raw.thumb_medium;
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.ohi);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.olx, java.lang.Integer.valueOf(i18));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return hc2.x0.k(string + w07 + string2, context, '#', i27, com.tencent.mm.R.color.f478553an, h17, h17, 0, 0, 2, 192, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, r45.zu0 info) {
        r45.vl2 vl2Var;
        r45.ql2 ql2Var;
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
        int integer = i17 == 1 ? info.getInteger(0) : info.getInteger(1);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127616b6).getValue()).r()).booleanValue()) {
            i95.m c18 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            lb2.j jVar = (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127635c6).getValue();
            jVar.l();
            return ((java.lang.Boolean) jVar.r()).booleanValue();
        }
        pf5.u uVar = pf5.u.f353936a;
        boolean z17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_INTERACTION_STRONG_LIKE_TOAST_INT_SYNC, 0) == 1;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast: globalFeatureSwitch is false");
            return false;
        }
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_INTERACTION_STRONG_LIKE_TOAST_BREAK_POINTS_STRING_SYNC, "");
        kotlin.jvm.internal.o.d(v17);
        boolean z18 = v17.length() > 0;
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (z18) {
            try {
                java.util.List f07 = r26.n0.f0(v17, new java.lang.String[]{","}, false, 0, 6, null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = f07.iterator();
                while (it.hasNext()) {
                    java.lang.Integer h17 = r26.h0.h(r26.n0.u0((java.lang.String) it.next()).toString());
                    if (h17 != null) {
                        arrayList.add(h17);
                    }
                }
                p0Var = arrayList;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Finder.FinderInteractionStrongLikeToastConfigVM", "Failed to parse breakPoints: ".concat(v17), e17);
            }
        }
        if (!p0Var.contains(java.lang.Integer.valueOf(integer))) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast: isBreakPointReached is false, count: " + integer);
            return false;
        }
        r45.dm2 object_extend = feedObject.getObject_extend();
        boolean z19 = ((object_extend == null || (vl2Var = (r45.vl2) object_extend.getCustom(27)) == null || (ql2Var = (r45.ql2) vl2Var.getCustom(0)) == null) ? null : ql2Var.getString(0)) != null;
        if (!((i17 == 1 && z19) ? false : true)) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast: isLikeTypeValid is false, interactionType: " + i17 + ", isDynamicLike: " + z19);
            return false;
        }
        if (!(!hc2.o0.H(feedObject))) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast: isNotSelfFeed is false, isSelf: " + hc2.o0.H(feedObject));
            return false;
        }
        i95.m c19 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        lb2.j jVar2 = (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127635c6).getValue();
        jVar2.l();
        if (!((java.lang.Boolean) jVar2.r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast: isConfigEnabled is false");
            return false;
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast, count: " + integer + ", globalFeatureSwitch: " + z17 + ", isDynamicLike: " + z19 + ", isSelf: " + hc2.o0.H(feedObject));
        return true;
    }

    public static final void c(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 holder, ro2.u likeType, java.lang.Integer num) {
        int i17;
        cw2.da videoView;
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(likeType, "likeType");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        long itemId = baseFinderFeed.getItemId();
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout == null || (videoView = finderVideoLayout.getVideoView()) == null) {
            i17 = 0;
        } else {
            long videoDurationMs = videoView.getVideoDurationMs() * 100;
            i17 = (videoDurationMs <= 0 ? 0 : java.lang.Float.valueOf(((float) videoView.getCurrentPlayMs()) / ((float) videoDurationMs))).intValue();
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            java.lang.String t17 = r26.i0.t(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(itemId, baseFinderFeed.w(), nyVar.V6().getInteger(5)), ",", ";", false);
            com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.report.d2.i(d2Var, context, "acc_like_tips", "view_exp", false, kz5.c1.k(new jz5.l("feed_id", pm0.v.u(itemId)), new jz5.l("session_buffer", t17), new jz5.l("acc_like_type", java.lang.Integer.valueOf(likeType.f398107d)), new jz5.l("playpercent", java.lang.Integer.valueOf(i17)), new jz5.l("acc_like_cnt", num)), 8, null);
        }
    }
}
