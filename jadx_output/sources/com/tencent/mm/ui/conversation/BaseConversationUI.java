package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class BaseConversationUI extends com.tencent.mm.ui.MMFragmentActivity {
    private static final java.lang.String LAST_RESTORE_TALKER = "last_restore_talker";
    static final java.lang.String TAG = "MicroMsg.BaseConversationUI";

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f207286d = 0;
    private byte _hellAccFlag_;
    private com.tencent.mm.ui.base.OnLayoutChangedLinearLayout chattingFragmentView;
    private com.tencent.mm.ui.chatting.ChattingUIFragment chattingFragmet;
    private com.tencent.mm.ui.IChattingUIProxy chattingUIProxy;
    private com.tencent.mm.ui.tools.TestTimeForChatting chattingView;
    public com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI conversationFm;
    private boolean isAnimating;
    private java.lang.String lastRestoreTalker;
    private androidx.appcompat.app.b mActionBar;
    private com.tencent.mm.ui.j mActionBarHelper;
    private android.view.animation.Animation mChattingInAnim;
    private android.view.animation.Animation mChattingOutAnim;
    private android.graphics.Bitmap mPrepareBitmap;
    android.os.Bundle pendingBundle;
    java.lang.String pendingUser;
    private java.lang.CharSequence title;
    private long chattinguiResumeTime = 0;
    private int unreadSum = 0;
    private com.tencent.mm.ui.conversation.d0 launcherUIStatus = com.tencent.mm.ui.conversation.d0.ACTIVITY_CREATE;
    private boolean mNeedChattingAnim = false;
    public boolean mChattingClosed = true;
    private int chattingID = -1;
    private long onDrawStart = 0;
    private db5.x8 onChattingLayoutChangedListener = new com.tencent.mm.ui.conversation.v(this);
    java.lang.Runnable startChattingRunnable = new com.tencent.mm.ui.conversation.b0(this);
    private com.tencent.mm.ui.conversation.f0 selectImageJob = new com.tencent.mm.ui.conversation.f0(this, null);

    public static void access$100(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI, android.content.Intent intent, boolean z17) {
        boolean z18;
        char c17;
        android.view.View view;
        int i17;
        baseConversationUI.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (baseConversationUI.chattingFragmet == null) {
            com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = baseConversationUI.getChattingUIFragment();
            baseConversationUI.chattingFragmet = chattingUIFragment;
            baseConversationUI.chattingUIProxy = new com.tencent.mm.ui.chatting.ChattingUIProxy(baseConversationUI, chattingUIFragment);
            z18 = true;
        } else {
            z18 = false;
        }
        if (baseConversationUI.chattingView == null) {
            if (baseConversationUI.chattingFragmet.isSupportCustomActionBar()) {
                int[] iArr = new int[2];
                android.view.View j17 = baseConversationUI.getSupportActionBar().j();
                if (j17 != null) {
                    j17.getLocationInWindow(iArr);
                }
                com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = new com.tencent.mm.ui.tools.TestTimeForChatting(baseConversationUI);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                testTimeForChatting.setId(com.tencent.mm.R.id.bks);
                baseConversationUI.chattingID = testTimeForChatting.getId();
                testTimeForChatting.setOrientation(1);
                testTimeForChatting.setLayoutParams(layoutParams);
                com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView = new com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView(baseConversationUI);
                fitSystemWindowLayoutView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                android.view.View j18 = baseConversationUI.mActionBar.j();
                if (j18 == null) {
                    view = null;
                } else {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) baseConversationUI.getWindow().getDecorView();
                    android.view.ViewParent viewParent = null;
                    for (android.view.ViewParent parent = j18.getParent(); parent != viewGroup && parent != null; parent = parent.getParent()) {
                        viewParent = parent;
                    }
                    view = (android.view.ViewGroup) viewParent;
                }
                if (view == null) {
                    view = ((android.view.ViewGroup) baseConversationUI.getWindow().getDecorView()).getChildAt(0);
                }
                android.view.View view2 = view;
                android.view.ViewGroup viewGroup2 = view2 instanceof com.tencent.mm.ui.widget.SwipeBackLayout ? (android.view.ViewGroup) ((android.view.ViewGroup) view2).getChildAt(0) : (android.view.ViewGroup) view2;
                android.widget.ImageView imageView = new android.widget.ImageView(baseConversationUI);
                imageView.setId(com.tencent.mm.R.id.l3_);
                imageView.setLayoutParams(layoutParams);
                imageView.setVisibility(8);
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(baseConversationUI);
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                frameLayout.setId(com.tencent.mm.R.id.f485486u90);
                frameLayout.setLayoutParams(layoutParams2);
                ((android.view.ViewGroup) baseConversationUI.getWindow().getDecorView()).removeView(view2);
                view2.setId(com.tencent.mm.R.id.huh);
                frameLayout.addView(view2);
                frameLayout.addView(imageView);
                frameLayout.addView(testTimeForChatting);
                fitSystemWindowLayoutView.addView(frameLayout);
                ((android.view.ViewGroup) baseConversationUI.getWindow().getDecorView()).addView(fitSystemWindowLayoutView);
                zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(baseConversationUI);
                if (Ai != null) {
                    i17 = 0;
                    ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).R6(frameLayout, new com.tencent.mm.ui.conversation.x(baseConversationUI), false);
                } else {
                    i17 = 0;
                }
                baseConversationUI.getWindow().getDecorView().requestFitSystemWindows();
                int i18 = iArr[1];
                if (i18 > 0) {
                    baseConversationUI.V6(fitSystemWindowLayoutView, i18, new android.graphics.Rect(i17, i18, i17, i17), viewGroup2);
                } else {
                    android.view.View j19 = baseConversationUI.getSupportActionBar().j();
                    if (j19 != null) {
                        j19.post(new com.tencent.mm.ui.conversation.z(baseConversationUI, j19, iArr, fitSystemWindowLayoutView, viewGroup2));
                    }
                }
                baseConversationUI.chattingView = (com.tencent.mm.ui.tools.TestTimeForChatting) baseConversationUI.findViewById(baseConversationUI.chattingID);
                com.tencent.mars.xlog.Log.i(TAG, "ashu::prepareChattingFragment init chattingView, top %s", java.lang.Integer.valueOf(iArr[1]));
            } else {
                com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting2 = (com.tencent.mm.ui.tools.TestTimeForChatting) baseConversationUI.findViewById(com.tencent.mm.R.id.bjy);
                baseConversationUI.chattingView = testTimeForChatting2;
                baseConversationUI.chattingID = testTimeForChatting2.getId();
            }
        } else if (baseConversationUI.chattingFragmet.isSupportCustomActionBar()) {
            int[] iArr2 = new int[2];
            baseConversationUI.chattingView.getLocationInWindow(iArr2);
            if (iArr2[1] == 0) {
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) baseConversationUI.getWindow().getDecorView();
                int i19 = 0;
                while (true) {
                    if (i19 >= viewGroup3.getChildCount()) {
                        break;
                    }
                    android.view.View childAt = ((android.view.ViewGroup) baseConversationUI.getWindow().getDecorView()).getChildAt(i19);
                    if (childAt instanceof com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView) {
                        if (baseConversationUI.getSupportActionBar().j() != null) {
                            baseConversationUI.getSupportActionBar().j().getLocationInWindow(iArr2);
                        }
                        com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView2 = (com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView) childAt;
                        fitSystemWindowLayoutView2.fitSystemWindows(new android.graphics.Rect(0, fitSystemWindowLayoutView2.getCacheInsetsTop(), 0, 0));
                        com.tencent.mars.xlog.Log.i(TAG, "rootLayout2 fitSystemWindows, top %s", java.lang.Integer.valueOf(iArr2[1]));
                        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) viewGroup3.findViewById(com.tencent.mm.R.id.huh);
                        android.widget.ImageView imageView2 = (android.widget.ImageView) fitSystemWindowLayoutView2.findViewById(com.tencent.mm.R.id.l3_);
                        imageView2.setTag(viewGroup4);
                        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup4.getLayoutParams();
                        if (layoutParams3 == null || (layoutParams3 instanceof android.widget.FrameLayout.LayoutParams)) {
                            imageView2.setLayoutParams(layoutParams3);
                        } else {
                            com.tencent.mars.xlog.Log.w(TAG, "FIX LayoutParams");
                            imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(layoutParams3));
                        }
                        if (!baseConversationUI.getMagicDrawingByPixelCopy() || android.os.Build.VERSION.SDK_INT < 26) {
                            android.graphics.Bitmap magicDrawingCache = baseConversationUI.getMagicDrawingCache(viewGroup4);
                            if (magicDrawingCache != null) {
                                imageView2.setImageBitmap(magicDrawingCache);
                                viewGroup4.setVisibility(8);
                                imageView2.setVisibility(0);
                                com.tencent.mars.xlog.Log.i(TAG, "[prepareChattingFragment] prepareView VISIBLE");
                            } else {
                                imageView2.setImageBitmap(null);
                            }
                        } else {
                            com.tencent.mm.ui.conversation.a0 a0Var = new com.tencent.mm.ui.conversation.a0(baseConversationUI, imageView2, viewGroup4);
                            int width = viewGroup4.getWidth();
                            int height = viewGroup4.getHeight();
                            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(config);
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(java.lang.Integer.valueOf(height));
                            arrayList.add(java.lang.Integer.valueOf(width));
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "getMagicDrawingCacheViaPixelCopy", "(Landroid/view/View;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                            yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/conversation/BaseConversationUI", "getMagicDrawingCacheViaPixelCopy", "(Landroid/view/View;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            baseConversationUI.mPrepareBitmap = createBitmap;
                            try {
                                android.view.PixelCopy.request(baseConversationUI.getWindow(), new android.graphics.Rect(viewGroup4.getLeft(), viewGroup4.getTop(), viewGroup4.getRight(), viewGroup4.getBottom()), baseConversationUI.mPrepareBitmap, a0Var, new android.os.Handler(android.os.Looper.getMainLooper()));
                            } catch (java.lang.IllegalArgumentException e17) {
                                com.tencent.mars.xlog.Log.e(TAG, "PixelCopy failed: %s", e17);
                                a0Var.onPixelCopyFinished(1);
                                c17 = 1;
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e(TAG, "on position %d, rootLayout not found!", java.lang.Integer.valueOf(i19));
                        i19++;
                    }
                }
            }
            c17 = 1;
            com.tencent.mars.xlog.Log.i(TAG, "ashu::prepareChattingFragment has chattingView, top %s", java.lang.Integer.valueOf(iArr2[c17]));
        }
        if (intent != null) {
            baseConversationUI.chattingFragmet.getArguments().putAll(com.tencent.mm.sdk.platformtools.c2.e(intent));
        }
        if (z18) {
            baseConversationUI.chattingUIProxy.onInit(baseConversationUI.chattingID, z17);
            baseConversationUI.chattingFragmentView = (com.tencent.mm.ui.base.OnLayoutChangedLinearLayout) baseConversationUI.chattingFragmet.getView().findViewById(com.tencent.mm.R.id.bkb);
        } else {
            baseConversationUI.chattingUIProxy.onEnterBegin();
        }
        if (baseConversationUI.chattingFragmet.isSupportNavigationSwipeBack()) {
            baseConversationUI.chattingFragmet.getSwipeBackLayout().setNeedRequestActivityTranslucent(false);
        }
        com.tencent.mars.xlog.Log.i(TAG, "ashu::prepareChattingFragment use %dms, needInit %B, Intent %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Boolean.valueOf(z18), intent);
    }

    public static void access$1500(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI, android.graphics.Bitmap bitmap, android.widget.ImageView imageView, android.view.ViewGroup viewGroup) {
        baseConversationUI.getClass();
        if (bitmap == null) {
            imageView.setImageBitmap(null);
            return;
        }
        imageView.setImageBitmap(bitmap);
        viewGroup.setVisibility(8);
        imageView.setVisibility(0);
        com.tencent.mars.xlog.Log.i(TAG, "[prepareChattingFragment] prepareView VISIBLE");
    }

    public static void access$500(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI) {
        if (baseConversationUI.mChattingInAnim == null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(baseConversationUI, com.tencent.mm.ui.uc.f211078a);
            baseConversationUI.mChattingInAnim = loadAnimation;
            loadAnimation.setAnimationListener(new com.tencent.mm.ui.conversation.w(baseConversationUI));
        }
    }

    public static void access$800(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI) {
        baseConversationUI.chattingView.setTranslationX(0.0f);
        baseConversationUI.chattingView.e();
    }

    public static void access$900(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI) {
        baseConversationUI.getClass();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.conversation.t(baseConversationUI), 60L);
    }

    public final void S6() {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment != null && chattingUIFragment.f198152f.f460714i) {
            com.tencent.mars.xlog.Log.w(TAG, "[initActionBar] isChattingForeground True!");
            return;
        }
        com.tencent.mars.xlog.Log.w(TAG, "[initActionBar] isChattingForeground False!");
        android.view.View actionBarCustomView = getActionBarCustomView();
        this.mActionBarHelper = new com.tencent.mm.ui.j(actionBarCustomView);
        this.mActionBar.I(new android.graphics.drawable.ColorDrawable(getResources().getColor(android.R.color.transparent)));
        this.mActionBar.F(false);
        this.mActionBar.B(false);
        this.mActionBar.E(false);
        this.mActionBar.D(true);
        this.mActionBar.y(actionBarCustomView);
        java.lang.CharSequence charSequence = this.title;
        com.tencent.mm.ui.j jVar = this.mActionBarHelper;
        if (jVar != null) {
            jVar.g(charSequence);
        }
        this.mActionBarHelper.c(new com.tencent.mm.ui.conversation.r(this));
        if (this.mActionBar.j() != null) {
            ((android.widget.TextView) this.mActionBar.j().findViewById(com.tencent.mm.R.id.obn)).setTextColor(getResources().getColor(com.tencent.mm.R.color.f478719fa));
        }
    }

    public final void T6(boolean z17, int i17) {
        if (db5.f.g() && ep.a.a()) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.huh);
            if (findViewById == null) {
                com.tencent.mars.xlog.Log.e(TAG, "[onSettle] null == container");
                return;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.l3_);
            if (imageView != null && imageView.getVisibility() == 8 && imageView.getDrawable() != null) {
                imageView.setVisibility(0);
                com.tencent.mars.xlog.Log.i(TAG, "[onSettle] prepareView VISIBLE");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "performOnSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/conversation/BaseConversationUI", "performOnSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (imageView == null || imageView.getVisibility() != 0) {
                if (z17) {
                    com.tencent.mm.ui.tools.l5.a(findViewById, i17 <= 0 ? 230L : 130L, 0.0f, 0.0f, null);
                    return;
                } else {
                    com.tencent.mm.ui.tools.l5.a(findViewById, i17 <= 0 ? 230L : 130L, (findViewById.getWidth() * (-1)) / 2.5f, 0.0f, null);
                    return;
                }
            }
            if (z17) {
                com.tencent.mm.ui.tools.l5.a(imageView, i17 > 0 ? 130L : 230L, 0.0f, 0.0f, null);
            } else {
                com.tencent.mm.ui.tools.l5.a(imageView, i17 > 0 ? 130L : 230L, (imageView.getWidth() * (-1)) / 2.5f, 0.0f, null);
            }
        }
    }

    public final void U6() {
        if (db5.f.g() && ep.a.a()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.chattingFragmet == null);
            com.tencent.mars.xlog.Log.i(TAG, "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", objArr);
            com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
            if (chattingUIFragment == null || chattingUIFragment.getSwipeBackLayout() == null) {
                return;
            }
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = this.chattingFragmet.getSwipeBackLayout();
            swipeBackLayout.f211441v = false;
            swipeBackLayout.F = false;
        }
    }

    public final void V6(com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView, int i17, android.graphics.Rect rect, android.view.ViewGroup viewGroup) {
        int bottom = getWindow().getDecorView().getBottom();
        int i18 = 0;
        int bottom2 = getSupportActionBar().j() != null ? getSupportActionBar().j().getBottom() : 0;
        com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        if (baseConversationFmUI != null && baseConversationFmUI.getView() != null) {
            i18 = bottom - ((i17 + bottom2) + this.conversationFm.getView().getBottom());
        }
        com.tencent.mars.xlog.Log.i(TAG, "ashu::fitSystemWindows 2. decorBottom:%d, statusBarHeight:%d, actionBarHeight:%d, paddingForNavBar:%d", java.lang.Integer.valueOf(bottom), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bottom2), java.lang.Integer.valueOf(i18));
        fitSystemWindowLayoutView.setActionBarContainer(viewGroup);
        fitSystemWindowLayoutView.fitSystemWindows(rect);
    }

    public void addPrepareChattingFragmentIdleHandler() {
        if (db5.f.g() && ep.a.a()) {
            com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
            if (chattingUIFragment != null && chattingUIFragment.isSupportNavigationSwipeBack()) {
                this.chattingFragmet.getSwipeBackLayout().setEnableGesture(true);
            }
            android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.ui.conversation.s(this));
        }
    }

    public void closeChatting(boolean z17) {
        android.widget.ImageView imageView;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = this.chattingView;
        objArr[0] = java.lang.Boolean.valueOf(testTimeForChatting == null ? false : testTimeForChatting.isShown());
        com.tencent.mars.xlog.Log.i(TAG, "try closeChatting, ishow:%b", objArr);
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment != null && chattingUIFragment.isSupportNavigationSwipeBack()) {
            al5.a3.c(this);
        }
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting2 = this.chattingView;
        if (testTimeForChatting2 == null || testTimeForChatting2.getVisibility() == 8 || this.chattingFragmet == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "[closeChatting] needAnim:%s", java.lang.Boolean.valueOf(z17));
        this.chattingView.setVisibility(8);
        this.mChattingClosed = true;
        if (z17 && this.mChattingOutAnim == null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.ui.uc.f211081d);
            this.mChattingOutAnim = loadAnimation;
            loadAnimation.setAnimationListener(new com.tencent.mm.ui.conversation.c0(this));
        }
        if (this.chattingFragmet.isSupportCustomActionBar() && (imageView = (android.widget.ImageView) getWindow().getDecorView().findViewById(com.tencent.mm.R.id.l3_)) != null && imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            com.tencent.mars.xlog.Log.i(TAG, "[closeChatting] prepareView GONE");
            if (imageView.getTag() != null) {
                android.view.View view = (android.view.View) imageView.getTag();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "closeChatting", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/conversation/BaseConversationUI", "closeChatting", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (z17) {
            this.chattingUIProxy.onExitBegin();
            this.chattingUIProxy.onExitEnd();
            this.chattingView.startAnimation(this.mChattingOutAnim);
        } else {
            this.chattingUIProxy.onExitBegin();
            this.chattingUIProxy.onExitEnd();
            this.chattingView.setVisibility(8);
            onSwipe(1.0f);
            U6();
        }
        if (!this.chattingFragmet.isSupportCustomActionBar()) {
            S6();
        }
        supportInvalidateOptionsMenu();
        resumeMainFragment();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        zk3.c Ai;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            com.tencent.mm.sdk.platformtools.u3.l(this.startChattingRunnable);
        }
        if (this.isAnimating) {
            return true;
        }
        if (keyEvent.getKeyCode() == 4 && (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) != null && ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).S6(keyEvent)) {
            return true;
        }
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment == null || !chattingUIFragment.onKeyDown(keyEvent.getKeyCode(), keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableEdge2Edge() {
        return false;
    }

    public android.view.View getActionBarCustomView() {
        return com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f487908ba, (android.view.ViewGroup) null);
    }

    public com.tencent.mm.ui.chatting.ChattingUIFragment getChattingUIFragment() {
        return new com.tencent.mm.ui.chatting.ChattingUIFragment();
    }

    public boolean getMagicDrawingByPixelCopy() {
        return false;
    }

    public android.graphics.Bitmap getMagicDrawingCache(android.view.View view) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0) {
            width = view.getMeasuredWidth();
        }
        if (height <= 0) {
            height = view.getMeasuredHeight();
        }
        if (width <= 0 || height <= 0 || this.chattingFragmet.getView() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "viewWidth:%s viewHeight:%s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height));
            return null;
        }
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment != null) {
            com.tencent.mars.xlog.Log.i(TAG, "getBottom:%s keyboardState:%s", java.lang.Integer.valueOf(chattingUIFragment.getView().getBottom()), java.lang.Integer.valueOf(this.chattingFragmet.keyboardState()));
        }
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment2 = this.chattingFragmet;
        if (chattingUIFragment2 != null && chattingUIFragment2.getView().getBottom() > 0 && (this.chattingFragmet.keyboardState() == 1 || this.chattingFragmet.getView().getBottom() < (getResources().getDisplayMetrics().heightPixels * 2) / 3)) {
            com.tencent.mars.xlog.Log.e(TAG, "hardKeyboardHidden:%s", java.lang.Integer.valueOf(this.chattingFragmet.keyboardState()));
            return null;
        }
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment3 = this.chattingFragmet;
        if (chattingUIFragment3 != null && chattingUIFragment3.keyboardState() == 1) {
            com.tencent.mars.xlog.Log.e(TAG, "hardKeyboardHidden:%s", java.lang.Integer.valueOf(this.chattingFragmet.keyboardState()));
            return null;
        }
        android.graphics.Bitmap bitmap = this.mPrepareBitmap;
        if (bitmap == null || bitmap.isRecycled() || this.mPrepareBitmap.getWidth() != width || this.mPrepareBitmap.getHeight() != height) {
            android.graphics.Bitmap bitmap2 = this.mPrepareBitmap;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                com.tencent.mars.xlog.Log.i(TAG, "bitmap recycle %s", this.mPrepareBitmap.toString());
                this.mPrepareBitmap.recycle();
            }
            try {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "getMagicDrawingCache", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/conversation/BaseConversationUI", "getMagicDrawingCache", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                this.mPrepareBitmap = createBitmap;
            } catch (java.lang.OutOfMemoryError e17) {
                com.tencent.mars.xlog.Log.e(TAG, "[getMagicDrawingCache] e:%s", e17);
                return null;
            }
        } else {
            this.mPrepareBitmap.eraseColor(0);
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(this.mPrepareBitmap);
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.ael);
        int dimension2 = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479627b2);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-1);
        canvas.drawRect(0.0f, dimension, width, height - dimension2, paint);
        view.draw(canvas);
        com.tencent.mars.xlog.Log.i(TAG, "[getMagicDrawingCache] cost%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return this.mPrepareBitmap;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet(super.importUIComponents());
        ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).wi(this, hashSet);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        if (baseConversationFmUI != null) {
            baseConversationFmUI.onActivityResult(i17, i18, intent);
        }
        if (i18 != -1) {
            return;
        }
        if ((i17 == 2001 || i17 == 226 || i17 == 229) && (chattingUIFragment = this.chattingFragmet) != null) {
            chattingUIFragment.onActivityResult(i17, i18, intent);
        }
        int i19 = 65535 & i17;
        com.tencent.mars.xlog.Log.w(TAG, "check request code %d", java.lang.Integer.valueOf(i19));
        if ((i19 == 217 || i19 == 218) && this.chattingFragmet == null) {
            com.tencent.mars.xlog.Log.i(TAG, "on select image ActivityResult. the chattingUI maybe kill in the background.");
            com.tencent.mm.sdk.platformtools.u3.l(this.selectImageJob);
            com.tencent.mm.ui.conversation.f0 f0Var = this.selectImageJob;
            f0Var.f207658d = 0;
            f0Var.f207659e = i17;
            f0Var.f207660f = i18;
            f0Var.f207661g = intent;
            com.tencent.mm.sdk.platformtools.u3.h(f0Var);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        getWindow().setFormat(-2);
        super.onCreate(bundle);
        getWindow().setCallback(new ma5.f(getWindow().getCallback(), this));
        this.mActionBar = getSupportActionBar();
        initNavigationSwipeBack();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.graphics.Bitmap bitmap = this.mPrepareBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i(TAG, "bitmap recycle %s", this.mPrepareBitmap.toString());
            this.mPrepareBitmap.recycle();
        }
        this.chattingFragmet = null;
        this.chattingFragmentView = null;
        this.chattingView = null;
        this.conversationFm = null;
        this.mActionBarHelper = null;
        this.mChattingInAnim = null;
        this.mChattingOutAnim = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i(TAG, "onNewIntent");
        setIntent(intent);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i(TAG, "on pause");
        super.onPause();
        if (!isFinishing()) {
            al5.a3.d(this);
        }
        this.launcherUIStatus = com.tencent.mm.ui.conversation.d0.ACTIVITY_PAUSE;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment == null || !chattingUIFragment.isSupportNavigationSwipeBack()) {
            return;
        }
        this.chattingFragmet.getSwipeBackLayout().setEnableGesture(false);
    }

    public void onPrepareChattingFragmentEnd() {
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.lastRestoreTalker = bundle.getString(LAST_RESTORE_TALKER);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        al5.a3.c(this);
        onSwipe(1.0f);
        this.launcherUIStatus = com.tencent.mm.ui.conversation.d0.ACTIVITY_RESUME;
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = this.chattingView;
        if (!(testTimeForChatting != null && testTimeForChatting.isShown())) {
            this.chattinguiResumeTime = com.tencent.mm.sdk.platformtools.t8.i1();
        }
        if (!shouldSkipPrepareChattingOnIdle()) {
            addPrepareChattingFragmentIdleHandler();
        }
        S6();
        this.mActionBar.L();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment == null || com.tencent.mm.sdk.platformtools.t8.K0(chattingUIFragment.f198152f.x())) {
            return;
        }
        this.chattingFragmet.f198152f.x();
        bundle.putString(LAST_RESTORE_TALKER, this.chattingFragmet.f198152f.x());
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.z2
    public void onSettle(boolean z17, int i17, boolean z18) {
        if (z18) {
            T6(z17, i17);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.z2
    public void onSwipe(float f17) {
        android.widget.ImageView imageView;
        android.view.ViewGroup viewGroup;
        if (db5.f.g() && ep.a.a()) {
            com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
            if (chattingUIFragment == null) {
                com.tencent.mars.xlog.Log.e(TAG, "chattingFragmet is null!");
                return;
            }
            if (f17 == 0.0f && !this.mChattingClosed) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) getWindow().getDecorView().findViewById(com.tencent.mm.R.id.l3_);
                if (imageView2 != null && (viewGroup = (android.view.ViewGroup) imageView2.getTag()) != null) {
                    com.tencent.mars.xlog.Log.i(TAG, "[onSwipe] prepareView GONE");
                    viewGroup.setVisibility(0);
                    imageView2.setVisibility(8);
                    imageView2.setImageDrawable(null);
                }
                android.view.animation.Animation animation = this.mChattingInAnim;
                if (animation != null) {
                    animation.cancel();
                }
            } else if (f17 == 1.0f && !this.mChattingClosed && chattingUIFragment.isSupportNavigationSwipeBack() && (imageView = (android.widget.ImageView) getWindow().getDecorView().findViewById(com.tencent.mm.R.id.l3_)) != null && imageView.getVisibility() == 0 && imageView.getTag() != null) {
                android.view.View view = (android.view.View) imageView.getTag();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mars.xlog.Log.i(TAG, "[onSwipe] prepareView GONE");
                imageView.setVisibility(8);
            }
            if (com.tencent.mm.ui.conversation.d0.ACTIVITY_RESUME != this.launcherUIStatus && java.lang.Float.compare(1.0f, f17) > 0) {
                com.tencent.mars.xlog.Log.i(TAG, "[onSwipe] return! consumedSuperCall:%s", java.lang.Float.valueOf(f17));
                return;
            }
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.huh);
            android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.l3_);
            if (imageView3 != null && imageView3.getVisibility() == 8 && imageView3.getDrawable() != null && !this.mChattingClosed && f17 != 1.0f && f17 != 0.0f) {
                imageView3.setVisibility(0);
                com.tencent.mars.xlog.Log.i(TAG, "[onSwipe] !1 && !0 prepareView VISIBLE");
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (java.lang.Float.compare(1.0f, f17) <= 0) {
                com.tencent.mm.ui.tools.l5.c(findViewById, 0.0f, 0.0f);
                if (imageView3 == null || imageView3.getDrawable() == null) {
                    return;
                }
                com.tencent.mm.ui.tools.l5.c(imageView3, 0.0f, 0.0f);
                return;
            }
            if (imageView3 == null || imageView3.getDrawable() == null) {
                com.tencent.mm.ui.tools.l5.c(findViewById, (findViewById.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
            } else {
                com.tencent.mm.ui.tools.l5.c(imageView3, (imageView3.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        android.view.ActionMode g17;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment == null || chattingUIFragment.A0() == null || !this.chattingFragmet.isSupportCustomActionBar() || fp.h.b(22) || (g17 = this.chattingFragmet.A0().A0.g(callback)) == null) {
            return null;
        }
        return g17;
    }

    public void pauseMainFragment() {
        com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        if (baseConversationFmUI != null) {
            baseConversationFmUI.onPause();
            if (this.conversationFm.isSupportNavigationSwipeBack()) {
                return;
            }
            this.conversationFm.showOptionMenu(false);
        }
    }

    public void resumeMainFragment() {
        com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        if (baseConversationFmUI != null) {
            baseConversationFmUI.onResume();
            if (this.conversationFm.isSupportNavigationSwipeBack()) {
                return;
            }
            this.conversationFm.showOptionMenu(true);
        }
    }

    public void setCustomTitle(java.lang.CharSequence charSequence) {
        this.title = charSequence;
        com.tencent.mm.ui.j jVar = this.mActionBarHelper;
        if (jVar == null || jVar == null) {
            return;
        }
        jVar.g(charSequence);
    }

    public void setTitle(java.lang.String str) {
        this.title = str;
        if (this.mActionBarHelper != null) {
            updateTitle(str);
        }
    }

    public void setUnread(int i17, boolean z17) {
        this.unreadSum = i17;
        com.tencent.mm.ui.j jVar = this.mActionBarHelper;
        if (jVar == null || !z17) {
            return;
        }
        jVar.h(i17);
    }

    public boolean shouldSkipPrepareChattingOnIdle() {
        return false;
    }

    public void startChatting(java.lang.String str) {
        startChatting(str, null, false);
    }

    public void startChattingViewAnimation() {
        com.tencent.mars.xlog.Log.i(TAG, "startChattingViewAnimation");
        if (this.mChattingInAnim == null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.ui.uc.f211078a);
            this.mChattingInAnim = loadAnimation;
            loadAnimation.setAnimationListener(new com.tencent.mm.ui.conversation.w(this));
        }
        if (this.chattingFragmet.getSwipeBackLayout() != null) {
            this.chattingFragmet.getSwipeBackLayout().startAnimation(this.mChattingInAnim);
        } else {
            this.chattingFragmet.getView().startAnimation(this.mChattingInAnim);
        }
    }

    public void updateContentViewMargin(android.view.View view) {
        if (view != null && enableEdge2Edge() && com.tencent.mm.ui.b4.c(this)) {
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.jmc);
            view.setBackgroundColor(getColor(com.tencent.mm.R.color.BW_93));
            com.tencent.mm.ui.a4.g(findViewById, true);
        }
    }

    public void updateTitle(java.lang.String str) {
        com.tencent.mm.ui.j jVar = this.mActionBarHelper;
        if (jVar != null) {
            jVar.g(str);
        }
    }

    /* loaded from: classes11.dex */
    public static class BaseConversationFmUI extends com.tencent.mm.ui.MMFragment {
        private com.tencent.mm.ui.conversation.d0 fmStatus = com.tencent.mm.ui.conversation.d0.ACTIVITY_CREATE;

        /* renamed from: ui, reason: collision with root package name */
        public com.tencent.mm.ui.conversation.BaseConversationUI f207287ui;

        @Override // com.tencent.mm.ui.MMFragment
        public void finish() {
            thisActivity().finish();
        }

        @Override // com.tencent.mm.ui.MMFragment
        /* renamed from: getLayoutId */
        public int getF72225d() {
            return 0;
        }

        public java.lang.String getUserName() {
            return null;
        }

        @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
        public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
            this.fmStatus = com.tencent.mm.ui.conversation.d0.ACTIVITY_CREATE;
            this.f207287ui = (com.tencent.mm.ui.conversation.BaseConversationUI) thisActivity();
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }

        @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            if (this.fmStatus != com.tencent.mm.ui.conversation.d0.ACTIVITY_PAUSE) {
                com.tencent.mars.xlog.Log.w(com.tencent.mm.ui.conversation.BaseConversationUI.TAG, "fmStatus != ActivityStatus.ACTIVITY_PAUSE when fm onDestroy");
                onPause();
            }
            super.onDestroy();
        }

        @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onPause() {
            super.onPause();
            this.fmStatus = com.tencent.mm.ui.conversation.d0.ACTIVITY_PAUSE;
        }

        @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            this.fmStatus = com.tencent.mm.ui.conversation.d0.ACTIVITY_RESUME;
        }

        @Override // com.tencent.mm.ui.MMFragment
        public void setMMTitle(java.lang.String str) {
            com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f207287ui;
            if (baseConversationUI != null) {
                baseConversationUI.setTitle(str);
            }
        }

        public void setUnread(int i17, boolean z17) {
            com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f207287ui;
            if (baseConversationUI != null) {
                baseConversationUI.setUnread(i17, z17);
            }
        }

        public void setMMTitle(java.lang.CharSequence charSequence) {
            com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f207287ui;
            if (baseConversationUI != null) {
                baseConversationUI.setCustomTitle(charSequence);
            }
        }
    }

    public void startChatting(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        startChatting(str, bundle, z17, true);
    }

    public void startChatting(java.lang.String str, android.os.Bundle bundle, boolean z17, boolean z18) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = this.chattingView;
        objArr[0] = java.lang.Boolean.valueOf(testTimeForChatting == null ? false : testTimeForChatting.isShown());
        objArr[1] = java.lang.Boolean.valueOf(z18);
        com.tencent.mars.xlog.Log.i(TAG, "try startChatting, ishow:%b, post: %b", objArr);
        this.pendingBundle = bundle;
        this.pendingUser = str;
        this.mNeedChattingAnim = z17;
        if (z17) {
            jz5.g gVar = com.tencent.mm.ui.chatting.adapter.m.f198435a;
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.chattingFragmet;
            if (chattingUIFragment != null) {
                chattingUIFragment.T0();
            }
        }
        if (z18) {
            gm0.j1.e().p();
            com.tencent.mm.sdk.platformtools.u3.m(-8);
            com.tencent.mm.sdk.platformtools.u3.l(this.startChattingRunnable);
            com.tencent.mm.sdk.platformtools.u3.h(this.startChattingRunnable);
            return;
        }
        this.startChattingRunnable.run();
    }
}
