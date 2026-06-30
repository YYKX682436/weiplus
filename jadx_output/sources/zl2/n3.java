package zl2;

/* loaded from: classes.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(android.content.Context context, java.lang.String str) {
        super(0);
        this.f473901d = context;
        this.f473902e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        db5.t7.makeText(this.f473901d, "Debug " + this.f473902e, 0).show();
        return jz5.f0.f302826a;
    }
}
