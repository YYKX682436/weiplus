package dj4;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f233042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f233043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233044h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, java.lang.String str2, mj4.h hVar, android.graphics.Bitmap bitmap, java.lang.String str3) {
        super(0);
        this.f233040d = str;
        this.f233041e = str2;
        this.f233042f = hVar;
        this.f233043g = bitmap;
        this.f233044h = str3;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerDownloadThumb update ");
        java.lang.String str = this.f233040d;
        sb6.append(str);
        sb6.append(' ');
        java.lang.String str2 = this.f233041e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        si4.a G = ai4.m0.f5173a.G();
        mj4.h hVar = this.f233042f;
        mj4.h t17 = G.t(((mj4.k) hVar).l());
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (t17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb update " + str2 + ' ' + str);
            dj4.w.c(this.f233043g, str2);
            android.graphics.Bitmap b17 = dj4.w.b(str2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("triggerDownloadThumb: cache bitmap statusId=");
            sb7.append(((mj4.k) hVar).l());
            sb7.append(", imgUrl=");
            java.lang.String str3 = this.f233044h;
            sb7.append(str3);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb7.toString());
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(str3, b17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb TextStatus is null");
        }
        return f0Var;
    }
}
