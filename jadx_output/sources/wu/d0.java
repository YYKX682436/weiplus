package wu;

/* loaded from: classes9.dex */
public final class d0 extends wu.p {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f449556h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
        this.f449556h = pd5.l.f353580b.a(com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_FinderNameCard.class, false);
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        int intValue;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        if (!this.f449556h) {
            com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
            if (mvvmView == null) {
                return;
            }
            z01.p pVar = new z01.p();
            pVar.f469136d = q(item);
            pVar.f469137e = com.tencent.mm.R.drawable.d87;
            pVar.f469138f = new wu.c0(this, item);
            mvvmView.setViewModel(pVar);
            return;
        }
        com.tencent.mm.mvvm.MvvmView mvvmView2 = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView2 == null) {
            return;
        }
        z01.d dVar = new z01.d();
        dVar.f468978d = com.tencent.mm.R.drawable.d87;
        s15.h hVar = item.f284997e;
        s15.s y17 = hVar.y();
        java.lang.String nickname = y17 != null ? y17.getNickname() : null;
        android.content.Context context = containerView.getContext();
        if (nickname != null && context != null) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            dVar.f468980f = com.tencent.mm.pluginsdk.ui.span.c0.i(context, nickname);
        }
        s15.s y18 = hVar.y();
        dVar.f468979e = y18 != null ? y18.l() : null;
        s15.s y19 = hVar.y();
        dVar.f468981g = y19 != null ? y19.k() : null;
        android.content.Context context2 = containerView.getContext();
        s15.s y27 = hVar.y();
        java.lang.Integer valueOf = y27 != null ? java.lang.Integer.valueOf(y27.j()) : null;
        if (context2 != null && valueOf != null && (intValue = valueOf.intValue()) > 0) {
            if (intValue == 1) {
                dVar.f468982h = com.tencent.mm.R.raw.icons_filled_star_identify;
                dVar.f468983i = b3.l.getColor(context2, com.tencent.mm.R.color.f478526a7);
            } else if (intValue == 2) {
                dVar.f468982h = com.tencent.mm.R.raw.icons_filled_star_identify_enterprise;
            }
        }
        dVar.f468985n = new wu.b0(this, item);
        mvvmView2.setViewModel(dVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        x05.c q17 = q(item);
        android.content.Intent intent = new android.content.Intent();
        hu.f fVar = this.f449610e;
        if (com.tencent.mm.storage.z3.R4(fVar.q())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
            intent.putExtra("report_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
            intent.putExtra("report_scene", 1);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(com.tencent.mm.storage.z3.R4(fVar.q()) ? 3 : 2, 3, 32, intent);
        intent.putExtra("key_enter_profile_type", 4);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_ec_source", q17.n());
        intent.putExtra("finder_username", q17.getUsername());
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", q17.getNickname());
        intent.putExtra("key_finder_teen_mode_user_id", q17.getUsername());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e1Var.w(context, intent);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        com.tencent.mm.mvvm.MvvmView chattingFinderNameCardMvvmView;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        if (this.f449556h) {
            r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
            android.content.Context context = containerView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            chattingFinderNameCardMvvmView = ((bf5.a) Ai).f(context);
        } else {
            ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
            android.content.Context context2 = containerView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            chattingFinderNameCardMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFinderNameCardMvvmView(context2, null, 0, 6, null);
        }
        chattingFinderNameCardMvvmView.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(chattingFinderNameCardMvvmView, -2, -2);
    }

    public final x05.c q(hu.b bVar) {
        x05.c cVar = new x05.c();
        s15.s y17 = bVar.f284997e.y();
        if (y17 != null) {
            cVar.u(y17.getUsername());
            cVar.t(y17.getNickname());
            cVar.r(y17.l());
            cVar.q(y17.k());
            cVar.p(y17.j());
            cVar.s(y17.n());
        }
        return cVar;
    }
}
