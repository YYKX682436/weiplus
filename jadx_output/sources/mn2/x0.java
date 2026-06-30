package mn2;

/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f330154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.w f330155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f330156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(kotlinx.coroutines.y0 y0Var, u26.w wVar, android.graphics.Bitmap bitmap) {
        super(1);
        this.f330154d = y0Var;
        this.f330155e = wVar;
        this.f330156f = bitmap;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var = this.f330154d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new mn2.w0(this.f330155e, (android.graphics.Bitmap) obj, this.f330156f, null), 2, null);
        return jz5.f0.f302826a;
    }
}
