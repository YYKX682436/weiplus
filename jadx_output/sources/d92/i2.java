package d92;

/* loaded from: classes.dex */
public final class i2 extends e92.b implements d92.m2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.jtj).view(com.tencent.mm.R.id.jtj).desc(new d92.d2(this));
        root(com.tencent.mm.R.id.jti).view(com.tencent.mm.R.id.jti).desc(new d92.e2(this));
        root(com.tencent.mm.R.id.jtg).view(com.tencent.mm.R.id.jtg).desc(new d92.f2(this));
        root(com.tencent.mm.R.id.jtf).view(com.tencent.mm.R.id.jtf).desc(new d92.g2(this));
        root(com.tencent.mm.R.id.jth).view(com.tencent.mm.R.id.jth).desc(new d92.h2(this));
    }
}
