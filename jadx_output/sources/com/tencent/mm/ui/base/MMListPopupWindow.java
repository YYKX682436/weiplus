package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class MMListPopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final db5.d4 f197471a;

    /* renamed from: b, reason: collision with root package name */
    public final db5.c4 f197472b;

    /* renamed from: c, reason: collision with root package name */
    public final db5.b4 f197473c;

    /* renamed from: d, reason: collision with root package name */
    public final db5.z3 f197474d;

    /* renamed from: e, reason: collision with root package name */
    public final int f197475e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f197476f;

    /* renamed from: g, reason: collision with root package name */
    public final db5.d5 f197477g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListAdapter f197478h;

    /* renamed from: i, reason: collision with root package name */
    public db5.y3 f197479i;

    /* renamed from: j, reason: collision with root package name */
    public int f197480j;

    /* renamed from: k, reason: collision with root package name */
    public int f197481k;

    /* renamed from: l, reason: collision with root package name */
    public int f197482l;

    /* renamed from: m, reason: collision with root package name */
    public int f197483m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f197484n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f197485o;

    /* renamed from: p, reason: collision with root package name */
    public android.database.DataSetObserver f197486p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f197487q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f197488r;

    /* renamed from: s, reason: collision with root package name */
    public final android.os.Handler f197489s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Rect f197490t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f197491u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f197492v;

    public MMListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478316gj);
    }

    public void a() {
        db5.d5 d5Var = this.f197477g;
        d5Var.dismiss();
        d5Var.setContentView(null);
        this.f197479i = null;
        this.f197489s.removeCallbacks(this.f197471a);
    }

    public void b(android.widget.ListAdapter listAdapter) {
        android.database.DataSetObserver dataSetObserver = this.f197486p;
        if (dataSetObserver == null) {
            this.f197486p = new db5.a4(this, null);
        } else {
            android.widget.ListAdapter listAdapter2 = this.f197478h;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f197478h = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f197486p);
        }
        db5.y3 y3Var = this.f197479i;
        if (y3Var != null) {
            y3Var.setAdapter(this.f197478h);
        }
    }

    public void c(int i17) {
        android.graphics.drawable.Drawable background = this.f197477g.getBackground();
        if (background == null) {
            this.f197481k = i17;
            return;
        }
        android.graphics.Rect rect = this.f197490t;
        background.getPadding(rect);
        this.f197481k = rect.left + rect.right + i17;
    }

    public void d() {
        int i17;
        android.view.View view;
        int i18;
        int i19;
        int i27;
        db5.y3 y3Var;
        db5.y3 y3Var2 = this.f197479i;
        db5.d5 d5Var = this.f197477g;
        android.content.Context context = this.f197476f;
        if (y3Var2 == null) {
            db5.y3 y3Var3 = new db5.y3(context, !this.f197491u, null);
            this.f197479i = y3Var3;
            y3Var3.setAdapter(this.f197478h);
            this.f197479i.setOnItemClickListener(this.f197488r);
            this.f197479i.setFocusable(true);
            this.f197479i.setFocusableInTouchMode(true);
            this.f197479i.setDivider(null);
            this.f197479i.setDividerHeight(0);
            this.f197479i.setOnItemSelectedListener(new db5.x3(this));
            this.f197479i.setOnScrollListener(this.f197473c);
            d5Var.setContentView(this.f197479i);
        }
        android.graphics.drawable.Drawable background = d5Var.getBackground();
        android.graphics.Rect rect = this.f197490t;
        if (background != null) {
            background.getPadding(rect);
            int i28 = rect.top;
            i17 = rect.bottom + i28;
            if (!this.f197484n) {
                this.f197483m = -i28;
            }
        } else {
            rect.setEmpty();
            i17 = 0;
        }
        boolean z17 = d5Var.getInputMethodMode() == 2;
        android.view.View view2 = this.f197487q;
        int i29 = this.f197483m;
        android.graphics.Rect rect2 = new android.graphics.Rect();
        view2.getWindowVisibleDisplayFrame(rect2);
        view2.getLocationOnScreen(new int[2]);
        int i37 = rect2.bottom;
        if (z17) {
            view2.getContext().getResources();
            i37 = com.tencent.mm.ui.dl.d(view2.getContext()).y;
        }
        int i38 = i37 - i29;
        if (d5Var.getBackground() != null) {
            d5Var.getBackground().getPadding(rect);
            i38 -= rect.top + rect.bottom;
        }
        if (this.f197480j != -1) {
            int i39 = this.f197481k;
            int makeMeasureSpec = i39 != -2 ? i39 != -1 ? android.view.View.MeasureSpec.makeMeasureSpec(i39, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            db5.y3 y3Var4 = this.f197479i;
            i38 -= 0;
            int listPaddingTop = y3Var4.getListPaddingTop();
            int listPaddingBottom = y3Var4.getListPaddingBottom();
            int dividerHeight = y3Var4.getDividerHeight();
            android.graphics.drawable.Drawable divider = y3Var4.getDivider();
            android.widget.ListAdapter adapter = y3Var4.getAdapter();
            if (adapter == null) {
                i38 = listPaddingTop + listPaddingBottom;
            } else {
                int i47 = listPaddingTop + listPaddingBottom;
                if (dividerHeight <= 0 || divider == null) {
                    dividerHeight = 0;
                }
                int count = adapter.getCount();
                int i48 = 0;
                int i49 = 0;
                android.view.View view3 = null;
                while (true) {
                    if (i48 >= count) {
                        i38 = i47;
                        break;
                    }
                    int itemViewType = adapter.getItemViewType(i48);
                    if (itemViewType != i49) {
                        i49 = itemViewType;
                        view = null;
                    } else {
                        view = view3;
                    }
                    android.view.View view4 = adapter.getView(i48, view, y3Var4);
                    int i57 = view4 == null ? 0 : view4.getLayoutParams().height;
                    int makeMeasureSpec2 = i57 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i57, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    if (view4 != null) {
                        view4.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    if (i48 > 0) {
                        i47 += dividerHeight;
                    }
                    if (view4 != null) {
                        i47 += view4.getMeasuredHeight();
                    }
                    if (i47 >= i38) {
                        break;
                    }
                    i48++;
                    view3 = view4;
                }
            }
            i17 = i38 > 0 ? i17 + 0 : 0;
        }
        int i58 = i38 + i17;
        boolean z18 = d5Var.getInputMethodMode() == 2;
        if (d5Var.isShowing()) {
            int i59 = this.f197481k;
            if (i59 == -1) {
                i59 = -1;
            } else if (i59 == -2) {
                i59 = this.f197487q.getWidth();
            }
            int i66 = this.f197480j;
            if (i66 == -1) {
                int i67 = z18 ? i58 : -1;
                if (z18) {
                    d5Var.setWindowLayoutMode(this.f197481k == -1 ? -1 : 0, 0);
                } else {
                    d5Var.setWindowLayoutMode(this.f197481k == -1 ? -1 : 0, -1);
                }
                i58 = i67;
            } else if (i66 != -2) {
                i58 = i66;
            }
            d5Var.update(i59, i58);
            d5Var.setOutsideTouchable(!this.f197485o);
            if (this.f197492v) {
                d5Var.showAtLocation(this.f197487q, 17, 0, 0);
                return;
            } else {
                d5Var.showAtLocation(this.f197487q, 53, this.f197482l, this.f197483m);
                return;
            }
        }
        int i68 = this.f197481k;
        if (i68 == -1) {
            i19 = -1;
            i18 = -2;
        } else {
            i18 = -2;
            if (i68 == -2) {
                d5Var.setWidth(this.f197487q.getWidth());
            } else {
                d5Var.setWidth(i68);
            }
            i19 = 0;
        }
        int i69 = this.f197480j;
        if (i69 == -1) {
            i27 = -1;
        } else {
            if (i69 == i18) {
                d5Var.setHeight(i58);
            } else {
                d5Var.setHeight(i69);
            }
            i27 = 0;
        }
        d5Var.setWindowLayoutMode(i19, i27);
        d5Var.setOutsideTouchable(!this.f197485o);
        d5Var.f228318a = this.f197472b;
        if (this.f197492v) {
            d5Var.showAtLocation(this.f197487q, 17, 0, 0);
        } else {
            d5Var.showAtLocation(this.f197487q, 53, this.f197482l, this.f197483m);
        }
        this.f197479i.setSelection(-1);
        if ((!this.f197491u || this.f197479i.isInTouchMode()) && (y3Var = this.f197479i) != null) {
            y3Var.f228579d = true;
            y3Var.requestLayout();
        }
        if (this.f197491u) {
            return;
        }
        this.f197489s.post(this.f197474d);
    }

    public MMListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f197471a = new db5.d4(this, null);
        this.f197472b = new db5.c4(this, null);
        this.f197473c = new db5.b4(this, null);
        this.f197474d = new db5.z3(this, null);
        this.f197475e = Integer.MAX_VALUE;
        this.f197480j = -2;
        this.f197481k = -2;
        this.f197485o = false;
        this.f197489s = new android.os.Handler();
        this.f197490t = new android.graphics.Rect();
        this.f197492v = false;
        this.f197476f = context;
        db5.d5 d5Var = new db5.d5(context);
        this.f197477g = d5Var;
        d5Var.setInputMethodMode(1);
    }
}
