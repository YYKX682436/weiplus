package com.tencent.mm.ui.base.sortview;

/* loaded from: classes9.dex */
public abstract class BaseSortView extends android.widget.LinearLayout implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.VerticalScrollBar f197863d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f197864e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f197865f;

    /* renamed from: g, reason: collision with root package name */
    public fb5.m f197866g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f197867h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.AdapterView.OnItemLongClickListener f197868i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f197869m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f197870n;

    /* renamed from: o, reason: collision with root package name */
    public int f197871o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f197872p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f197873q;

    /* renamed from: r, reason: collision with root package name */
    public fb5.j f197874r;

    public BaseSortView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197870n = new java.util.ArrayList();
        this.f197866g = new fb5.m(getItemViewCreator());
        b();
        this.f197863d = getScrollBar();
        this.f197864e = getListView();
        this.f197865f = getNoResultView();
        this.f197872p = true;
        d(true);
        this.f197864e.setAdapter((android.widget.ListAdapter) this.f197866g);
        com.tencent.mm.ui.base.VerticalScrollBar verticalScrollBar = this.f197863d;
        if (verticalScrollBar != null) {
            verticalScrollBar.setOnScrollBarTouchListener(this);
        }
        this.f197866g.registerDataSetObserver(new fb5.f(this));
        this.f197864e.setOnItemClickListener(new fb5.g(this));
        this.f197864e.setOnItemLongClickListener(new fb5.h(this));
        this.f197864e.setOnItemSelectedListener(new fb5.i(this));
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) ((java.util.HashMap) this.f197866g.f260895e).get(str), -1);
        if (j17 >= 0) {
            this.f197864e.setSelection(j17);
        }
    }

    public void a(java.lang.String str) {
        boolean z17;
        if (this.f197871o != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseSortView", "Can't doFilter successfully out of the search mode.");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            z17 = false;
        } else {
            arrayList.clear();
            java.util.Iterator it = ((java.util.ArrayList) this.f197870n).iterator();
            while (it.hasNext()) {
                fb5.n nVar = (fb5.n) it.next();
                if (c(str, nVar)) {
                    arrayList.add(nVar);
                }
            }
            z17 = true;
        }
        f(this.f197864e, z17 && arrayList.size() > 0);
        f(this.f197865f, z17 && arrayList.size() <= 0);
        e(arrayList);
    }

    public abstract android.view.View b();

    public abstract boolean c(java.lang.String str, fb5.n nVar);

    public void d(boolean z17) {
        this.f197873q = z17;
        com.tencent.mm.ui.base.VerticalScrollBar verticalScrollBar = this.f197863d;
        if (verticalScrollBar != null) {
            verticalScrollBar.setVisibility(z17 ? 0 : 8);
        }
    }

    public void e(java.util.List list) {
        java.util.List list2;
        if (this.f197871o == 0 && (list2 = this.f197870n) != list) {
            ((java.util.ArrayList) list2).clear();
            if (list != null) {
                ((java.util.ArrayList) this.f197870n).addAll(list);
            }
        }
        this.f197866g.c(list);
    }

    public void f(android.view.View view, boolean z17) {
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/sortview/BaseSortView", "updateViewStatus", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/sortview/BaseSortView", "updateViewStatus", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public fb5.m getAdapter() {
        return this.f197866g;
    }

    public fb5.j getDataSetObserver() {
        return this.f197874r;
    }

    public java.util.List<fb5.n> getDatas() {
        return this.f197866g.f260894d;
    }

    public abstract fb5.l getItemViewCreator();

    public abstract android.widget.ListView getListView();

    public int getMode() {
        return this.f197871o;
    }

    public abstract android.view.View getNoResultView();

    public android.widget.AdapterView.OnItemClickListener getOnItemClickListener() {
        return this.f197867h;
    }

    public android.widget.AdapterView.OnItemLongClickListener getOnItemLongClickListener() {
        return this.f197868i;
    }

    public android.widget.AdapterView.OnItemSelectedListener getOnItemSelectedListener() {
        return this.f197869m;
    }

    public abstract com.tencent.mm.ui.base.VerticalScrollBar getScrollBar();

    public void setDataSetObserver(fb5.j jVar) {
        this.f197874r = jVar;
    }

    public void setMode(int i17) {
        if (i17 == 1) {
            this.f197871o = 1;
            a("");
        } else {
            this.f197871o = 0;
            f(this.f197865f, false);
            f(this.f197864e, true);
            e(this.f197870n);
        }
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f197867h = onItemClickListener;
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f197868i = onItemLongClickListener;
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f197869m = onItemSelectedListener;
    }
}
