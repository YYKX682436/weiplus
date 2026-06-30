package m50;

/* loaded from: classes.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, co.a model, java.util.List usernameList, java.lang.Class previewUICClz, boolean z17, android.os.Bundle bundle, com.tencent.mm.ui.widget.dialog.i iVar, boolean z18, com.tencent.mm.ui.zc zcVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        kotlin.jvm.internal.o.g(previewUICClz, "previewUICClz");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseForwardUIC", "showHalfScreenForwardView, toUser:" + kz5.n0.g0(usernameList, ",", null, null, 0, null, null, 62, null) + ", model:" + model.toXml());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(usernameList, ","));
        intent.putExtra("Retr_ForwardXmlContent", model.toXml());
        pf5.j0.a(intent, previewUICClz);
        pf5.j0.a(intent, o50.n.class);
        if (com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
            pf5.j0.a(intent, o50.b.class);
        }
        if (!z17) {
            intent.putExtra("ForwardParams_EnableContentClick", false);
        } else if (iVar != null) {
            ok5.d.b(intent, "ForwardParams_ContentClick", iVar, new ok5.f());
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        int i17 = com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI.f67084e;
        pf5.j0.a(intent, r50.g.class);
        pf5.j0.a(intent, r50.j0.class);
        boolean z19 = (!z18 || (model instanceof ld5.b) || (model instanceof ld5.a)) ? false : true;
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        bh5.d dVar = cVar.f20922a;
        dVar.f20924a = context;
        cVar.b(com.tencent.mm.feature.forward.ui.ForwardMsgPreviewFragment.class);
        cVar.c(false);
        cVar.f(z19);
        dVar.f20927d.w(1);
        cVar.a(com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI.class.getName());
        cVar.i(zcVar);
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).hideVKB();
        }
    }
}
