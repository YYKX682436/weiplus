package s74;

/* loaded from: classes4.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f404255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w64.n f404257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f404259h;

    public e2(int i17, s74.o2 o2Var, w64.n nVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        this.f404255d = i17;
        this.f404256e = o2Var;
        this.f404257f = nVar;
        this.f404258g = snsInfo;
        this.f404259h = timeLineObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        w64.x xVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$processGridElementContainer$1$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicComponent$processGridElementContainer$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f404255d;
        s74.o2 o2Var = this.f404256e;
        if (i17 == 0) {
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.mhg);
            java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            com.tencent.mars.xlog.Log.i(o2Var.j(), "onGridElementClick, isFakeClick=" + booleanValue);
            if (!booleanValue) {
                s74.f3 D = o2Var.D();
                if (D != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView2JumpAnimMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    java.util.Map map = D.f404284r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView2JumpAnimMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    if (map != null) {
                        xVar = (w64.x) ((java.util.LinkedHashMap) map).get(view);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                        view.setTag(com.tencent.mm.R.id.ptl, xVar);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                    }
                }
                xVar = null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                view.setTag(com.tencent.mm.R.id.ptl, xVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
            }
            this.f404257f.x(null);
            view.setTag(com.tencent.mm.R.id.mhg, java.lang.Boolean.FALSE);
        }
        com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.d(this.f404258g);
        l44.k4 k4Var = l44.k4.f316220a;
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) o2Var.i();
        java.lang.String localid = snsInfo != null ? snsInfo.getLocalid() : null;
        java.lang.String str = localid == null ? "" : localid;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f404259h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        k4Var.a(view, str, timeLineObject, o2Var.f404451r, o2Var.H(), o2Var.G(), this.f404257f, false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicComponent$processGridElementContainer$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$processGridElementContainer$1$3");
    }
}
