package db5;

/* loaded from: classes5.dex */
public final class u3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto f228525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto mMLimitedClearEditTextWithPhoto) {
        super(0);
        this.f228525d = mMLimitedClearEditTextWithPhoto;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto mMLimitedClearEditTextWithPhoto = this.f228525d;
        mMLimitedClearEditTextWithPhoto.getPreviewPhotoCloseBtn();
        return (android.widget.ImageView) mMLimitedClearEditTextWithPhoto.findViewById(com.tencent.mm.R.id.utd);
    }
}
