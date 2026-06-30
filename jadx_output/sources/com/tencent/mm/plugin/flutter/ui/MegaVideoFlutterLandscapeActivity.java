package com.tencent.mm.plugin.flutter.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/flutter/ui/MegaVideoFlutterLandscapeActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MegaVideoFlutterActivity;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MegaVideoFlutterLandscapeActivity extends com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity {
    @Override // com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity, com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        setRequestedOrientation(0);
    }
}
