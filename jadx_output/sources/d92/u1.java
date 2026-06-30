package d92;

/* loaded from: classes.dex */
public final class u1 extends e92.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.g1v).view(com.tencent.mm.R.id.bzh).desc(com.tencent.mm.R.string.cnu);
        root(com.tencent.mm.R.id.g1v).view(com.tencent.mm.R.id.g1v).desc(new d92.s1(this));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.f485983js1);
        root.view(com.tencent.mm.R.id.f485983js1).desc(com.tencent.mm.R.string.f8e);
        root.view(com.tencent.mm.R.id.jqm).desc(com.tencent.mm.R.string.eor);
        root(com.tencent.mm.R.id.fsw).view(com.tencent.mm.R.id.fsw).desc(new d92.t1(this)).disableChildren();
        focusFirst(com.tencent.mm.R.id.f485983js1);
        focusOrder().next(com.tencent.mm.R.id.f485983js1).next(com.tencent.mm.R.id.jqm).next(com.tencent.mm.R.id.h0r).next(com.tencent.mm.R.id.f487177ns4);
    }
}
