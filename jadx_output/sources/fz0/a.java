package fz0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f267281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Intent intent) {
        super(0);
        this.f267281d = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f267281d.getStringExtra("key_click_tab_context_id");
        return stringExtra == null ? "" : stringExtra;
    }
}
