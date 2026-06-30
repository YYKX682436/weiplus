package dl4;

/* loaded from: classes3.dex */
public final class p0 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f235452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o11.g f235454c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f235455d;

    public p0(long j17, java.lang.String str, o11.g gVar, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        this.f235452a = j17;
        this.f235453b = str;
        this.f235454c = gVar;
        this.f235455d = w1Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        dl4.d1 d1Var = dl4.d1.f235383a;
        long j17 = this.f235452a;
        android.graphics.Bitmap bitmap = bVar != null ? bVar.f359534d : null;
        if (str == null) {
            str = "";
        }
        dl4.d1.c(d1Var, j17, bitmap, str, this.f235453b, this.f235454c, this.f235455d);
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
