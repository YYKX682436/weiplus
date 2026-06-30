package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class w80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(android.view.ViewGroup viewGroup) {
        super(0);
        this.f114887d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f114887d.getContext().getSystemService("vibrator");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        return (android.os.Vibrator) systemService;
    }
}
