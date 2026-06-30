package eh5;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.immersive.ImmersiveBaseActivity f252960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.ui.immersive.ImmersiveBaseActivity immersiveBaseActivity) {
        super(1);
        this.f252960d = immersiveBaseActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.ui.immersive.ImmersiveBaseActivity.f208931s;
        com.tencent.mm.ui.immersive.ImmersiveBaseActivity immersiveBaseActivity = this.f252960d;
        return java.lang.Boolean.valueOf((it == immersiveBaseActivity.X6().c() || it == immersiveBaseActivity.X6().b() || it == immersiveBaseActivity.X6().a()) ? false : true);
    }
}
