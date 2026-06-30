package com.tencent.mm.ui.base;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0015\u001a\n \r*\u0004\u0018\u00010\f0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R#\u0010\u0018\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R#\u0010\u001d\u001a\n \r*\u0004\u0018\u00010\u00190\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u001cR#\u0010 \u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010,\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\n¨\u00064"}, d2 = {"Lcom/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto;", "Lcom/tencent/mm/ui/base/MMLimitedClearEditText;", "", "getLayoutId", "", "t", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "enable", "Landroid/view/View;", "kotlin.jvm.PlatformType", "u", "Ljz5/g;", "getPictureLayoutDivider", "()Landroid/view/View;", "pictureLayoutDivider", org.chromium.base.BaseSwitches.V, "getAddPhotoLayout", "addPhotoLayout", "w", "getPreviewPhotoLayout", "previewPhotoLayout", "Landroid/widget/ImageView;", "x", "getPreviewPhotoImg", "()Landroid/widget/ImageView;", "previewPhotoImg", "y", "getPreviewPhotoCloseBtn", "previewPhotoCloseBtn", "Lkotlin/Function1;", "Ljz5/f0;", "z", "Lyz5/l;", "getShowAddPhotoLayoutChangeListener", "()Lyz5/l;", "setShowAddPhotoLayoutChangeListener", "(Lyz5/l;)V", "showAddPhotoLayoutChangeListener", "value", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "isShowAddPhotoLayout", "setShowAddPhotoLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MMLimitedClearEditTextWithPhoto extends com.tencent.mm.ui.base.MMLimitedClearEditText {

    /* renamed from: A, reason: from kotlin metadata */
    public boolean isShowAddPhotoLayout;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean enable;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final jz5.g pictureLayoutDivider;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final jz5.g addPhotoLayout;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final jz5.g previewPhotoLayout;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final jz5.g previewPhotoImg;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final jz5.g previewPhotoCloseBtn;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public yz5.l showAddPhotoLayoutChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMLimitedClearEditTextWithPhoto(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.enable = true;
        this.pictureLayoutDivider = jz5.h.b(new db5.r3(this));
        this.addPhotoLayout = jz5.h.b(new db5.q3(this));
        this.previewPhotoLayout = jz5.h.b(new db5.v3(this));
        this.previewPhotoImg = jz5.h.b(new db5.u3(this));
        this.previewPhotoCloseBtn = jz5.h.b(new db5.t3(this));
        this.isShowAddPhotoLayout = true;
    }

    private final android.view.View getPictureLayoutDivider() {
        return (android.view.View) ((jz5.n) this.pictureLayoutDivider).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getPreviewPhotoCloseBtn() {
        return (android.view.View) ((jz5.n) this.previewPhotoCloseBtn).getValue();
    }

    private final android.view.View getPreviewPhotoLayout() {
        return (android.view.View) ((jz5.n) this.previewPhotoLayout).getValue();
    }

    public final void g() {
        android.view.View pictureLayoutDivider = getPictureLayoutDivider();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(pictureLayoutDivider, arrayList.toArray(), "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto", "disable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pictureLayoutDivider.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(pictureLayoutDivider, "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto", "disable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View addPhotoLayout = getAddPhotoLayout();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(addPhotoLayout, arrayList2.toArray(), "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto", "disable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addPhotoLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(addPhotoLayout, "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto", "disable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View previewPhotoLayout = getPreviewPhotoLayout();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(previewPhotoLayout, arrayList3.toArray(), "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto", "disable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        previewPhotoLayout.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(previewPhotoLayout, "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto", "disable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.enable = false;
    }

    public final android.view.View getAddPhotoLayout() {
        return (android.view.View) ((jz5.n) this.addPhotoLayout).getValue();
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @Override // com.tencent.mm.ui.base.MMLimitedClearEditText
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e4t;
    }

    public final android.widget.ImageView getPreviewPhotoImg() {
        return (android.widget.ImageView) ((jz5.n) this.previewPhotoImg).getValue();
    }

    public final yz5.l getShowAddPhotoLayoutChangeListener() {
        return this.showAddPhotoLayoutChangeListener;
    }

    public final void setEnable(boolean z17) {
        this.enable = z17;
    }

    public final void setShowAddPhotoLayout(boolean z17) {
        this.isShowAddPhotoLayout = z17;
        if (this.enable) {
            yz5.l lVar = this.showAddPhotoLayoutChangeListener;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.valueOf(z17));
            }
            android.view.View addPhotoLayout = getAddPhotoLayout();
            int i17 = this.isShowAddPhotoLayout ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(addPhotoLayout, arrayList.toArray(), "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            addPhotoLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(addPhotoLayout, "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View previewPhotoLayout = getPreviewPhotoLayout();
            int i18 = this.isShowAddPhotoLayout ? 8 : 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(previewPhotoLayout, arrayList2.toArray(), "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            previewPhotoLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(previewPhotoLayout, "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void setShowAddPhotoLayoutChangeListener(yz5.l lVar) {
        this.showAddPhotoLayoutChangeListener = lVar;
    }
}
