package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class sq extends com.tencent.mm.ui.chatting.viewitems.um {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence] */
    @Override // com.tencent.mm.ui.chatting.viewitems.um
    public void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, com.tencent.mm.ui.chatting.adapter.q qVar, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        android.text.SpannableString spannableString;
        f21.a m07;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        java.lang.String x17 = dVar.x();
        com.tencent.mm.ui.chatting.viewitems.vm vmVar = (com.tencent.mm.ui.chatting.viewitems.vm) g0Var;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("conv_talker_username", x17);
        if (dVar.f460717l instanceof com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI) {
            bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 10);
        } else if (dVar.D()) {
            bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        } else {
            bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putLong("msg_id", f9Var.getMsgId());
        bundle.putLong("msg_sever_id", f9Var.I0());
        bundle.putString("send_msg_username", f9Var.Q0());
        k01.v0 v0Var = (k01.v0) i95.n0.c(k01.v0.class);
        java.lang.String j17 = f9Var.j();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(dVar.g());
        java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(vmVar.f205878b);
        oh1.o1 o1Var = (oh1.o1) v0Var;
        o1Var.getClass();
        tt0.d a17 = tt0.d.a(j17);
        android.content.Context context = (android.content.Context) weakReference.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaSubscribeMsgService", "context is null");
        } else {
            java.lang.String str2 = a17.f421796a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                java.lang.String string = bundle.getString("conv_talker_username");
                int i17 = bundle.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                long j18 = bundle.getLong("msg_sever_id");
                java.lang.String string2 = bundle.getString("send_msg_username");
                long j19 = a17.f421806k;
                android.text.SpannableString spannableString2 = new android.text.SpannableString(str2);
                spannableString2.setSpan(new oh1.m1(o1Var, 1, null, a17, string, j19, i17, j18, string2), str2.indexOf(a17.f421798c), str2.indexOf(a17.f421798c) + a17.f421798c.length(), 17);
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaSubscribeMsgService", "wxaSubscribeSysContent.forbids:%d", java.lang.Integer.valueOf(a17.f421804i));
                if (a17.f421804i == 1) {
                    spannableString = spannableString2;
                } else {
                    k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(a17.f421800e);
                    java.lang.String str3 = Bi != null ? Bi.field_brandIconURL : "";
                    l01.b bVar = l01.d0.f314761a;
                    android.graphics.Bitmap f17 = bVar.f(str3, null);
                    if (f17 == null) {
                        bVar.m(new oh1.n1(o1Var, weakReference2, weakReference, spannableString2), str3, null);
                        spannableString = android.text.TextUtils.concat(o1Var.wi(context, a17.f421805j, null), spannableString2);
                    } else {
                        spannableString = android.text.TextUtils.concat(o1Var.wi(context, a17.f421805j, f17), spannableString2);
                    }
                }
                if (spannableString != null || spannableString.length() == 0) {
                    android.view.View view = vmVar.f205879c;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view2 = vmVar.f205879c;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (spannableString instanceof android.text.SpannableString) {
                        c(spannableString);
                    }
                    vmVar.f205878b.b(spannableString);
                }
                m07 = f21.r0.wi().m0(x17);
                int intValue = ((java.lang.Integer) c01.d9.b().p().l(12311, -2)).intValue();
                vmVar.f205878b.setBackgroundResource(((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).n0());
                if ((m07 != null || m07.f258833b == -2) && (m07 != null || intValue == -2)) {
                    vmVar.f205878b.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.f478520a84));
                } else {
                    vmVar.f205878b.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.adg));
                }
                vmVar.f205878b.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.rq(this));
                vmVar.f205878b.invalidate();
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaSubscribeMsgService", "content is null, return");
        }
        spannableString = null;
        if (spannableString != null) {
        }
        android.view.View view3 = vmVar.f205879c;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m07 = f21.r0.wi().m0(x17);
        int intValue2 = ((java.lang.Integer) c01.d9.b().p().l(12311, -2)).intValue();
        vmVar.f205878b.setBackgroundResource(((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).n0());
        if (m07 != null) {
        }
        vmVar.f205878b.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.f478520a84));
        vmVar.f205878b.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.rq(this));
        vmVar.f205878b.invalidate();
    }
}
