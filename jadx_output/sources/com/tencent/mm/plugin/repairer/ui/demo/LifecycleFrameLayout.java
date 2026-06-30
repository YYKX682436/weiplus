package com.tencent.mm.plugin.repairer.ui.demo;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/LifecycleFrameLayout;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/o;", "getLifecycle", "Lkotlin/Function0;", "Ljz5/f0;", "e", "Lyz5/a;", "getOnRemove", "()Lyz5/a;", "setOnRemove", "(Lyz5/a;)V", "onRemove", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LifecycleFrameLayout extends android.widget.FrameLayout implements androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.b0 f158072d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.a onRemove;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f158072d;
    }

    public final yz5.a getOnRemove() {
        return this.onRemove;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f158072d.f(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.lifecycle.b0 b0Var = this.f158072d;
        b0Var.f(androidx.lifecycle.m.ON_PAUSE);
        b0Var.f(androidx.lifecycle.m.ON_DESTROY);
        yz5.a aVar = this.onRemove;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setOnRemove(yz5.a aVar) {
        this.onRemove = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LifecycleFrameLayout(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r1 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            java.lang.String r6 = "context"
            kotlin.jvm.internal.o.g(r2, r6)
            r1.<init>(r2, r3, r4, r5)
            androidx.lifecycle.b0 r2 = new androidx.lifecycle.b0
            r3 = 1
            r2.<init>(r1, r3)
            r1.f158072d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.repairer.ui.demo.LifecycleFrameLayout.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
    }
}
