package ir3;

/* loaded from: classes.dex */
public final class e extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        view(com.tencent.mm.R.layout.c9d, com.tencent.mm.R.id.f487036na2).desc(com.tencent.mm.R.id.f487037na3).checkOn(ir3.c.f294259d);
        view(com.tencent.mm.R.layout.c9d, com.tencent.mm.R.id.f487034na0).desc(com.tencent.mm.R.id.f487035na1).checkOn(ir3.d.f294260d);
        com.tencent.mm.accessibility.base.ViewSetter descFormat = root(com.tencent.mm.R.id.kds).view(com.tencent.mm.R.id.kdu).descFormat(com.tencent.mm.R.string.jpm);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        descFormat.type(viewType).valueByView(com.tencent.mm.R.id.kdv).valueByKey("not_allow_see_sns_permission_cb_key");
        root(com.tencent.mm.R.id.n6q).view(com.tencent.mm.R.id.f486159ke3).descFormat(com.tencent.mm.R.string.jpm).type(viewType).valueByView(com.tencent.mm.R.id.f486160ke4).valueByKey("not_see_sns_permission_tv_key");
        root(com.tencent.mm.R.layout.c9d).view(com.tencent.mm.R.id.f486159ke3).expand(40, 40, 40, 40);
    }
}
