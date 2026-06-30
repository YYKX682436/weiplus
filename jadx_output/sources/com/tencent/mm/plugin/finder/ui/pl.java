package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class pl extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sl f129651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(com.tencent.mm.plugin.finder.ui.sl slVar) {
        super(1);
        this.f129651d = slVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MaasAlbumTemplateHelper", "get maas permission");
        com.tencent.mm.plugin.finder.ui.sl slVar = this.f129651d;
        com.tencent.mm.plugin.finder.ui.sl.a(slVar, false);
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
        com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI = slVar.f129820a;
        finderAlbumUI.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(finderAlbumUI.f138528m.f247131g);
        if (!arrayList.isEmpty()) {
            ut3.f.f431176c.f431177a = finderAlbumUI;
            finderAlbumUI.g8(arrayList);
        }
        return jz5.f0.f302826a;
    }
}
