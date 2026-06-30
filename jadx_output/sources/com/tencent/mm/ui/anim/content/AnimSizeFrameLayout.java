package com.tencent.mm.ui.anim.content;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/ui/anim/content/AnimSizeFrameLayout;", "Landroid/widget/FrameLayout;", "Lqa5/l;", "d", "Lqa5/l;", "getSizeAnimController", "()Lqa5/l;", "sizeAnimController", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AnimSizeFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final qa5.l sizeAnimController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimSizeFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        qa5.l lVar = new qa5.l(this);
        lVar.f361127c = true;
        this.sizeAnimController = lVar;
    }

    public final qa5.l getSizeAnimController() {
        return this.sizeAnimController;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.sizeAnimController.d(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        qa5.l lVar = this.sizeAnimController;
        jz5.l f17 = lVar.f(i17, i18);
        if (f17 != null) {
            setMeasuredDimension(((java.lang.Number) f17.f302833d).intValue(), ((java.lang.Number) f17.f302834e).intValue());
            return;
        }
        super.onMeasure(i17, i18);
        jz5.l e17 = lVar.e(i17, i18);
        if (e17 != null) {
            setMeasuredDimension(((java.lang.Number) e17.f302833d).intValue(), ((java.lang.Number) e17.f302834e).intValue());
        }
    }
}
