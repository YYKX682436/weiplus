package sc;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f405630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.Class cls, java.lang.String str) {
        super(0);
        this.f405630d = cls;
        this.f405631e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.reflect.Field declaredField = this.f405630d.getDeclaredField(this.f405631e);
        declaredField.setAccessible(true);
        return declaredField;
    }
}
