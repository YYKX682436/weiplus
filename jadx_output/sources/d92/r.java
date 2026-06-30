package d92;

/* loaded from: classes.dex */
public final class r extends e92.b implements d92.k2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.d4o).view(com.tencent.mm.R.id.byz).desc(com.tencent.mm.R.string.b9a);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.dz_);
        root.view(com.tencent.mm.R.id.dz_).desc(new d92.l(this));
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.c6d);
        view.disable();
        view.disableChildren();
        root.view(com.tencent.mm.R.id.iht).desc(new d92.m(this));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.dza);
        root2.view(com.tencent.mm.R.id.dza).desc(new d92.n(this));
        com.tencent.mm.accessibility.base.ViewSetter view2 = root2.view(com.tencent.mm.R.id.c6d);
        view2.disable();
        view2.disableChildren();
        root2.view(com.tencent.mm.R.id.iht).desc(new d92.o(this));
        root(com.tencent.mm.R.id.tyc).view(com.tencent.mm.R.id.tyc).desc(d92.p.f227499d).disableChildren();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.id.c6x);
        root3.view(com.tencent.mm.R.id.f483846c80).desc(new d92.q(this)).disableChildren();
        root3.view(com.tencent.mm.R.id.n0r).desc(com.tencent.mm.R.string.axk);
        com.tencent.mm.accessibility.base.ViewSetter desc = root3.view(com.tencent.mm.R.id.u3e).desc(com.tencent.mm.R.string.n7m);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479688cn);
        root3.view(com.tencent.mm.R.id.sw9).expand(h17, h17, h17, h17);
        root(com.tencent.mm.R.id.ow9).view(com.tencent.mm.R.id.v1o).desc(com.tencent.mm.R.string.n7m).type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root4 = root(com.tencent.mm.R.id.d4w);
        root4.view(com.tencent.mm.R.id.byz).desc(com.tencent.mm.R.string.b9a);
        root4.view(com.tencent.mm.R.id.d4y).desc(com.tencent.mm.R.string.ctj);
    }
}
