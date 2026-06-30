package vg2;

/* loaded from: classes3.dex */
public final class x0 extends vg2.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f436616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Context context, android.view.ViewGroup parentRoot) {
        super(context, parentRoot);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parentRoot, "parentRoot");
        this.f436616f = "GiftSamePkgGiftWidget";
    }

    @Override // vg2.c
    public int a() {
        return com.tencent.mm.R.layout.dc7;
    }

    @Override // vg2.c
    public void d(android.view.ViewGroup attachView, java.lang.String giftId) {
        kotlin.jvm.internal.o.g(attachView, "attachView");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        super.d(attachView, giftId);
        com.tencent.mars.xlog.Log.i(this.f436616f, "[showWidget] giftId:".concat(giftId));
        this.f436485c.setOnClickListener(new vg2.w0(this));
    }
}
