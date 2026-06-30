package eh5;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.immersive.ImmersiveBaseActivity f252957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.ui.immersive.ImmersiveBaseActivity immersiveBaseActivity) {
        super(0);
        this.f252957d = immersiveBaseActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.immersive.ImmersiveBaseActivity.f208931s;
        android.widget.LinearLayout c17 = this.f252957d.X6().c();
        kotlin.jvm.internal.o.f(c17, "getHeaderContainer(...)");
        return q26.h0.y(new n3.r1(c17));
    }
}
