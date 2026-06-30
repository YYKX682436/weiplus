package m82;

/* loaded from: classes.dex */
public final class o extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter view = view(com.tencent.mm.R.id.f482482fq, com.tencent.mm.R.id.f482482fq);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).desc(new m82.m(this));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.c88);
        root.view(com.tencent.mm.R.id.qkz).desc(com.tencent.mm.R.string.h_f);
        root.view(com.tencent.mm.R.id.f485306ql0).desc(com.tencent.mm.R.string.lyq);
        root.view(com.tencent.mm.R.id.f485307ql1).desc(com.tencent.mm.R.string.lyr);
        root.view(com.tencent.mm.R.id.qkx).desc(com.tencent.mm.R.string.h_g);
        root.view(com.tencent.mm.R.id.qkw).desc(com.tencent.mm.R.string.h_e);
        root.view(com.tencent.mm.R.id.qky).desc(com.tencent.mm.R.string.h_i);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.c8b);
        root2.view(com.tencent.mm.R.id.f486163kf1).desc(com.tencent.mm.R.string.l_v).type(viewType).clickAs(com.tencent.mm.R.id.f486162kf0).disableChildren();
        root2.view(com.tencent.mm.R.id.d68).desc(com.tencent.mm.R.string.h_f).type(viewType).clickAs(com.tencent.mm.R.id.d67).disableChildren();
        root2.view(com.tencent.mm.R.id.p0m).desc(com.tencent.mm.R.string.l_r).type(viewType).clickAs(com.tencent.mm.R.id.p0l).disableChildren();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.id.p5y);
        root3.view(com.tencent.mm.R.id.f487610p60).desc(com.tencent.mm.R.string.k9i).type(viewType);
        root3.view(com.tencent.mm.R.id.f487614p64).desc(m82.n.f324715d);
        com.tencent.mm.accessibility.base.ViewSetter desc = root3.view(com.tencent.mm.R.id.f487613p63).desc(com.tencent.mm.R.string.k9j);
        com.tencent.mm.accessibility.type.ViewType viewType2 = com.tencent.mm.accessibility.type.ViewType.TextView;
        desc.type(viewType2).clickAs(com.tencent.mm.R.id.f487611p61).disableChildren();
        root3.view(com.tencent.mm.R.id.p5y).desc(com.tencent.mm.R.string.ha7).type(viewType2);
    }
}
