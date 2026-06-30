package kk4;

/* loaded from: classes15.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.f0 f308608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.ParcelFileDescriptor f308609e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kk4.f0 f0Var, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        super(0);
        this.f308608d = f0Var;
        this.f308609e = parcelFileDescriptor;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f308608d.f308525a.setDataSource(this.f308609e);
        return jz5.f0.f302826a;
    }
}
