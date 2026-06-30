package com.tencent.mm.ui.conversation.unreadmode;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity;", "Lcom/tencent/mm/ui/conversation/BaseConversationUI;", "<init>", "()V", "UnreadConversationFmUI", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes11.dex */
public final class UnreadConversationActivity extends com.tencent.mm.ui.conversation.BaseConversationUI {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f208107h = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f208108e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.unreadmode.g0 f208109f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f208110g;

    @db5.a(3)
    @kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0014J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\u0006\u0010\u001c\u001a\u00020\u0002J\u0006\u0010\u001d\u001a\u00020\u0012R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020%0(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0016\u00101\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00102\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00108\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010,R\"\u0010:\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00103\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00105\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u0004\u0018\u00010G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006O"}, d2 = {"Lcom/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI;", "Lcom/tencent/mm/ui/conversation/BaseConversationUI$BaseConversationFmUI;", "Ljz5/f0;", "initView", "initData", "setupRecyclerView", "setupListeners", "setupSlideToDismiss", "", "deltaY", "updateSlidePosition", "animateEnter", "animateReset", "loadData", "updateEmptyView", "", "calculateCacheUnreadConvCount", "updateUnreadCount", "", "supportNavigationSwipeBack", "getLayoutId", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "", "getUserName", "onPause", "onDestroy", "animateDismiss", "checkNeedAutoFinish", "Lem/e4;", "viewBinding", "Lem/e4;", "Lcom/tencent/mm/ui/conversation/unreadmode/s;", "dataSource", "Lcom/tencent/mm/ui/conversation/unreadmode/s;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lyf5/x;", "mvvmList", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lxm3/t0;", "adapter", "Lxm3/t0;", "touchStartY", "F", "", "touchStartTime", "J", "lastTouchY", "lastTouchTime", "isDragging", "Z", "dismissThreshold$delegate", "Ljz5/g;", "getDismissThreshold", "()F", "dismissThreshold", "dismissVelocityThreshold", "hasEnteredChat", "getHasEnteredChat", "()Z", "setHasEnteredChat", "(Z)V", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "scope$delegate", "getScope", "()Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "scope", "Ll75/z0;", "convStorageEventListener", "Ll75/z0;", "Lcom/tencent/mm/ui/conversation/unreadmode/g0;", "getReporter", "()Lcom/tencent/mm/ui/conversation/unreadmode/g0;", "reporter", "<init>", "()V", "Companion", "com/tencent/mm/ui/conversation/unreadmode/a", "app_release"}, k = 1, mv = {1, 9, 0})
    @ul5.d(0)
    /* loaded from: classes11.dex */
    public static final class UnreadConversationFmUI extends com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI {
        public static final int $stable = 8;
        public static final com.tencent.mm.ui.conversation.unreadmode.a Companion = new com.tencent.mm.ui.conversation.unreadmode.a(null);
        private static final java.lang.String TAG = "MicroMsg.UnreadConversationFmUI";
        private byte _hellAccFlag_;
        private xm3.t0 adapter;
        private com.tencent.mm.ui.conversation.unreadmode.s dataSource;
        private boolean hasEnteredChat;
        private boolean isDragging;
        private long lastTouchTime;
        private float lastTouchY;
        private com.tencent.mm.plugin.mvvmlist.MvvmList<yf5.x> mvvmList;
        private long touchStartTime;
        private float touchStartY;
        private em.e4 viewBinding;

        /* renamed from: dismissThreshold$delegate, reason: from kotlin metadata */
        private final jz5.g dismissThreshold = jz5.h.b(new com.tencent.mm.ui.conversation.unreadmode.h(this));
        private final float dismissVelocityThreshold = 800.0f;

        /* renamed from: scope$delegate, reason: from kotlin metadata */
        private final jz5.g scope = jz5.h.b(new com.tencent.mm.ui.conversation.unreadmode.k(this));
        private final l75.z0 convStorageEventListener = new com.tencent.mm.ui.conversation.unreadmode.g(this);

        private final void animateEnter() {
            android.view.Window window;
            float f17 = getResources().getDisplayMetrics().heightPixels;
            em.e4 e4Var = this.viewBinding;
            android.view.View view = null;
            if (e4Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            e4Var.a().setTranslationY(f17);
            androidx.fragment.app.FragmentActivity activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                view = window.getDecorView();
            }
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI", "animateEnter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI", "animateEnter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat.addUpdateListener(new com.tencent.mm.ui.conversation.unreadmode.e(this, f17));
            ofFloat.addListener(new com.tencent.mm.ui.conversation.unreadmode.d(this));
            ofFloat.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void animateReset() {
            float[] fArr = new float[2];
            em.e4 e4Var = this.viewBinding;
            if (e4Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            fArr[0] = e4Var.a().getTranslationY();
            fArr[1] = 0.0f;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat.addUpdateListener(new com.tencent.mm.ui.conversation.unreadmode.f(this));
            ofFloat.start();
        }

        private final int calculateCacheUnreadConvCount() {
            com.tencent.mm.plugin.mvvmlist.MvvmList<yf5.x> mvvmList = this.mvvmList;
            if (mvvmList == null) {
                kotlin.jvm.internal.o.o("mvvmList");
                throw null;
            }
            java.util.Iterator it = mvvmList.f152065o.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                com.tencent.mm.storage.l4 l4Var = ((yf5.x) it.next()).f461995d;
                if ((l4Var != null ? l4Var.d1() : 0) > 0) {
                    i17++;
                }
            }
            return i17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float getDismissThreshold() {
            return ((java.lang.Number) this.dismissThreshold.getValue()).floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.tencent.mm.ui.conversation.unreadmode.g0 getReporter() {
            androidx.fragment.app.FragmentActivity activity = getActivity();
            com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity unreadConversationActivity = activity instanceof com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity ? (com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity) activity : null;
            if (unreadConversationActivity == null) {
                return null;
            }
            com.tencent.mm.ui.conversation.unreadmode.g0 g0Var = unreadConversationActivity.f208109f;
            if (g0Var != null) {
                return g0Var;
            }
            kotlin.jvm.internal.o.o("reporter");
            throw null;
        }

        private final com.tencent.mm.sdk.coroutines.LifecycleScope getScope() {
            return (com.tencent.mm.sdk.coroutines.LifecycleScope) this.scope.getValue();
        }

        private final void initData() {
            android.content.Intent intent = requireActivity().getIntent();
            kotlin.jvm.internal.o.f(intent, "getIntent(...)");
            java.lang.Object a17 = ok5.d.a(intent, "conversation_datasource");
            yf5.w wVar = a17 instanceof yf5.w ? (yf5.w) a17 : null;
            if (wVar == null) {
                androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
                kotlin.jvm.internal.o.f(requireActivity, "requireActivity(...)");
                wVar = new yf5.w(requireActivity);
            }
            this.dataSource = new com.tencent.mm.ui.conversation.unreadmode.s(wVar);
        }

        private final void initView() {
            android.view.View view = getView();
            if (view != null) {
                em.e4 e4Var = new em.e4(view);
                this.viewBinding = e4Var;
                if (e4Var.f254293f == null) {
                    e4Var.f254293f = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.atg);
                }
                e4Var.f254293f.setOnClickListener(new com.tencent.mm.ui.conversation.unreadmode.i(this));
                em.e4 e4Var2 = this.viewBinding;
                if (e4Var2 == null) {
                    kotlin.jvm.internal.o.o("viewBinding");
                    throw null;
                }
                if (e4Var2.f254295h == null) {
                    e4Var2.f254295h = (android.widget.RelativeLayout) e4Var2.f254288a.findViewById(com.tencent.mm.R.id.vka);
                }
                e4Var2.f254295h.setOnClickListener(new com.tencent.mm.ui.conversation.unreadmode.j(this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void loadData() {
            com.tencent.mm.plugin.mvvmlist.MvvmList<yf5.x> mvvmList = this.mvvmList;
            if (mvvmList != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.r(mvvmList, null, 1, null);
            } else {
                kotlin.jvm.internal.o.o("mvvmList");
                throw null;
            }
        }

        private final void setupListeners() {
            v65.i.b(getScope(), null, new com.tencent.mm.ui.conversation.unreadmode.o(this, null), 1, null);
            setupSlideToDismiss();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().a(this.convStorageEventListener);
        }

        private final void setupRecyclerView() {
            xm3.n0 n0Var = new xm3.n0();
            n0Var.f455359d = 100;
            n0Var.f455358c = false;
            n0Var.f455357b = true;
            android.content.Intent intent = requireActivity().getIntent();
            kotlin.jvm.internal.o.f(intent, "getIntent(...)");
            java.lang.Object a17 = ok5.d.a(intent, "conversation_unread_list");
            java.util.List<yf5.x> list = a17 instanceof java.util.List ? (java.util.List) a17 : null;
            com.tencent.mm.ui.conversation.unreadmode.s sVar = this.dataSource;
            if (sVar == null) {
                kotlin.jvm.internal.o.o("dataSource");
                throw null;
            }
            com.tencent.mm.plugin.mvvmlist.MvvmList<yf5.x> mvvmList = new com.tencent.mm.plugin.mvvmlist.MvvmList<>(sVar, n0Var, this, null, list == null ? kz5.p0.f313996d : list, 8, null);
            this.mvvmList = mvvmList;
            com.tencent.mm.ui.conversation.unreadmode.s sVar2 = this.dataSource;
            if (sVar2 == null) {
                kotlin.jvm.internal.o.o("dataSource");
                throw null;
            }
            sVar2.f208158e = mvvmList;
            this.adapter = new xm3.t0(mvvmList, new in5.s() { // from class: com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity$UnreadConversationFmUI$setupRecyclerView$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    com.tencent.mm.ui.conversation.unreadmode.g0 reporter;
                    androidx.fragment.app.FragmentActivity requireActivity = com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI.this.requireActivity();
                    kotlin.jvm.internal.o.f(requireActivity, "requireActivity(...)");
                    reporter = com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI.this.getReporter();
                    return new com.tencent.mm.ui.conversation.unreadmode.d0(requireActivity, reporter);
                }
            }, false);
            em.e4 e4Var = this.viewBinding;
            if (e4Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            e4Var.c().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(requireContext()));
            em.e4 e4Var2 = this.viewBinding;
            if (e4Var2 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView c17 = e4Var2.c();
            xm3.t0 t0Var = this.adapter;
            if (t0Var == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            c17.setAdapter(t0Var);
            em.e4 e4Var3 = this.viewBinding;
            if (e4Var3 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            e4Var3.c().setItemAnimator(null);
            updateUnreadCount();
            updateEmptyView();
            com.tencent.mm.ui.conversation.unreadmode.g0 reporter = getReporter();
            if (reporter != null) {
                reporter.f208139a = c01.id.c();
                reporter.f208141c = 0;
                java.util.Set set = reporter.f208140b;
                set.clear();
                if (list != null) {
                    for (yf5.x xVar : list) {
                        com.tencent.mm.storage.l4 l4Var = xVar.f461995d;
                        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
                        if (h17 != null) {
                            com.tencent.mm.storage.l4 l4Var2 = xVar.f461995d;
                            if ((l4Var2 != null ? l4Var2.d1() : 0) > 0) {
                                set.add(h17);
                            }
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.UnreadModeReporter", "onPageEnter, enterTimeMs=" + reporter.f208139a + ", initialUnreadCount=" + set.size());
            }
        }

        private final void setupSlideToDismiss() {
            em.e4 e4Var = this.viewBinding;
            if (e4Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            if (e4Var.f254289b == null) {
                e4Var.f254289b = (android.widget.FrameLayout) e4Var.f254288a.findViewById(com.tencent.mm.R.id.vge);
            }
            e4Var.f254289b.setOnTouchListener(new com.tencent.mm.ui.conversation.unreadmode.p(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateEmptyView() {
            com.tencent.mm.plugin.mvvmlist.MvvmList<yf5.x> mvvmList = this.mvvmList;
            if (mvvmList == null) {
                kotlin.jvm.internal.o.o("mvvmList");
                throw null;
            }
            if (mvvmList.f152065o.isEmpty()) {
                em.e4 e4Var = this.viewBinding;
                if (e4Var == null) {
                    kotlin.jvm.internal.o.o("viewBinding");
                    throw null;
                }
                if (e4Var.f254291d == null) {
                    e4Var.f254291d = (com.google.android.material.card.MaterialCardView) e4Var.f254288a.findViewById(com.tencent.mm.R.id.vke);
                }
                e4Var.f254291d.setVisibility(8);
                return;
            }
            em.e4 e4Var2 = this.viewBinding;
            if (e4Var2 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            if (e4Var2.f254291d == null) {
                e4Var2.f254291d = (com.google.android.material.card.MaterialCardView) e4Var2.f254288a.findViewById(com.tencent.mm.R.id.vke);
            }
            e4Var2.f254291d.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateSlidePosition(float f17) {
            android.view.Window window;
            float f18 = f17 * 0.6f;
            em.e4 e4Var = this.viewBinding;
            android.view.View view = null;
            if (e4Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            e4Var.a().setTranslationY(f18);
            float e17 = 1.0f - e06.p.e(f18 / (getResources().getDisplayMetrics().heightPixels * 0.5f), 0.0f, 1.0f);
            androidx.fragment.app.FragmentActivity activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                view = window.getDecorView();
            }
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(e17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI", "updateSlidePosition", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI", "updateSlidePosition", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateUnreadCount() {
            int calculateCacheUnreadConvCount = calculateCacheUnreadConvCount();
            if (calculateCacheUnreadConvCount > 0) {
                em.e4 e4Var = this.viewBinding;
                if (e4Var == null) {
                    kotlin.jvm.internal.o.o("viewBinding");
                    throw null;
                }
                e4Var.b().setText(requireContext().getString(com.tencent.mm.R.string.pjf, java.lang.Integer.valueOf(calculateCacheUnreadConvCount)));
                em.e4 e4Var2 = this.viewBinding;
                if (e4Var2 != null) {
                    e4Var2.b().setTextColor(getResources().getColor(com.tencent.mm.R.color.Brand_100));
                    return;
                } else {
                    kotlin.jvm.internal.o.o("viewBinding");
                    throw null;
                }
            }
            em.e4 e4Var3 = this.viewBinding;
            if (e4Var3 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            e4Var3.b().setText(requireContext().getString(com.tencent.mm.R.string.pje));
            em.e4 e4Var4 = this.viewBinding;
            if (e4Var4 != null) {
                e4Var4.b().setTextColor(getResources().getColor(com.tencent.mm.R.color.f478520a84));
            } else {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
        }

        public final void animateDismiss() {
            float[] fArr = new float[2];
            em.e4 e4Var = this.viewBinding;
            if (e4Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            fArr[0] = e4Var.a().getTranslationY();
            fArr[1] = getResources().getDisplayMetrics().heightPixels;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
            ofFloat.addUpdateListener(new com.tencent.mm.ui.conversation.unreadmode.b(this));
            ofFloat.start();
            em.e4 e4Var2 = this.viewBinding;
            if (e4Var2 != null) {
                e4Var2.a().postDelayed(new com.tencent.mm.ui.conversation.unreadmode.c(this), 300L);
            } else {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
        }

        public final boolean checkNeedAutoFinish() {
            com.tencent.mm.plugin.mvvmlist.MvvmList<yf5.x> mvvmList = this.mvvmList;
            if (mvvmList != null) {
                return mvvmList.f152065o.size() == 1 && calculateCacheUnreadConvCount() == 1;
            }
            kotlin.jvm.internal.o.o("mvvmList");
            throw null;
        }

        public final boolean getHasEnteredChat() {
            return this.hasEnteredChat;
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment
        /* renamed from: getLayoutId */
        public int getF72225d() {
            return com.tencent.mm.R.layout.eqe;
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI
        public java.lang.String getUserName() {
            return "unread_conv_list";
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityCreated(android.os.Bundle bundle) {
            com.tencent.mars.xlog.Log.i(TAG, "onActivityCreated");
            super.onActivityCreated(bundle);
            initView();
            initData();
            setupRecyclerView();
            setupListeners();
            animateEnter();
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            com.tencent.mm.ui.conversation.unreadmode.g0 reporter;
            super.onDestroy();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this.convStorageEventListener);
            if (this.mvvmList != null && (reporter = getReporter()) != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList<yf5.x> mvvmList = this.mvvmList;
                if (mvvmList == null) {
                    kotlin.jvm.internal.o.o("mvvmList");
                    throw null;
                }
                java.util.ArrayList unreadList = mvvmList.f152065o;
                kotlin.jvm.internal.o.g(unreadList, "unreadList");
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.util.Iterator it = unreadList.iterator();
                int i17 = 0;
                int i18 = 0;
                while (it.hasNext()) {
                    com.tencent.mm.storage.l4 l4Var = ((yf5.x) it.next()).f461995d;
                    if (l4Var != null) {
                        i18 += l4Var.d1();
                        if (l4Var.d1() > 0) {
                            i17++;
                        }
                    }
                }
                com.tencent.mm.ui.conversation.w3 w3Var = com.tencent.mm.ui.conversation.w3.f208214g;
                com.tencent.mm.ui.conversation.v3 a17 = w3Var.a(reporter.f208140b);
                com.tencent.mm.ui.conversation.v3 a18 = w3Var.a(null);
                java.util.Map k17 = kz5.c1.k(new jz5.l("unread_group_event_ms", java.lang.Long.valueOf(reporter.f208139a)), new jz5.l("unread_chat_count", java.lang.Integer.valueOf(i17)), new jz5.l("unread_num", java.lang.Integer.valueOf(i18)), new jz5.l("quit_type", java.lang.Integer.valueOf(reporter.f208141c)), new jz5.l("log_version", 20260429L), new jz5.l("in24h_ingroup_unread_chat_cnt", java.lang.Integer.valueOf(a17.f208183a)), new jz5.l("out24h_ingroup_unread_chat_cnt", java.lang.Integer.valueOf(a17.f208184b)), new jz5.l("in24h_ingroup_unread_msg_cnt", java.lang.Integer.valueOf(a17.f208185c)), new jz5.l("out24h_ingroup_unread_msg_cnt", java.lang.Integer.valueOf(a17.f208186d)), new jz5.l("in24h_unread_chat_cnt", java.lang.Integer.valueOf(a18.f208183a)), new jz5.l("out24h_unread_chat_cnt", java.lang.Integer.valueOf(a18.f208184b)), new jz5.l("in24h_unread_msg_cnt", java.lang.Integer.valueOf(a18.f208185c)), new jz5.l("out24h_unread_msg_cnt", java.lang.Integer.valueOf(a18.f208186d)));
                ((cy1.a) rVar).Cj("unread_group_out", null, k17, 35186);
                com.tencent.mars.xlog.Log.i("MicroMsg.UnreadModeReporter", "reportUnreadGroupOut, quitType=" + reporter.f208141c + ", unreadChatCount=" + k17.get("unread_chat_count") + ", unreadNum=" + k17.get("unread_num"));
            }
            com.tencent.mm.ui.conversation.unreadmode.e0.f208130b = false;
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onPause() {
            com.tencent.mars.xlog.Log.i(TAG, "on pause");
            super.onPause();
        }

        public final void setHasEnteredChat(boolean z17) {
            this.hasEnteredChat = z17;
        }

        @Override // com.tencent.mm.ui.MMFragment
        public boolean supportNavigationSwipeBack() {
            return false;
        }
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI
    public boolean getMagicDrawingByPixelCopy() {
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.ui.conversation.unreadmode.g0 g0Var = this.f208109f;
        if (g0Var == null) {
            kotlin.jvm.internal.o.o("reporter");
            throw null;
        }
        g0Var.f208141c = 1;
        com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI = baseConversationFmUI instanceof com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI ? (com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI) baseConversationFmUI : null;
        if (unreadConversationFmUI != null) {
            unreadConversationFmUI.animateDismiss();
        }
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f208109f = new com.tencent.mm.ui.conversation.unreadmode.g0();
        overridePendingTransition(0, 0);
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.eqd, (android.view.ViewGroup) null);
        this.f208108e = inflate;
        setContentView(inflate);
        this.conversationFm = new com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI();
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        beginTransaction.h(com.tencent.mm.R.id.jmc, this.conversationFm, null, 1);
        beginTransaction.d();
        com.tencent.mm.ui.conversation.unreadmode.e0.f208130b = true;
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI
    public void onPrepareChattingFragmentEnd() {
        super.onPrepareChattingFragmentEnd();
        com.tencent.mm.ui.v9.f(this, b3.l.getColor(this, com.tencent.mm.R.color.f478490b));
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        com.tencent.mm.ui.v9.f(this, b3.l.getColor(this, com.tencent.mm.R.color.f478490b));
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f208110g) {
            this.f208110g = false;
            finish();
        }
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI
    public boolean shouldSkipPrepareChattingOnIdle() {
        return true;
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI
    public void startChatting(java.lang.String str, android.os.Bundle bundle, boolean z17, boolean z18) {
        com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI = baseConversationFmUI instanceof com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI ? (com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI) baseConversationFmUI : null;
        if (!(unreadConversationFmUI != null && unreadConversationFmUI.checkNeedAutoFinish())) {
            super.startChatting(str, bundle, z17, z18);
            return;
        }
        this.f208110g = true;
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("finish_direct", true);
        intent.putExtra("chat_from_scene", 13);
        intent.putExtra("Chat_User", str);
        intent.setClassName(this, "com.tencent.mm.ui.chatting.ChattingUI");
        android.os.Bundle bundle2 = android.app.ActivityOptions.makeCustomAnimation(this, com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6).toBundle();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bundle2);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity", "startChatting", "(Ljava/lang/String;Landroid/os/Bundle;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
        yj0.a.f(this, "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity", "startChatting", "(Ljava/lang/String;Landroid/os/Bundle;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }
}
