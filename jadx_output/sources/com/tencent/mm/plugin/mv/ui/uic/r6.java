package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class r6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f151408d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mv.ui.view.SpeedyLinearLayoutManager speedyLinearLayoutManager = new com.tencent.mm.plugin.mv.ui.view.SpeedyLinearLayoutManager(this.f151408d, 0, false);
        speedyLinearLayoutManager.f151755v = 100.0f;
        return speedyLinearLayoutManager;
    }
}
