package la5;

/* loaded from: classes.dex */
public final class i1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.f487918bk).view(android.R.id.text1).descFormat(com.tencent.mm.R.string.f489815cj).valueByView(android.R.id.text1).valueByKey("is_mute");
    }
}
