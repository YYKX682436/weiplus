package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class w implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI f152350a;

    public w(com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI) {
        this.f152350a = nearLifeCreatePoiUI;
    }

    @Override // u60.e
    public void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        java.lang.String str = addr.f71214g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = addr.f71216i;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String concat = str.concat(str2);
        java.lang.String str3 = addr.f71217m;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = addr.f71218n;
        java.lang.String concat2 = str3.concat(str4 != null ? str4 : "");
        com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI = this.f152350a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(nearLifeCreatePoiUI.f152273n.getText().toString())) {
            nearLifeCreatePoiUI.f152273n.setText(concat);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(nearLifeCreatePoiUI.f152272m.getText().toString()) && !com.tencent.mm.sdk.platformtools.t8.K0(concat2)) {
            nearLifeCreatePoiUI.f152272m.setText(concat2);
        }
        nearLifeCreatePoiUI.f152269g = addr;
    }
}
