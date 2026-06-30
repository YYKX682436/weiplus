package wu;

/* loaded from: classes9.dex */
public final class x extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.m mVar = new z01.m();
        s15.h hVar = item.f284997e;
        java.lang.String string = hVar.getString(hVar.f303422d + 0);
        kotlin.jvm.internal.o.g(string, "<set-?>");
        mVar.f469098i = string;
        java.lang.String f07 = com.tencent.mm.sdk.platformtools.t8.f0(hVar.getLong(hVar.f303422d + 11));
        if (f07 == null) {
            f07 = "";
        }
        mVar.f469099m = f07;
        mVar.f469100n = com.tencent.mm.R.drawable.d87;
        java.lang.String n17 = hVar.n();
        i95.m c17 = i95.n0.c(pt.m0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        mVar.f469103q = pt.m0.oa((pt.m0) c17, false, n17, false, false, 12, null);
        mVar.D = new wu.w(this, containerView, item);
        mvvmView.setViewModel(mVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r(context, item);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView s17 = ((bf5.a) Ai).s(context);
        s17.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(s17, -2, -2);
    }

    public final java.lang.String q(java.lang.String str) {
        java.lang.String xml;
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigRecordFileCurrentNodeXmlOnly()) == 1;
        hu.f fVar = this.f449610e;
        if (!z17) {
            s15.w wVar = fVar.f285005e;
            return (wVar == null || (xml = wVar.toXml()) == null) ? "" : xml;
        }
        s15.w wVar2 = fVar.f285005e;
        if (wVar2 == null) {
            return "";
        }
        s15.w wVar3 = new s15.w();
        wVar3.fromJson(wVar2.toJson());
        java.util.LinkedList j17 = wVar3.j();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : j17) {
            s15.h hVar = (s15.h) obj;
            if (kotlin.jvm.internal.o.b(hVar.getString(hVar.f303422d + 3), str)) {
                arrayList.add(obj);
            }
        }
        wVar3.l(new java.util.LinkedList(arrayList));
        return wVar3.toXml();
    }

    public final void r(android.content.Context context, hu.b bVar) {
        ct.w2 w2Var = (ct.w2) i95.n0.c(ct.w2.class);
        ((com.tencent.mm.pluginsdk.model.app.d3) w2Var).getClass();
        if (!sc5.g.f406573b) {
            s(context, bVar);
            return;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        hu.f fVar = this.f449610e;
        com.tencent.mm.storage.f9 n17 = e0Var.n(fVar.q(), fVar.n());
        s15.h hVar = bVar.f284997e;
        java.lang.String string = hVar.getString(hVar.f303422d + 3);
        if (((com.tencent.mm.pluginsdk.model.app.d3) w2Var).Bi(context, n17, q(string), string)) {
            return;
        }
        s(context, bVar);
    }

    public final void s(android.content.Context context, hu.b bVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.record.ui.RecordMsgFileUI");
        hu.f fVar = this.f449610e;
        intent.putExtra("message_id", fVar.n());
        intent.putExtra("message_talker", fVar.q());
        s15.h hVar = bVar.f284997e;
        intent.putExtra("record_xml", q(hVar.getString(hVar.f303422d + 3)));
        s15.h hVar2 = bVar.f284997e;
        intent.putExtra("record_data_id", hVar2.getString(hVar2.f303422d + 3));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/appmsg/ui/item/RecordDetailFileItemConvert", "startLegacyFileUI", "(Landroid/content/Context;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailFileItemConvert", "startLegacyFileUI", "(Landroid/content/Context;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
