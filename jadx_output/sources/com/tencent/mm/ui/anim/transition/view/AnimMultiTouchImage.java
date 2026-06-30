package com.tencent.mm.ui.anim.transition.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage;", "Lcom/tencent/mm/ui/base/MultiTouchImageView;", "Lya5/a;", "Landroid/graphics/Bitmap;", "bmp", "Ljz5/f0;", "setAnimBitmap", "Landroid/view/View;", "y0", "Landroid/view/View;", "getBindingLayout", "()Landroid/view/View;", "setBindingLayout", "(Landroid/view/View;)V", "bindingLayout", "", "l1", "Z", "isNeedHideBindingAfterSetBitmap", "()Z", "setNeedHideBindingAfterSetBitmap", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class AnimMultiTouchImage extends com.tencent.mm.ui.base.MultiTouchImageView implements ya5.a {

    /* renamed from: l1, reason: collision with root package name and from kotlin metadata */
    public boolean isNeedHideBindingAfterSetBitmap;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    public android.view.View bindingLayout;

    public AnimMultiTouchImage(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final android.view.View getBindingLayout() {
        return this.bindingLayout;
    }

    @Override // ya5.a
    public void k(boolean z17) {
        if (z17) {
            w(true);
        } else if (getDrawable() == null) {
            this.isNeedHideBindingAfterSetBitmap = true;
        } else {
            w(false);
        }
    }

    @Override // ya5.a
    public void q() {
    }

    public final void setAnimBitmap(android.graphics.Bitmap bitmap) {
        setMaxZoomLimit(10.0f);
        setEnableHorLongBmpMode(false);
        int width = bitmap != null ? bitmap.getWidth() : 0;
        int height = bitmap != null ? bitmap.getHeight() : 0;
        boolean z17 = com.tencent.mm.sdk.platformtools.l1.f192817a;
        int i17 = com.tencent.mm.sdk.platformtools.u1.f193003a.f193033a;
        int i18 = (width >= i17 || height >= i17) ? 1 : 0;
        if (getLayerType() != i18) {
            setLayerType(i18, null);
        }
        int width2 = bitmap != null ? bitmap.getWidth() : 0;
        int height2 = bitmap != null ? bitmap.getHeight() : 0;
        this.f197651o = width2;
        this.f197652p = height2;
        setImageBitmap(bitmap);
        requestLayout();
        if (this.isNeedHideBindingAfterSetBitmap) {
            w(false);
        }
    }

    public final void setBindingLayout(android.view.View view) {
        this.bindingLayout = view;
    }

    public final void setNeedHideBindingAfterSetBitmap(boolean z17) {
        this.isNeedHideBindingAfterSetBitmap = z17;
    }

    public final void w(boolean z17) {
        if (!z17) {
            android.view.View view = this.bindingLayout;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        android.view.View view2 = this.bindingLayout;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.bindingLayout;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
