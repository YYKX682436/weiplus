package im2;

/* loaded from: classes.dex */
public final class r4 extends d92.z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // d92.z0, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        super.initConfig();
        root(com.tencent.mm.R.id.fqc).view(com.tencent.mm.R.id.ifw).desc(com.tencent.mm.R.string.egk).type(com.tencent.mm.accessibility.type.ViewType.TextView).disExpand();
        root(com.tencent.mm.R.id.g1h).view(com.tencent.mm.R.id.g1h).disableChildren().clickAs(com.tencent.mm.R.id.fbf).desc(com.tencent.mm.R.string.f493406k20);
        root(com.tencent.mm.R.id.g1l).view(com.tencent.mm.R.id.g1l).disableChildren().clickAs(com.tencent.mm.R.id.igy).desc(com.tencent.mm.R.string.d_f);
        root(com.tencent.mm.R.id.g1m).view(com.tencent.mm.R.id.g1m).disableChildren().clickAs(com.tencent.mm.R.id.ihi).desc(com.tencent.mm.R.string.eas);
        root(com.tencent.mm.R.id.f485589i95).view(com.tencent.mm.R.id.f485586i92).desc(im2.q4.f292509d).disableChildren().disExpand();
    }
}
