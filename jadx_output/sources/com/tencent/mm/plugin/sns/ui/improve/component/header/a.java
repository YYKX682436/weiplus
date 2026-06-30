package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.e f168811d;

    public a(com.tencent.mm.plugin.sns.ui.improve.component.header.e eVar, int i17, int i18) {
        this.f168811d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.improve.component.header.a aVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2;
        java.lang.String str5;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewParent parent = view.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) parent).removeView(view);
        java.lang.String str6 = "(Landroid/view/View;)V";
        java.lang.String str7 = "android/view/View$OnClickListener";
        java.lang.String str8 = "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1";
        if (view.getTag() instanceof java.lang.String) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
            com.tencent.mm.plugin.sns.ui.improve.component.header.e eVar = this.f168811d;
            android.content.Context context = eVar.f168836d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
            if (context != null) {
                java.lang.Object tag = view.getTag();
                kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str9 = (java.lang.String) tag;
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ErrorPost", "sns Header tag:".concat(str9));
                android.content.Intent intent = new android.content.Intent();
                com.tencent.mm.pointers.PLong pLong = new com.tencent.mm.pointers.PLong();
                if (r26.i0.y(str9, "feed_", false)) {
                    str5 = str9.substring(5);
                    kotlin.jvm.internal.o.f(str5, "substring(...)");
                    snsInfo2 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str5);
                    str2 = "android/view/View$OnClickListener";
                    str3 = "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1";
                    str4 = str9;
                } else {
                    if (r26.i0.y(str9, "comment_", false)) {
                        java.lang.String substring = str9.substring(8);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        int P = com.tencent.mm.sdk.platformtools.t8.P(substring, -1);
                        intent.putExtra("INTENT_ERROR_OPTIME", P);
                        com.tencent.mm.plugin.sns.model.i4 xj6 = com.tencent.mm.plugin.sns.model.l4.xj();
                        xj6.getClass();
                        str2 = "android/view/View$OnClickListener";
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        java.util.Iterator it = xj6.f164298a.f444250m.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str3 = str8;
                                str4 = str9;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                                z17 = false;
                                break;
                            }
                            java.util.Iterator it6 = it;
                            wa4.n nVar = (wa4.n) it.next();
                            str3 = str8;
                            if (P == nVar.f444266e) {
                                str4 = str9;
                                pLong.value = nVar.f444265d;
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAsyncQueueMgr", "getByOpTime find %s", java.lang.Integer.valueOf(P));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                                z17 = true;
                                break;
                            }
                            str8 = str3;
                            it = it6;
                        }
                        if (z17) {
                            snsInfo = com.tencent.mm.plugin.sns.model.l4.Fj().W0(pLong.value);
                            intent.putExtra("INTENT_SNSID", pLong.value);
                            snsInfo2 = snsInfo;
                            str5 = "";
                        }
                    } else {
                        str2 = "android/view/View$OnClickListener";
                        str3 = "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1";
                        str4 = str9;
                    }
                    snsInfo = null;
                    snsInfo2 = snsInfo;
                    str5 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                intent.setClass(eVar.f168836d, com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
                if (snsInfo2 == null || snsInfo2.getUserName() == null || kotlin.jvm.internal.o.b(snsInfo2.getUserName(), "")) {
                    if (r26.i0.y(str4, "comment_", false)) {
                        com.tencent.mm.plugin.sns.model.i4 xj7 = com.tencent.mm.plugin.sns.model.l4.xj();
                        xj7.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeAllErrorComments", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAsyncQueueMgr", "removeAllErrorComments");
                        xj7.f164298a.f444250m.clear();
                        if (!xj7.r()) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAsyncQueueMgr", "removeAllErrorComments error listToFile");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeAllErrorComments", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        eVar.a();
                    }
                    yj0.a.h(this, str3, str2, "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1");
                    return;
                }
                intent.putExtra("INTENT_TALKER", snsInfo2.getUserName());
                intent.putExtra("INTENT_SNS_LOCAL_ID", str5);
                intent.putExtra("INTENT_FROMGALLERY", true);
                m21.w.d(726);
                snsInfo2.getCreateTime();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                android.content.Context context2 = eVar.f168836d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                try {
                    com.tencent.mm.protobuf.f parseFrom = new r45.kj4().parseFrom(snsInfo2.field_postBuf);
                    kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaPostInfo");
                    r45.kj4 kj4Var = (r45.kj4) parseFrom;
                    int i17 = kj4Var.f378753s;
                    if (i17 == 201 || i17 == 210 || i17 != 211) {
                        kj4Var.G = true;
                        snsInfo2.setPostBuf(kj4Var.toByteArray());
                        com.tencent.mm.plugin.sns.model.l4.Fj().w3(snsInfo2.localid, snsInfo2);
                        eVar.a();
                    }
                } catch (java.lang.Exception unused) {
                }
                aVar = this;
                str = "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1";
                str6 = "(Landroid/view/View;)V";
                str7 = str2;
                str8 = str3;
                yj0.a.h(aVar, str8, str7, "onClick", str6);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", str);
            }
        }
        aVar = this;
        str = "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1";
        yj0.a.h(aVar, str8, str7, "onClick", str6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", str);
    }
}
