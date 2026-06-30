package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class e9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        super(0);
        this.f117083d = v9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ProgressBar progressBar = this.f117083d.f117489h;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
