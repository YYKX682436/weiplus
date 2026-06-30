package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class o extends com.tencent.mm.plugin.finder.live.view.v1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.u f117290n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.live.viewmodel.u uVar) {
        super((com.tencent.mm.ui.MMActivity) appCompatActivity, null, null);
        this.f117290n = uVar;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.v1, fm2.a, com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public int getLiveRole() {
        ((com.tencent.mm.plugin.finder.live.viewmodel.s) this.f117290n.f117439q).getClass();
        return 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.v1, com.tencent.mm.live.view.BaseLivePluginLayout
    public int getRelativeLayoutId() {
        return com.tencent.mm.R.layout.anh;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.v1, com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public void statusChange(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        ((com.tencent.mm.plugin.finder.live.viewmodel.s) this.f117290n.f117439q).statusChange(status, bundle);
    }
}
