package um5;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.w f429190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f429191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(um5.w wVar, android.view.Surface surface) {
        super(0);
        this.f429190d = wVar;
        this.f429191e = surface;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.tav.decoder.RenderContext renderContext = this.f429190d.f429197f;
        if (renderContext != null) {
            renderContext.setSurface(this.f429191e);
        }
        return jz5.f0.f302826a;
    }
}
