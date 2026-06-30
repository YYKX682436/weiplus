package ke3;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f307019g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ke3.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l lVar2) {
        super(1);
        this.f307016d = str;
        this.f307017e = str2;
        this.f307018f = str3;
        this.f307019g = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        if (view != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "bindFrameSetView ok, frameSetName: " + this.f307016d + ", frameSetRootPath: " + this.f307017e + ", frameSetData.len: " + this.f307018f.length());
            this.f307019g.invoke(view);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclCommonStarterDemoUI", "in starterBiz case, onRequestInsertCoverView, frameSetView is null");
        }
        return jz5.f0.f302826a;
    }
}
