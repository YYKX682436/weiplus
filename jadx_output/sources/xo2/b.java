package xo2;

/* loaded from: classes.dex */
public final class b extends e92.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.k6a);
        root.view(com.tencent.mm.R.id.k69).desc(new xo2.a(context));
        root.view(com.tencent.mm.R.id.e_e).desc(com.tencent.mm.R.string.f491285cm4);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.c76);
        root2.view(com.tencent.mm.R.id.mcb).desc(com.tencent.mm.R.string.efr).disableChildren();
        root2.view(com.tencent.mm.R.id.k6a).disable();
    }
}
