package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ee extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.fe f118247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(com.tencent.mm.plugin.finder.live.widget.fe feVar) {
        super(0);
        this.f118247d = feVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f118247d.f118343a.animate().translationY(0.0f).setDuration(200L).setListener(null).start();
        return jz5.f0.f302826a;
    }
}
