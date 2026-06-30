package qw2;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f367132a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f367133b;

    /* renamed from: c, reason: collision with root package name */
    public final qw2.f f367134c;

    public k(com.tencent.mm.plugin.finder.video.sticker.StickerEffectView stickerEffectView, android.view.View itemView, boolean z17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f367132a = itemView;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.d_1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f367133b = recyclerView;
        qw2.f fVar = new qw2.f();
        this.f367134c = fVar;
        fVar.f367125h = stickerEffectView.f130813z;
        if (z17) {
            fVar.f367126i = new qw2.j(this, stickerEffectView);
        }
        recyclerView.setAdapter(fVar);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(itemView.getContext(), 5));
        recyclerView.setItemAnimator(null);
    }
}
