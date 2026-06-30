package j93;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r f298472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j93.r rVar) {
        super(0);
        this.f298472d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.String.valueOf(this.f298472d.getIntent().getIntExtra("contact_select_label_from_scene", 0));
    }
}
