package me4;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f325938a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f325939b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f325940c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f325941d;

    public b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f325938a = arrayList;
        me4.a aVar = new me4.a(this);
        this.f325941d = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initTask", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        arrayList.add(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTask", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWorkThread", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        try {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("waidproviderInitTask");
            this.f325939b = handlerThread;
            handlerThread.start();
            this.f325940c = new android.os.Handler(this.f325939b.getLooper());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("InitTaskMgr", "initWorkThread exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWorkThread", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
    }
}
