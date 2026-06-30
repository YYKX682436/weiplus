package d92;

/* loaded from: classes.dex */
public final class p1 extends e92.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.b7r);
        root.view(com.tencent.mm.R.id.fyv).disable();
        root.view(com.tencent.mm.R.id.fxf).desc(com.tencent.mm.R.string.f491285cm4).clickAs(com.tencent.mm.R.id.fxe).disableChildren();
        root.view(com.tencent.mm.R.id.fyk).desc(d92.g1.f227475d);
        root.view(com.tencent.mm.R.id.fyb).desc(com.tencent.mm.R.string.eyt);
        root.view(com.tencent.mm.R.id.ttu).desc(com.tencent.mm.R.string.f39);
        root.view(com.tencent.mm.R.id.r_2).desc(com.tencent.mm.R.string.m1j);
        root.view(com.tencent.mm.R.id.qnv).desc(com.tencent.mm.R.string.jyv);
        root.view(com.tencent.mm.R.id.mld).descFormat(com.tencent.mm.R.string.dfp).valueByView(com.tencent.mm.R.id.f484939g03);
        root.view(com.tencent.mm.R.id.fxa).desc(new d92.h1(this)).disableChildren();
        root.view(com.tencent.mm.R.id.fyq).desc(com.tencent.mm.R.id.fyr).disableChildren();
        root.view(com.tencent.mm.R.id.fyh).desc(com.tencent.mm.R.id.fyi).disableChildren();
        root.view(com.tencent.mm.R.id.jdo).desc(com.tencent.mm.R.id.jdq).disableChildren();
        root.view(com.tencent.mm.R.id.fzt).desc(com.tencent.mm.R.id.fzw).disableChildren();
        root.view(com.tencent.mm.R.id.fzj).desc(com.tencent.mm.R.id.fzk).disableChildren();
        root.view(com.tencent.mm.R.id.f484746fe4).desc(new d92.i1(this));
        root.view(com.tencent.mm.R.id.ffe).desc(com.tencent.mm.R.string.e0x);
        root.view(com.tencent.mm.R.id.f486444l82).desc(new d92.j1(this));
        root(com.tencent.mm.R.id.l9n).view(com.tencent.mm.R.id.l9n).desc(new d92.k1(this));
        root(com.tencent.mm.R.id.l_l).view(com.tencent.mm.R.id.l_l).desc(new d92.l1(this));
        root(com.tencent.mm.R.id.l9r).view(com.tencent.mm.R.id.l9r).desc(new d92.m1(this));
        root(com.tencent.mm.R.id.l8t).view(com.tencent.mm.R.id.l8t).desc(new d92.n1(this));
        root(com.tencent.mm.R.id.lam).view(com.tencent.mm.R.id.lam).desc(new d92.o1(this));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.k2x);
        root2.view(com.tencent.mm.R.id.jqg).desc(com.tencent.mm.R.string.ez_);
        root2.view(com.tencent.mm.R.id.ttu).desc(com.tencent.mm.R.string.f39);
        focusFirst(com.tencent.mm.R.id.backBtn);
        focusOrder().next(com.tencent.mm.R.id.backBtn).next(com.tencent.mm.R.id.fxf).next(com.tencent.mm.R.id.fzn);
    }
}
