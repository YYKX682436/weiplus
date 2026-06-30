package dr;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr.i f242385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f242386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f242387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dr.i iVar, boolean z17, android.graphics.Bitmap bitmap) {
        super(0);
        this.f242385d = iVar;
        this.f242386e = z17;
        this.f242387f = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uiThread, md5 = ");
        dr.i iVar = this.f242385d;
        sb6.append(iVar.f242400a.getMd5());
        sb6.append(", view is ");
        java.lang.ref.WeakReference weakReference = iVar.f242402c;
        sb6.append(weakReference != null ? (android.widget.ImageView) weakReference.get() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverRequest", sb6.toString());
        java.lang.ref.WeakReference weakReference2 = iVar.f242402c;
        android.widget.ImageView imageView = weakReference2 != null ? (android.widget.ImageView) weakReference2.get() : null;
        if (this.f242386e && (bitmap = this.f242387f) != null && imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
