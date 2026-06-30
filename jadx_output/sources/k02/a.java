package k02;

/* loaded from: classes8.dex */
public class a implements k02.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h02.a f303061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f303062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j35.d f303063c;

    public a(h02.a aVar, boolean z17, j35.d dVar) {
        this.f303061a = aVar;
        this.f303062b = z17;
        this.f303063c = dVar;
    }

    @Override // k02.j
    public void a(boolean z17) {
        if (z17) {
            g02.c cVar = new g02.c();
            h02.a aVar = this.f303061a;
            cVar.a(aVar);
            java.lang.String str = aVar.field_packageName;
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("install_begin_time", 0);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong(str, java.lang.System.currentTimeMillis()).apply();
            }
            g02.b.b(aVar.field_appId, aVar.field_scene, 4, aVar.field_md5, aVar.field_downloadUrl, null, aVar.field_extInfo);
            cVar.f267429j = (java.lang.System.currentTimeMillis() - aVar.field_startTime) / 1000;
            g02.b.c(4, cVar);
            if (this.f303062b) {
                g02.b.c(15, cVar);
            } else {
                g02.b.c(16, cVar);
            }
        }
        j35.d dVar = this.f303063c;
        if (dVar != null) {
            dVar.a(z17);
        }
    }

    @Override // k02.j
    public void b(boolean z17) {
        g02.c cVar = new g02.c();
        cVar.a(this.f303061a);
        if (z17) {
            g02.b.c(23, cVar);
        } else {
            g02.b.c(22, cVar);
        }
    }
}
