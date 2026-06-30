package xt2;

/* loaded from: classes3.dex */
public final class z1 implements com.tencent.mm.plugin.finder.view.nd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f457135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f457136b;

    public z1(xt2.e3 e3Var, android.content.Context context) {
        this.f457135a = e3Var;
        this.f457136b = context;
    }

    @Override // com.tencent.mm.plugin.finder.view.nd
    public void a(cm2.k0 item, com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView view) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(view, "view");
        this.f457135a.d(this.f457136b, item);
    }
}
