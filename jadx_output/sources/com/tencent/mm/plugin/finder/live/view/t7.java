package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class t7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.u7 f116696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(com.tencent.mm.plugin.finder.live.view.u7 u7Var) {
        super(0);
        this.f116696d = u7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.finder.live.view.s7(this.f116696d));
        n3Var.setLogging(false);
        return n3Var;
    }
}
