package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class ql extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sl f129745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(com.tencent.mm.plugin.finder.ui.sl slVar) {
        super(1);
        this.f129745d = slVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("Finder.AlbumUI", "do not get maas permission");
        com.tencent.mm.plugin.finder.ui.sl.a(this.f129745d, true);
        return jz5.f0.f302826a;
    }
}
