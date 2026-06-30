package com.tencent.mm.plugin.finder.ui.fav;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB%\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001fR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter;", "Landroid/widget/RelativeLayout;", "Lon5/c;", "", "Lso2/j5;", "e", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "", "f", "getAvailiableList", "availiableList", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public class FinderGlobalFavLoaderMoreFooter extends android.widget.RelativeLayout implements on5.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f129138d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public java.util.List dataList;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final java.util.List availiableList;

    public FinderGlobalFavLoaderMoreFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        kotlin.jvm.internal.o.g(kernel, "kernel");
    }

    @Override // on5.c
    public boolean b(boolean z17) {
        if (this.f129138d == z17) {
            return true;
        }
        this.f129138d = z17;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ilg);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ilh);
        int i17 = 0;
        if (!z17) {
            if (findViewById2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById == null) {
                return true;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.dataList)) {
            if (findViewById == null) {
                return true;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.List list = this.dataList;
        if (list != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (this.availiableList.contains(java.lang.Integer.valueOf(((so2.j5) obj).h()))) {
                    arrayList6.add(obj);
                }
            }
            i17 = arrayList6.size();
        }
        android.widget.TextView textView = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.bdz) : null;
        if (textView == null) {
            return true;
        }
        textView.setText(j(i17));
        return true;
    }

    @Override // on5.g
    public void c(on5.f refreshLayout, int i17, int i18) {
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
    }

    @Override // on5.g
    public void d(float f17, int i17, int i18) {
    }

    @Override // on5.g
    public void f(on5.f refreshLayout, int i17, int i18) {
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
    }

    @Override // qn5.e
    public void g(on5.f refreshLayout, sn5.b oldState, sn5.b newState) {
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        kotlin.jvm.internal.o.g(oldState, "oldState");
        kotlin.jvm.internal.o.g(newState, "newState");
        if (this.f129138d) {
            return;
        }
        if ((newState == sn5.b.f410156o || newState == sn5.b.f410155n) && (findViewById = findViewById(com.tencent.mm.R.id.ilh)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "onStateChanged", "(Lcom/tencent/mm/view/refreshLayout/interfaces/IRefreshLayout;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "onStateChanged", "(Lcom/tencent/mm/view/refreshLayout/interfaces/IRefreshLayout;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final java.util.List<java.lang.Integer> getAvailiableList() {
        return this.availiableList;
    }

    public final java.util.List<so2.j5> getDataList() {
        return this.dataList;
    }

    @Override // on5.g
    public sn5.c getSpinnerStyle() {
        return sn5.c.f410174b;
    }

    @Override // on5.g
    public android.view.View getView() {
        return this;
    }

    @Override // on5.g
    public int h(on5.f refreshLayout, boolean z17) {
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        return 0;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
    }

    public java.lang.String j(int i17) {
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.d0f, java.lang.Integer.valueOf(i17));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void k() {
        int i17;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ilg);
        java.util.List list = this.dataList;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (this.availiableList.contains(java.lang.Integer.valueOf(((so2.j5) obj).h()))) {
                    arrayList.add(obj);
                }
            }
            i17 = arrayList.size();
        } else {
            i17 = 0;
        }
        android.widget.TextView textView = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.bdz) : null;
        if (textView == null) {
            return;
        }
        textView.setText(j(i17));
    }

    public final void setDataList(java.util.List<? extends so2.j5> list) {
        this.dataList = list;
    }

    public FinderGlobalFavLoaderMoreFooter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.availiableList = kz5.c0.i(3002, 4, 9, 3001, 2, -3, -5, -7, 10002);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, li0.a.f318750d);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            android.view.View.inflate(getContext(), resourceId, this);
        }
        obtainStyledAttributes.recycle();
    }
}
