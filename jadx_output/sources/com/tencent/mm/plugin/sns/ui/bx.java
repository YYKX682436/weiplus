package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bx implements android.view.View.OnClickListener {
    public bx(com.tencent.mm.plugin.sns.ui.kw kwVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$24");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "appbrandHomeRedirectListener");
        if (!(view.getTag() instanceof com.tencent.mm.protocal.protobuf.TimeLineObject)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$24");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) view.getTag();
        r45.y87 y87Var = timeLineObject.weappInfo;
        if (y87Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener username is null");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$24");
            return;
        }
        java.lang.String str = y87Var.f390864d;
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "username: " + str);
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        nxVar.f7469d = 1009;
        nxVar.f7470e = timeLineObject.Id + ":" + timeLineObject.UserName;
        nxVar.f7486u = timeLineObject.Id;
        nxVar.f7488w = 2;
        nxVar.f7487v = timeLineObject.UserName;
        startAppBrandUIFromOuterEvent.e();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$24");
    }
}
