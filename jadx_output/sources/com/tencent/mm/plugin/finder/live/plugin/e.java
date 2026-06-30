package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f112355d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17) {
        super(0);
        this.f112355d = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = "Animation cancelled for buttonType: " + this.f112355d;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("LiveButtonChangeController", str, null);
        return jz5.f0.f302826a;
    }
}
