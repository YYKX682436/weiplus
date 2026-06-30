package yn2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn2.m f463977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yn2.m mVar) {
        super(0);
        this.f463977d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) this.f463977d.f463995f).getValue()).intValue() - (com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn) * 2));
    }
}
