package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        super(0);
        this.f114039d = etVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "onTouch");
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114039d;
        etVar.P1();
        etVar.R1();
        android.content.Context context = etVar.R;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context).hideVKB();
        etVar.D1(true);
        return jz5.f0.f302826a;
    }
}
