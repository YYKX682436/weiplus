package my4;

/* loaded from: classes.dex */
public final class g extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        view(com.tencent.mm.R.id.cwv, com.tencent.mm.R.id.cwv).checkOn(my4.d.f332849d, my4.e.f332850d);
        view(com.tencent.mm.R.id.f484077cx4, com.tencent.mm.R.id.f484077cx4).desc(my4.f.f332851d);
    }
}
