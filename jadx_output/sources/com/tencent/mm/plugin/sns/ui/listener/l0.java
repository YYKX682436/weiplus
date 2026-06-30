package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class l0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169836d;

    public l0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169836d = iVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "unlike click");
        if (!(adapterView.getAdapter() instanceof com.tencent.mm.plugin.sns.ui.k)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TimelineClickListener", "unknown unlike adapter click");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
            return;
        }
        ca4.j jVar = (ca4.j) view.getTag();
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(jVar.f39954c);
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169836d;
        if (k17 == null) {
            try {
                iVar.H(view);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "onUnLikeFinishError exp=" + e17.toString());
            }
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
            return;
        }
        ca4.i iVar2 = jVar.f39952a;
        if (i17 == 0) {
            if (k17.isAd()) {
                com.tencent.mm.plugin.sns.storage.ADInfo s17 = com.tencent.mm.plugin.sns.ui.listener.i.s(iVar, k17);
                ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Bi(11855, k17.getAdRecSrc(), 3, s17 == null ? "" : s17.viewId, java.lang.Integer.valueOf(k17.getAdRecSrc()));
            }
            com.tencent.mm.plugin.sns.storage.d dVar = iVar2.f39940b.adUnlikeInfo;
            dVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasReasonOptions", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
            boolean z17 = dVar.a().size() > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasReasonOptions", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.k kVar = (com.tencent.mm.plugin.sns.ui.k) adapterView.getAdapter();
                kVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stepForward", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
                kVar.f169596g++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stepForward", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
                kVar.notifyDataSetChanged();
                adapterView.setOnItemClickListener(iVar.Q);
                iVar.F(view);
                com.tencent.mm.plugin.sns.storage.c cVar = new com.tencent.mm.plugin.sns.storage.c();
                cVar.f165945d = 101;
                cVar.f165948g = jVar.f39956e;
                cVar.f165949h = 0L;
                com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(k17.field_snsId, 8, cVar);
                gm0.j1.i();
                gm0.j1.n().f273288b.g(q2Var);
            } else {
                if (iVar2.f39940b.forbidClick) {
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
                    return;
                }
                iVar.G(view);
                com.tencent.mm.plugin.sns.storage.c cVar2 = new com.tencent.mm.plugin.sns.storage.c();
                cVar2.f165948g = jVar.f39956e;
                cVar2.f165949h = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.model.q2 q2Var2 = new com.tencent.mm.plugin.sns.model.q2(k17.field_snsId, 8, cVar2);
                gm0.j1.i();
                gm0.j1.n().f273288b.g(q2Var2);
            }
        } else {
            com.tencent.mm.plugin.sns.storage.l lVar = iVar2.f39939a.adFeedbackInfo;
            if (lVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "click feedback item but no report url");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
                return;
            }
            int i18 = i17 - 1;
            if (i18 < ((java.util.LinkedList) lVar.f166039a).size()) {
                java.lang.String str = ((com.tencent.mm.plugin.sns.storage.m) ((java.util.LinkedList) lVar.f166039a).get(i18)).f166060d;
                try {
                    str = za4.z0.d(str, java.lang.String.format("snsid=%s", k17.getTimeLine().Id), java.lang.String.format("aid=%s", k17.getAid()), java.lang.String.format("traceid=%s", k17.getTraceid()), java.lang.String.format("uin=%s", gm0.j1.b().j()));
                } catch (java.lang.Exception unused) {
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("useJs", true);
                intent.putExtra("KPublisherId", "sns_" + ca4.z0.t0(k17.field_snsId));
                intent.putExtra("pre_username", k17.field_userName);
                intent.putExtra("prePublishId", "sns_" + ca4.z0.t0(k17.field_snsId));
                intent.putExtra("preUsername", k17.field_userName);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, com.tencent.mm.plugin.sns.ui.listener.i.e(iVar));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
    }
}
