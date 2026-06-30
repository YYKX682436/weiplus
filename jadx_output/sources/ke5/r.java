package ke5;

/* loaded from: classes9.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f307117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f307118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.MMChattingListView f307119f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f307120g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ke5.s f307121h;

    public r(ke5.s sVar, android.os.Bundle bundle, int i17, com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, java.util.List list) {
        this.f307121h = sVar;
        this.f307117d = bundle;
        this.f307118e = i17;
        this.f307119f = mMChattingListView;
        this.f307120g = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var;
        final ke5.s sVar = this.f307121h;
        sb5.z adapter = (sb5.z) sVar.f307041b.f460708c.a(sb5.z.class);
        com.tencent.mm.ui.chatting.view.MMChattingListView view = this.f307119f;
        int i17 = this.f307118e;
        java.util.List dataList = this.f307120g;
        android.os.Bundle bundle = this.f307117d;
        if (bundle == null || bundle.getInt("SCENE", 0) != 1) {
            if (bundle == null || bundle.getInt("SCENE", 0) != 2) {
                return;
            }
            sVar.g(i17, bundle.getBoolean("IS_IDLE_VISBLE", false), bundle.getInt("SELECTION_TOP_OFFSET", 0), bundle.getBoolean("IS_SMOOTH_SCROLL", false));
            sb5.a0 a0Var = (sb5.a0) sVar.f307041b.f460708c.a(sb5.a0.class);
            int i18 = this.f307118e;
            ((com.tencent.mm.ui.chatting.component.o4) a0Var).getClass();
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(adapter, "adapter");
            kotlin.jvm.internal.o.g(dataList, "dataList");
            if (bundle == null) {
                return;
            }
            if ((i18 >= 0 && i18 < dataList.size()) && (f9Var = (com.tencent.mm.storage.f9) dataList.get(i18)) != null && f9Var.getMsgId() > 0) {
                android.os.Bundle bundle2 = bundle.getBundle("EXTRA_BUNDLE");
                int i19 = bundle2 != null ? bundle2.getInt("is_from_mediagroup_unread_count", 0) : 0;
                long j17 = bundle.getLong("MSG_ID", -1L);
                com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(f9Var.Q0(), f9Var.getMsgId());
                if (k17 == null) {
                    return;
                }
                view.getListView().postDelayed(new com.tencent.mm.ui.chatting.component.n4(adapter, j17, i18, i19, k17, view), 300L);
                return;
            }
            return;
        }
        final int headerViewsCount = i17 + view.getListView().getHeaderViewsCount();
        boolean z17 = bundle.getBoolean("IS_HIGHLIGHT_ITEM", false);
        boolean z18 = bundle.getBoolean("IS_ALWAYS_HIGHLIGHT_MODE", false);
        final boolean z19 = bundle.getBoolean("IS_IDLE_VISBLE", false);
        final int i27 = bundle.getInt("SELECTION_TOP_OFFSET", 0);
        final boolean z27 = bundle.getBoolean("IS_SMOOTH_SCROLL", false);
        sVar.f307041b.f460720o = headerViewsCount;
        if (dataList.size() > headerViewsCount && headerViewsCount != -1) {
            ((com.tencent.mm.storage.f9) dataList.get(headerViewsCount)).I0();
        }
        sVar.g(headerViewsCount, z19, i27, z27);
        long j18 = bundle.getLong("MSG_ID", -1L);
        if (!z17 || headerViewsCount < 0) {
            return;
        }
        if (!z18) {
            ke5.s sVar2 = this.f307121h;
            sVar2.f(this.f307119f, headerViewsCount, new com.tencent.mm.plugin.msg.MsgIdTalker(j18, sVar2.f307042c), z19, i27, z27, this.f307117d);
            return;
        }
        final com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = this.f307119f;
        sVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "highLightItemAlwaysOnMode position: %s", java.lang.Integer.valueOf(headerViewsCount));
        try {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            java.lang.Runnable runnable = sVar.f307047h;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: ke5.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.pluginsdk.ui.tools.v3 v3Var;
                    ke5.a.this.g(headerViewsCount, z19, i27, z27);
                    final com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView2 = mMChattingListView;
                    int i28 = mMChattingListView2.A1;
                    if (i28 < 0 || (v3Var = mMChattingListView2.T) == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMChattingListView", "[blinkPersistentHighLight] invalid state, index:%s", java.lang.Integer.valueOf(i28));
                    } else if (((com.tencent.mm.pluginsdk.ui.tools.ChattingRecyclerView) v3Var).F(i28) == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMChattingListView", "[blinkPersistentHighLight] null == view index:%s", java.lang.Integer.valueOf(mMChattingListView2.A1));
                    } else {
                        android.animation.ValueAnimator valueAnimator = mMChattingListView2.f202850z1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            mMChattingListView2.f202850z1 = null;
                        }
                        mMChattingListView2.q();
                        float f17 = com.tencent.mm.ui.bk.C() ? 0.08f : 0.1f;
                        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, f17, 0.0f, f17, f17, f17));
                        mMChattingListView2.f202850z1 = ofPropertyValuesHolder;
                        ofPropertyValuesHolder.setDuration(1000L);
                        mMChattingListView2.f202850z1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.ui.chatting.view.MMChattingListView$$d
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                                int i29 = com.tencent.mm.ui.chatting.view.MMChattingListView.L1;
                                com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView3 = com.tencent.mm.ui.chatting.view.MMChattingListView.this;
                                mMChattingListView3.getClass();
                                float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue("alpha")).floatValue();
                                mMChattingListView3.f202849y1 = floatValue;
                                mMChattingListView3.f202847x1.setAlpha((int) (floatValue * 255.0f));
                                mMChattingListView3.T.postInvalidate();
                            }
                        });
                        mMChattingListView2.f202850z1.start();
                    }
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_POSITION_AT_CHATRECORD_FIRST_IN_BOOLEAN, java.lang.Boolean.FALSE);
                }
            };
            sVar.f307047h = runnable2;
            handler.postDelayed(runnable2, 300L);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingLoader.AbstractDataPresenter", "highLightItemAlwaysOnMode exception: %s", e17.getMessage());
        }
    }
}
