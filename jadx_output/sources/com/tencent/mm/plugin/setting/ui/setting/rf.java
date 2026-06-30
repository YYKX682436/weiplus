package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class rf implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.w f161509d;

    public rf(com.tencent.mm.plugin.setting.ui.setting.sf sfVar, k14.w wVar) {
        this.f161509d = wVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f161509d);
    }
}
