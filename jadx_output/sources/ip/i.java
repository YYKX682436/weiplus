package ip;

/* loaded from: classes8.dex */
public class i extends ip.h {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f293568f;

    public i(int i17) {
        super(i17);
        this.f293568f = new java.util.HashMap();
        ip.f fVar = new ip.f(1, "MPConfig", new java.lang.String[]{"reportOnLeaveDomains", "domain"}, true, false);
        if (1 == this.f293564a) {
            ((java.util.ArrayList) this.f293566c).add(fVar);
        }
        ip.f fVar2 = new ip.f(1, "MPConfig", new java.lang.String[]{"FullScreenMpLinkPrefixList", "MpLinkPrefix"}, true, true);
        if (1 == this.f293564a) {
            ((java.util.ArrayList) this.f293566c).add(fVar2);
        }
    }
}
