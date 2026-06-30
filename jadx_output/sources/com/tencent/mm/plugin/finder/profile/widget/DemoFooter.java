package com.tencent.mm.plugin.finder.profile.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/widget/DemoFooter;", "Landroid/widget/RelativeLayout;", "Lon5/c;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class DemoFooter extends android.widget.RelativeLayout implements on5.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f124456d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f124457e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f124458f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f124459g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f124460h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f124461i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f124462m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f124463n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f124464o;

    /* renamed from: p, reason: collision with root package name */
    public final int f124465p;

    public DemoFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f124465p = 500;
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.b6t, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m68);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f124456d = textView;
        this.f124457e = "上拉加载更多";
        this.f124458f = "释放立即加载";
        this.f124459g = "正在加载…";
        this.f124460h = "等待头部刷新完成…";
        this.f124461i = "加载完成";
        this.f124462m = "加载失败";
        this.f124463n = "没有更多数据了";
        textView.setText(isInEditMode() ? "正在加载…" : "上拉加载更多");
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        kotlin.jvm.internal.o.g(kernel, "kernel");
    }

    @Override // on5.c
    public boolean b(boolean z17) {
        if (this.f124464o == z17) {
            return true;
        }
        this.f124464o = z17;
        android.widget.TextView textView = this.f124456d;
        if (z17) {
            textView.setText(this.f124463n);
            return true;
        }
        textView.setText(this.f124457e);
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
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        kotlin.jvm.internal.o.g(oldState, "oldState");
        kotlin.jvm.internal.o.g(newState, "newState");
        if (this.f124464o) {
            return;
        }
        int ordinal = newState.ordinal();
        android.widget.TextView textView = this.f124456d;
        if (ordinal == 1 || ordinal == 2) {
            textView.setText(this.f124459g);
            return;
        }
        java.lang.String str = this.f124457e;
        if (ordinal == 3) {
            textView.setText(str);
            return;
        }
        if (ordinal == 7) {
            textView.setText(str);
        } else if (ordinal == 10) {
            textView.setText(this.f124460h);
        } else {
            if (ordinal != 11) {
                return;
            }
            textView.setText(this.f124458f);
        }
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
        if (this.f124464o) {
            return 0;
        }
        this.f124456d.setText(z17 ? this.f124461i : this.f124462m);
        return this.f124465p;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
    }
}
