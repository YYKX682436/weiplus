package com.tencent.mm.ui.chatting;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/ChattingSendDataToDeviceForOpenMsgUI;", "Lcom/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class ChattingSendDataToDeviceForOpenMsgUI extends com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI {
    @Override // com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI
    public void a7() {
        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingSendDataToDeviceForOpenMsgUI", "showIdleState:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isFinishing()) {
            return;
        }
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = this.A1;
        if (networkDeviceInfo == null || kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, this.H1) || kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, this.J1)) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        vj5.a.a(getContentView(), com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479500a43), true);
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = (com.tencent.mm.feature.exdevice.NetworkDeviceInfo) getIntent().getParcelableExtra("NetworkDeviceInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingSendDataToDeviceForOpenMsgUI", "onCreate deviceInfo:" + networkDeviceInfo);
        if (networkDeviceInfo == null) {
            finish();
        } else {
            getContentView().post(new com.tencent.mm.ui.chatting.o7(networkDeviceInfo, this));
            findViewById(com.tencent.mm.R.id.aad).setOnClickListener(new com.tencent.mm.ui.chatting.p7(this));
        }
    }
}
