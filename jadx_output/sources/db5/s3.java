package db5;

/* loaded from: classes5.dex */
public final class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto f228504d;

    public s3(com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto mMLimitedClearEditTextWithPhoto) {
        this.f228504d = mMLimitedClearEditTextWithPhoto;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto$previewPhotoCloseBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f228504d.setShowAddPhotoLayout(true);
        yj0.a.h(this, "com/tencent/mm/ui/base/MMLimitedClearEditTextWithPhoto$previewPhotoCloseBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
