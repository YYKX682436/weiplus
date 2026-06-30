package xt2;

/* loaded from: classes3.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f456673d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f456674e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f456675f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f456676g;

    /* renamed from: h, reason: collision with root package name */
    public long f456677h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f456678i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView f456679m;

    /* renamed from: n, reason: collision with root package name */
    public int f456680n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView finderLiveShopCountDownAnimView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f456679m = finderLiveShopCountDownAnimView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f456678i = obj;
        this.f456680n |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView.a(this.f456679m, 0L, null, null, this);
    }
}
