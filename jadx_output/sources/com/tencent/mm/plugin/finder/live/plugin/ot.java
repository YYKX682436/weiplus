package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ot extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.rt f113782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot(com.tencent.mm.plugin.finder.live.plugin.rt rtVar) {
        super(0);
        this.f113782d = rtVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(this.f113782d.f114185d.f365323d.getContext());
        int i17 = b17.x;
        int i18 = b17.y;
        if (i17 > i18) {
            i17 = i18;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
