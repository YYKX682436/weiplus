package com.tencent.mm.plugin.repairer.ui.demo.refresh.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/view/DemoHeader;", "Landroid/widget/LinearLayout;", "Lon5/d;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class DemoHeader extends android.widget.LinearLayout implements on5.d {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f158114d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f158115e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f158116f;

    public DemoHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        j();
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
    public boolean e() {
        return false;
    }

    @Override // on5.g
    public void f(on5.f refreshLayout, int i17, int i18) {
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f158116f;
        if (mMProcessBar != null) {
            mMProcessBar.d();
        } else {
            kotlin.jvm.internal.o.o("mProgressView");
            throw null;
        }
    }

    @Override // qn5.e
    public void g(on5.f refreshLayout, sn5.b oldState, sn5.b newState) {
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        kotlin.jvm.internal.o.g(oldState, "oldState");
        kotlin.jvm.internal.o.g(newState, "newState");
        int ordinal = newState.ordinal();
        if (ordinal == 3 || ordinal == 5) {
            android.widget.TextView textView = this.f158114d;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mHeaderText");
                throw null;
            }
            textView.setText("下拉开始刷新");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f158115e;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("mArrowView");
                throw null;
            }
            weImageView.setVisibility(0);
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f158116f;
            if (mMProcessBar == null) {
                kotlin.jvm.internal.o.o("mProgressView");
                throw null;
            }
            mMProcessBar.setVisibility(8);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f158115e;
            if (weImageView2 != null) {
                weImageView2.animate().rotation(0.0f);
                return;
            } else {
                kotlin.jvm.internal.o.o("mArrowView");
                throw null;
            }
        }
        if (ordinal != 10) {
            if (ordinal != 12) {
                return;
            }
            android.widget.TextView textView2 = this.f158114d;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mHeaderText");
                throw null;
            }
            textView2.setText("释放立即刷新");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f158115e;
            if (weImageView3 != null) {
                weImageView3.animate().rotation(180.0f);
                return;
            } else {
                kotlin.jvm.internal.o.o("mArrowView");
                throw null;
            }
        }
        android.widget.TextView textView3 = this.f158114d;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("mHeaderText");
            throw null;
        }
        textView3.setText("正在刷新");
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = this.f158116f;
        if (mMProcessBar2 == null) {
            kotlin.jvm.internal.o.o("mProgressView");
            throw null;
        }
        mMProcessBar2.setVisibility(0);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f158115e;
        if (weImageView4 != null) {
            weImageView4.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("mArrowView");
            throw null;
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
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f158116f;
        if (mMProcessBar == null) {
            kotlin.jvm.internal.o.o("mProgressView");
            throw null;
        }
        mMProcessBar.d();
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = this.f158116f;
        if (mMProcessBar2 == null) {
            kotlin.jvm.internal.o.o("mProgressView");
            throw null;
        }
        mMProcessBar2.setVisibility(8);
        if (z17) {
            android.widget.TextView textView = this.f158114d;
            if (textView != null) {
                textView.setText("刷新完成");
                return 500;
            }
            kotlin.jvm.internal.o.o("mHeaderText");
            throw null;
        }
        android.widget.TextView textView2 = this.f158114d;
        if (textView2 != null) {
            textView2.setText("刷新失败");
            return 500;
        }
        kotlin.jvm.internal.o.o("mHeaderText");
        throw null;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
    }

    public final void j() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cf7, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.crr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f158114d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.a4s);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f158115e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f485683im4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f158116f = (com.tencent.mm.ui.widget.MMProcessBar) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DemoHeader(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(attrs, "attrs");
        j();
    }
}
