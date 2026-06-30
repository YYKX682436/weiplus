package ht3;

/* loaded from: classes.dex */
public final class g extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.g17);
        root.view(com.tencent.mm.R.id.f483759bz3).desc(com.tencent.mm.R.id.bzo).clickAs(com.tencent.mm.R.id.bzo).disableChildren();
        root.view(com.tencent.mm.R.id.bzo).disable();
        root.view(com.tencent.mm.R.id.m3x).desc(ht3.a.f284944d).disableChildren();
        root.view(com.tencent.mm.R.id.ctg).desc(com.tencent.mm.R.string.csx).disableChildren();
        root.view(com.tencent.mm.R.id.lok).desc(new ht3.b(this));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.f487117nk1);
        root2.view(com.tencent.mm.R.id.nlz).desc(new ht3.c(this));
        root2.view(com.tencent.mm.R.id.f487130nm2).desc(new ht3.d(this));
        root2.view(com.tencent.mm.R.id.nlw).desc(new ht3.e(this));
        root2.view(com.tencent.mm.R.id.nof).desc(com.tencent.mm.R.string.clp);
        root(com.tencent.mm.R.id.nmj).view(com.tencent.mm.R.id.nom).desc(new ht3.f(this));
    }
}
