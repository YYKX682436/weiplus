package ee5;

/* loaded from: classes9.dex */
public abstract class t2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f252048d;

    /* renamed from: e, reason: collision with root package name */
    public final int f252049e;

    /* renamed from: f, reason: collision with root package name */
    public final int f252050f;

    /* renamed from: g, reason: collision with root package name */
    public final int f252051g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.j0 f252052h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.g0 f252053i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f252054m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f252055n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f252056o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f252057p;

    /* renamed from: q, reason: collision with root package name */
    public long f252058q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f252048d = "MiscroMsg.FTSMultiNormalBasicUIC";
        this.f252049e = 1;
        this.f252050f = 2;
        this.f252051g = 3;
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(ae5.n.f4432d);
        this.f252052h = j0Var;
        this.f252053i = j0Var;
        this.f252054m = new java.util.ArrayList();
        this.f252056o = "";
    }

    public abstract android.text.SpannableString O6();

    public abstract zd5.n P6();

    public int Q6() {
        return 0;
    }

    public boolean R6() {
        long j17 = this.f252058q + 30000;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f252058q = currentTimeMillis;
        if (j17 < currentTimeMillis) {
            this.f252057p = c01.d9.b().E();
        }
        return this.f252057p;
    }

    public final void S6(java.lang.String str, long j17) {
        java.lang.String str2 = this.f252048d;
        if (str == null) {
            com.tencent.mars.xlog.Log.e(str2, "[gotoChattingUIWithPosition] username is null");
            return;
        }
        long msgId = pt0.f0.f358209b1.n(str, j17).getMsgId();
        com.tencent.mars.xlog.Log.i(str2, "[gotoChattingUIWithPosition] msgLocalId:%s", java.lang.Long.valueOf(msgId));
        if (!com.tencent.mm.storage.z3.R4(str)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            if (n17 == null || !n17.r2()) {
                if (n17 == null) {
                    com.tencent.mars.xlog.Log.w(str2, "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                } else {
                    com.tencent.mars.xlog.Log.w(str2, "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                }
                db5.e1.t(getActivity(), getActivity().getString(com.tencent.mm.R.string.hy6), getActivity().getString(com.tencent.mm.R.string.jz9), null);
                return;
            }
        } else if (((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(str) == null) {
            com.tencent.mars.xlog.Log.w(str2, "[gotoChattingUIWithPosition] member is null! username:%s", str);
            db5.e1.t(getActivity(), getActivity().getString(com.tencent.mm.R.string.hy6), getActivity().getString(com.tencent.mm.R.string.jz9), null);
            return;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", msgId);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        putExtra.setClass(getActivity(), com.tencent.mm.ui.chatting.ChattingUI.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiNormalBasicUIC", "goToChattingUI", "(Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiNormalBasicUIC", "goToChattingUI", "(Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void T6(int i17, com.tencent.mm.storage.f9 msgInfo, java.lang.String str) {
        int i18;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        java.lang.String str2 = this.f252048d;
        com.tencent.mars.xlog.Log.i(str2, "[handleSelectedItem] index:%s", objArr);
        int Q6 = Q6();
        if (i17 == this.f252049e) {
            de5.a.f229396a.c(16, Q6);
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            arrayList.add(msgInfo);
            if (!com.tencent.mm.pluginsdk.model.e2.i(getActivity(), doFavoriteEvent, this.f252056o, arrayList, false, false)) {
                com.tencent.mars.xlog.Log.e(str2, "[handleFav] err!");
                return;
            }
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6327m = 45;
            c4Var.f6323i = getActivity();
            doFavoriteEvent.e();
            int i19 = doFavoriteEvent.f54091h.f6433a;
            if (i19 == -2 || i19 > 0 || i19 > 0 || 14 != c4Var.f6317c) {
                return;
            }
            r45.sq0 sq0Var = c4Var.f6316b;
            if (sq0Var == null) {
                com.tencent.mars.xlog.Log.e(str2, "want to report record fav, but type count is null");
                return;
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11142, java.lang.Integer.valueOf(sq0Var.f385906d), java.lang.Integer.valueOf(c4Var.f6316b.f385907e), java.lang.Integer.valueOf(c4Var.f6316b.f385908f), java.lang.Integer.valueOf(c4Var.f6316b.f385910h), java.lang.Integer.valueOf(c4Var.f6316b.f385911i), java.lang.Integer.valueOf(c4Var.f6316b.f385912m), java.lang.Integer.valueOf(c4Var.f6316b.f385913n), java.lang.Integer.valueOf(c4Var.f6316b.f385914o), java.lang.Integer.valueOf(c4Var.f6316b.f385915p), java.lang.Integer.valueOf(c4Var.f6316b.f385916q), java.lang.Integer.valueOf(c4Var.f6316b.f385917r), java.lang.Integer.valueOf(c4Var.f6316b.f385918s), java.lang.Integer.valueOf(c4Var.f6316b.f385919t), java.lang.Integer.valueOf(c4Var.f6316b.f385920u));
                return;
            }
        }
        if (i17 != 0) {
            if (i17 == this.f252050f) {
                de5.a.f229396a.c(17, Q6);
                S6(str, msgInfo.getMsgId());
                return;
            } else {
                if (i17 == this.f252051g) {
                    de5.a.f229396a.c(18, Q6);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11627, 5);
                    java.util.HashSet hashSet = new java.util.HashSet();
                    hashSet.add(tg3.l1.a(msgInfo));
                    db5.e1.A(getActivity(), getActivity().getString(com.tencent.mm.R.string.bav), "", getActivity().getString(com.tencent.mm.R.string.boo), getActivity().getString(com.tencent.mm.R.string.f490347sg), new ee5.r2(this, Q6(), hashSet, msgInfo), null);
                    return;
                }
                return;
            }
        }
        de5.a.f229396a.c(15, Q6);
        ot0.q v17 = ot0.q.v(msgInfo.j());
        if (v17 == null || (!(51 == (i18 = v17.f348666i) || 129 == i18) || com.tencent.mm.sdk.platformtools.f9.SessionChannels.k(getActivity(), null))) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 19L, 1L, true);
            java.lang.String lowerCase = this.f252056o.toLowerCase();
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            boolean n17 = r26.i0.n(lowerCase, "@chatroom", false);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
            arrayList2.add(msgInfo);
            com.tencent.mm.ui.chatting.x3.d(getActivity(), arrayList2, n17, this.f252056o, new ee5.s2());
        }
    }

    public final void U6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).O6();
    }

    public final void V6(java.util.ArrayList arrayList) {
        kotlin.jvm.internal.o.g(arrayList, "<set-?>");
        this.f252054m = arrayList;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        kotlinx.coroutines.r2 r2Var = this.f252055n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        java.lang.String stringExtra = getIntent().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f252056o = stringExtra;
    }
}
