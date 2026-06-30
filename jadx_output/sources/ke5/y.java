package ke5;

/* loaded from: classes9.dex */
public class y extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f307144i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f307145j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f307146k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f307147l;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f307148m;

    /* renamed from: n, reason: collision with root package name */
    public final long f307149n;

    /* renamed from: o, reason: collision with root package name */
    public int f307150o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f307151p;

    public y(yb5.d dVar, hd5.r rVar) {
        super(dVar, rVar);
        this.f307144i = 0;
        this.f307146k = 0L;
        this.f307147l = 0L;
        this.f307148m = 0L;
        this.f307150o = 0;
        java.lang.String stringExtra = dVar.f460717l.getStringExtra("key_notify_message_real_username");
        this.f307145j = stringExtra;
        this.f307149n = dVar.f460717l.getLongExtra("biz_last_unread_create_time", 0L);
        this.f307151p = te5.s1.f418747a.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "[ChattingSingleNotifyMsgPresenter] talker:%s", stringExtra);
    }

    @Override // ke5.a, ke5.f0
    public void a(hd5.n nVar, boolean z17, android.os.Bundle bundle) {
        if (((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) this.f307041b.f460708c.a(sb5.u1.class))).f199298i && nVar == hd5.n.ACTION_ENTER) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "onLoad isFromServiceNotifyContentSearch ignore action enter");
        } else {
            super.a(nVar, z17, bundle);
        }
    }

    @Override // ke5.a, hd5.k
    public void c(final com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, final hd5.q qVar) {
        final int i17;
        super.c(mMChattingListView, qVar);
        hd5.n nVar = qVar.f280630b;
        java.util.List list = qVar.f280633e;
        int size = ((java.util.LinkedList) qVar.f280631c).size();
        int i18 = qVar.f280634f;
        final int i19 = qVar.f280635g;
        android.os.Bundle bundle = qVar.f280629a;
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) list.get(0);
        com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) list.get(list.size() - 1);
        if (f9Var != null) {
            this.f307146k = f9Var.getCreateTime();
        }
        if (f9Var2 != null) {
            this.f307147l = f9Var2.getCreateTime();
        }
        if (this.f307151p && (i17 = this.f307150o) > 0) {
            this.f307150o = 0;
            final sb5.z zVar = (sb5.z) this.f307041b.f460708c.a(sb5.z.class);
            mMChattingListView.getListView().post(new java.lang.Runnable() { // from class: ke5.y$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) sb5.z.this;
                    kVar.V0(kVar.getCount() - i17);
                }
            });
        }
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            mMChattingListView.d(false);
            com.tencent.mm.pluginsdk.ui.tools.f7.b(mMChattingListView.getListView(), (mMChattingListView.getCurCount() - mMChattingListView.getPreCount()) + 1, ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f307041b.f460708c.a(sb5.z0.class))).r0() + mMChattingListView.getTopHeight(), false, false);
            int curCount = mMChattingListView.getCurCount() - mMChattingListView.getPreCount();
            if (curCount > 0) {
                ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f307041b.f460708c.a(sb5.z.class))).I0(curCount);
            }
        } else if (ordinal == 1) {
            mMChattingListView.c(false);
            com.tencent.mm.pluginsdk.ui.tools.f7.b(mMChattingListView.getListView(), mMChattingListView.getPreCount() + 1, (mMChattingListView.getListView().getHeight() - ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f307041b.f460708c.a(sb5.z0.class))).r0()) - mMChattingListView.getBottomHeight(), false, false);
        } else if (ordinal == 3) {
            this.f307041b.N(false);
        } else if (ordinal == 4) {
            int i27 = bundle == null ? -1 : bundle.getInt("MSG_POSITION", -1);
            if (i27 != -1) {
                i19 = java.lang.Math.max(0, mMChattingListView.getCurCount() - (qVar.f280634f - i27));
                qVar.f280635g = i19;
            }
            if (this.f307041b.f460717l.getIntExtra("container_enter_scene", 0) == 2) {
                h(i19, mMChattingListView, qVar);
            } else {
                mMChattingListView.getListView().post(new java.lang.Runnable() { // from class: ke5.y$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ke5.y.this.h(i19, mMChattingListView, qVar);
                    }
                });
            }
        }
        if (nVar != hd5.n.ACTION_ENTER) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "[onViewUpdate] mode:%s lastTopMsgCreateTime:%s lastBottomMsgCreateTime:%s loadedCount:%s allCount:%s selection:%s", nVar, java.lang.Long.valueOf(this.f307146k), java.lang.Long.valueOf(this.f307147l), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "[isShowTopAll] talker:%s loadedCount:%s allCount:%s", this.f307145j, java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i18));
            mMChattingListView.setIsTopShowAll(i18 <= size);
            mMChattingListView.setIsBottomShowAll(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r11 > 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    @Override // ke5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public he5.t e(hd5.n r25, android.os.Bundle r26, hd5.q r27) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.y.e(hd5.n, android.os.Bundle, hd5.q):he5.t");
    }

    public final void h(int i17, com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, hd5.q qVar) {
        android.os.Bundle bundle = qVar.f280629a;
        yb5.d dVar = this.f307041b;
        sb5.z zVar = (sb5.z) dVar.f460708c.a(sb5.z.class);
        if (bundle != null && bundle.getInt("SCENE", 0) == 1) {
            boolean z17 = bundle.getBoolean("IS_IDLE_VISBLE", false);
            int i18 = bundle.getInt("SELECTION_TOP_OFFSET", 0);
            boolean z18 = bundle.getBoolean("IS_SMOOTH_SCROLL", false);
            dVar.f460720o = i17;
            g(i17, z17, i18, z18);
            if (i17 < 0 || !dVar.f460717l.getBooleanExtra("need_hight_item", false).booleanValue()) {
                return;
            }
            f(mMChattingListView, i17, com.tencent.mm.plugin.msg.MsgIdTalker.f149479g, false, i18, false, bundle);
            return;
        }
        if (bundle == null || bundle.getInt("SCENE", 0) != 2) {
            return;
        }
        ((com.tencent.mm.ui.chatting.adapter.k) zVar).V0(i17);
        yb5.d dVar2 = this.f307041b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/source/presenter/ChattingSingleNotifyMsgPresenter", "handleScrollToPositionImpl", "(ILcom/tencent/mm/ui/chatting/view/MMChattingListView;Lcom/tencent/mm/ui/chatting/loader/IDataLoader$LoadedResult;)V", "Undefined", "scrollToPosition", "(I)V");
        dVar2.O(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/source/presenter/ChattingSingleNotifyMsgPresenter", "handleScrollToPositionImpl", "(ILcom/tencent/mm/ui/chatting/view/MMChattingListView;Lcom/tencent/mm/ui/chatting/loader/IDataLoader$LoadedResult;)V", "Undefined", "scrollToPosition", "(I)V");
    }
}
