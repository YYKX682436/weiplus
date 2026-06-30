package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class p8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.s8 f117330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(com.tencent.mm.plugin.finder.live.viewmodel.s8 s8Var) {
        super(0);
        this.f117330d = s8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ProgressBar progressBar = this.f117330d.f117400e;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
