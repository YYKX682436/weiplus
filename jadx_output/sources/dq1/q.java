package dq1;

/* loaded from: classes8.dex */
public final class q extends dq1.a {
    public q() {
        dq1.u[] uVarArr = dq1.u.f242358d;
    }

    @Override // dq1.k
    public boolean a(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI ui6, dq1.b context, com.tencent.mm.protobuf.g actionBuffer, com.tencent.mm.protobuf.g gVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f242353a;
        if (!pVar.a(dq1.c.f242346d, context, pVar.b())) {
            return false;
        }
        r45.n00 n00Var = new r45.n00();
        try {
            n00Var.parseFrom(actionBuffer.g());
            final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(ui6);
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest();
            openIMKefuStartConversationRequest.f72273e = java.lang.System.currentTimeMillis();
            openIMKefuStartConversationRequest.f72274f = 17;
            android.content.Intent intent = new android.content.Intent();
            openIMKefuStartConversationRequest.f72288w = intent;
            final android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
            intent.putExtra("key_result_receiver", new android.os.ResultReceiver(createFreeHandler) { // from class: com.tencent.mm.plugin.biz.scheme.handler.BizSchemeWWKefu$handle$1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i17, android.os.Bundle bundle) {
                    android.app.Activity activity;
                    boolean z17 = false;
                    if (bundle != null && bundle.getInt("result_key_action", 0) == 3) {
                        z17 = true;
                    }
                    if (!z17 || (activity = (android.app.Activity) weakReference.get()) == null) {
                        return;
                    }
                    activity.finishAndRemoveTask();
                }
            });
            openIMKefuStartConversationRequest.f72272d = ui6;
            r45.s4 s4Var = new r45.s4();
            openIMKefuStartConversationRequest.f72277i = s4Var;
            java.lang.String str2 = n00Var.f380971d;
            s4Var.f385486d = str2;
            s4Var.f385487e = str2;
            s4Var.f385489g = new r45.l05();
            r45.l05 l05Var = openIMKefuStartConversationRequest.f72277i.f385489g;
            l05Var.f379061f = n00Var.f380971d;
            l05Var.f379060e = "";
            l05Var.f379059d = openIMKefuStartConversationRequest.f72274f;
            openIMKefuStartConversationRequest.f72281p = true;
            openIMKefuStartConversationRequest.f72282q = openIMKefuStartConversationRequest.f72272d.getString(com.tencent.mm.R.string.hez);
            openIMKefuStartConversationRequest.f72276h = j41.f0.a(openIMKefuStartConversationRequest.f72274f);
            openIMKefuStartConversationRequest.f72283r = true;
            openIMKefuStartConversationRequest.f72285t = true;
            openIMKefuStartConversationRequest.f72286u = true;
            ((l41.g2) ((j41.z) i95.n0.c(j41.z.class))).Bi(openIMKefuStartConversationRequest);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = ui6.f93877h;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeWWKefu", "e = " + e17.getMessage());
            return false;
        }
    }
}
