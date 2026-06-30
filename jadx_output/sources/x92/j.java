package x92;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x92.l f452698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f452699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x92.l lVar, android.widget.ImageView imageView) {
        super(0);
        this.f452698d = lVar;
        this.f452699e = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        x92.l lVar = this.f452698d;
        wu5.c cVar = lVar.f452708o;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f452699e.setVisibility(0);
        lVar.Y6(true);
        return jz5.f0.f302826a;
    }
}
