package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public abstract class y implements zb5.h, com.tencent.mm.ui.chatting.adapter.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f202541d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f202542e;

    /* renamed from: f, reason: collision with root package name */
    public zb5.i f202543f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.adapter.k0 f202544g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f202545h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f202546i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f202547m = null;

    /* renamed from: n, reason: collision with root package name */
    public volatile long f202548n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202549o = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public volatile long f202550p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f202551q = false;

    /* renamed from: r, reason: collision with root package name */
    public long f202552r = 0;

    public y(android.content.Context context) {
        this.f202546i = null;
        this.f202541d = context;
        this.f202546i = new java.util.ArrayList();
    }

    public com.tencent.mm.ui.chatting.adapter.f0 h(int i17) {
        java.util.ArrayList arrayList = this.f202546i;
        if (arrayList == null || arrayList.size() <= i17) {
            return null;
        }
        return (com.tencent.mm.ui.chatting.adapter.f0) this.f202546i.get(i17);
    }

    public java.lang.String j(com.tencent.mm.storage.f9 f9Var, boolean z17, boolean z18) {
        java.lang.String str = null;
        if (f9Var == null) {
            return null;
        }
        if (f9Var.A0() == 1) {
            return c01.z1.r();
        }
        if (z17) {
            str = c01.w9.s(f9Var.j());
        } else if (z18) {
            str = f9Var.u0();
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? f9Var.Q0() : str;
    }

    public abstract int k();

    public void l(android.content.Context context, java.lang.String str, long j17) {
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] username is null");
            return;
        }
        long msgId = pt0.f0.Li(str, j17).getMsgId();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] msgLocalId:%s", java.lang.Long.valueOf(msgId));
        if (!com.tencent.mm.storage.z3.R4(str)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            if (n17 == null || !n17.r2()) {
                if (n17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                }
                db5.e1.t(context, context.getString(com.tencent.mm.R.string.hy6), context.getString(com.tencent.mm.R.string.jz9), null);
                return;
            }
        } else if (((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(str) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseHistoryListPresenter", "[gotoChattingUIWithPosition] member is null! username:%s", str);
            db5.e1.t(context, context.getString(com.tencent.mm.R.string.hy6), context.getString(com.tencent.mm.R.string.jz9), null);
            return;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", msgId);
        putExtra.setClass(context, com.tencent.mm.ui.chatting.ChattingUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/presenter/BaseHistoryListPresenter", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/presenter/BaseHistoryListPresenter", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void m(int i17, com.tencent.mm.storage.f9 f9Var, int i18) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseHistoryListPresenter", "[handleSelectedItem] index:%s", java.lang.Integer.valueOf(i17));
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseHistoryListPresenter", "handleSelectedItem msgInfo is null");
            return;
        }
        int k17 = k();
        android.content.Context context = this.f202541d;
        if (i17 == 0) {
            de5.a.f229396a.k(15, i18, k17);
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null || (!(51 == (i19 = v17.f348666i) || 129 == i19) || com.tencent.mm.sdk.platformtools.f9.SessionChannels.k(context, null))) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 19L, 1L, true);
                boolean endsWith = this.f202542e.toLowerCase().endsWith("@chatroom");
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(f9Var);
                com.tencent.mm.ui.chatting.x3.d(context, arrayList, endsWith, this.f202542e, new com.tencent.mm.ui.chatting.presenter.u(this));
                return;
            }
            return;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                de5.a.f229396a.k(17, i18, k17);
                l(context, this.f202542e, f9Var.getMsgId());
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                de5.a.f229396a.k(18, i18, k17);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11627, 5);
                java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
                copyOnWriteArraySet.add(tg3.l1.a(f9Var));
                db5.e1.A(context, context.getString(com.tencent.mm.R.string.bav), "", context.getString(com.tencent.mm.R.string.boo), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.chatting.presenter.x(this, i18, copyOnWriteArraySet, f9Var), null);
                return;
            }
        }
        de5.a.f229396a.k(16, i18, k17);
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        arrayList2.add(f9Var);
        if (!com.tencent.mm.pluginsdk.model.e2.i(this.f202541d, doFavoriteEvent, this.f202542e, arrayList2, false, false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseHistoryListPresenter", "[handleFav] err!");
            return;
        }
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6327m = 45;
        c4Var.f6323i = (android.app.Activity) context;
        doFavoriteEvent.e();
        int i27 = doFavoriteEvent.f54091h.f6433a;
        if (i27 == -2 || i27 > 0 || i27 > 0 || 14 != c4Var.f6317c) {
            return;
        }
        r45.sq0 sq0Var = c4Var.f6316b;
        if (sq0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseHistoryListPresenter", "want to report record fav, but type count is null");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11142, java.lang.Integer.valueOf(sq0Var.f385906d), java.lang.Integer.valueOf(c4Var.f6316b.f385907e), java.lang.Integer.valueOf(c4Var.f6316b.f385908f), java.lang.Integer.valueOf(c4Var.f6316b.f385909g), java.lang.Integer.valueOf(c4Var.f6316b.f385910h), java.lang.Integer.valueOf(c4Var.f6316b.f385911i), java.lang.Integer.valueOf(c4Var.f6316b.f385912m), java.lang.Integer.valueOf(c4Var.f6316b.f385913n), java.lang.Integer.valueOf(c4Var.f6316b.f385914o), java.lang.Integer.valueOf(c4Var.f6316b.f385915p), java.lang.Integer.valueOf(c4Var.f6316b.f385916q), java.lang.Integer.valueOf(c4Var.f6316b.f385917r), java.lang.Integer.valueOf(c4Var.f6316b.f385918s), java.lang.Integer.valueOf(c4Var.f6316b.f385919t), java.lang.Integer.valueOf(c4Var.f6316b.f385920u));
        }
    }

    public void n() {
        this.f202549o.set(true);
        this.f202550p = java.lang.System.currentTimeMillis() - this.f202548n;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseHistoryListPresenter", "[loadData][perf] completed, cost:%dms, type:%s", java.lang.Long.valueOf(this.f202550p), getClass().getSimpleName());
    }

    public void o() {
        this.f202548n = java.lang.System.currentTimeMillis();
        this.f202549o.set(false);
        this.f202550p = 0L;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        if (this.f202548n != 0) {
            boolean z17 = this.f202549o.get();
            long currentTimeMillis = z17 ? this.f202550p : java.lang.System.currentTimeMillis() - this.f202548n;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseHistoryListPresenter", "[loadData][perf] exit, completed:%s, cost:%dms, type:%s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis), getClass().getSimpleName());
            java.util.ArrayList arrayList = this.f202546i;
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.o(this, z17, currentTimeMillis, arrayList != null ? arrayList.size() : 0));
        }
        this.f202543f.l2(null);
        this.f202543f = null;
        com.tencent.mm.ui.chatting.adapter.k0 k0Var = this.f202544g;
        if (k0Var != null) {
            k0Var.getClass();
            com.tencent.mm.ui.chatting.adapter.k0.f198430f = null;
            com.tencent.mm.ui.chatting.adapter.k0.f198431g = null;
        }
    }
}
