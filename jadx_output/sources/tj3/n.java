package tj3;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f419780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tj3.p pVar) {
        super(0);
        this.f419780d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.f419780d.f419782a);
        relativeLayout.setBackgroundResource(com.tencent.mm.R.drawable.icon_shadow_multitalk_avatar);
        relativeLayout.setGravity(80);
        relativeLayout.setVisibility(4);
        return relativeLayout;
    }
}
