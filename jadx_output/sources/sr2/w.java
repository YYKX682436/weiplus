package sr2;

/* loaded from: classes8.dex */
public final class w extends com.tencent.mm.plugin.finder.viewmodel.component.q4 {

    /* renamed from: i, reason: collision with root package name */
    public final int f411751i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411751i = 20002;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.q4
    public int O6() {
        return this.f411751i;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.q4
    public void Q6() {
        int intExtra = getIntent().getIntExtra("key_finder_post_from", -1);
        if ((this.f135660f.length() == 0) && intExtra == 20) {
            super.Q6();
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.q4
    public void S6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = (com.tencent.mm.plugin.finder.post.PostMainUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class);
        postMainUIC.y7();
        ya2.b2 b2Var = postMainUIC.f122513e;
        if (b2Var != null) {
            postMainUIC.C7().n0(b2Var);
        }
        postMainUIC.r7();
    }
}
