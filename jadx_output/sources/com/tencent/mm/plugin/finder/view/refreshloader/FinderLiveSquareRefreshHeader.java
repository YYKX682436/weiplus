package com.tencent.mm.plugin.finder.view.refreshloader;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB%\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ\u0006\u0010\u0005\u001a\u00020\u0004R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/finder/view/refreshloader/FinderLiveSquareRefreshHeader;", "Landroid/widget/RelativeLayout;", "Lon5/d;", "", "Lcom/tencent/mm/ui/widget/MMProcessBar;", "getLoadingIcon", "Lkotlin/Function0;", "Ljz5/f0;", "f", "Lyz5/a;", "getOnMoving", "()Lyz5/a;", "setOnMoving", "(Lyz5/a;)V", "onMoving", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderLiveSquareRefreshHeader extends android.widget.RelativeLayout implements on5.d, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f132946d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f132947e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.a onMoving;

    public FinderLiveSquareRefreshHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        kotlin.jvm.internal.o.g(kernel, "kernel");
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
        android.widget.TextView textView = this.f132946d;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("headerTips");
            throw null;
        }
    }

    @Override // qn5.e
    public void g(on5.f refreshLayout, sn5.b oldState, sn5.b newState) {
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        kotlin.jvm.internal.o.g(oldState, "oldState");
        kotlin.jvm.internal.o.g(newState, "newState");
        int ordinal = newState.ordinal();
        if (ordinal == 3) {
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f132947e;
            if (mMProcessBar != null) {
                mMProcessBar.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("loadingIcon");
                throw null;
            }
        }
        if (ordinal != 5) {
            return;
        }
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = this.f132947e;
        if (mMProcessBar2 == null) {
            kotlin.jvm.internal.o.o("loadingIcon");
            throw null;
        }
        if (mMProcessBar2.getVisibility() != 0) {
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar3 = this.f132947e;
            if (mMProcessBar3 != null) {
                mMProcessBar3.setVisibility(0);
            } else {
                kotlin.jvm.internal.o.o("loadingIcon");
                throw null;
            }
        }
    }

    public final com.tencent.mm.ui.widget.MMProcessBar getLoadingIcon() {
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f132947e;
        if (mMProcessBar != null) {
            return mMProcessBar;
        }
        kotlin.jvm.internal.o.o("loadingIcon");
        throw null;
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
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f132947e;
        if (mMProcessBar == null) {
            kotlin.jvm.internal.o.o("loadingIcon");
            throw null;
        }
        mMProcessBar.setVisibility(8);
        if (z17) {
            return 0;
        }
        android.widget.TextView textView = this.f132946d;
        if (textView != null) {
            textView.setVisibility(0);
            return 500;
        }
        kotlin.jvm.internal.o.o("headerTips");
        throw null;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
        yz5.a aVar = this.onMoving;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lr6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f132946d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.m6l);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) findViewById2;
        this.f132947e = mMProcessBar;
        mMProcessBar.setVisibility(8);
    }

    public final void setOnMoving(yz5.a aVar) {
        this.onMoving = aVar;
    }

    public FinderLiveSquareRefreshHeader(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f489086b84, this);
    }
}
