package v73;

/* loaded from: classes.dex */
public class v0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public v0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter desc = root(com.tencent.mm.R.layout.bjr).view(com.tencent.mm.R.id.h4e).desc(com.tencent.mm.R.id.h4e);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        root(com.tencent.mm.R.id.f485272h44).view(com.tencent.mm.R.id.h2q).desc(new v73.t0(this)).type(viewType);
        root(com.tencent.mm.R.id.h4k).view(com.tencent.mm.R.id.f485273h45).desc(com.tencent.mm.R.id.f485274h46).type(viewType);
    }
}
