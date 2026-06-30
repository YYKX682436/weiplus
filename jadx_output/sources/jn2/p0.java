package jn2;

/* loaded from: classes10.dex */
public final class p0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.CheckBox f300663d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView f300664e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f300665f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jn2.r0 f300666g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(jn2.r0 r0Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f300666g = r0Var;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.sdm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f300663d = (android.widget.CheckBox) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.sdo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = (com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView) findViewById2;
        this.f300664e = finderLiveSongInfoView;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.sdn);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f300665f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        finderLiveSongInfoView.setScene(hn2.m.f282536e);
        finderLiveSongInfoView.B();
    }
}
