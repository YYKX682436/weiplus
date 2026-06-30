package dl4;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f235360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o11.g f235362g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String str, long j17, android.graphics.Bitmap bitmap, java.lang.String str2, o11.g gVar) {
        super(0);
        this.f235359d = str;
        this.f235360e = bitmap;
        this.f235361f = str2;
        this.f235362g = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = (java.util.ArrayList) dl4.d1.f235385c.remove(this.f235359d);
        if (arrayList != null) {
            android.graphics.Bitmap bitmap = this.f235360e;
            if (bitmap != null) {
                bitmap.getWidth();
            }
            if (bitmap != null) {
                bitmap.getHeight();
            }
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p11.k) it.next()).a(this.f235361f, null, bitmap, this.f235362g.D);
            }
        }
        return jz5.f0.f302826a;
    }
}
