package zg1;

/* loaded from: classes13.dex */
public class c implements o91.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z81.j f472814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z81.i f472815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472816c;

    public c(zg1.d dVar, z81.j jVar, z81.i iVar, java.lang.String str) {
        this.f472814a = jVar;
        this.f472815b = iVar;
        this.f472816c = str;
    }

    @Override // o91.b
    public void a(android.graphics.Bitmap bitmap) {
        z81.j jVar = this.f472814a;
        if (jVar == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        jVar.a(this.f472815b, this.f472816c, bitmap);
    }
}
