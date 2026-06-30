package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class dd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gd f118099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(com.tencent.mm.plugin.finder.live.widget.gd gdVar) {
        super(0);
        this.f118099d = gdVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.finder.live.widget.gd.f118419n;
        com.tencent.mm.plugin.finder.live.widget.gd gdVar = this.f118099d;
        gdVar.animate().alpha(0.0f).setDuration(200L).setListener(new com.tencent.mm.plugin.finder.live.widget.cd(gdVar)).start();
        gdVar.f118425i.d();
        return jz5.f0.f302826a;
    }
}
