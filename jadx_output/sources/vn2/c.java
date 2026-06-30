package vn2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f438244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f438245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, v65.n nVar) {
        super(1);
        this.f438244d = i17;
        this.f438245e = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        int i17 = this.f438244d;
        if (i17 != 0 && bitmap != null) {
            vn2.i iVar = vn2.i.f438303a;
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAntiAlias(true);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawColor(i17);
        }
        this.f438245e.a(bitmap);
        return jz5.f0.f302826a;
    }
}
