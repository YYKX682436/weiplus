package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.az f114626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(com.tencent.mm.plugin.finder.live.plugin.az azVar) {
        super(0);
        this.f114626d = azVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.az azVar = this.f114626d;
        android.content.Context context = azVar.f111946d;
        azVar.f111953n = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.ggd), true, 3, null);
        return jz5.f0.f302826a;
    }
}
