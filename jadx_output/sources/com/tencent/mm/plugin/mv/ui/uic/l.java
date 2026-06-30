package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class l implements com.tencent.mm.plugin.mv.ui.view.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q f151262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151263b;

    public l(com.tencent.mm.plugin.mv.ui.uic.q qVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f151262a = qVar;
        this.f151263b = appCompatActivity;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.b
    public void a(int i17) {
        java.util.ArrayList arrayList;
        im3.j jVar;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList = this.f151262a.f151366i;
        if (musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList == null || (arrayList = musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList.f152065o) == null || (jVar = (im3.j) kz5.n0.a0(arrayList, i17)) == null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f151263b;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((com.tencent.mm.plugin.mv.ui.uic.b) a17).O6().B3(new pm3.d(pm3.c.f356871d, jVar));
    }
}
