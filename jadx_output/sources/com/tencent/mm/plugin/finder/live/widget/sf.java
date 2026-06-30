package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sf extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget f119775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget finderLiveFansClubTagWidget) {
        super(1);
        this.f119775d = finderLiveFansClubTagWidget;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Number) obj).floatValue() >= 1.0f) {
            this.f119775d.getTagTv().setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
