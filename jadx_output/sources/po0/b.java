package po0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f357282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f357283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, yz5.l lVar) {
        super(1);
        this.f357282d = i17;
        this.f357283e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAntiAlias(true);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawColor(this.f357282d);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new po0.a(this.f357283e, bitmap));
        return jz5.f0.f302826a;
    }
}
