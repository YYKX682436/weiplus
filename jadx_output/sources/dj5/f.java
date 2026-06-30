package dj5;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.m f233067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dj5.m mVar) {
        super(0);
        this.f233067d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f233067d.getIntent().getStringExtra("chatroomName");
        return stringExtra == null ? "" : stringExtra;
    }
}
