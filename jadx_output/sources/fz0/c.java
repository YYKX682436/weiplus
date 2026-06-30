package fz0;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f267283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Intent intent) {
        super(0);
        this.f267283d = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f267283d.getIntExtra("key_from_comment_scene", 0));
    }
}
