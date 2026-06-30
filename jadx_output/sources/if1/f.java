package if1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f291066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f291067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl1.a f291068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f291069g;

    public f(if1.g gVar, boolean z17, android.graphics.Bitmap bitmap, gl1.a aVar, android.graphics.Bitmap bitmap2) {
        this.f291066d = z17;
        this.f291067e = bitmap;
        this.f291068f = aVar;
        this.f291069g = bitmap2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        boolean z17 = this.f291066d;
        gl1.a aVar = this.f291068f;
        if (!z17 || (bitmap = this.f291067e) == null) {
            aVar.setImageBitmap(this.f291069g);
        } else {
            aVar.setImageBitmap(bitmap);
        }
    }
}
