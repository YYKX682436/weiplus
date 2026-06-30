package p50;

/* loaded from: classes.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.elv).view(com.tencent.mm.R.id.a_4).desc(p50.a.f351991d);
        root(com.tencent.mm.R.layout.elv).view(com.tencent.mm.R.id.cix).desc(p50.b.f351992d).type(com.tencent.mm.accessibility.type.ViewType.Button);
        root(com.tencent.mm.R.layout.dye).view(com.tencent.mm.R.id.u4u).desc(com.tencent.mm.R.string.bvt);
    }
}
