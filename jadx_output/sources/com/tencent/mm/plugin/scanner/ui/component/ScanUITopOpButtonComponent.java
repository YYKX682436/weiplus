package com.tencent.mm.plugin.scanner.ui.component;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/component/ScanUITopOpButtonComponent;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "onClickListener", "Ljz5/f0;", "setOnCloseClickListener", "setOnCancelClickListener", "setOnMoreClickListener", "", "show", "setShowMoreButton", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class ScanUITopOpButtonComponent extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f159519d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f159520e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f159521f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f159522g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanUITopOpButtonComponent(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(boolean z17) {
        android.widget.ImageView imageView = this.f159522g;
        if (imageView != null) {
            e04.i3.b(imageView, z17, null);
        } else {
            kotlin.jvm.internal.o.o("moreButton");
            throw null;
        }
    }

    public final void b(boolean z17, android.animation.Animator.AnimatorListener animatorListener) {
        if (z17) {
            android.widget.ImageView imageView = this.f159520e;
            if (imageView != null) {
                e04.i3.b(imageView, false, new a04.a(this, animatorListener));
                return;
            } else {
                kotlin.jvm.internal.o.o("closeButton");
                throw null;
            }
        }
        android.widget.TextView textView = this.f159521f;
        if (textView != null) {
            e04.i3.b(textView, false, new a04.b(this, animatorListener));
        } else {
            kotlin.jvm.internal.o.o("cancelButton");
            throw null;
        }
    }

    public final void setOnCancelClickListener(android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        android.widget.TextView textView = this.f159521f;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("cancelButton");
            throw null;
        }
    }

    public final void setOnCloseClickListener(android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        android.widget.ImageView imageView = this.f159520e;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("closeButton");
            throw null;
        }
    }

    public final void setOnMoreClickListener(android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        android.widget.ImageView imageView = this.f159522g;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("moreButton");
            throw null;
        }
    }

    public final void setShowMoreButton(boolean z17) {
        android.widget.ImageView imageView = this.f159522g;
        if (imageView != null) {
            imageView.setVisibility(z17 ? 0 : 8);
        } else {
            kotlin.jvm.internal.o.o("moreButton");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanUITopOpButtonComponent(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489210bp1, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.off);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f159519d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.bz6);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f159520e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.b5j);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f159521f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.jqu);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f159522g = (android.widget.ImageView) findViewById4;
        android.view.View view = this.f159519d;
        if (view != null) {
            view.setPadding(0, com.tencent.mm.ui.bl.h(context), 0, 0);
        } else {
            kotlin.jvm.internal.o.o("buttonContainer");
            throw null;
        }
    }
}
