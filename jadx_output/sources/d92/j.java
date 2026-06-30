package d92;

/* loaded from: classes.dex */
public final class j extends e92.b implements d92.j2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.ogs).view(com.tencent.mm.R.id.ogs).desc(new d92.g(this)).expand(4, 4, 4, 4).disableChildren();
        root(com.tencent.mm.R.id.e0b).view(com.tencent.mm.R.id.e0b).desc(new d92.h(this)).disableChildren();
        root(com.tencent.mm.R.id.in_).view(com.tencent.mm.R.id.inh).desc(com.tencent.mm.R.string.euj);
        root(com.tencent.mm.R.id.f484307ds5).view(com.tencent.mm.R.id.f484307ds5).desc(com.tencent.mm.R.id.kbq);
        root(com.tencent.mm.R.id.eb8).view(com.tencent.mm.R.id.eb8).desc(new d92.i(this));
    }
}
