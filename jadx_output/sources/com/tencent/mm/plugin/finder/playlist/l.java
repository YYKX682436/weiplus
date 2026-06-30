package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer f122337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer) {
        super(1);
        this.f122337d = finderPlayListDrawer;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer = this.f122337d;
        com.tencent.mm.plugin.finder.playlist.o0 o0Var = finderPlayListDrawer.C;
        if (o0Var != null) {
            o0Var.b(false);
        }
        if (booleanValue) {
            finderPlayListDrawer.x();
        } else {
            finderPlayListDrawer.y();
        }
        return jz5.f0.f302826a;
    }
}
