package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class d extends com.tencent.mm.plugin.finder.storage.vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f123330a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123331b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f123332c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f123333d;

    public d(android.app.Activity context, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f123330a = context;
        this.f123331b = i17;
        this.f123332c = z17;
        jz5.h.b(com.tencent.mm.plugin.finder.profile.c.f123326d);
        this.f123333d = new java.util.HashSet();
    }

    public static final boolean f(com.tencent.mm.plugin.finder.profile.d dVar) {
        android.app.Activity context = dVar.f123330a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername(), xy2.c.e(context)) || bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonFinderProfileIsAuthor()) == 1;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(yz5.l lVar) {
        return new com.tencent.mm.plugin.finder.profile.FinderProfileAllLayoutConfig$getItemConvertFactory$1(this, lVar);
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        return new com.tencent.mm.plugin.finder.profile.b(this);
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(context, this.f123331b);
        gridLayoutManager.setItemPrefetchEnabled(true);
        return gridLayoutManager;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.y2 e(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        return null;
    }
}
