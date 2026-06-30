package n14;

/* loaded from: classes.dex */
public final class j extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        view(com.tencent.mm.R.id.mpl, com.tencent.mm.R.id.mpl).desc(n14.h.f334147d).checkOn(n14.i.f334148d).clickAs(com.tencent.mm.R.id.ntt).disableChildren();
    }
}
