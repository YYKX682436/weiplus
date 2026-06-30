package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class qd implements com.tencent.mm.plugin.sns.ui.widget.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.td f170338a;

    public qd(com.tencent.mm.plugin.sns.ui.td tdVar) {
        this.f170338a = tdVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.b1
    public void onCancel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        com.tencent.mm.plugin.sns.ui.td tdVar = this.f170338a;
        if (com.tencent.mm.plugin.sns.ui.td.b(tdVar) != null) {
            com.tencent.mm.plugin.sns.ui.td.b(tdVar).setBackground(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        android.os.Handler handler = tdVar.f170512f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        handler.removeCallbacksAndMessages(null);
        com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "onCancel, isCalledOnFinish=" + tdVar.f170518l);
        if (tdVar.f170518l) {
            com.tencent.mars.xlog.Log.e("SnsAdPressGestureCtrl", "onCancel, isCalledOnFinish==true");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            return;
        }
        if (com.tencent.mm.plugin.sns.ui.td.a(tdVar) == null) {
            com.tencent.mars.xlog.Log.e("SnsAdPressGestureCtrl", "onCancel, mGestureInfo == null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            return;
        }
        com.tencent.mm.plugin.sns.ui.widget.b1 b1Var = tdVar.f170520n;
        if (b1Var != null) {
            b1Var.onCancel();
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo c17 = com.tencent.mm.plugin.sns.ui.td.c(tdVar);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - tdVar.f170516j);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        com.tencent.mm.plugin.sns.ui.td.f(c17, 1, currentTimeMillis, tdVar.f170511e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.b1
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "onClick");
        com.tencent.mm.plugin.sns.ui.widget.b1 b1Var = this.f170338a.f170520n;
        if (b1Var != null) {
            b1Var.onClick(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.b1
    public void onFinish() {
        int longPressTime;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish, isCalledOnFinish=");
        com.tencent.mm.plugin.sns.ui.td tdVar = this.f170338a;
        sb6.append(tdVar.f170518l);
        com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", sb6.toString());
        if (tdVar.f170518l) {
            com.tencent.mars.xlog.Log.e("SnsAdPressGestureCtrl", "onFinish, secondTimes");
        } else {
            tdVar.f170518l = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            android.os.Handler handler = tdVar.f170512f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            handler.postDelayed(new com.tencent.mm.plugin.sns.ui.pd(this), 100L);
            com.tencent.mm.plugin.sns.ui.widget.b1 b1Var = tdVar.f170520n;
            if (b1Var != null) {
                b1Var.onFinish();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView snsAdTouchProgressView = tdVar.f170509c;
            if (snsAdTouchProgressView == null) {
                longPressTime = 0;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                longPressTime = snsAdTouchProgressView.getLongPressTime();
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo c17 = com.tencent.mm.plugin.sns.ui.td.c(tdVar);
            int currentTimeMillis = (int) ((longPressTime + java.lang.System.currentTimeMillis()) - tdVar.f170516j);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            com.tencent.mm.plugin.sns.ui.td.f(c17, 2, currentTimeMillis, tdVar.f170511e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.b1
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.td tdVar = this.f170338a;
        tdVar.f170516j = currentTimeMillis;
        tdVar.f170518l = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        android.os.Handler handler = tdVar.f170512f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        handler.removeCallbacksAndMessages(null);
        if (com.tencent.mm.plugin.sns.ui.td.a(tdVar) == null) {
            com.tencent.mars.xlog.Log.e("SnsAdPressGestureCtrl", "onStart, mGestureInfo == null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "onStart, isCalledOnFinish=" + tdVar.f170518l);
        com.tencent.mm.plugin.sns.ui.widget.b1 b1Var = tdVar.f170520n;
        if (b1Var != null) {
            b1Var.onStart();
        }
        ca4.z0.I0(new long[]{0, 60});
        if (com.tencent.mm.plugin.sns.ui.td.b(tdVar) != null) {
            android.view.View b17 = com.tencent.mm.plugin.sns.ui.td.b(tdVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdPressGestureCtrl$2", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/sns/ui/SnsAdPressGestureCtrl$2", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View b18 = com.tencent.mm.plugin.sns.ui.td.b(tdVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            android.graphics.drawable.Drawable drawable = tdVar.f170515i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            b18.setBackground(drawable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
    }
}
