package hf3;

/* loaded from: classes.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f489259bw5);
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.jkg);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).desc(com.tencent.mm.R.string.kmv);
        root.view(com.tencent.mm.R.id.jkk).type(viewType).descFormat(com.tencent.mm.R.string.l0b).valueByView(com.tencent.mm.R.id.jkm).valueByView(com.tencent.mm.R.id.f487643pb0).valueByView(com.tencent.mm.R.id.f485936jl3);
        root.focusFirst(com.tencent.mm.R.id.jkg);
        root.disable(com.tencent.mm.R.id.jkm);
        root.disable(com.tencent.mm.R.id.f487643pb0);
        root.disable(com.tencent.mm.R.id.f485936jl3);
        root.disable(com.tencent.mm.R.id.paz);
        root(com.tencent.mm.R.layout.c2f).disable(com.tencent.mm.R.id.f485936jl3);
        root(com.tencent.mm.R.layout.bvt).view(com.tencent.mm.R.id.j9i).desc(hf3.a.f281217d);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f489254bw0);
        root2.view(com.tencent.mm.R.id.j9t).type(viewType).desc(new hf3.b(this));
        root2.disable(com.tencent.mm.R.id.j9s);
        root(com.tencent.mm.R.layout.f487907b9).view(com.tencent.mm.R.id.f482482fq).desc(com.tencent.mm.R.string.krj);
    }
}
