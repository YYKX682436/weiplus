package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public abstract class fd implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMListPopupWindow f210423d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f210424e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f210425f;

    /* renamed from: g, reason: collision with root package name */
    public final int f210426g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.BaseAdapter f210427h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewTreeObserver f210428i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f210429m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f210430n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f210431o = com.tencent.mm.R.style.f494150fi;

    /* renamed from: p, reason: collision with root package name */
    public boolean f210432p = false;

    public fd(android.content.Context context) {
        this.f210424e = context;
        android.content.res.Resources resources = context.getResources();
        this.f210426g = java.lang.Math.min((resources.getDisplayMetrics().widthPixels * 4) / 5, resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479900id));
        if (context instanceof android.app.Activity) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView();
            if (viewGroup.getChildCount() > 0) {
                this.f210425f = viewGroup.getChildAt(0);
            } else {
                this.f210425f = viewGroup;
            }
        }
        com.tencent.mm.sdk.platformtools.j.d(context, 1.0f);
        resources.getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
        resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479626b1);
        com.tencent.mm.sdk.platformtools.j.d(context, 36.0f);
        this.f210427h = b();
    }

    public void a() {
        if (c()) {
            this.f210423d.a();
        }
    }

    public abstract android.widget.BaseAdapter b();

    public boolean c() {
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f210423d;
        return mMListPopupWindow != null && mMListPopupWindow.f197477g.isShowing();
    }

    public boolean d(int i17) {
        int d17;
        android.graphics.Rect rect = new android.graphics.Rect();
        android.content.Context context = this.f210424e;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            d17 = ((androidx.appcompat.app.AppCompatActivity) context).getSupportActionBar().l();
        } else {
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            d17 = displayMetrics.widthPixels > displayMetrics.heightPixels ? com.tencent.mm.sdk.platformtools.j.d(context, 40.0f) : com.tencent.mm.sdk.platformtools.j.d(context, 49.0f);
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int height = activity.getWindow().getDecorView().getHeight();
            int[] iArr = new int[2];
            activity.getWindow().getDecorView().getLocationOnScreen(iArr);
            d17 = (height - rect.height() < 0 || iArr[1] <= 200) ? d17 + rect.top : d17 + (height - rect.height());
        }
        android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        this.f210432p = displayMetrics2.widthPixels > displayMetrics2.heightPixels;
        if (this.f210423d == null) {
            this.f210423d = new com.tencent.mm.ui.base.MMListPopupWindow(context, null, 0);
        }
        this.f210423d.f197477g.setOnDismissListener(this);
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f210423d;
        mMListPopupWindow.f197488r = this;
        android.widget.BaseAdapter baseAdapter = this.f210427h;
        mMListPopupWindow.b(baseAdapter);
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow2 = this.f210423d;
        mMListPopupWindow2.f197491u = true;
        mMListPopupWindow2.f197477g.setFocusable(true);
        this.f210423d.f197477g.setBackgroundDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.ccd));
        this.f210423d.f197477g.setAnimationStyle(this.f210431o);
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow3 = this.f210423d;
        mMListPopupWindow3.f197482l = i17;
        android.view.View view = this.f210425f;
        mMListPopupWindow3.f197487q = view;
        if (view != null) {
            boolean z17 = this.f210428i == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f210428i = viewTreeObserver;
            if (z17) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
        }
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow4 = this.f210423d;
        mMListPopupWindow4.f197483m = d17;
        mMListPopupWindow4.f197484n = true;
        mMListPopupWindow4.f197492v = this.f210430n;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = baseAdapter.getCount();
        android.view.View view2 = null;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < count; i27++) {
            int itemViewType = baseAdapter.getItemViewType(i27);
            if (itemViewType != i19) {
                view2 = null;
                i19 = itemViewType;
            }
            if (this.f210429m == null) {
                this.f210429m = new android.widget.FrameLayout(context);
            }
            view2 = baseAdapter.getView(i27, view2, this.f210429m);
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            i18 = java.lang.Math.max(i18, view2.getMeasuredWidth());
        }
        mMListPopupWindow4.c(java.lang.Math.min(i18, this.f210426g));
        this.f210423d.f197477g.setInputMethodMode(2);
        this.f210423d.d();
        this.f210423d.f197479i.setOnKeyListener(this);
        this.f210423d.f197479i.setSelector(new android.graphics.drawable.ColorDrawable(context.getResources().getColor(com.tencent.mm.R.color.a9e)));
        this.f210423d.f197479i.setDividerHeight(0);
        this.f210423d.f197479i.setVerticalScrollBarEnabled(true);
        this.f210423d.f197479i.setHorizontalScrollBarEnabled(false);
        return true;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.view.ViewTreeObserver viewTreeObserver = this.f210428i;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f210428i = this.f210425f.getViewTreeObserver();
            }
            this.f210428i.removeGlobalOnLayoutListener(this);
            this.f210428i = null;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        c();
        android.view.View view = this.f210425f;
        view.isShown();
        if (c()) {
            if (!view.isShown()) {
                a();
                return;
            }
            if (c()) {
                boolean z17 = this.f210432p;
                android.util.DisplayMetrics displayMetrics = this.f210424e.getResources().getDisplayMetrics();
                if (z17 != (displayMetrics.widthPixels > displayMetrics.heightPixels)) {
                    this.f210423d.a();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/SubMenuHelperBase", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (keyEvent.getAction() != 1 || i17 != 82) {
            yj0.a.i(false, this, "com/tencent/mm/ui/tools/SubMenuHelperBase", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        a();
        yj0.a.i(true, this, "com/tencent/mm/ui/tools/SubMenuHelperBase", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return true;
    }
}
