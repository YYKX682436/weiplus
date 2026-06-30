package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class aa extends com.tencent.mm.plugin.sns.ui.widget.ad.v0 {
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.l C;
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pa D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(com.tencent.mm.plugin.sns.ui.pa paVar, android.view.View view, android.content.Context context, java.lang.String str, androidx.lifecycle.y yVar, android.view.View view2, com.tencent.mm.plugin.sns.ui.widget.l lVar) {
        super(view, context, str, yVar, view2);
        this.D = paVar;
        this.C = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if ((!r26.n0.N(r7.f166126a)) != false) goto L19;
     */
    @Override // com.tencent.mm.plugin.sns.ui.widget.ad.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean O(com.tencent.mm.plugin.sns.storage.SnsInfo r7) {
        /*
            r6 = this;
            java.lang.String r0 = "isComponentExist"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            if (r7 == 0) goto L18
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r7.getAdXml()
            if (r7 == 0) goto L18
            com.tencent.mm.plugin.sns.storage.s0 r7 = r7.adMultiProductsInfo
            goto L19
        L18:
            r7 = 0
        L19:
            if (r7 == 0) goto L4d
            android.content.Context r3 = r6.f171051p
            boolean r3 = ca4.m0.Z(r3)
            if (r3 != 0) goto L4d
            java.util.List r3 = r7.a()
            boolean r3 = r3.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L4d
            java.util.List r3 = r7.a()
            int r3 = r3.size()
            if (r3 > r4) goto L4e
            java.lang.String r3 = "getProductDesc"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            java.lang.String r7 = r7.f166126a
            boolean r7 = r26.n0.N(r7)
            r7 = r7 ^ r4
            if (r7 == 0) goto L4d
            goto L4e
        L4d:
            r4 = 0
        L4e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.aa.O(com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        kotlin.jvm.internal.o.g(model, "model");
        android.view.ViewGroup L = L();
        if (L == null) {
            com.tencent.mars.xlog.Log.e(j(), "multiView is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        } else {
            L.setClipChildren(false);
            if (K() == 1) {
                com.tencent.mm.plugin.sns.storage.s0 s0Var = model.getAdXml().adMultiProductsInfo;
                s0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProductDesc", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProductDesc", "com.tencent.mm.plugin.sns.storage.AdMultiProductsInfo");
                java.lang.String str = s0Var.f166126a;
                if (!android.text.TextUtils.isEmpty(str)) {
                    android.text.SpannableString Ri = com.tencent.mm.smiley.x1.Di().Ri(str, true);
                    android.widget.TextView M = M();
                    if (M != null) {
                        M.setText(Ri);
                    }
                }
                android.widget.TextView M2 = M();
                if (M2 != null) {
                    M2.setVisibility(0);
                }
            } else {
                android.widget.TextView M3 = M();
                if (M3 != null) {
                    M3.setVisibility(8);
                }
            }
            c(new com.tencent.mm.plugin.sns.ui.widget.ad.e(this, model));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        }
        java.lang.String str2 = model.getAdXml().adCardTitle;
        java.lang.String str3 = model.getAdXml().adCardDesc;
        android.widget.TextView D = D();
        com.tencent.mm.plugin.sns.ui.pa paVar = this.D;
        if (D != null && C() != null && B() != null && L() != null) {
            android.widget.TextView D2 = D();
            android.widget.TextView C = C();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            paVar.t(str2, str3, D2, C);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            B().setOnClickListener(new com.tencent.mm.plugin.sns.ui.z9(this, com.tencent.mm.plugin.sns.ui.pa.i(paVar)));
            com.tencent.mm.plugin.sns.ui.pa.j(paVar, B());
            com.tencent.mm.plugin.sns.ui.pa.c(paVar, model);
            android.view.View h17 = com.tencent.mm.plugin.sns.ui.pa.h(paVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$7", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$7", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            L().setVisibility(0);
        }
        try {
            if (com.tencent.mm.plugin.sns.ui.pa.e(paVar) != null && com.tencent.mm.plugin.sns.ui.pa.d(paVar) != null) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.kmv);
                android.view.View findViewById = com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.jdk);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.f482447eu);
                android.view.View findViewById2 = com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.b7k);
                viewGroup.setClipToPadding(false);
                viewGroup.setClipChildren(false);
                if (viewGroup.getParent() instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) viewGroup.getParent()).setClipChildren(false);
                }
                viewGroup2.setClipChildren(false);
                android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                }
                viewGroup.setPadding(0, 0, 0, 0);
                viewGroup.requestLayout();
                findViewById.requestLayout();
                if (findViewById2.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
                    ((android.view.ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams()).bottomMargin = i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 16);
                    ((android.view.ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams()).topMargin = 0;
                    findViewById2.requestLayout();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "adMultiProductComponent bind error", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public /* bridge */ /* synthetic */ boolean n(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7");
        boolean O = O((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7");
        return O;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        android.animation.AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetComponentState ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) i();
        sb6.append(snsInfo != null ? snsInfo.getSnsId() : null);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "resetComponentState() called");
        com.tencent.mm.plugin.sns.ui.widget.l lVar = this.C;
        com.tencent.mm.plugin.sns.ui.pa paVar = this.D;
        if (!lVar.n(com.tencent.mm.plugin.sns.ui.pa.l(paVar))) {
            com.tencent.mm.plugin.sns.ui.pa.j(paVar, (android.widget.Button) com.tencent.mm.plugin.sns.ui.pa.h(paVar).findViewById(com.tencent.mm.R.id.f482445es));
            android.view.View h17 = com.tencent.mm.plugin.sns.ui.pa.h(paVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$7", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$7", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (L() != null) {
            L().setVisibility(8);
        }
        try {
            if (com.tencent.mm.plugin.sns.ui.pa.e(paVar) != null && com.tencent.mm.plugin.sns.ui.pa.d(paVar) != null) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.kmv);
                android.view.View findViewById = com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.jdk);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.f482447eu);
                android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i65.a.h(com.tencent.mm.plugin.sns.ui.pa.d(paVar), com.tencent.mm.R.dimen.f479924j3);
                }
                if (viewGroup.getParent() instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) viewGroup.getParent()).setClipChildren(true);
                }
                viewGroup.setClipToPadding(true);
                viewGroup.setClipChildren(true);
                viewGroup2.setClipChildren(true);
                viewGroup.setPadding(0, 0, 0, i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 16));
                viewGroup.requestLayout();
                findViewById.requestLayout();
                android.view.View findViewById2 = com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.b7k);
                if (findViewById2.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
                    int b17 = i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 12);
                    ((android.view.ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams()).bottomMargin = 0;
                    ((android.view.ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams()).topMargin = b17;
                    findViewById2.requestLayout();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "adMultiProductComponent resetComponentState error", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7");
    }
}
