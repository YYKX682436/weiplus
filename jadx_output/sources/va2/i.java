package va2;

/* loaded from: classes2.dex */
public final class i extends com.tencent.mm.plugin.finder.activity.uic.w1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int O6(int i17) {
        return 1;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int P6() {
        return 22;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC R6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(va2.n.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public java.lang.String S6() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_topic_title");
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int T6() {
        return 1;
    }
}
