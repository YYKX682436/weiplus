package pf4;

/* loaded from: classes4.dex */
public final class c0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final int f353851d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView f353852e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f353853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pf4.f0 f353854g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(pf4.f0 f0Var, android.view.View itemView, int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(itemView);
        i17 = (i18 & 2) != 0 ? com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 4) : i17;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f353854g = f0Var;
        this.f353851d = i17;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f487149np0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f353852e = (com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f487151np2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f353853f = (android.widget.TextView) findViewById2;
    }
}
