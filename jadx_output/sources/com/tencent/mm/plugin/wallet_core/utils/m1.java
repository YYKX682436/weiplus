package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class m1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f180929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gq f180930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f180931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.content.Context context, r45.gq gqVar, android.view.View.OnClickListener onClickListener) {
        super(false);
        this.f180929d = context;
        this.f180930e = gqVar;
        this.f180931f = onClickListener;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.utils.z1.c(this.f180929d, this.f180930e.f375463e, null);
        android.view.View.OnClickListener onClickListener = this.f180931f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
