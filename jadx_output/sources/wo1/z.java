package wo1;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f448059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context) {
        super(0);
        this.f448059d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f448059d, com.tencent.mm.R.anim.f477944fw);
        loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        return loadAnimation;
    }
}
