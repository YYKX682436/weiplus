package yq5;

/* loaded from: classes11.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq5.k f464599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yq5.k kVar) {
        super(0);
        this.f464599d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        yq5.k kVar = this.f464599d;
        sb6.append(((yq5.e) kVar.f464600a).f464596b);
        sb6.append("&imageInfo=");
        sb6.append(kVar.f464601b);
        return sb6.toString();
    }
}
