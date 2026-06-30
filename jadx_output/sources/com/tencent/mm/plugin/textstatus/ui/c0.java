package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class c0 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.e0 f173757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.textstatus.ui.e0 e0Var, android.content.Context context) {
        super(context);
        this.f173757d = e0Var;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f173757d.dismiss();
    }
}
