package com.tencent.mm.pluginsdk.forward;

/* loaded from: classes8.dex */
public final class k implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.forward.m f188715d;

    public k(com.tencent.mm.pluginsdk.forward.m mVar) {
        this.f188715d = mVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f188715d.f188724g = null;
    }
}
