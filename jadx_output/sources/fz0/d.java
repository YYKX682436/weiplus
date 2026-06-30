package fz0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f267284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Intent intent) {
        super(0);
        this.f267284d = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f267284d.getStringExtra("key_jump_id");
        return stringExtra == null ? "" : stringExtra;
    }
}
