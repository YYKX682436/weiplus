package xn2;

/* loaded from: classes2.dex */
public final class c0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f455480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455481b;

    public c0(in5.s0 s0Var, xn2.p0 p0Var) {
        this.f455480a = s0Var;
        this.f455481b = p0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        in5.s0 s0Var = this.f455480a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.qoi);
        boolean z17 = false;
        if (textView != null && textView.getVisibility() == 0) {
            z17 = true;
        }
        return kz5.c1.k(new jz5.l("finder_context_id", this.f455481b.f455544b), new jz5.l("comment_scene", 281), new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId())), new jz5.l("session_buffer", baseFinderFeed.getFeedObject().getFeedObject().getSessionBuffer()), new jz5.l("show_word", z17 ? textView != null ? textView.getText() : null : ""));
    }
}
