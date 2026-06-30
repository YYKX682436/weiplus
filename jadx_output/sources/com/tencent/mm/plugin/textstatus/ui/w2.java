package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI f174399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI) {
        super(0);
        this.f174399d = statusAlbumUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusAlbumUI", "onLoadMoreBegin");
        bk4.d dVar = this.f174399d.f173466g;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        gm0.j1.d().g(new ej4.f(dVar.f21446f, null, null, null, null, 30, null));
        return jz5.f0.f302826a;
    }
}
