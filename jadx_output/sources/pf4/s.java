package pf4;

/* loaded from: classes4.dex */
public final class s extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final int f353890d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView f353891e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f353892f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f353893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pf4.w f353894h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(pf4.w wVar, android.view.View itemView, int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(itemView);
        i17 = (i18 & 2) != 0 ? com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 4) : i17;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f353894h = wVar;
        this.f353890d = i17;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f487153np4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f353891e = (com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.np7);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f353892f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.np6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f353893g = (android.widget.TextView) findViewById3;
    }
}
