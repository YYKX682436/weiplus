package qb2;

/* loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u26.w f361209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f361210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(u26.w wVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f361209d = wVar;
        this.f361210e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlinx.coroutines.l.f(null, new qb2.e1(this.f361209d, this.f361210e, null), 1, null);
        return jz5.f0.f302826a;
    }
}
