package x92;

/* loaded from: classes3.dex */
public final class k implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x92.l f452701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f452702c;

    public k(java.lang.String str, x92.l lVar, android.widget.ImageView imageView) {
        this.f452700a = str;
        this.f452701b = lVar;
        this.f452702c = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new x92.j(this.f452701b, this.f452702c));
            com.tencent.mars.xlog.Log.i("Finder.FinderTopicCoverUIC", "[handleActivityProfileCover] [" + bitmap.getWidth() + ':' + bitmap.getHeight() + "] allocationByteCount=" + com.tencent.mm.sdk.platformtools.t8.f0(bitmap.getAllocationByteCount()) + " coverUrl=" + this.f452700a);
        }
    }
}
