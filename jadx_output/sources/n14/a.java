package n14;

/* loaded from: classes.dex */
public final class a extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.ckc).view(com.tencent.mm.R.id.lew).descFormat(com.tencent.mm.R.string.hps).valueByView(com.tencent.mm.R.id.kb_).valueByKey("sex_key").valueByView(com.tencent.mm.R.id.d0r).valueByView(com.tencent.mm.R.id.f486841ml4).valueByView(com.tencent.mm.R.id.ml7).valueByView(com.tencent.mm.R.id.lfl);
    }
}
