package com.tencent.mm.plugin.game.luggage.ipc;

/* loaded from: classes8.dex */
public class CommonLogicTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.luggage.ipc.CommonLogicTask> CREATOR = new w43.c();

    /* renamed from: f, reason: collision with root package name */
    public android.os.Bundle f139570f = new android.os.Bundle();

    /* renamed from: g, reason: collision with root package name */
    public int f139571g;

    public CommonLogicTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f139571g = parcel.readInt();
        this.f139570f = parcel.readBundle(getClass().getClassLoader());
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f139571g);
        parcel.writeBundle(this.f139570f);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        int i17;
        switch (this.f139571g) {
            case 1:
                android.os.Bundle bundle = this.f139570f;
                if (bundle != null) {
                    boolean z17 = bundle.getBoolean("permission_allow", false);
                    java.lang.String string = this.f139570f.getString("url");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ComonLogicTask", "ACTIVITY_JUMP_HANDLER, url is null");
                        return;
                    } else {
                        ((com.tencent.mm.app.plugin.j) o25.z1.a()).c(com.tencent.mm.sdk.platformtools.x2.f193071a, string, z17, null);
                        break;
                    }
                }
                break;
            case 2:
                android.os.Bundle bundle2 = this.f139570f;
                if (bundle2 != null) {
                    int[] intArray = bundle2.getIntArray("getConfigStgKey");
                    if (intArray != null && intArray.length != 0) {
                        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                        for (int i18 : intArray) {
                            gm0.j1.i();
                            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(i18, null);
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            if (str == null) {
                                str = "";
                            }
                            arrayList.add(str);
                        }
                        this.f139570f.putStringArrayList("getConfigStgValue", arrayList);
                        break;
                    } else {
                        return;
                    }
                }
                break;
            case 3:
                android.os.Bundle bundle3 = this.f139570f;
                if (bundle3 != null) {
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(bundle3.getString(dm.i4.COL_LOCALID));
                    if (b17 != null) {
                        this.f139570f.putParcelable("item", b17);
                        break;
                    }
                }
                break;
            case 4:
                boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_webview_allow_download_file, 1) == 1;
                if (this.f139570f == null) {
                    this.f139570f = new android.os.Bundle();
                }
                this.f139570f.putBoolean("allowDownloadFile", z19);
                break;
            case 5:
                try {
                    i17 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableWebviewScanQRCode"), 1);
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ComonLogicTask", "getIntValFromDynamicConfig parseInt failed, val: EnableWebviewScanQRCode");
                    i17 = 1;
                }
                this.f139570f.putBoolean("allow_webview_scan", i17 == 1);
                break;
            case 6:
                this.f139570f.putBoolean("has_set_uin", gm0.j1.a());
                break;
            case 8:
                this.f139570f.putString("file_path", com.tencent.mm.plugin.webview.model.o5.e(this.f139570f.getString(dm.i4.COL_LOCALID)));
                break;
            case 9:
                java.lang.String string2 = this.f139570f.getString("game_hv_menu_appid");
                com.tencent.mm.autogen.events.GameCommOperationEvent gameCommOperationEvent = new com.tencent.mm.autogen.events.GameCommOperationEvent();
                am.le leVar = gameCommOperationEvent.f54358g;
                leVar.f7243a = 3;
                leVar.f7244b = string2;
                gameCommOperationEvent.e();
                this.f139570f.putString("game_hv_menu_pbcache", gameCommOperationEvent.f54359h.f7341a);
                break;
            case 10:
                m53.i5 p17 = com.tencent.mm.plugin.game.commlib.i.p();
                if (p17 != null) {
                    com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams gameSettingParams = new com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams();
                    gameSettingParams.f184762d = p17.f323795d;
                    gameSettingParams.f184763e = p17.f323796e;
                    gameSettingParams.f184764f = p17.f323797f;
                    this.f139570f.putParcelable("game_setting_params", gameSettingParams);
                    break;
                }
                break;
            case 11:
                sx4.v.a(this.f139570f);
                break;
        }
        c();
    }

    public CommonLogicTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
