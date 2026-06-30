package un;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.l f429295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(un.l lVar) {
        super(0);
        this.f429295d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f429295d.getIntent().getStringExtra("room_operation_session_id");
        if (stringExtra != null) {
            return stringExtra;
        }
        return com.tencent.mm.sdk.platformtools.w2.a(c01.z1.r()) + c01.id.c();
    }
}
