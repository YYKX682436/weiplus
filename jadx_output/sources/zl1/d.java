package zl1;

/* loaded from: classes7.dex */
public class d extends zl1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f473576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zl1.t f473577b;

    public d(zl1.t tVar, android.widget.ImageView imageView) {
        this.f473577b = tVar;
        this.f473576a = imageView;
    }

    @Override // zl1.z
    public void a(android.graphics.Bitmap bitmap, zl1.y yVar) {
        super.a(bitmap, yVar);
        int i17 = zl1.t.f473614q;
        zl1.t tVar = this.f473577b;
        tVar.getClass();
        tVar.e(new zl1.f(tVar, this.f473576a, bitmap));
    }
}
