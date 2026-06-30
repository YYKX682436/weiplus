package ir3;

/* loaded from: classes.dex */
public final class f extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.m_3);
        root.view(com.tencent.mm.R.id.f486754mc5).disable();
        com.tencent.mm.accessibility.base.ViewSetter descFormat = root.view(com.tencent.mm.R.id.jp7).descFormat(com.tencent.mm.R.string.jpl);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        descFormat.type(viewType).valueByView(com.tencent.mm.R.id.jp8).clickAs(com.tencent.mm.R.id.jp8).disableChildren();
        com.tencent.mm.accessibility.base.ViewSetter valueByView = root.view(com.tencent.mm.R.id.hsf).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.hsf);
        com.tencent.mm.accessibility.type.ViewType viewType2 = com.tencent.mm.accessibility.type.ViewType.TextView;
        valueByView.type(viewType2);
        root.view(com.tencent.mm.R.id.nxx).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.nxx).type(viewType2);
        root.view(com.tencent.mm.R.id.kdt).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.kdt).type(viewType2);
        root.view(com.tencent.mm.R.id.kdv).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.kdv).type(viewType2);
        root.view(com.tencent.mm.R.id.f486160ke4).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.f486160ke4).type(viewType2);
        root.view(com.tencent.mm.R.id.f486645m00).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.f486645m00).type(viewType2);
        root.view(com.tencent.mm.R.id.f486612lu5).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.f486612lu5).type(viewType2);
        root.view(com.tencent.mm.R.id.nxw).descFormat(com.tencent.mm.R.string.jpm).type(viewType2).valueByView(com.tencent.mm.R.id.nxx).valueByView(com.tencent.mm.R.id.nxu).clickAs(com.tencent.mm.R.id.nxx).clickAs(com.tencent.mm.R.id.nxu).disableChildren();
        view(com.tencent.mm.R.id.mnm, com.tencent.mm.R.id.mnm).type(viewType);
    }
}
