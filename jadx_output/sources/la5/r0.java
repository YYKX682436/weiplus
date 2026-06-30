package la5;

/* loaded from: classes14.dex */
public final class r0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.f487912be).view(com.tencent.mm.R.id.jha).setSecurityCheck(la5.m0.f317630d);
        root(com.tencent.mm.R.layout.f487913bf).view(com.tencent.mm.R.id.jga).setSecurityCheck(la5.n0.f317631d);
        root(com.tencent.mm.R.layout.f488435t8).view(com.tencent.mm.R.id.bql).setSecurityCheck(la5.o0.f317633d);
        root(com.tencent.mm.R.id.huj).view(com.tencent.mm.R.id.nvt).setSecurityCheck(la5.p0.f317635d);
        root(com.tencent.mm.R.layout.e19).view(com.tencent.mm.R.id.bkg).setSecurityCheck(la5.q0.f317637d);
    }
}
