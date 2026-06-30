package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class t implements com.tencent.mm.ui.widget.snackbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.u f177192a;

    public t(com.tencent.mm.plugin.voip.widget.u uVar) {
        this.f177192a = uVar;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void a() {
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onHide() {
        this.f177192a.f177193d.finish();
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onShow() {
    }
}
