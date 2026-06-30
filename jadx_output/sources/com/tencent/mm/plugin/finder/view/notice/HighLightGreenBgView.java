package com.tencent.mm.plugin.finder.view.notice;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HighLightGreenBgView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f132727d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f132728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighLightGreenBgView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132728e = android.view.View.inflate(context, com.tencent.mm.R.layout.b0f, this).findViewById(com.tencent.mm.R.id.agx);
    }

    public final void a() {
        kotlinx.coroutines.r2 r2Var = this.f132727d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        android.view.View view = this.f132728e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView", "resetFlashing", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView", "resetFlashing", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
