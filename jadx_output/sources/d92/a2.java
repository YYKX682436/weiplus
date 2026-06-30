package d92;

/* loaded from: classes.dex */
public final class a2 extends e92.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.m3c).view(com.tencent.mm.R.id.m3c).disable();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.ml9);
        root.view(com.tencent.mm.R.id.e7m).desc(new d92.v1(this));
        root.view(com.tencent.mm.R.id.jtp).desc(new d92.w1(this));
        root.view(com.tencent.mm.R.id.mle).desc(new d92.x1(this));
        root(com.tencent.mm.R.id.hpk).view(com.tencent.mm.R.id.hpk).desc(new d92.y1(this));
        root(com.tencent.mm.R.id.hpi).view(com.tencent.mm.R.id.hpi).desc(new d92.z1(this));
    }
}
