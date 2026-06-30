package s74;

/* loaded from: classes4.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(s74.o2 o2Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        super(0);
        this.f404216d = o2Var;
        this.f404217e = snsInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.listener.c cVar;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onEveryFillItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onEveryFillItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setNormalStyleText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        s74.o2 o2Var = this.f404216d;
        o2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNormalStyleText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        o2Var.P();
        s74.p2 C = o2Var.C();
        C.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPopupMenu", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPopupMenu", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        rl5.r rVar = C.f404488i;
        if (rVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNormalStyleText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        } else {
            com.tencent.mm.plugin.sns.ui.listener.i f17 = o2Var.C().f();
            com.tencent.mm.plugin.sns.ui.listener.h1 h1Var = f17 != null ? f17.f169812o : null;
            if (h1Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNormalStyleText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            } else {
                com.tencent.mm.plugin.sns.ui.listener.i f18 = o2Var.C().f();
                com.tencent.mm.plugin.sns.ui.listener.c cVar2 = f18 != null ? f18.f169809l : null;
                if (cVar2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNormalStyleText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                } else {
                    boolean z18 = true;
                    boolean b17 = pc4.d.f353410a.b(true);
                    s74.f3 D = o2Var.D();
                    if (D != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalStyleText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                        java.util.List list = D.I;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalStyleText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                        if (list != null) {
                            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                            while (it.hasNext()) {
                                android.widget.TextView textView = (androidx.appcompat.widget.AppCompatTextView) it.next();
                                if (textView == null) {
                                    z17 = z18;
                                    cVar = cVar2;
                                } else {
                                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404217e;
                                    com.tencent.mm.plugin.sns.ui.go goVar = new com.tencent.mm.plugin.sns.ui.go(snsInfo.getSnsId(), snsInfo.getLocalid(), true, false, 2);
                                    goVar.f168451g = z18;
                                    java.lang.CharSequence f131525i = textView.getF131525i();
                                    if (f131525i == null || (str = f131525i.toString()) == null) {
                                        str = "";
                                    }
                                    goVar.f168452h = str;
                                    textView.setTag(com.tencent.mm.R.id.r0u, goVar);
                                    if (!b17) {
                                        rVar.j(textView, h1Var, cVar2);
                                    }
                                    android.os.Bundle bundle = new android.os.Bundle();
                                    bundle.putString("key_wxa_short_link_launch_scene", "TIME_LINE");
                                    bundle.putInt("ShareScene", 3);
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(snsInfo.getUserName());
                                    sb6.append('#');
                                    com.tencent.mm.plugin.sns.ui.listener.c cVar3 = cVar2;
                                    sb6.append(ca4.z0.t0(snsInfo.field_snsId));
                                    bundle.putString("ShareSceneId", sb6.toString());
                                    bundle.putLong("CreateTime", snsInfo.field_createTime);
                                    s74.f3 D2 = o2Var.D();
                                    if (D2 != null && D2.r() == 0) {
                                        bundle.putInt("TimelineEnterSource", 1);
                                    } else {
                                        bundle.putInt("TimelineEnterSource", 3);
                                    }
                                    bundle.putInt("SnsContentType", snsInfo.field_type);
                                    bundle.putString("serverMsgID", ca4.z0.t0(snsInfo.field_snsId));
                                    bundle.putString("msgUsername", snsInfo.getUserName());
                                    bundle.putBoolean("SHOULD_PERFORM_CLICK", true);
                                    bundle.putBoolean("SHOULD_PERFORM_LONG_CLICK", true);
                                    s74.f3 D3 = o2Var.D();
                                    ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).pj(textView, 2, 2, new s74.h2(new java.lang.ref.WeakReference(o2Var.G()), snsInfo, D3 != null ? D3.r() : 0), 30, bundle);
                                    if (b17) {
                                        textView.setBackground(null);
                                        z17 = true;
                                        cVar = cVar3;
                                        bd4.f2 f2Var = new bd4.f2(o2Var.E(), textView, snsInfo, h1Var, cVar, null, null, 0, null, 480, null);
                                        wl5.x j17 = f2Var.j();
                                        if (textView.getContext() instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
                                            j17.L = true;
                                        }
                                        ((java.util.ArrayList) o2Var.E).add(f2Var);
                                    } else {
                                        cVar = cVar3;
                                        z17 = true;
                                    }
                                }
                                z18 = z17;
                                cVar2 = cVar;
                            }
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNormalStyleText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setNormalStyleText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onEveryFillItem$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onEveryFillItem$3");
        return f0Var;
    }
}
