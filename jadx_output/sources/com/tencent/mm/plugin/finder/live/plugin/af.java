package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class af extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f111875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        super(0);
        this.f111875d = mgVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.finder.live.plugin.ze(this.f111875d));
        n3Var.setLogging(false);
        return n3Var;
    }
}
