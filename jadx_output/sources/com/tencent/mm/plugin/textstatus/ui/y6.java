package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        super(0);
        this.f174450d = textStatusDoWhatActivityV2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f174450d.f173537e;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAlpha(1.0f);
        }
        return jz5.f0.f302826a;
    }
}
