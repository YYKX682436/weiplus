package dr;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f242381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f242382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dr.g f242383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z17, android.graphics.Bitmap bitmap, dr.g gVar) {
        super(0);
        this.f242381d = z17;
        this.f242382e = bitmap;
        this.f242383f = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap;
        boolean z17 = this.f242381d;
        dr.g gVar = this.f242383f;
        if (!z17 || (bitmap = this.f242382e) == null) {
            dr.r rVar = gVar.f242384c;
            if (rVar != null) {
                rVar.a(-1, gVar.f242400a, null);
            }
        } else {
            dr.r rVar2 = gVar.f242384c;
            if (rVar2 != null) {
                rVar2.a(1, gVar.f242400a, bitmap);
            }
        }
        return jz5.f0.f302826a;
    }
}
