package com.tencent.mm.plugin.multitask;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/multitask/MultiTaskCallBackBroadcast;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MultiTaskCallBackBroadcast extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f150401a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.app.Activity activity;
        android.app.Activity activity2;
        android.app.Activity activity3;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskCallBackBroadcast", "MultiTaskCallBackBroadcast onReceive");
        android.app.Activity activity4 = null;
        if (kotlin.jvm.internal.o.b(intent != null ? intent.getAction() : null, "com.tencent.mm.multitask")) {
            int intExtra = intent.getIntExtra("com.tencent.mm.multitask.ActionCode", 0);
            if (intExtra == 0) {
                java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                    java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
                    if (j17 != null) {
                        activity4 = (android.app.Activity) j17.get();
                    }
                } else {
                    activity4 = activity;
                }
                if (activity4 != null) {
                    ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
                    zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(activity4);
                    if (Ai != null ? ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).l7(true, 7) : false) {
                        com.tencent.mm.plugin.multitask.m0 Ni = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ni();
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        Ni.j(bool, bool);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskCallBackBroadcast", "hideMultiTaskFloatBall");
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskCallBackBroadcast", "ActionCode_Default, topActivity: " + activity4);
                return;
            }
            if (intExtra == 1) {
                java.lang.ref.WeakReference k18 = com.tencent.mm.app.w.k();
                if (k18 == null || (activity2 = (android.app.Activity) k18.get()) == null) {
                    java.lang.ref.WeakReference j18 = com.tencent.mm.app.w.INSTANCE.j();
                    if (j18 != null) {
                        activity4 = (android.app.Activity) j18.get();
                    }
                } else {
                    activity4 = activity2;
                }
                if (activity4 != null && !com.tencent.mm.sdk.platformtools.x2.n()) {
                    com.tencent.mm.autogen.events.MulitTaskEvent mulitTaskEvent = new com.tencent.mm.autogen.events.MulitTaskEvent();
                    mulitTaskEvent.f54503g.f6161c = 4;
                    mulitTaskEvent.b(android.os.Looper.getMainLooper());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskCallBackBroadcast", "ActionCode_RefreshData, topActivity: " + activity4);
                return;
            }
            if (intExtra != 2) {
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("com.tencent.mm.multitask.id");
            int intExtra2 = intent.getIntExtra("com.tencent.mm.multitask.type", 0);
            java.lang.ref.WeakReference k19 = com.tencent.mm.app.w.k();
            if (k19 == null || (activity3 = (android.app.Activity) k19.get()) == null) {
                java.lang.ref.WeakReference j19 = com.tencent.mm.app.w.INSTANCE.j();
                if (j19 != null) {
                    activity4 = (android.app.Activity) j19.get();
                }
            } else {
                activity4 = activity3;
            }
            if (activity4 != null && !com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mm.autogen.events.MulitTaskEvent mulitTaskEvent2 = new com.tencent.mm.autogen.events.MulitTaskEvent();
                am.ak akVar = mulitTaskEvent2.f54503g;
                akVar.f6161c = 5;
                akVar.f6159a = stringExtra;
                akVar.f6160b = intExtra2;
                mulitTaskEvent2.b(android.os.Looper.getMainLooper());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskCallBackBroadcast", "ActionCode_DeleteData, topActivity: " + activity4 + ", multiTaskId: " + stringExtra + ", multiTaskType: " + intExtra2);
        }
    }
}
