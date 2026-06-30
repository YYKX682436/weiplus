package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveMultiNoticeListFooter;", "Landroid/widget/RelativeLayout;", "Lon5/c;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderLiveMultiNoticeListFooter extends android.widget.RelativeLayout implements on5.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f131198d;

    public FinderLiveMultiNoticeListFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        kotlin.jvm.internal.o.g(kernel, "kernel");
    }

    @Override // on5.c
    public boolean b(boolean z17) {
        if (this.f131198d == z17) {
            return true;
        }
        this.f131198d = z17;
        if (z17) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m68);
            if (textView == null) {
                return true;
            }
            textView.setText(getContext().getString(com.tencent.mm.R.string.doh));
            return true;
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m68);
        if (textView2 == null) {
            return true;
        }
        textView2.setText(getContext().getString(com.tencent.mm.R.string.dof));
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
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        kotlin.jvm.internal.o.g(oldState, "oldState");
        kotlin.jvm.internal.o.g(newState, "newState");
        if (this.f131198d) {
            return;
        }
        if ((newState == sn5.b.f410156o || newState == sn5.b.f410155n) && (textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m68)) != null) {
            textView.setText(getContext().getString(com.tencent.mm.R.string.doi));
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
        if (this.f131198d) {
            return 0;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m68);
        if (textView == null) {
            return 500;
        }
        textView.setText(z17 ? getContext().getString(com.tencent.mm.R.string.doh) : getContext().getString(com.tencent.mm.R.string.dog));
        return 500;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
    }

    public FinderLiveMultiNoticeListFooter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.atg, this);
    }
}
