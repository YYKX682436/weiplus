package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class w0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f211185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AppBrandNotifySettingsUI f211186e;

    public w0(com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI, java.util.LinkedList linkedList) {
        this.f211186e = appBrandNotifySettingsUI;
        this.f211185d = linkedList;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI = this.f211186e;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.ui.AppBrandNotifySettingsUI.T6(appBrandNotifySettingsUI, this.f211185d);
            return 0;
        }
        db5.t7.makeText(appBrandNotifySettingsUI, com.tencent.mm.R.string.hd9, 0).show();
        return 0;
    }
}
