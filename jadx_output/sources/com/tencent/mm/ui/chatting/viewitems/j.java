package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public abstract class j extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.r2 f204212t;

    /* renamed from: u, reason: collision with root package name */
    public long f204213u;

    /* renamed from: x, reason: collision with root package name */
    public yb5.d f204216x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f204217y;

    /* renamed from: z, reason: collision with root package name */
    public long f204218z;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f204211s = kotlinx.coroutines.z0.b();

    /* renamed from: v, reason: collision with root package name */
    public final int f204214v = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);

    /* renamed from: w, reason: collision with root package name */
    public final int f204215w = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9) * (-1);
    public final yn.l A = new com.tencent.mm.ui.chatting.viewitems.g(this);

    public static final void g0(com.tencent.mm.ui.chatting.viewitems.j jVar, com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder) {
        android.widget.ImageView finderTailTag = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderTailTag();
        if (finderTailTag != null) {
            finderTailTag.setVisibility(8);
        }
        android.widget.TextView finderNickname = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderNickname();
        android.view.ViewGroup.LayoutParams layoutParams = finderNickname != null ? finderNickname.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(jVar.f204214v);
        }
        android.view.View iconGroupContainer = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getIconGroupContainer();
        android.view.ViewGroup.LayoutParams layoutParams2 = iconGroupContainer != null ? iconGroupContainer.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 == null) {
            return;
        }
        marginLayoutParams2.setMarginStart(jVar.f204215w);
    }

    public final java.util.Map d0(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, r45.g92 g92Var) {
        java.util.Map k17 = kz5.c1.k(new jz5.l("card_id", java.lang.Long.valueOf(f9Var.I0())), new jz5.l("card_type", "4"), new jz5.l("live_status", g92Var.getInteger(13) != 1 ? "0" : "1"), new jz5.l("liveid", g92Var.getString(0)), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, dVar.D() ? "2" : "1"), new jz5.l("chatroomid", dVar.x()), new jz5.l("share_username", g95.e0.d(f9Var)), new jz5.l("chatroomuv", dVar.D() ? java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(dVar.x())) : null));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : k17.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void e0(android.view.View view, yb5.d ui6, com.tencent.mm.storage.f9 msg, r45.g92 finderObject) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        java.util.Map d07 = d0(ui6, msg, finderObject);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "chatting_item_appmsg_new_finder_live_feed_container_view");
        aVar.gk(view, d07);
        aVar.Tj(view, 40, 12, false);
    }

    public final void f0(yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        zy2.c cVar = (zy2.c) ot0.q.v(msg.U1()).y(zy2.c.class);
        if (cVar != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("chatting_item_appmsg_new_finder_live_feed_container_view", "view_clk", d0(ui6, msg, cVar.f477359b), 12, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0275  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r22, yb5.d r23, rd5.d r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.j.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
