package wj5;

/* loaded from: classes14.dex */
public final class r extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f446834e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.tipsbar.d f446835f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.r f446836g;

    public r(yb5.d mChattingContext, com.tencent.mm.ui.tipsbar.d tipsBarContext, yj5.r processor) {
        kotlin.jvm.internal.o.g(mChattingContext, "mChattingContext");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f446834e = mChattingContext;
        this.f446835f = tipsBarContext;
        this.f446836g = processor;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489318c43;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.g item = (xj5.g) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        com.tencent.mm.ui.tipsbar.d dVar = this.f446835f;
        boolean z18 = dVar.f209926b == com.tencent.mm.ui.tipsbar.e.f209930e;
        yb5.d dVar2 = this.f446834e;
        boolean z19 = ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) dVar2.f460708c.a(sb5.n.class))).u0() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar2.f460708c.a(sb5.f.class))).P;
        com.tencent.mm.ui.MultiTalkRoomPopupNav multiTalkRoomPopupNav = (com.tencent.mm.ui.MultiTalkRoomPopupNav) holder.p(com.tencent.mm.R.id.jx8);
        multiTalkRoomPopupNav.setChattingContext(dVar2);
        multiTalkRoomPopupNav.setGroupUserName(dVar2.x());
        multiTalkRoomPopupNav.setCurrentSenderUserName(dVar2.t());
        multiTalkRoomPopupNav.setInChatRoom(z19);
        multiTalkRoomPopupNav.h(z18);
        multiTalkRoomPopupNav.setMultiTalkInfo(item.f454903u);
        if (dVar.f209925a == com.tencent.mm.ui.tipsbar.c.f209922d) {
            multiTalkRoomPopupNav.c();
        } else {
            yj5.q qVar = item.f454904v;
            if (qVar.f462727a && (!qVar.f462728b.isEmpty())) {
                multiTalkRoomPopupNav.g("", multiTalkRoomPopupNav.b(qVar.f462728b, ""), dVar2.x(), qVar.f462728b.size(), 0L);
            } else {
                multiTalkRoomPopupNav.c();
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = multiTalkRoomPopupNav.f196995e;
        if (weImageView != null) {
            weImageView.setVisibility(dVar.a() ? 8 : 0);
        }
        multiTalkRoomPopupNav.setEnterMultiTalkListener(new wj5.q(this));
        android.view.View findViewById = multiTalkRoomPopupNav.findViewById(com.tencent.mm.R.id.jvy);
        android.widget.Button button = findViewById instanceof android.widget.Button ? (android.widget.Button) findViewById : null;
        if (button != null) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(button, "group_msg_set_top_bar_join_btn");
            aVar.ik(button, 8, 26356);
        }
        this.f446836g.f462729f = multiTalkRoomPopupNav;
    }

    @Override // wj5.c, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
