package wj2;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wj2.w wVar) {
        super(0);
        this.f446717d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        dk2.xf z17;
        wj2.w wVar = this.f446717d;
        wVar.M();
        km2.q bindLinkMicUser = wVar.getBindLinkMicUser();
        if (bindLinkMicUser != null && (str = bindLinkMicUser.f309175f) != null && (z17 = wVar.f446719i.z()) != null) {
            ((dk2.r4) z17).D(str, new wj2.m(wVar));
        }
        return jz5.f0.f302826a;
    }
}
