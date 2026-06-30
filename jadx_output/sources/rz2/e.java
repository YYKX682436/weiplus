package rz2;

/* loaded from: classes.dex */
public final class e extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f401800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f401800d = "";
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.f488748aa3).view(com.tencent.mm.R.id.g7w).type(com.tencent.mm.accessibility.type.ViewType.Button).desc(com.tencent.mm.R.string.b9a);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488749aa4);
        root.view(com.tencent.mm.R.id.g89).talkOn(new rz2.b(this));
        root.view(com.tencent.mm.R.id.g88).talkOn(new rz2.c(this));
        root(com.tencent.mm.R.layout.f488750aa5).view(com.tencent.mm.R.id.dnt).talkOn(rz2.d.f401799d);
    }
}
