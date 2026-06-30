package com.tencent.mm.ui.chatting.gallery.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/view/FullScreenStatusMaskView;", "Landroid/widget/FrameLayout;", "", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "Ljz5/f0;", "setMessage", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FullScreenStatusMaskView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f201512d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f201513e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f201514f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f201515g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f201516h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenStatusMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bdf, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f201512d = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gha);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f201513e = textView;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f487545oy5);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f201514f = findViewById2;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new pc5.a(this));
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.gh_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f201515g = (android.widget.ProgressBar) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.gh9);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f201516h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final void setMessage(java.lang.CharSequence charSequence) {
        this.f201513e.setText(charSequence);
    }
}
