package com.tencent.mm.pluginsdk.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/LoadingTipsView;", "Landroid/widget/FrameLayout;", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "Ljz5/f0;", "setTips", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LoadingTipsView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f189773d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f189774e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f189775f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingTipsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final void setTips(java.lang.String str) {
        android.widget.TextView textView;
        if (str == null || (textView = this.f189775f) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LoadingTipsVIew", "showEmptyTips: ");
        android.view.View view = this.f189774e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/LoadingTipsView", "hideLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/LoadingTipsView", "hideLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setTips(getContext().getString(com.tencent.mm.R.string.cep));
    }

    public final void b() {
        android.view.View view = this.f189774e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/LoadingTipsView", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/LoadingTipsView", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LoadingTipsVIew", "showLoadingWithTips: ");
        b();
        setTips(getContext().getString(com.tencent.mm.R.string.m7f));
    }

    public final void d(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mars.xlog.Log.i("MicroMsg.LoadingTipsVIew", "showLoadingWithTips: ");
        b();
        setTips(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingTipsView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dog, this);
        this.f189773d = inflate;
        if (inflate != null) {
            this.f189774e = inflate.findViewById(com.tencent.mm.R.id.imd);
            this.f189775f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oqc);
        }
    }
}
