package ht3;

/* loaded from: classes.dex */
public final class l extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.cw6);
        root.view(com.tencent.mm.R.id.nnm).desc(com.tencent.mm.R.string.f489951gg);
        root.view(com.tencent.mm.R.id.nlz).desc(new ht3.h(this));
        root.view(com.tencent.mm.R.id.f487130nm2).desc(new ht3.i(this));
        root.view(com.tencent.mm.R.id.nlw).desc(new ht3.j(this));
        root(com.tencent.mm.R.id.nm8).view(com.tencent.mm.R.id.nm8).desc(com.tencent.mm.R.string.clr);
        root(com.tencent.mm.R.layout.d3e).view(com.tencent.mm.R.id.f484168d80).desc(com.tencent.mm.R.string.f489952gh);
        root(com.tencent.mm.R.id.d7y).view(com.tencent.mm.R.id.d7b).desc(new ht3.k(this)).disableChildren();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.bet);
        root2.disable(com.tencent.mm.R.id.nn6);
        root2.disable(com.tencent.mm.R.id.d8e);
    }
}
