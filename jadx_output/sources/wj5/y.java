package wj5;

/* loaded from: classes8.dex */
public final class y extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f446848e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.tipsbar.d f446849f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.t f446850g;

    /* renamed from: h, reason: collision with root package name */
    public final db5.i9 f446851h;

    public y(yb5.d mChattingContext, com.tencent.mm.ui.tipsbar.d tipsBarContext, yj5.t processor) {
        kotlin.jvm.internal.o.g(mChattingContext, "mChattingContext");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f446848e = mChattingContext;
        this.f446849f = tipsBarContext;
        this.f446850g = processor;
        this.f446851h = new wj5.x(this);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cxt;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        java.lang.String str;
        boolean z18;
        xj5.i item = (xj5.i) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        com.tencent.mm.ui.base.TalkRoomPopupNavV2 talkRoomPopupNavV2 = (com.tencent.mm.ui.base.TalkRoomPopupNavV2) holder.p(com.tencent.mm.R.id.nxy);
        yb5.d dVar = this.f446848e;
        talkRoomPopupNavV2.setChattingContext(dVar);
        talkRoomPopupNavV2.setOnClickListener(this.f446851h);
        java.lang.String t17 = dVar.t();
        java.util.List list2 = item.f454906u;
        if (list2.contains(t17)) {
            str = dVar.s().getString(com.tencent.mm.R.string.k1n);
            talkRoomPopupNavV2.setArrowRotation(0.0f);
            z18 = false;
        } else {
            talkRoomPopupNavV2.setArrowRotation(90.0f);
            talkRoomPopupNavV2.c(-1, 0);
            if (list2.size() == 1) {
                android.content.res.Resources s17 = dVar.s();
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str2 = (java.lang.String) list2.get(0);
                ((sg3.a) v0Var).getClass();
                string = s17.getString(com.tencent.mm.R.string.k1m, c01.a2.e(str2));
            } else {
                string = dVar.s().getString(com.tencent.mm.R.string.k1o, java.lang.Integer.valueOf(list2.size()));
            }
            int color = dVar.s().getColor(com.tencent.mm.R.color.f478502m);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = talkRoomPopupNavV2.f197696p;
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_location);
                talkRoomPopupNavV2.f197696p.setIconColor(color);
            }
            str = string;
            z18 = true;
        }
        android.widget.LinearLayout linearLayout = talkRoomPopupNavV2.f197690g;
        if (linearLayout != null) {
            if (linearLayout.getVisibility() == 0 && talkRoomPopupNavV2.f197703w == null) {
                talkRoomPopupNavV2.e(true);
            } else {
                talkRoomPopupNavV2.e(false);
            }
        }
        talkRoomPopupNavV2.d(list2);
        talkRoomPopupNavV2.setVisibility(0);
        talkRoomPopupNavV2.setNavContent(str);
        com.tencent.mm.ui.tipsbar.d dVar2 = this.f446849f;
        if (dVar2.f209925a == com.tencent.mm.ui.tipsbar.c.f209922d) {
            talkRoomPopupNavV2.k(0L);
        } else if (z18) {
            talkRoomPopupNavV2.j("fromBanner", list2, 0L);
        } else {
            talkRoomPopupNavV2.k(0L);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView arrowImg = talkRoomPopupNavV2.getArrowImg();
        if (arrowImg != null) {
            arrowImg.setVisibility(dVar2.a() ? 8 : 0);
        }
        android.widget.Button btnEnter = talkRoomPopupNavV2.getBtnEnter();
        if (btnEnter != null) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(btnEnter, "group_msg_set_top_bar_join_btn");
            aVar.ik(btnEnter, 8, 26356);
        }
        this.f446850g.f462731f = talkRoomPopupNavV2;
    }

    @Override // wj5.c, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void p(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("enter_room_username", str);
        intent.setFlags(268435456);
        j45.l.j(this.f446848e.g(), "talkroom", ".ui.TalkRoomUI", intent, null);
    }

    public final void q(java.lang.String str) {
        yb5.d dVar = this.f446848e;
        if (iq.b.C(dVar.g()) || iq.b.v(dVar.g()) || iq.b.e(dVar.g())) {
            return;
        }
        if (q21.d.a() != null) {
            if (((va3.z0) q21.d.a()).f(dVar.u().d1())) {
                java.util.LinkedList b17 = ((va3.z0) q21.d.a()).b(dVar.u().d1());
                if (b17 != null && b17.contains(dVar.t())) {
                    r("fromBanner");
                    return;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, 13, 0, 0, 0);
                com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = this.f446850g.f462731f;
                if (talkRoomPopupNav == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TrackRoomComponent", "talkRoomPopupNav = null.");
                    return;
                }
                talkRoomPopupNav.setDialogContent(dVar.s().getString(com.tencent.mm.R.string.f491121c10));
                if (talkRoomPopupNav.f197690g.getVisibility() == 0) {
                    talkRoomPopupNav.k(300L);
                    return;
                } else {
                    talkRoomPopupNav.j("fromBanner", b17, 300L);
                    return;
                }
            }
        }
        r("fromBanner");
    }

    public final void r(java.lang.String str) {
        this.f446850g.m0();
        ((com.tencent.mm.ui.chatting.component.sm) ((sb5.j2) this.f446848e.f460708c.a(sb5.j2.class))).t0(str);
    }
}
