package sr2;

/* loaded from: classes10.dex */
public final class y4 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411820a;

    public y4(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411820a = postMainUIC;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        aw2.c0 c0Var = this.f411820a.f122529u;
        if (c0Var != null) {
            return kz5.b1.e(new jz5.l("highlight_topic_name", c0Var.f14733p ? c0Var.f14732o : null));
        }
        kotlin.jvm.internal.o.o("highlightTopicWidget");
        throw null;
    }
}
