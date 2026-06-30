package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f113568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(com.tencent.mm.plugin.finder.live.plugin.ow owVar) {
        super(0);
        this.f113568d = owVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), this.f113568d.X, true);
        b4Var.setLogging(false);
        return b4Var;
    }
}
