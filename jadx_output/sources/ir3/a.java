package ir3;

/* loaded from: classes.dex */
public final class a extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        view(com.tencent.mm.R.id.leu, com.tencent.mm.R.id.leu).desc(com.tencent.mm.R.string.a6x);
        view(com.tencent.mm.R.id.lfg, com.tencent.mm.R.id.lfg).desc(com.tencent.mm.R.string.hpz);
        root(com.tencent.mm.R.layout.bz9).view(com.tencent.mm.R.id.mes).expand(40, 5, 40, 0);
        root(com.tencent.mm.R.layout.bz8).view(com.tencent.mm.R.id.jlx).descFormat(com.tencent.mm.R.string.jpn).valueByView(android.R.id.title).valueByView(com.tencent.mm.R.id.o58).valueByView(android.R.id.summary).disableChildren();
        root(com.tencent.mm.R.layout.c0j).view(android.R.id.title).type(com.tencent.mm.accessibility.type.ViewType.Button).descFormat(com.tencent.mm.R.string.amq).valueByKey("title_key");
    }
}
