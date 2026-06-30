package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class ConversationListView extends android.widget.ListView implements android.widget.AbsListView.OnScrollListener, com.tencent.mm.plugin.appbrand.widget.recent.k0, android.view.View.OnTouchListener, com.tencent.mm.plugin.taskbar.ui.q {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f207310x0 = 0;
    public java.lang.Runnable A;
    public android.view.View B;
    public android.view.View C;
    public ul5.k D;
    public int E;
    public android.view.View F;
    public final int G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f207311J;
    public final android.graphics.Rect K;
    public android.graphics.Paint L;
    public boolean M;
    public final com.tencent.mm.sdk.event.IListener N;
    public final android.view.View.OnLayoutChangeListener P;
    public android.view.View.OnTouchListener Q;
    public int R;
    public boolean S;
    public android.view.View T;
    public boolean U;
    public boolean V;
    public android.widget.AdapterView.OnItemLongClickListener W;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f207312d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.AbsListView.OnScrollListener f207313e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnTouchListener f207314f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f207315g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f207316h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.taskbar.ui.s f207317i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.taskbar.ui.r f207318m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.o5 f207319n;

    /* renamed from: o, reason: collision with root package name */
    public int f207320o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f207321p;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f207322p0;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f207323q;

    /* renamed from: r, reason: collision with root package name */
    public int f207324r;

    /* renamed from: s, reason: collision with root package name */
    public int f207325s;

    /* renamed from: t, reason: collision with root package name */
    public int f207326t;

    /* renamed from: u, reason: collision with root package name */
    public int f207327u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragmentActivity f207328v;

    /* renamed from: w, reason: collision with root package name */
    public int f207329w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f207330x;

    /* renamed from: y, reason: collision with root package name */
    public hh4.a f207331y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Runnable f207332z;

    public ConversationListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f207312d = new java.util.LinkedList();
        this.f207315g = true;
        this.f207316h = false;
        this.f207321p = new android.graphics.Paint(1);
        this.f207323q = new android.graphics.Paint(1);
        this.f207326t = 0;
        this.f207327u = 0;
        this.f207329w = 0;
        this.f207330x = false;
        this.f207331y = null;
        this.f207332z = null;
        this.A = null;
        this.E = 0;
        this.G = i65.a.b(getContext(), 56);
        this.H = true;
        this.I = 0;
        this.f207311J = false;
        this.K = new android.graphics.Rect();
        this.M = false;
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MultiWindowModeChangedEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.conversation.ConversationListView.1
            {
                this.__eventId = 1571206658;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MultiWindowModeChangedEvent multiWindowModeChangedEvent) {
                com.tencent.mm.autogen.events.MultiWindowModeChangedEvent multiWindowModeChangedEvent2 = multiWindowModeChangedEvent;
                com.tencent.mm.ui.conversation.ConversationListView conversationListView = com.tencent.mm.ui.conversation.ConversationListView.this;
                boolean z17 = conversationListView.f207311J;
                boolean z18 = multiWindowModeChangedEvent2.f54508g.f6682a;
                if (z17 == z18) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "MultiWindowModeChanged: %b", java.lang.Boolean.valueOf(z18));
                conversationListView.f207311J = multiWindowModeChangedEvent2.f54508g.f6682a;
                conversationListView.y();
                com.tencent.mm.plugin.taskbar.ui.s sVar = conversationListView.f207317i;
                if (sVar == null) {
                    return false;
                }
                ((com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar).e(conversationListView.f207311J);
                return false;
            }
        };
        this.P = new com.tencent.mm.ui.conversation.h3(this);
        this.Q = null;
        this.S = true;
        this.V = false;
        q(context);
    }

    private android.view.View getEmptyFooter() {
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.huj);
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479896i9);
        int height = findViewById != null ? findViewById.getHeight() : 0;
        if (height > 0) {
            dimension = height;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        android.view.View view = new android.view.View(getContext());
        this.T = view;
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, dimension));
        linearLayout.addView(this.T);
        linearLayout.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        linearLayout.setId(com.tencent.mm.R.id.bp9);
        return linearLayout;
    }

    private java.util.ArrayList<android.view.View> getHeaderViewList() {
        android.view.View view;
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f207312d;
            if (i17 >= linkedList.size()) {
                return arrayList;
            }
            android.widget.ListView.FixedViewInfo fixedViewInfo = (android.widget.ListView.FixedViewInfo) linkedList.get(i17);
            if (fixedViewInfo != null && (view = fixedViewInfo.view) != null) {
                arrayList.add(view);
            }
            i17++;
        }
    }

    private int getRealCount() {
        if (getAdapter() == null) {
            return 1;
        }
        return (getAdapter().getCount() - getHeaderViewsCount()) - getFooterViewsCount();
    }

    public final void A(boolean z17) {
        boolean z18;
        boolean z19 = this.f207315g;
        this.f207315g = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "updateHeaderContainer showHeaderContainer: %b, last: %b, updateView: %b, isHeaderContainerAdded: %b", true, java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f207316h));
        if (z17 && z19 != (z18 = this.f207315g)) {
            if (!z18) {
                if (this.f207316h) {
                    java.lang.Object obj = this.f207317i;
                    if (obj != null) {
                        removeHeaderView((android.widget.RelativeLayout) obj);
                        y();
                    }
                    this.f207316h = false;
                    setSelection(0);
                    return;
                }
                return;
            }
            if (this.f207316h) {
                return;
            }
            if (this.f207317i != null) {
                java.util.ArrayList<android.view.View> headerViewList = getHeaderViewList();
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "removeHeaderViewList size: %d", java.lang.Integer.valueOf(headerViewList.size()));
                for (int i17 = 0; i17 < headerViewList.size(); i17++) {
                    android.view.View view = headerViewList.get(i17);
                    if (view != null) {
                        removeHeaderView(view);
                    }
                }
                addHeaderView((android.widget.RelativeLayout) this.f207317i);
                headerViewList.remove((android.widget.RelativeLayout) this.f207317i);
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "addHeaderViewList addViewList: %d", java.lang.Integer.valueOf(headerViewList.size()));
                for (int i18 = 0; i18 < headerViewList.size(); i18++) {
                    addHeaderView(headerViewList.get(i18));
                }
                y();
            }
            this.f207316h = true;
            j(200L, 0, true);
        }
    }

    public final void B() {
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        int h17 = com.tencent.mm.ui.bl.h(getContext());
        int i17 = this.E;
        if (i17 <= 0 && !this.f207311J) {
            i17 = h17;
        }
        int i18 = this.f207325s;
        this.f207325s = com.tencent.mm.ui.bl.a(getContext()) + i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "updateScrollOffset statusBarHeight:%d actionBarTop:%d scrollOffset:%d old:%d", java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(this.f207325s), java.lang.Integer.valueOf(i18));
        if (this.f207315g && (rVar = this.f207318m) != null) {
            int i19 = this.f207325s;
            com.tencent.mm.plugin.taskbar.ui.z zVar = (com.tencent.mm.plugin.taskbar.ui.z) rVar;
            zVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "updateScrollOffset %d", java.lang.Integer.valueOf(i19));
            zVar.f172769m = i19;
        }
        com.tencent.mm.plugin.taskbar.ui.s sVar = this.f207317i;
        if (sVar != null) {
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = (com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar;
            if (taskBarContainer.f172514x != i17) {
                taskBarContainer.f172514x = i17;
                ((android.widget.FrameLayout.LayoutParams) taskBarContainer.f172502i.getLayoutParams()).topMargin = i17;
                android.view.ViewGroup.LayoutParams layoutParams = taskBarContainer.f172516z.contentView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = i17;
            }
        }
        if (i18 != this.f207325s) {
            setSelection(1);
        }
    }

    @Override // android.widget.ListView
    public void addHeaderView(android.view.View view, java.lang.Object obj, boolean z17) {
        super.addHeaderView(view, obj, z17);
        android.widget.ListView.FixedViewInfo fixedViewInfo = new android.widget.ListView.FixedViewInfo(this);
        fixedViewInfo.view = view;
        fixedViewInfo.data = obj;
        fixedViewInfo.isSelectable = z17;
        this.f207312d.add(fixedViewInfo);
    }

    @Override // android.view.ViewGroup
    public void attachViewToParent(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i17, layoutParams);
        if (this.f207324r > 0 || this.f207318m == null) {
            return;
        }
        this.f207324r = com.tencent.mm.ui.bl.a(getContext()) + com.tencent.mm.ui.bl.i(getContext(), 0);
        this.f207325s = com.tencent.mm.ui.bl.a(getContext()) + com.tencent.mm.ui.bl.h(getContext());
        y();
        com.tencent.mm.plugin.taskbar.ui.s sVar = this.f207317i;
        if (sVar != null) {
            sVar.setActionBar(this.C);
        }
        com.tencent.mm.plugin.taskbar.ui.r rVar = this.f207318m;
        ((com.tencent.mm.plugin.taskbar.ui.z) rVar).J1 = this.C;
        ((com.tencent.mm.plugin.taskbar.ui.z) rVar).I1 = getRootView().findViewById(com.tencent.mm.R.id.huj);
        ((com.tencent.mm.plugin.taskbar.ui.z) this.f207318m).K1 = (com.tencent.mm.ui.FrostedContentView) getRootView().findViewById(com.tencent.mm.R.id.jlt);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.k0
    public void b(int i17) {
    }

    public float c(int i17, int i18, boolean z17) {
        if (getAdapter() == null) {
            return 0.0f;
        }
        i(false);
        int i19 = this.f207326t;
        int i27 = this.f207327u;
        int headerViewsCount = (i17 - getHeaderViewsCount()) - getFooterViewsCount();
        int i28 = (((headerViewsCount - i18) - (z17 ? 1 : 0)) * i19) + ((z17 ? 1 : 0) * i27);
        int measuredHeight = getMeasuredHeight();
        int a17 = com.tencent.mm.ui.bl.a(getContext());
        float f17 = ((measuredHeight - i28) - a17) - this.E;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[isFullScreen] totalItemCount:" + i17 + " rawCount:" + headerViewsCount + " itemHeight:" + i19 + " foldItemHeight:" + i27 + " foldedItemCount:" + i18 + " foldItemCount:" + (z17 ? 1 : 0) + " getFirstVisiblePosition:" + getFirstVisiblePosition() + " getLastVisiblePosition:" + getLastVisiblePosition() + " getHeaderViewsCount:" + getHeaderViewsCount() + " getFooterViewsCount:" + getFooterViewsCount() + " measuredHeight:" + measuredHeight + " rawHeight:" + i28 + " actionBarHeight:" + a17 + " statusBarHeight: " + this.E + " extraHeight:" + f17);
        return f17;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        java.lang.Object obj = this.f207317i;
        return obj == null ? super.canScrollHorizontally(i17) : ((android.widget.RelativeLayout) obj).getBottom() >= ((android.widget.RelativeLayout) this.f207317i).getHeight();
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.q
    public void d() {
        m();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        int i17 = this.f207325s + this.I;
        if (i17 >= 0 && !r() && !com.tencent.mm.ui.t7.f209881a.a()) {
            float f17 = i17;
            canvas.drawLine(0.0f, f17, getMeasuredWidth(), f17, this.f207323q);
        }
        android.graphics.Rect rect = this.K;
        if (rect.isEmpty()) {
            return;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        getLocalVisibleRect(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect(rect2);
        android.graphics.Rect rect4 = new android.graphics.Rect(rect2);
        if (this.M) {
            rect3.top = rect.top;
            rect3.bottom = rect.bottom;
            canvas.drawRect(rect3, this.L);
        } else {
            rect3.bottom = rect.top;
            rect4.top = rect.bottom;
            canvas.drawRect(rect3, this.L);
            canvas.drawRect(rect4, this.L);
        }
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            this.L.getAlpha();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        if (getFirstVisiblePosition() != 0 || i18 >= 0 || iArr == null || iArr.length < 2 || this.f207330x) {
            return super.dispatchNestedPreScroll(i17, i18, iArr, iArr2);
        }
        iArr[1] = (int) (i18 * 0.32f);
        super.dispatchNestedPreScroll(i17, i18, iArr, iArr2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnTouchListener onTouchListener = this.Q;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        try {
            int rawY = (int) motionEvent.getRawY();
            if (this.f207311J) {
                rawY = (int) motionEvent.getY();
            }
            com.tencent.mm.plugin.taskbar.ui.s sVar = this.f207317i;
            if (sVar != null) {
                sVar.getBackUpFooterRect().toString();
                motionEvent.getRawX();
                motionEvent.getRawY();
                ((android.view.View) this.f207317i).getBottom();
                ((android.view.View) this.f207317i).getHeight();
            }
            if (r() && this.f207317i != null) {
                if (motionEvent.getPointerCount() > 1) {
                    motionEvent.setAction(3);
                    return ((android.widget.RelativeLayout) this.f207317i).dispatchTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    if (this.f207317i.getBackUpFooterRect().contains((int) motionEvent.getRawX(), rawY)) {
                        this.V = true;
                    } else {
                        this.V = false;
                    }
                }
                if (!this.V) {
                    return ((android.widget.RelativeLayout) this.f207317i).dispatchTouchEvent(motionEvent);
                }
            }
            java.lang.Object obj = this.f207317i;
            if (obj != null && ((android.widget.RelativeLayout) obj).getBottom() >= ((android.widget.RelativeLayout) this.f207317i).getHeight()) {
                ((com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) this.f207317i).f172498e.getClass();
                if (getFirstVisiblePosition() == 0) {
                    if (motionEvent.getAction() == 0 && this.f207317i.getBackUpFooterRect().contains((int) motionEvent.getRawX(), rawY)) {
                        this.U = true;
                    } else if (motionEvent.getAction() == 0) {
                        this.U = false;
                    }
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        if (this.f207318m != null && motionEvent.getAction() == 0) {
                            ((com.tencent.mm.plugin.taskbar.ui.z) this.f207318m).p(motionEvent);
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (!this.U) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    this.U = false;
                    if (this.f207318m != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "closeHeader by click BackUpFooterRect");
                        ((com.tencent.mm.plugin.taskbar.ui.z) this.f207318m).a(12);
                    }
                    if (motionEvent.getAction() != 1) {
                        return true;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "ConversationListView cancel touch event");
                    motionEvent.setAction(3);
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (this.U && motionEvent.getAction() == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "ConversationListView cancel touch event..., isHeaderOpen: %b, isHeaderVisible: %b", java.lang.Boolean.valueOf(r()), java.lang.Boolean.valueOf(s()));
                if (r()) {
                    motionEvent.setAction(3);
                } else {
                    this.U = false;
                }
            }
            if (motionEvent.getAction() == 0 && this.f207318m != null && motionEvent.getAction() == 0) {
                ((com.tencent.mm.plugin.taskbar.ui.z) this.f207318m).p(motionEvent);
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConversationListView", e17, "ConversationListView dispatchTouchEvent exception", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.ConversationListView.g():void");
    }

    public int getBannerHeaderHeight() {
        java.util.Iterator it = this.f207312d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            android.view.View view = ((android.widget.ListView.FixedViewInfo) it.next()).view;
            if (view != this.f207317i) {
                i17 += view.getMeasuredHeight();
            }
        }
        return i17;
    }

    public int getEmptyFooterHeight() {
        android.view.View view = this.T;
        android.widget.LinearLayout.LayoutParams layoutParams = view != null ? (android.widget.LinearLayout.LayoutParams) view.getLayoutParams() : null;
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    public int getFirstHeaderVisible() {
        android.view.View childAt;
        java.util.Iterator it = this.f207312d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            android.view.View view = ((android.widget.ListView.FixedViewInfo) it.next()).view;
            if (view != this.f207317i && view != null && (view instanceof android.view.ViewGroup) && (childAt = ((android.view.ViewGroup) view).getChildAt(0)) != null && childAt.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[getFirstHeaderVisible] index:%s", java.lang.Integer.valueOf(i17));
                return i17;
            }
            i17++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[getFirstHeaderVisible] index:%s", java.lang.Integer.valueOf(i17));
        return i17;
    }

    public boolean getShowHeaderContainer() {
        return this.f207315g;
    }

    public com.tencent.mm.plugin.taskbar.ui.t getTaskBarView() {
        com.tencent.mm.plugin.taskbar.ui.s sVar = this.f207317i;
        if (sVar != null) {
            return sVar.getTaskBarView();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ConversationListView", "mHeaderContainer is null");
        return null;
    }

    public void h(boolean z17) {
        if (this.T == null) {
            return;
        }
        if (z17) {
            postDelayed(new com.tencent.mm.ui.conversation.n3(this), 0L);
        } else {
            g();
        }
    }

    public final void i(boolean z17) {
        if (z17 || this.f207326t == 0 || this.f207327u == 0) {
            this.f207326t = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479896i9);
            this.f207327u = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479872hl);
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "checkSavedItemHeight %b %d %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f207326t), java.lang.Integer.valueOf(this.f207327u));
        }
    }

    public void j(long j17, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[closeHeader] delay:%s, type: %d, forceClose: %b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (getFirstVisiblePosition() == 0 || z17) {
            if (j17 <= 0) {
                setSelection(0);
                return;
            }
            java.lang.Runnable runnable = this.f207332z;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            com.tencent.mm.ui.conversation.m3 m3Var = new com.tencent.mm.ui.conversation.m3(this, i17);
            this.f207332z = m3Var;
            postDelayed(m3Var, j17);
        }
    }

    public final void k(int i17) {
        if (i17 == 0) {
            super.smoothScrollToPositionFromTop(getFirstHeaderVisible(), this.f207325s);
        } else {
            super.smoothScrollToPositionFromTop(i17, this.f207325s);
        }
    }

    public final void l(int i17, int i18) {
        if (i17 == 0) {
            super.smoothScrollToPositionFromTop(getFirstHeaderVisible(), i18 + this.f207325s);
        } else {
            super.smoothScrollToPositionFromTop(i17, i18 + this.f207325s);
        }
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.q
    public void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[onOpenHeader]");
        setImportantForAccessibility(2);
        this.f207330x = true;
        ul5.k kVar = this.D;
        if (kVar != null) {
            kVar.setBounceEnabled(false);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        int hashCode = hashCode();
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).uj("MainUI_PullDown", hashCode, 1005, 0);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f207328v;
        ((cy1.a) rVar2).bk(mMFragmentActivity instanceof com.tencent.mm.ui.LauncherUI ? ((com.tencent.mm.ui.LauncherUI) mMFragmentActivity).getHomeUI().getMainTabUI().g() : null, true);
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.q
    public void o(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[onCloseHeader]");
        setImportantForAccessibility(1);
        this.U = false;
        this.f207330x = false;
        this.f207320o = 0;
        ul5.k kVar = this.D;
        if (kVar != null) {
            kVar.setBounceEnabled(true);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f207328v;
        ((cy1.a) rVar).bk(mMFragmentActivity instanceof com.tencent.mm.ui.LauncherUI ? ((com.tencent.mm.ui.LauncherUI) mMFragmentActivity).getHomeUI().getMainTabUI().g() : null, false);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        int hashCode = hashCode();
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar2).vj("MainUI_PullDown", hashCode, 1005, 0);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
        if (com.tencent.mm.ui.LauncherUI.getInstance() != null) {
            boolean isInMultiWindowMode = com.tencent.mm.ui.LauncherUI.getInstance().isInMultiWindowMode();
            this.f207311J = isInMultiWindowMode;
            com.tencent.mm.plugin.taskbar.ui.s sVar = this.f207317i;
            if (sVar != null) {
                ((com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar).e(isInMultiWindowMode);
            }
        }
        com.tencent.mm.sdk.event.IListener iListener = this.N;
        if (iListener != null) {
            iListener.alive();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[onConfigurationChanged] orientation:%s, last: %d", java.lang.Integer.valueOf(configuration.orientation), 0);
        h(true);
        B();
        if (this.f207315g && (rVar = this.f207318m) != null) {
            com.tencent.mm.plugin.taskbar.ui.z zVar = (com.tencent.mm.plugin.taskbar.ui.z) rVar;
            zVar.c();
            int color = zVar.f172762d.getResources().getColor(com.tencent.mm.R.color.f478489a);
            zVar.U = color;
            zVar.q(1.0f, color, 0);
            zVar.s(1.0f);
            zVar.L = false;
        }
        com.tencent.mm.plugin.taskbar.ui.s sVar = this.f207317i;
        if (sVar != null) {
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = (com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainer", "AppBrandDesktopContainer onCustomConfigurationChanged newConfig orientation: %d", java.lang.Integer.valueOf(configuration.orientation));
            java.lang.Runnable runnable = taskBarContainer.M;
            if (runnable != null) {
                taskBarContainer.removeCallbacks(runnable);
            }
            android.view.View view = taskBarContainer.f172505o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "onCustomConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "onCustomConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.taskbar.ui.p0 p0Var = new com.tencent.mm.plugin.taskbar.ui.p0(taskBarContainer);
            taskBarContainer.M = p0Var;
            taskBarContainer.postDelayed(p0Var, 400L);
            com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = taskBarContainer.f172498e;
            if (taskBarView != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "TaskBarView onCustomConfigurationChanged lastOrientation: %d, orientation: %d", java.lang.Integer.valueOf(taskBarView.f172540t2), java.lang.Integer.valueOf(configuration.orientation));
                com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer2 = taskBarView.f172526f2;
                if (taskBarContainer2 != null) {
                    int viewHeight = taskBarContainer2.getViewHeight();
                    taskBarView.f172537q2 = viewHeight;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "TaskBarView onCustomConfigurationChanged fixedViewHeight: %d", java.lang.Integer.valueOf(viewHeight));
                }
                int i17 = taskBarView.f172540t2;
                int i18 = configuration.orientation;
                if (i17 != i18) {
                    taskBarView.f172540t2 = i18;
                    com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer3 = taskBarView.f172526f2;
                    if (taskBarContainer3 != null) {
                        com.tencent.mm.plugin.taskbar.ui.z zVar2 = taskBarContainer3.f172497d;
                        if (zVar2 != null ? zVar2.h() : false) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onCustomConfigurationChanged closeHeader");
                            com.tencent.mm.plugin.taskbar.ui.z zVar3 = taskBarView.f172526f2.f172497d;
                            if (zVar3 != null) {
                                zVar3.b(0L, 0, true);
                            }
                        }
                    }
                    java.lang.Runnable runnable2 = taskBarView.Y2;
                    taskBarView.removeCallbacks(runnable2);
                    taskBarView.post(runnable2);
                }
            }
        }
        hh4.a aVar = this.f207331y;
        if (aVar != null) {
            aVar.b(true);
        }
        java.lang.Runnable runnable3 = this.A;
        if (runnable3 != null) {
            removeCallbacks(runnable3);
        }
        com.tencent.mm.ui.conversation.e3 e3Var = new com.tencent.mm.ui.conversation.e3(this, configuration);
        this.A = e3Var;
        postDelayed(e3Var, 800L);
        this.f207330x = false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.sdk.event.IListener iListener = this.N;
        if (iListener != null) {
            iListener.dead();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f207317i == null || getFirstVisiblePosition() != 0) {
            return;
        }
        ((com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) this.f207317i).f172498e.getClass();
        if (((android.widget.RelativeLayout) this.f207317i).getBottom() <= 6 || this.f207320o < 30) {
            return;
        }
        android.graphics.Paint.Style style = android.graphics.Paint.Style.FILL;
        android.graphics.Paint paint = this.f207321p;
        paint.setStyle(style);
        paint.setColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478643cz));
        paint.setAlpha(!s() ? 0 : this.f207320o);
        canvas.drawRect(this.f207317i.getBackUpFooterRect().left, this.f207317i.getBackUpFooterRect().top + this.G, this.f207317i.getBackUpFooterRect().right, this.f207317i.getBackUpFooterRect().bottom, paint);
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        try {
            if (this.S && !r() && getAdapter() != null && getAdapter().getCount() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[onLayout] pre-set LAYOUT_SET_SELECTION for first layout");
                super.setSelectionFromTop(1, this.f207325s);
            }
            super.onLayout(z17, i17, i18, i19, i27);
            boolean r17 = r();
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[onLayout] changed:%s, isHeaderOpen: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(r17));
            getRealCount();
            hashCode();
            if (!this.S && z17 && !r17) {
                setSelection(1);
                post(new com.tencent.mm.ui.conversation.l3(this));
            }
            if (!z17 && (this.R >= 16 || getRealCount() == this.R)) {
                h(true);
                this.R = getRealCount();
                this.S = false;
            }
            h(false);
            this.R = getRealCount();
            this.S = false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConversationListView", e17, "onLayout exception", new java.lang.Object[0]);
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View view, int i17, int i18, int i19, int i27) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.lang.Object obj;
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        int i27;
        java.lang.Object obj2;
        android.widget.LinearLayout linearLayout;
        java.lang.Object obj3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ConversationListView", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (this.f207315g && i17 == 0 && this.H) {
            android.view.View childAt = getChildAt(1);
            if (childAt == null) {
                i27 = (!r() || (obj3 = this.f207317i) == null) ? 0 : ((android.view.View) obj3).getMeasuredHeight() - this.f207325s;
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "computeActionBarTranslation %d", java.lang.Integer.valueOf(i27));
            } else {
                i27 = -((-childAt.getTop()) + ((int) (java.lang.Math.max(i17 - getHeaderViewsCount(), 0) * getResources().getDimension(com.tencent.mm.R.dimen.f479896i9))) + this.f207325s);
            }
            int max = java.lang.Math.max(0, i27);
            this.I = max;
            android.view.View view = this.C;
            if (view != null) {
                float f17 = max;
                view.setTranslationY(f17);
                com.tencent.mm.ui.conversation.o5 o5Var = this.f207319n;
                if (o5Var != null && (linearLayout = o5Var.f207928h) != null) {
                    linearLayout.setTranslationY(f17);
                }
            }
            android.view.View view2 = this.F;
            if (view2 != null) {
                if (max > 0) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/conversation/ConversationListView", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/conversation/ConversationListView", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/ui/conversation/ConversationListView", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/conversation/ConversationListView", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            if (this.f207315g && (obj2 = this.f207317i) != null) {
                float f18 = max * 1.0f;
                ((android.view.View) obj2).getHeight();
                int height = ((android.view.View) this.f207317i).getHeight() - this.f207325s;
                com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = (com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) obj2;
                if (taskBarContainer.K) {
                    android.widget.LinearLayout linearLayout2 = taskBarContainer.f172502i;
                    if (linearLayout2 != null && max > 10) {
                        linearLayout2.setTranslationY(taskBarContainer.getMeasuredHeight() - taskBarContainer.getBottom());
                        float max2 = java.lang.Math.max(java.lang.Math.min(((f18 / height) * 0.39999998f) + 0.6f, 1.0f), 0.6f);
                        taskBarContainer.f172502i.setScaleX(max2);
                        taskBarContainer.f172502i.setScaleY(max2);
                        if (max >= height) {
                            taskBarContainer.K = false;
                        }
                    }
                } else if (max <= 10) {
                    taskBarContainer.K = true;
                }
            }
        } else if (i17 > 0) {
            u();
        }
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f207313e;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i17, i18, i19);
        }
        if (this.f207315g && (rVar = this.f207318m) != null) {
            ((com.tencent.mm.plugin.taskbar.ui.z) rVar).onScroll(absListView, i17, i18, i19);
        }
        if (this.f207315g && i18 > 1 && s() && (obj = this.f207317i) != null) {
            int bottom = ((android.view.View) obj).getBottom() - i65.a.b(getContext(), 56);
            this.f207317i.getBackUpFooterRect().set(0, bottom, getWidth(), getHeight() + bottom);
            this.f207317i.getBackUpFooterRect().toString();
            ((android.view.View) this.f207317i).getTop();
            ((android.view.View) this.f207317i).getBottom();
            this.f207320o = (int) ((((android.view.View) this.f207317i).getBottom() * 255.0f) / ((android.view.View) this.f207317i).getHeight());
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/ConversationListView", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ConversationListView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f207313e;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i17);
        }
        com.tencent.mm.plugin.taskbar.ui.r rVar = this.f207318m;
        if (rVar != null && this.f207315g) {
            ((com.tencent.mm.plugin.taskbar.ui.z) rVar).onScrollStateChanged(absListView, i17);
        }
        if (i17 == 1) {
            fg5.c.f262502b = 0L;
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/ConversationListView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mm.ui.conversation.o5 o5Var = this.f207319n;
        if (o5Var == null || i18 == i27) {
            return;
        }
        o5Var.c(i18, false);
        o5Var.A(true);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ConversationListView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f207315g && (rVar = this.f207318m) != null) {
            ((com.tencent.mm.plugin.taskbar.ui.z) rVar).onTouch(view, motionEvent);
        }
        android.view.View.OnTouchListener onTouchListener = this.f207314f;
        boolean onTouch = onTouchListener != null ? false | onTouchListener.onTouch(view, motionEvent) : false;
        yj0.a.i(onTouch, this, "com/tencent/mm/ui/conversation/ConversationListView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }

    public final void p(int i17, int i18, int i19) {
        if (i17 == 0) {
            super.smoothScrollToPositionFromTop(getFirstHeaderVisible(), i18 + this.f207325s, i19);
        } else {
            super.smoothScrollToPositionFromTop(i17, i18 + this.f207325s, i19);
        }
    }

    public final void q(android.content.Context context) {
        android.graphics.Paint paint = this.f207321p;
        paint.setAlpha(255);
        paint.setTextSize(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479882hv));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.L = paint2;
        paint2.setColor(-16777216);
        int color = getResources().getColor(com.tencent.mm.R.color.FG_3);
        android.graphics.Paint paint3 = this.f207323q;
        paint3.setColor(color);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setStrokeWidth(getResources().getDimension(com.tencent.mm.R.dimen.f479638bd));
        super.setOnScrollListener(this);
        super.setOnTouchListener(this);
        setOverScrollMode(2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "HeaderContainer new, ConversationListView: %d", java.lang.Integer.valueOf(hashCode()));
        A(false);
        addFooterView(getEmptyFooter());
        this.f207329w = (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479627b2) * i65.a.m(getContext()));
        this.f207326t = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479896i9);
        this.f207327u = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479872hl);
        this.f207325s = com.tencent.mm.ui.bl.a(getContext()) + com.tencent.mm.ui.bl.h(getContext());
        setWillNotDraw(false);
    }

    public boolean r() {
        return s() && this.f207330x;
    }

    @Override // android.widget.ListView
    public boolean removeHeaderView(android.view.View view) {
        java.util.LinkedList linkedList;
        int i17 = 0;
        while (true) {
            linkedList = this.f207312d;
            if (i17 >= linkedList.size()) {
                i17 = -1;
                break;
            }
            android.widget.ListView.FixedViewInfo fixedViewInfo = (android.widget.ListView.FixedViewInfo) linkedList.get(i17);
            if (fixedViewInfo != null && fixedViewInfo.view == view) {
                break;
            }
            i17++;
        }
        if (i17 != -1) {
            linkedList.remove(i17);
        }
        return super.removeHeaderView(view);
    }

    public boolean s() {
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        if (this.f207317i == null || (rVar = this.f207318m) == null) {
            return false;
        }
        return ((com.tencent.mm.plugin.taskbar.ui.z) rVar).h();
    }

    public void setActionBarUpdateCallback(hh4.a aVar) {
        com.tencent.mm.plugin.taskbar.ui.r rVar = this.f207318m;
        if (rVar != null) {
            this.f207331y = aVar;
            ((com.tencent.mm.plugin.taskbar.ui.z) rVar).f172771o = new com.tencent.mm.ui.conversation.g3(this, aVar);
        }
    }

    public void setActivity(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity) {
        this.f207328v = mMFragmentActivity;
        com.tencent.mm.plugin.taskbar.ui.s sVar = this.f207317i;
        if (sVar != null) {
            sVar.setActivity(mMFragmentActivity);
        }
    }

    public void setFoldBanner(android.view.View view) {
        com.tencent.mm.plugin.taskbar.ui.s sVar = this.f207317i;
        if (sVar != null) {
            sVar.setFoldBanner(view);
        }
    }

    public void setFoldHelper(com.tencent.mm.ui.conversation.o5 o5Var) {
        this.f207319n = o5Var;
    }

    public void setHighLightChildNew(int i17) {
        this.M = true;
        if (com.tencent.mm.ui.bk.C()) {
            this.L.setColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        } else {
            this.L.setColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[newStyle] setfalse" + this.M);
        int max = java.lang.Math.max(0, i17);
        android.view.View childAt = getChildAt(max);
        if (childAt == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConversationListView", "null == view index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        if (childAt.getBottom() - childAt.getTop() <= 0) {
            childAt = getChildAt(getHeaderViewsCount() + max);
        }
        if (childAt == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConversationListView", "null == view index:%s", java.lang.Integer.valueOf(max + getHeaderViewsCount()));
            return;
        }
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(com.tencent.mm.ui.bk.C() ? android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.08f, 0.08f, 0.08f, 0.08f, 0.08f, 0.0f) : android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f));
        childAt.getGlobalVisibleRect(this.K);
        ofPropertyValuesHolder.addUpdateListener(new com.tencent.mm.ui.conversation.j3(this, childAt));
        ofPropertyValuesHolder.addListener(new com.tencent.mm.ui.conversation.k3(this));
        ofPropertyValuesHolder.setDuration(1150L);
        ofPropertyValuesHolder.start();
    }

    public void setIsCurrentMainUI(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "setIsCurrentMainUI: %b", java.lang.Boolean.valueOf(z17));
        this.H = z17;
        com.tencent.mm.plugin.taskbar.ui.r rVar = this.f207318m;
        if (rVar != null) {
            com.tencent.mm.plugin.taskbar.ui.z zVar = (com.tencent.mm.plugin.taskbar.ui.z) rVar;
            zVar.Y = z17;
            if (z17 || !zVar.N) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "setIsCurrentMainUI and header open, close");
            zVar.b(0L, 0, true);
        }
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f207322p0 = onItemClickListener;
        super.setOnItemClickListener(new com.tencent.mm.ui.conversation.d3(this));
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.W = onItemLongClickListener;
        super.setOnItemLongClickListener(new com.tencent.mm.ui.conversation.o3(this));
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onScrollListener) {
        this.f207313e = onScrollListener;
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.f207314f = onTouchListener;
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public void setSelection(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[setSelection] position:%s, scrollOffset: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f207325s));
        if (i17 == 0) {
            super.setSelectionFromTop(getFirstHeaderVisible(), this.f207325s);
        } else {
            super.setSelectionFromTop(i17, this.f207325s);
        }
    }

    @Override // android.widget.AbsListView
    public void setSelectionFromTop(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[setSelectionFromTop] position:%s, scrollOffset: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.setSelectionFromTop(i17, i18);
    }

    public void setStatusBarMaskView(android.view.View view) {
        this.B = view;
        com.tencent.mm.plugin.taskbar.ui.r rVar = this.f207318m;
        if (rVar != null) {
            ((com.tencent.mm.plugin.taskbar.ui.z) rVar).f172775q = view;
        }
    }

    public void setonDispatchTouchEventListener(android.view.View.OnTouchListener onTouchListener) {
        this.Q = onTouchListener;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void smoothScrollToPosition(final int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[smoothScrollToPosition] position:%s", java.lang.Integer.valueOf(i17));
        if (t(i17)) {
            post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.conversation.ConversationListView$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i18 = com.tencent.mm.ui.conversation.ConversationListView.f207310x0;
                    com.tencent.mm.ui.conversation.ConversationListView.this.k(i17);
                }
            });
        } else {
            k(i17);
        }
    }

    @Override // android.widget.AbsListView
    public void smoothScrollToPositionFromTop(final int i17, final int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[smoothScrollToPositionFromTop] position:%s offset:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (t(i17)) {
            post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.conversation.ConversationListView$$b
                @Override // java.lang.Runnable
                public final void run() {
                    int i19 = com.tencent.mm.ui.conversation.ConversationListView.f207310x0;
                    com.tencent.mm.ui.conversation.ConversationListView.this.l(i17, i18);
                }
            });
        } else {
            l(i17, i18);
        }
    }

    public final boolean t(int i17) {
        int firstVisiblePosition = getFirstVisiblePosition();
        if (i17 - getLastVisiblePosition() > 50) {
            super.setSelection(i17 - 50);
            return true;
        }
        if (firstVisiblePosition - i17 <= 50) {
            return false;
        }
        super.setSelection(i17 + 50);
        return true;
    }

    public final void u() {
        android.view.View view = this.C;
        if (view != null) {
            view.setTranslationY(0.0f);
            if (this.C.getVisibility() != 0) {
                android.view.View view2 = this.C;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/conversation/ConversationListView", "resetActionBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/conversation/ConversationListView", "resetActionBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f207331y != null) {
            if (com.tencent.mm.ui.bk.C()) {
                int color = getResources().getColor(com.tencent.mm.R.color.by);
                this.f207331y.c(0.0f, color, color);
                this.f207331y.a(0.0f, getResources().getColor(com.tencent.mm.R.color.f478861j7), 0);
            } else {
                int color2 = getResources().getColor(com.tencent.mm.R.color.f478599bx);
                this.f207331y.c(0.0f, color2, color2);
                this.f207331y.a(0.0f, getResources().getColor(com.tencent.mm.R.color.a07), 0);
            }
        }
    }

    public final void v(int i17, boolean z17) {
        android.content.SharedPreferences.Editor edit;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "saveTopMargin topMargin: %d, needRead: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        if (d17 == null || (edit = d17.edit()) == null) {
            return;
        }
        edit.putBoolean("Main_need_read_top_margin", z17);
        edit.putInt("Main_top_marign", i17);
        edit.apply();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "saveTopMargin success");
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.q
    public void w(int i17) {
        o(i17, 0);
    }

    public final void x(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "initActionBarView statusBarHeight: %d, isInMultiWindowMode: %b, target: %d, actionBarTop: %d, actionBarHeight: %d", java.lang.Integer.valueOf(this.E), java.lang.Boolean.valueOf(this.f207311J), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.C.getTop()), java.lang.Integer.valueOf(i18));
        if (i17 >= 0) {
            if (this.f207311J) {
                android.view.View view = this.B;
                if (view != null) {
                    view.getLayoutParams().height = i17;
                }
                android.view.View view2 = this.F;
                if (view2 != null) {
                    view2.getLayoutParams().height = i17;
                }
            } else {
                android.view.View view3 = this.B;
                if (view3 != null) {
                    view3.getLayoutParams().height = this.E + (this.f207315g ? 0 : i18);
                }
                android.view.View view4 = this.F;
                if (view4 != null) {
                    view4.getLayoutParams().height = this.E + (this.f207315g ? 0 : i18);
                }
            }
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                if (this.f207311J) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams).topMargin = 0;
                } else {
                    android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                    if (this.f207315g) {
                        i18 = 0;
                    }
                    layoutParams2.topMargin = i18;
                }
            }
            B();
        }
    }

    public final void y() {
        boolean z17;
        if (this.C == null) {
            android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.f482435ei);
            this.C = findViewById;
            if (findViewById == null) {
                return;
            } else {
                findViewById.addOnLayoutChangeListener(this.P);
            }
        }
        if (this.F == null) {
            this.F = getRootView().findViewById(com.tencent.mm.R.id.og9);
        }
        if (this.f207311J && com.tencent.mm.ui.LauncherUI.getInstance() != null) {
            boolean isInMultiWindowMode = com.tencent.mm.ui.LauncherUI.getInstance().isInMultiWindowMode();
            this.f207311J = isInMultiWindowMode;
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "initActionBarView check multiWindowMode %b", java.lang.Boolean.valueOf(isInMultiWindowMode));
        }
        int a17 = o25.n1.a(getContext());
        int i17 = this.E;
        if (i17 == 0 || !(this.f207311J || this.C.getTop() == this.E || this.C.getTop() == 0)) {
            this.E = this.C.getTop();
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17 || this.f207311J) {
            int top = this.C.getTop();
            this.E = top;
            if (top <= 0 && !this.f207311J) {
                this.E = com.tencent.mm.ui.bl.h(getContext());
            }
            x(this.E, a17);
            v(this.E, false);
        } else {
            post(new com.tencent.mm.ui.conversation.i3(this, a17));
        }
        if (this.E != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "statusBar height changed old:%d new:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.E));
            h(false);
        }
    }

    public final void z(float f17, int i17, int i18) {
        hh4.a aVar = this.f207331y;
        if (aVar != null) {
            aVar.a(f17, i17, 0);
            this.f207331y.c(f17, i18, i18);
        }
    }

    @Override // android.widget.AbsListView
    public void smoothScrollToPositionFromTop(final int i17, final int i18, final int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "[smoothScrollToPositionFromTop] position:%s offset:%s duration:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (t(i17)) {
            post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.conversation.ConversationListView$$c
                @Override // java.lang.Runnable
                public final void run() {
                    int i27 = com.tencent.mm.ui.conversation.ConversationListView.f207310x0;
                    com.tencent.mm.ui.conversation.ConversationListView.this.p(i17, i18, i19);
                }
            });
        } else {
            p(i17, i18, i19);
        }
    }

    public ConversationListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f207312d = new java.util.LinkedList();
        this.f207315g = true;
        this.f207316h = false;
        this.f207321p = new android.graphics.Paint(1);
        this.f207323q = new android.graphics.Paint(1);
        this.f207326t = 0;
        this.f207327u = 0;
        this.f207329w = 0;
        this.f207330x = false;
        this.f207331y = null;
        this.f207332z = null;
        this.A = null;
        this.E = 0;
        this.G = i65.a.b(getContext(), 56);
        this.H = true;
        this.I = 0;
        this.f207311J = false;
        this.K = new android.graphics.Rect();
        this.M = false;
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MultiWindowModeChangedEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.conversation.ConversationListView.1
            {
                this.__eventId = 1571206658;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MultiWindowModeChangedEvent multiWindowModeChangedEvent) {
                com.tencent.mm.autogen.events.MultiWindowModeChangedEvent multiWindowModeChangedEvent2 = multiWindowModeChangedEvent;
                com.tencent.mm.ui.conversation.ConversationListView conversationListView = com.tencent.mm.ui.conversation.ConversationListView.this;
                boolean z17 = conversationListView.f207311J;
                boolean z18 = multiWindowModeChangedEvent2.f54508g.f6682a;
                if (z17 == z18) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "MultiWindowModeChanged: %b", java.lang.Boolean.valueOf(z18));
                conversationListView.f207311J = multiWindowModeChangedEvent2.f54508g.f6682a;
                conversationListView.y();
                com.tencent.mm.plugin.taskbar.ui.s sVar = conversationListView.f207317i;
                if (sVar == null) {
                    return false;
                }
                ((com.tencent.mm.plugin.taskbar.ui.TaskBarContainer) sVar).e(conversationListView.f207311J);
                return false;
            }
        };
        this.P = new com.tencent.mm.ui.conversation.h3(this);
        this.Q = null;
        this.S = true;
        this.V = false;
        q(context);
    }
}
