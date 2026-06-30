package l41;

@j95.b
/* loaded from: classes8.dex */
public final class g2 extends i95.w implements j41.z {
    public final void Ai(com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest) {
        r45.s4 s4Var = openIMKefuStartConversationRequest.f72277i;
        if (s4Var != null) {
            if (s4Var.f385489g == null) {
                s4Var.f385489g = new r45.l05();
            }
            r45.l05 l05Var = s4Var.f385489g;
            if (l05Var != null) {
                l05Var.f379059d = openIMKefuStartConversationRequest.f72274f;
                r45.s4 s4Var2 = openIMKefuStartConversationRequest.f72277i;
                kotlin.jvm.internal.o.d(s4Var2);
                l05Var.f379061f = s4Var2.f385486d;
            }
        }
    }

    public void Bi(com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        Ai(request);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuStartConversationService", "startConversation %s", request);
        if (request.f72273e == 0) {
            request.f72273e = java.lang.System.currentTimeMillis();
        }
        android.content.Intent intent = request.f72288w;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        wi(intent, request);
        intent.setClassName(request.f72272d, "com.tencent.mm.openim.ui.OpenIMKefuConfirmUI");
        if (!(request.f72272d instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (com.tencent.mm.ui.b2.a(request.f72272d, true, new android.content.Intent[]{intent}, new java.lang.Object[0])) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuStartConversationService", "startConversation hit duplicated start");
            return;
        }
        android.content.Context context = request.f72272d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversation", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversation", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Di(com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest request) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(request, "request");
        r45.s4 s4Var = request.f72277i;
        java.lang.String str2 = s4Var != null ? s4Var.f385490h : null;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuStartConversationService", "startConversationDirectly username invalid");
            return;
        }
        Ai(request);
        android.content.Intent intent = request.f72288w;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        wi(intent, request);
        if (request.f72283r) {
            intent.setClassName(request.f72272d, "com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI");
            intent.putExtra("Contact_User", "opencustomerservicemsg");
            if (request.f72285t) {
                intent.putExtra("key_back_to_launcher_ui_when_finish", true);
            }
        } else {
            if (request.f72278m) {
                java.io.Serializable serializableExtra = request.f72289x.getSerializableExtra("KEY_START_CHATTING_HALF_SCREEN_UIC");
                if (serializableExtra == null) {
                    serializableExtra = ((rb5.m) ((wn.o) i95.n0.c(wn.o.class))).wi(1);
                }
                intent.putExtra("KHalfScreenUIC", serializableExtra);
                android.os.ResultReceiver resultReceiver = request.f72279n;
                if (resultReceiver != null) {
                    intent.putExtra("KEY_LIFE_CYCLE_OBSERVER", resultReceiver);
                }
                android.os.ResultReceiver resultReceiver2 = request.f72280o;
                if (resultReceiver2 != null) {
                    intent.putExtra("key_HalfScreenActionReceiver", resultReceiver2);
                }
                intent.putExtra("finish_direct", true);
                ty.j0 j0Var = (ty.j0) i95.n0.c(ty.j0.class);
                r45.s4 s4Var2 = request.f72277i;
                str = s4Var2 != null ? s4Var2.f385490h : null;
                ((sy.z) j0Var).Ai(str != null ? str : "", intent);
            } else {
                intent.putExtra("finish_direct", true);
                r45.s4 s4Var3 = request.f72277i;
                str = s4Var3 != null ? s4Var3.f385490h : null;
                intent.putExtra("Chat_User", str != null ? str : "");
                intent.setClassName(request.f72272d, "com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI");
            }
        }
        if (!(request.f72272d instanceof android.app.Activity) || request.f72286u) {
            intent.addFlags(268435456);
        }
        if (request.f72278m) {
            return;
        }
        android.content.Context context = request.f72272d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversationWithoutConfirm", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversationWithoutConfirm", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void wi(android.content.Intent intent, com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest) {
        intent.putExtra("key_start_conversation_request", openIMKefuStartConversationRequest);
        intent.putExtra("key_start_conversation_timestamp", java.lang.System.currentTimeMillis());
        intent.putExtras(openIMKefuStartConversationRequest.f72289x);
    }
}
