package hu4;

/* loaded from: classes.dex */
public final class e extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f285227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f285227d = "";
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.bl8);
        root.focusFirst(com.tencent.mm.R.id.onj);
        root.view(com.tencent.mm.R.id.hds).disable();
        root.view(com.tencent.mm.R.id.f486275kq5).desc(com.tencent.mm.R.string.kob);
        root.view(com.tencent.mm.R.id.onj).talkOn(new hu4.d(this));
    }
}
