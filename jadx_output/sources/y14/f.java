package y14;

/* loaded from: classes5.dex */
public final class f implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y14.e f458906b;

    public f(java.lang.String str, y14.e eVar) {
        this.f458905a = str;
        this.f458906b = eVar;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        y14.e eVar = this.f458906b;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("YuanBaoAvatarDownloadHelper", "downloadImage failed");
            if (eVar != null) {
                ((y14.i) eVar).a();
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadImage success: ");
        java.lang.String filePath = this.f458905a;
        sb6.append(filePath);
        com.tencent.mars.xlog.Log.i("YuanBaoAvatarDownloadHelper", sb6.toString());
        if (eVar != null) {
            y14.i iVar = (y14.i) eVar;
            kotlin.jvm.internal.o.g(filePath, "filePath");
            ym5.a1.f(new y14.h(iVar.f458912a, filePath, iVar.f458913b));
        }
    }
}
