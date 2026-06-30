package hi4;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hi4.m f281554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hi4.m mVar) {
        super(0);
        this.f281554d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f281554d.getIntent().getIntExtra("reportEnterScene", 0));
    }
}
