package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class p2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView f116577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f116578b;

    public p2(com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView, android.content.Context context) {
        this.f116577a = finderLiveCameraOptBeautyPowerfulDetailsView;
        this.f116578b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        yz5.a onRequestReset = this.f116577a.getOnRequestReset();
        if (onRequestReset != null) {
            onRequestReset.invoke();
        }
        android.content.Context context = this.f116578b;
        db5.e1.U(context, context.getString(com.tencent.mm.R.string.f491658du1), 0);
    }
}
