package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l8 f113202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(com.tencent.mm.plugin.finder.live.plugin.l8 l8Var) {
        super(1);
        this.f113202d = l8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.widget.i7 buttonType = (com.tencent.mm.plugin.finder.live.widget.i7) obj;
        kotlin.jvm.internal.o.g(buttonType, "buttonType");
        com.tencent.mm.plugin.finder.live.plugin.l8 l8Var = this.f113202d;
        l8Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorMusicSelectPlugin", "handleMusicEntranceButtonClick: " + buttonType);
        int ordinal = buttonType.ordinal();
        int i17 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            i17 = 2;
        }
        l8Var.f113360r = i17;
        return jz5.f0.f302826a;
    }
}
