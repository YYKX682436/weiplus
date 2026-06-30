package com.tencent.mm.plugin.offline.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/offline/util/OfflinePayShortcutReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class OfflinePayShortcutReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.Object obj;
        com.tencent.mm.ui.widget.dialog.z2 z2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePayShortcutReceiver", "onReceive: shortcut pinned by user");
        yo3.b.b("offlinePayShortcutCreateSuccess", 1);
        android.app.Activity[] activityArr = new android.app.Activity[3];
        java.lang.ref.WeakReference weakReference = yo3.b.f464143a;
        activityArr[0] = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152486r;
        activityArr[1] = weakReference2 != null ? (android.app.Activity) weakReference2.get() : null;
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        activityArr[2] = k17 != null ? (android.app.Activity) k17.get() : null;
        java.util.Iterator it = kz5.c0.i(activityArr).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.app.Activity activity = (android.app.Activity) obj;
            if ((activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true) {
                break;
            }
        }
        android.app.Activity activity2 = (android.app.Activity) obj;
        java.lang.ref.WeakReference weakReference3 = com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152485q;
        if (weakReference3 != null && (z2Var = (com.tencent.mm.ui.widget.dialog.z2) weakReference3.get()) != null && z2Var.h()) {
            z2Var.B();
        }
        com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152485q = null;
        com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152486r = null;
        java.lang.ref.WeakReference weakReference4 = com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152487s;
        com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI offlinePayShortcutGuideUI = weakReference4 != null ? (com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI) weakReference4.get() : null;
        if (offlinePayShortcutGuideUI != null && !offlinePayShortcutGuideUI.isFinishing() && !offlinePayShortcutGuideUI.isDestroyed()) {
            offlinePayShortcutGuideUI.f152488d = 3;
            android.view.View view = offlinePayShortcutGuideUI.f152490f;
            if (view == null) {
                kotlin.jvm.internal.o.o("mStep1Dot");
                throw null;
            }
            offlinePayShortcutGuideUI.V6(view, 16);
            android.view.View view2 = offlinePayShortcutGuideUI.f152490f;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("mStep1Dot");
                throw null;
            }
            view2.setBackgroundResource(com.tencent.mm.R.drawable.d7g);
            android.view.View view3 = offlinePayShortcutGuideUI.f152491g;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("mStep2Dot");
                throw null;
            }
            offlinePayShortcutGuideUI.V6(view3, 16);
            android.view.View view4 = offlinePayShortcutGuideUI.f152491g;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("mStep2Dot");
                throw null;
            }
            view4.setBackgroundResource(com.tencent.mm.R.drawable.d7g);
            android.view.View view5 = offlinePayShortcutGuideUI.f152492h;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("mStepLine");
                throw null;
            }
            view5.setBackgroundColor(offlinePayShortcutGuideUI.getResources().getColor(com.tencent.mm.R.color.f478502m));
            android.widget.TextView textView = offlinePayShortcutGuideUI.f152493i;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mStep1Text");
                throw null;
            }
            textView.setText(com.tencent.mm.R.string.pg6);
            android.widget.TextView textView2 = offlinePayShortcutGuideUI.f152493i;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mStep1Text");
                throw null;
            }
            textView2.setTextColor(offlinePayShortcutGuideUI.getResources().getColor(com.tencent.mm.R.color.f478502m));
            android.widget.TextView textView3 = offlinePayShortcutGuideUI.f152494m;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("mStep2Text");
                throw null;
            }
            textView3.setTextColor(offlinePayShortcutGuideUI.getResources().getColor(com.tencent.mm.R.color.f478502m));
            android.widget.TextView textView4 = offlinePayShortcutGuideUI.f152495n;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("mGuideTitle");
                throw null;
            }
            textView4.setText(com.tencent.mm.R.string.pg9);
            android.widget.Button button = offlinePayShortcutGuideUI.f152496o;
            if (button == null) {
                kotlin.jvm.internal.o.o("mGuideBtn");
                throw null;
            }
            button.setText(com.tencent.mm.R.string.f493872pg2);
            android.widget.Button button2 = offlinePayShortcutGuideUI.f152496o;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("mGuideBtn");
                throw null;
            }
            button2.setBackgroundResource(com.tencent.mm.R.drawable.f481063jr);
            android.widget.Button button3 = offlinePayShortcutGuideUI.f152496o;
            if (button3 == null) {
                kotlin.jvm.internal.o.o("mGuideBtn");
                throw null;
            }
            button3.setTextColor(offlinePayShortcutGuideUI.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
            android.widget.Button button4 = offlinePayShortcutGuideUI.f152496o;
            if (button4 == null) {
                kotlin.jvm.internal.o.o("mGuideBtn");
                throw null;
            }
            button4.setOnClickListener(new com.tencent.mm.plugin.offline.ui.f1(offlinePayShortcutGuideUI));
            yo3.b.b("offlinePayShortcutGuideStep3Show", 2);
        }
        if (activity2 != null) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity2);
            e4Var.f211776c = activity2.getString(com.tencent.mm.R.string.pek);
            e4Var.b(com.tencent.mm.R.raw.icons_outlined_done);
            e4Var.c();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.OfflinePayShortcutReceiver", "onReceive: no activity available for WeToast");
        }
        yo3.b.f464143a = null;
    }
}
