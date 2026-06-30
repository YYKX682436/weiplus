package com.tencent.mm.plugin.webview.stub;

@db5.a(7)
/* loaded from: classes8.dex */
public class WebViewStubTempUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public int f183504d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f183505e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Dialog f183506f = null;

    /* loaded from: classes8.dex */
    public static final class StartActivityForResultTask implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.StartActivityForResultTask> CREATOR = new com.tencent.mm.plugin.webview.stub.r0();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f183509d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f183510e;

        /* renamed from: f, reason: collision with root package name */
        public android.content.Intent f183511f;

        /* renamed from: g, reason: collision with root package name */
        public int f183512g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f183513h;

        /* renamed from: i, reason: collision with root package name */
        public int f183514i;

        public StartActivityForResultTask(android.os.Parcel parcel) {
            this.f183509d = parcel.readString();
            this.f183510e = parcel.readString();
            this.f183511f = (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader());
            this.f183512g = parcel.readInt();
            this.f183513h = parcel.readByte() != 0;
            this.f183514i = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f183509d);
            parcel.writeString(this.f183510e);
            parcel.writeParcelable(this.f183511f, i17);
            parcel.writeInt(this.f183512g);
            parcel.writeByte(this.f183513h ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f183514i);
        }
    }

    public static boolean T6(android.content.Context context, com.tencent.mm.plugin.webview.stub.z0 z0Var, java.lang.String[] strArr, int i17, int i18) {
        if (context == null || strArr == null || strArr.length == 0) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            if (b3.l.checkSelfPermission(context, str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0) {
            return true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_action_code", 1);
        bundle.putStringArray("key_permission_types", (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
        bundle.putInt("key_permission_request_code", i17);
        bundle.putInt("key_binder_id", i18);
        com.tencent.mm.plugin.webview.ui.tools.a1.e(bundle, "webview", ".stub.WebViewStubTempUI", z0Var, null);
        return false;
    }

    public static void U6(android.content.Context context, com.tencent.mm.plugin.webview.stub.z0 z0Var, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final android.content.DialogInterface.OnClickListener onClickListener, final android.content.DialogInterface.OnClickListener onClickListener2) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.class);
        if (context instanceof android.app.Service) {
            intent.addFlags(268435456);
        }
        intent.putExtra("key_action_code", 0);
        intent.putExtra("key_alert_cancelable", z17);
        intent.putExtra("key_alert_message", str);
        intent.putExtra("key_alert_title", str2);
        intent.putExtra("key_alert_yes", str3);
        intent.putExtra("key_alert_no", str4);
        intent.putExtra("key_alert_result_receiver", new android.os.ResultReceiver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                if (i17 == 0) {
                    onClickListener.onClick(null, 0);
                } else {
                    if (i17 != 1) {
                        return;
                    }
                    onClickListener2.onClick(null, 0);
                }
            }
        });
        com.tencent.mm.plugin.webview.ui.tools.a1.e(intent.getExtras(), "webview", ".stub.WebViewStubTempUI", z0Var, null);
    }

    public static void V6(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, int i17, boolean z17, int i18) {
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.class);
        if (context instanceof android.app.Service) {
            intent2.addFlags(268435456);
        }
        intent2.putExtra("key_action_code", 2);
        com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.StartActivityForResultTask startActivityForResultTask = new com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.StartActivityForResultTask();
        startActivityForResultTask.f183509d = str;
        startActivityForResultTask.f183510e = str2;
        startActivityForResultTask.f183511f = intent;
        startActivityForResultTask.f183512g = i17;
        startActivityForResultTask.f183513h = z17;
        startActivityForResultTask.f183514i = i18;
        intent2.putExtra("key_activity_result_task", startActivityForResultTask);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubTempUI", "startActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;IZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/stub/WebViewStubTempUI", "startActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;IZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17;
        if (this.f183505e && (a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(this.f183504d)) != null) {
            a17.mmOnActivityResult(i17, i18, intent);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("key_action_code", -1);
        if (intExtra == 0) {
            android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) getIntent().getParcelableExtra("key_alert_result_receiver");
            if (resultReceiver == null) {
                finish();
                return;
            }
            com.tencent.mm.ui.widget.dialog.j0 K = db5.e1.K(this, getIntent().getBooleanExtra("key_alert_cancelable", false), getIntent().getStringExtra("key_alert_message"), getIntent().getStringExtra("key_alert_title"), getIntent().getStringExtra("key_alert_yes"), getIntent().getStringExtra("key_alert_no"), new com.tencent.mm.plugin.webview.stub.o0(this, resultReceiver), new com.tencent.mm.plugin.webview.stub.p0(this, resultReceiver));
            this.f183506f = K;
            K.setOnCancelListener(new com.tencent.mm.plugin.webview.stub.q0(this));
            return;
        }
        if (intExtra == 1) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, getIntent().getStringArrayExtra("key_permission_types"), getIntent().getIntExtra("key_permission_request_code", 0), null, null);
        } else {
            if (intExtra != 2) {
                finish();
                return;
            }
            com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.StartActivityForResultTask startActivityForResultTask = (com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.StartActivityForResultTask) getIntent().getParcelableExtra("key_activity_result_task");
            this.f183504d = startActivityForResultTask.f183514i;
            this.f183505e = true;
            mmSetOnActivityResultCallback(this);
            j45.l.o(this, startActivityForResultTask.f183509d, startActivityForResultTask.f183510e, startActivityForResultTask.f183511f, startActivityForResultTask.f183512g, startActivityForResultTask.f183513h);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.Dialog dialog = this.f183506f;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        int intExtra = getIntent().getIntExtra("key_binder_id", 0);
        if (i17 != 72 && i17 != 75 && i17 != 113) {
            switch (i17) {
            }
            finish();
        }
        if (iArr.length != 0) {
            if (iArr[0] == 0) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(intExtra).mmOnActivityResult(i17, -1, null);
            } else {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(intExtra).mmOnActivityResult(i17, 0, null);
            }
        }
        finish();
    }
}
