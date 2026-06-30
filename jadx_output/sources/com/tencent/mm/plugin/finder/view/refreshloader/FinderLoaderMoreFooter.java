package com.tencent.mm.plugin.finder.view.refreshloader;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/refreshloader/FinderLoaderMoreFooter;", "Landroid/widget/RelativeLayout;", "Lon5/c;", "Lkotlin/Function0;", "Ljz5/f0;", "e", "Lyz5/a;", "getOnMoving", "()Lyz5/a;", "setOnMoving", "(Lyz5/a;)V", "onMoving", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderLoaderMoreFooter extends android.widget.RelativeLayout implements on5.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f132949d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.a onMoving;

    public FinderLoaderMoreFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        kotlin.jvm.internal.o.g(kernel, "kernel");
    }

    @Override // on5.c
    public boolean b(boolean z17) {
        if (this.f132949d == z17) {
            return true;
        }
        this.f132949d = z17;
        if (z17) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ili);
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.ilg);
            if (findViewById == null) {
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/refreshloader/FinderLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/refreshloader/FinderLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ili);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ilg);
        if (findViewById2 == null) {
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/refreshloader/FinderLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/refreshloader/FinderLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        android.widget.TextView textView;
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        kotlin.jvm.internal.o.g(oldState, "oldState");
        kotlin.jvm.internal.o.g(newState, "newState");
        if (this.f132949d) {
            return;
        }
        sn5.b bVar = sn5.b.f410156o;
        if ((newState == bVar || newState == sn5.b.f410155n) && (textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setVisibility(0);
        }
        if (newState != bVar || (findViewById = findViewById(com.tencent.mm.R.id.ilh)) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/refreshloader/FinderLoaderMoreFooter", "onStateChanged", "(Lcom/tencent/mm/view/refreshLayout/interfaces/IRefreshLayout;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/refreshloader/FinderLoaderMoreFooter", "onStateChanged", "(Lcom/tencent/mm/view/refreshLayout/interfaces/IRefreshLayout;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final yz5.a getOnMoving() {
        return this.onMoving;
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
        yz5.a aVar = this.onMoving;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void j(int i17) {
        removeAllViews();
        android.view.View.inflate(getContext(), i17, this);
    }

    public final void setOnMoving(yz5.a aVar) {
        this.onMoving = aVar;
    }

    public FinderLoaderMoreFooter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, li0.a.f318750d);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            android.view.View.inflate(getContext(), resourceId, this);
        }
        obtainStyledAttributes.recycle();
    }
}
