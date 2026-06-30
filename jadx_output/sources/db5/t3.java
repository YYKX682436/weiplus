package db5;

/* loaded from: classes5.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto f228517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto mMLimitedClearEditTextWithPhoto) {
        super(0);
        this.f228517d = mMLimitedClearEditTextWithPhoto;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto mMLimitedClearEditTextWithPhoto = this.f228517d;
        android.view.View findViewById = mMLimitedClearEditTextWithPhoto.findViewById(com.tencent.mm.R.id.utc);
        findViewById.setOnClickListener(new db5.s3(mMLimitedClearEditTextWithPhoto));
        return findViewById;
    }
}
