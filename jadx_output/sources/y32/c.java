package y32;

/* loaded from: classes.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.a_g);
        root.view(com.tencent.mm.R.id.djc).descFormat(com.tencent.mm.R.string.c4k).valueByView(com.tencent.mm.R.id.djd).valueByView(com.tencent.mm.R.id.djh).valueByView(com.tencent.mm.R.id.dic);
        root.view(com.tencent.mm.R.id.div).disable();
        root.view(com.tencent.mm.R.id.djg).desc(com.tencent.mm.R.string.a6x);
        root.view(com.tencent.mm.R.id.dji).disable();
        root.view(com.tencent.mm.R.id.f484246dj4).descFormat(com.tencent.mm.R.string.c3m).valueByView(com.tencent.mm.R.id.f484245dj3);
    }
}
