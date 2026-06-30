package y31;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y31.f f459158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y31.f fVar) {
        super(0);
        this.f459158d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.FrameLayout frameLayout = this.f459158d.f459164e;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return jz5.f0.f302826a;
    }
}
