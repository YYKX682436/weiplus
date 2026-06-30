package s74;

/* loaded from: classes4.dex */
public final class i2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404345d;

    public i2(s74.o2 o2Var) {
        this.f404345d = o2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6 = "emit";
        java.lang.String str7 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$subscriber$1";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$subscriber$1");
        s74.z2 z2Var = (s74.z2) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$subscriber$1");
        com.tencent.mars.xlog.Log.i("DynamicComponent", "the event is " + z2Var);
        z2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEventType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEventType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        if (z2Var.f404627a == 0) {
            java.lang.String str8 = "access$onAnimationEvent";
            java.lang.String str9 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onAnimationEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            s74.o2 o2Var = this.f404345d;
            o2Var.getClass();
            java.lang.String str10 = "onAnimationEvent";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEventName", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEventName", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
            s74.f3 D = o2Var.D();
            java.lang.String str11 = z2Var.f404628b;
            if (D != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                java.util.List list = D.V;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                if (list != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (kotlin.jvm.internal.o.b(((s74.a1) next).a().optString("event"), str11)) {
                            arrayList.add(next);
                        }
                    }
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        s74.a1 animationInfo = (s74.a1) it6.next();
                        s74.q4 q4Var = s74.q4.f404513a;
                        s74.f3 D2 = o2Var.D();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processViewAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
                        kotlin.jvm.internal.o.g(animationInfo, "animationInfo");
                        java.util.Iterator it7 = ((java.util.ArrayList) animationInfo.b()).iterator();
                        while (it7.hasNext()) {
                            android.animation.Animator animator = (android.animation.Animator) it7.next();
                            java.util.Iterator it8 = it6;
                            if (animator.isRunning()) {
                                com.tencent.mars.xlog.Log.e("DynamicView.Utils", "warning !! is Running!");
                            }
                            animator.cancel();
                            it6 = it8;
                        }
                        java.util.Iterator it9 = it6;
                        ((java.util.ArrayList) animationInfo.b()).clear();
                        org.json.JSONArray optJSONArray = animationInfo.a().optJSONArray("modified-property");
                        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                        c0Var.f310112d = true;
                        java.lang.String str12 = str6;
                        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
                        c0Var2.f310112d = true;
                        java.lang.String str13 = str7;
                        kotlin.jvm.internal.c0 c0Var3 = new kotlin.jvm.internal.c0();
                        c0Var3.f310112d = true;
                        java.lang.String str14 = str8;
                        kotlin.jvm.internal.c0 c0Var4 = new kotlin.jvm.internal.c0();
                        c0Var4.f310112d = true;
                        java.lang.String str15 = str9;
                        kotlin.jvm.internal.c0 c0Var5 = new kotlin.jvm.internal.c0();
                        c0Var5.f310112d = true;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (optJSONArray != null) {
                            str5 = str10;
                            c75.c.d(optJSONArray, new s74.p4(c0Var, c0Var2, c0Var3, c0Var4, c0Var5, linkedHashMap));
                        } else {
                            str5 = str10;
                        }
                        if (!c0Var.f310112d) {
                            q4Var.n(linkedHashMap, animationInfo);
                        }
                        if (!c0Var2.f310112d) {
                            q4Var.s(linkedHashMap, animationInfo, D2);
                        }
                        if (!c0Var3.f310112d) {
                            q4Var.q(linkedHashMap, animationInfo);
                        }
                        if (!c0Var4.f310112d) {
                            q4Var.p(linkedHashMap, animationInfo);
                        }
                        if (!c0Var5.f310112d) {
                            q4Var.l(linkedHashMap, animationInfo);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processViewAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
                        it6 = it9;
                        str6 = str12;
                        str7 = str13;
                        str8 = str14;
                        str9 = str15;
                        str10 = str5;
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    java.lang.String str16 = str9;
                    java.lang.String str17 = str10;
                    ((java.util.ArrayList) o2Var.K).addAll(arrayList);
                    if ((!arrayList.isEmpty()) && kotlin.jvm.internal.o.b(str11, "onPlayEnd")) {
                        o2Var.M = true;
                    }
                    str4 = str16;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str17, str4);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
                    str6 = str;
                    str7 = str2;
                }
            }
            str = "emit";
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$subscriber$1";
            str3 = "access$onAnimationEvent";
            str4 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent";
            com.tencent.mars.xlog.Log.i("DynamicComponent", "there is no animation config for event [" + str11 + ']');
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEvent", str4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
            str6 = str;
            str7 = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str7);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str7);
        return f0Var;
    }
}
