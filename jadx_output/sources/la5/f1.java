package la5;

/* loaded from: classes3.dex */
public final class f1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.oio).view(com.tencent.mm.R.id.oio).desc(new la5.b1(this));
        root(com.tencent.mm.R.id.dth).view(com.tencent.mm.R.id.dth).desc(new la5.c1(this));
        root(com.tencent.mm.R.id.crz).view(com.tencent.mm.R.id.crz).desc(new la5.d1(this));
        root(com.tencent.mm.R.id.m9n).view(com.tencent.mm.R.id.m9n).desc(new la5.e1(this));
    }
}
