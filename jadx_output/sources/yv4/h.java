package yv4;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f466224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv4.k f466225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, yv4.k kVar) {
        super(0);
        this.f466224d = z17;
        this.f466225e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f466224d;
        yv4.k kVar = this.f466225e;
        if (z17) {
            ((android.widget.FrameLayout) ((jz5.n) kVar.f466230f).getValue()).setAlpha(1.0f);
        } else {
            ((android.widget.FrameLayout) ((jz5.n) kVar.f466230f).getValue()).animate().alpha(1.0f).setDuration(200L).start();
        }
        return jz5.f0.f302826a;
    }
}
