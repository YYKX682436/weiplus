package v73;

/* loaded from: classes.dex */
public class n extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public n(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter desc = root(com.tencent.mm.R.id.f485265h34).view(com.tencent.mm.R.id.h38).desc(new v73.n$$a());
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        root(com.tencent.mm.R.layout.bjn).view(com.tencent.mm.R.id.h2l).desc(new v73.o(this)).type(viewType);
        root(com.tencent.mm.R.layout.bjl).view(com.tencent.mm.R.id.h2u).desc(com.tencent.mm.R.string.fwl).type(viewType);
    }
}
