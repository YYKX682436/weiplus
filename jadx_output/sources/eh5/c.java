package eh5;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.immersive.ImmersiveBaseActivity f252956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ui.immersive.ImmersiveBaseActivity immersiveBaseActivity) {
        super(0);
        this.f252956d = immersiveBaseActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.immersive.ImmersiveBaseActivity.f208931s;
        android.widget.LinearLayout b17 = this.f252956d.X6().b();
        kotlin.jvm.internal.o.f(b17, "getFooterContainer(...)");
        return q26.h0.y(new n3.r1(b17));
    }
}
