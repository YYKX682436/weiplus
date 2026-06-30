package m82;

/* loaded from: classes.dex */
public final class l extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {

    /* renamed from: d, reason: collision with root package name */
    public boolean f324713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter view = view(com.tencent.mm.R.id.f482482fq, com.tencent.mm.R.id.f482482fq);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).desc(new m82.a(this));
        root(com.tencent.mm.R.layout.f487911bd);
        view(com.tencent.mm.R.id.f482482fq, com.tencent.mm.R.id.f482482fq).type(viewType).desc(new m82.b(this));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.ofo);
        root.view(com.tencent.mm.R.id.dwf).desc(new m82.c(this)).type(viewType);
        root.view(com.tencent.mm.R.id.dw_).desc(new m82.d(this)).type(viewType);
        root.view(com.tencent.mm.R.id.dwg).desc(new m82.e(this)).type(viewType);
        root.view(com.tencent.mm.R.id.dwb).desc(new m82.f(this)).type(viewType);
        root.view(com.tencent.mm.R.id.dw9).desc(new m82.g(this)).type(viewType);
        root.view(com.tencent.mm.R.id.dw8).desc(new m82.h(this)).type(viewType);
        root.view(com.tencent.mm.R.id.dwe).desc(new m82.i(this)).type(viewType);
        root.view(com.tencent.mm.R.id.dwc).desc(new m82.j(this)).type(viewType);
        root.view(com.tencent.mm.R.id.dwd).desc(new m82.k(this)).type(viewType);
    }
}
