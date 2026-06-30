package com.tencent.mm.plugin.textstatus.ui.flutter;

@db5.a(512)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/flutter/StatusFlutterPublishActivity;", "Lcom/tencent/mm/plugin/textstatus/ui/FlutterTextStatusTransparentActivity;", "<init>", "()V", "xj4/a", "xj4/b", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class StatusFlutterPublishActivity extends com.tencent.mm.plugin.textstatus.ui.FlutterTextStatusTransparentActivity {
    public static final java.util.concurrent.atomic.AtomicInteger E;
    public volatile boolean D;

    /* renamed from: v, reason: collision with root package name */
    public android.os.ResultReceiver f173884v;

    /* renamed from: x, reason: collision with root package name */
    public bi4.d1 f173886x;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f173888z;

    /* renamed from: w, reason: collision with root package name */
    public int f173885w = -1;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f173887y = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final jz5.g A = jz5.h.b(new xj4.c(this));
    public final java.util.HashMap B = new java.util.HashMap();
    public final java.util.concurrent.CopyOnWriteArrayList C = new java.util.concurrent.CopyOnWriteArrayList();

    static {
        new xj4.a(null);
        E = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusFlutterPublishActivity", "finish");
        super.finish();
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        yz5.p pVar = (yz5.p) this.B.remove(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusFlutterPublishActivity", "onActivityResult: pigeon reqCode=" + i17 + ", resultCode=" + i18);
        try {
            pVar.invoke(java.lang.Integer.valueOf(i18), intent);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StatusFlutterPublishActivity", "onActivityResult: pigeon callback throw, err=" + th6.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.D) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: ignore duplicated press while callback in flight");
            return;
        }
        java.util.Map map = zi4.g0.f473214g;
        zi4.g0 g0Var = (zi4.g0) zi4.g0.f473214g.get(this);
        if (g0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: actionHost not bound, fallback to super.onBackPressed");
            super.onBackPressed();
            return;
        }
        this.D = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: sending EdgeGesture_Pop_Begin to Flutter");
        xj4.e eVar = new xj4.e(this);
        com.tencent.pigeon.status.FLTStatusCommonApi fLTStatusCommonApi = g0Var.f473216b;
        if (fLTStatusCommonApi == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FLTStatusActionHost", "sendCallbackToFlutter: commonCallbackApi is null, cmdId=".concat("Status_Native2Flutter_Sync_Call_EdgeGesture_Pop_Begin"));
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            eVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("commonCallbackApi not ready, cmdId=".concat("Status_Native2Flutter_Sync_Call_EdgeGesture_Pop_Begin"))))));
        } else {
            com.tencent.pigeon.status.FLTStatusActionRequest fLTStatusActionRequest = new com.tencent.pigeon.status.FLTStatusActionRequest("Status_Native2Flutter_Sync_Call_EdgeGesture_Pop_Begin", new com.tencent.pigeon.status.FLTStatusPlatformProto(null));
            com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusActionHost", "sendCallbackToFlutter: cmdId=Status_Native2Flutter_Sync_Call_EdgeGesture_Pop_Begin, dataLen=0");
            pm0.v.X(new zi4.d0(fLTStatusCommonApi, fLTStatusActionRequest, eVar, g0Var, "Status_Native2Flutter_Sync_Call_EdgeGesture_Pop_Begin"));
        }
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.FlutterTextStatusTransparentActivity, com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        bi4.d1 d1Var;
        super.onCreate(bundle);
        this.f173884v = (android.os.ResultReceiver) getIntent().getParcelableExtra("status_flutter_publish_result_receiver");
        this.f173885w = getIntent().getIntExtra("status_flutter_publish_request_code", -1);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("status_flutter_publish_set_status_param_bytes");
        if (byteArrayExtra != null) {
            d1Var = new bi4.d1();
            d1Var.parseFrom(byteArrayExtra);
        } else {
            d1Var = null;
        }
        this.f173886x = d1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate: hasReceiver=");
        sb6.append(this.f173884v != null);
        sb6.append(", requestCode=");
        sb6.append(this.f173885w);
        sb6.append(", hasEntryParam=");
        sb6.append(this.f173886x != null);
        sb6.append(", affSubId=");
        sb6.append((java.lang.String) ((jz5.n) this.A).getValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusFlutterPublishActivity", sb6.toString());
        ai4.m mVar = ai4.m.f5167a;
        java.lang.String subId = (java.lang.String) ((jz5.n) this.A).getValue();
        xj4.f fVar = new xj4.f(this);
        kotlin.jvm.internal.o.g(subId, "subId");
        if (r26.n0.N(subId)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StatusStorageEventBridge", "addObserver: blank subId, reject");
            return;
        }
        if (!ai4.m.f5172f) {
            mVar.e();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = ai4.m.f5168b;
        if (((ai4.i) concurrentHashMap.put(subId, fVar)) != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StatusStorageEventBridge", "addObserver: override exists subId=".concat(subId));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusStorageEventBridge", "addObserver: subId=" + subId + ", total=" + concurrentHashMap.size());
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusFlutterPublishActivity", "onDestroy: hasDispatchedResult=" + this.f173887y.get() + ", affSubId=" + ((java.lang.String) ((jz5.n) this.A).getValue()));
        this.f173888z = true;
        try {
            ai4.m.f5167a.d((java.lang.String) ((jz5.n) this.A).getValue());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StatusFlutterPublishActivity", "onDestroy: removeObserver failed, err=" + th6.getMessage());
        }
        if (!this.B.isEmpty()) {
            java.util.Map s17 = kz5.c1.s(this.B);
            this.B.clear();
            for (java.util.Map.Entry entry : s17.entrySet()) {
                int intValue = ((java.lang.Number) entry.getKey()).intValue();
                yz5.p pVar = (yz5.p) entry.getValue();
                com.tencent.mars.xlog.Log.w("MicroMsg.StatusFlutterPublishActivity", "onDestroy: cancel pending pigeon callback reqCode=" + intValue);
                try {
                    pVar.invoke(0, null);
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        this.C.clear();
        if (this.f173887y.compareAndSet(false, true)) {
            try {
                android.os.ResultReceiver resultReceiver = this.f173884v;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.w("MicroMsg.StatusFlutterPublishActivity", "onDestroy: send RESULT_CANCELED failed, err=" + th7.getMessage());
            }
            setResult(0);
        }
        this.f173884v = null;
        this.f173886x = null;
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.C;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((xj4.b) it.next()).a(i17, permissions, grantResults);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.StatusFlutterPublishActivity", "onRequestPermissionsResult: listener throw, err=" + th6.getMessage());
            }
        }
    }
}
