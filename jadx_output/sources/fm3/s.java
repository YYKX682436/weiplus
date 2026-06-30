package fm3;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f264119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264120f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, r45.ss4 ss4Var, yz5.l lVar) {
        super(2);
        this.f264118d = str;
        this.f264119e = ss4Var;
        this.f264120f = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap != null) {
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
            java.lang.String str = this.f264118d;
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, compressFormat, str, false);
            this.f264119e.set(2, str);
        }
        this.f264120f.invoke(java.lang.Boolean.valueOf(bitmap != null));
        return jz5.f0.f302826a;
    }
}
