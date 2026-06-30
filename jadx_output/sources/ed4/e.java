package ed4;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.plugin.sns.ui.widget.l {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.l f251292o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.sns.ui.item.l lVar, java.lang.String str, androidx.lifecycle.y yVar, android.view.View view) {
        super(str, yVar, view);
        this.f251292o = lVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean n(java.lang.Object obj) {
        boolean hasActionBtn;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
            hasActionBtn = false;
        } else {
            hasActionBtn = snsInfo.getAdXml().hasActionBtn();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        return hasActionBtn;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        if (snsInfo != null) {
            snsInfo.getSnsId();
        }
        if (snsInfo2 != null) {
            snsInfo2.getSnsId();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void q(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        com.tencent.mm.plugin.sns.ui.item.l lVar = this.f251292o;
        if (com.tencent.mm.plugin.sns.ui.item.l.F(lVar) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        } else {
            if (com.tencent.mm.plugin.sns.ui.item.l.F(lVar).U0 != null) {
                com.tencent.mm.plugin.sns.ui.item.l.F(lVar).U0.setVisibility(8);
            }
            if (com.tencent.mm.plugin.sns.ui.item.l.F(lVar).T0 != null) {
                com.tencent.mm.plugin.sns.ui.item.l.F(lVar).T0.setVisibility(8);
            }
            android.view.View view = com.tencent.mm.plugin.sns.ui.item.l.F(lVar).V0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$1", "onEveryFillItem", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$1", "onEveryFillItem", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            com.tencent.mm.plugin.sns.ui.pa paVar = lVar.f169371r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            if (paVar == null) {
                android.app.Activity activity = lVar.f169249f;
                android.view.ViewGroup viewGroup = com.tencent.mm.plugin.sns.ui.item.l.F(lVar).D0;
                i64.b1 b1Var = lVar.f169251h.f168036b.f169702c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                w64.l lVar2 = lVar.E;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                com.tencent.mm.plugin.sns.ui.pa paVar2 = new com.tencent.mm.plugin.sns.ui.pa(activity, viewGroup, 0, b1Var, lVar2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                lVar.f169371r = paVar2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            com.tencent.mm.plugin.sns.ui.pa paVar3 = lVar.f169371r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            paVar3.m(snsInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            com.tencent.mm.plugin.sns.ui.pa paVar4 = lVar.f169371r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            paVar4.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComponentList", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            java.util.List list = paVar4.f170206x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComponentList", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            w(list);
            e(snsInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        com.tencent.mm.plugin.sns.ui.item.l lVar = this.f251292o;
        if (com.tencent.mm.plugin.sns.ui.item.l.F(lVar) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
            return;
        }
        android.view.View view = com.tencent.mm.plugin.sns.ui.item.l.F(lVar).V0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$1", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$1", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
    }
}
