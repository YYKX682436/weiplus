package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class fa extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ra f190321a;

    public fa(com.tencent.mm.pluginsdk.ui.chat.ra raVar) {
        this.f190321a = raVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17;
        int i18;
        int i19 = message.what;
        com.tencent.mm.pluginsdk.ui.chat.ra raVar = this.f190321a;
        switch (i19) {
            case 20001:
                raVar.d();
                return;
            case 20002:
                removeMessages(20001);
                return;
            case 20003:
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SuggestEmoticonBubble", "show: %s", java.lang.Boolean.valueOf(raVar.f190619j));
                com.tencent.mm.sdk.platformtools.n3 n3Var = raVar.f190635z;
                n3Var.removeMessages(20001);
                if (raVar.f190619j) {
                    com.tencent.mm.pluginsdk.ui.chat.oa oaVar = raVar.f190622m;
                    java.util.ArrayList arrayList = raVar.f190621l;
                    java.util.LinkedList linkedList = oaVar.f190546d;
                    linkedList.clear();
                    linkedList.addAll(arrayList);
                    oaVar.notifyDataSetChanged();
                    androidx.recyclerview.widget.RecyclerView recyclerView = raVar.f190620k;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble", "show", "()V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(recyclerView, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble", "show", "()V", "Undefined", "scrollToPosition", "(I)V");
                    int size = arrayList.size() + raVar.f190629t;
                    if (size > 2) {
                        i17 = (int) (raVar.f190612c * 2.5f);
                        i18 = raVar.f190613d;
                    } else if (size == 2) {
                        i17 = raVar.f190612c * 2;
                        i18 = raVar.f190613d;
                    } else {
                        i17 = raVar.f190612c;
                        i18 = raVar.f190613d;
                    }
                    int i27 = i17 + (i18 * 2);
                    if (raVar.f190614e.isShowing()) {
                        raVar.f190614e.update(i27, -2);
                    } else {
                        raVar.f190614e.setWidth(i27);
                        android.view.View view = raVar.f190615f;
                        if (view != null) {
                            int[] iArr = new int[2];
                            view.getLocationInWindow(iArr);
                            raVar.f190614e.showAtLocation(raVar.f190615f, 0, iArr[0] - ((raVar.f190614e.getWidth() - raVar.f190615f.getWidth()) / 2), iArr[1] - raVar.f190614e.getHeight());
                        }
                    }
                    if (size >= 3) {
                        n3Var.sendEmptyMessageDelayed(20001, 5000L);
                    } else {
                        n3Var.sendEmptyMessageDelayed(20001, 3000L);
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    long j17 = 0;
                    for (int i28 = 0; i28 < arrayList.size(); i28++) {
                        jr.p pVar = (jr.p) arrayList.get(i28);
                        jr.o oVar = pVar.f301317b;
                        if (oVar.f301312a == 1) {
                            j17 = oVar.f301314c;
                        }
                        java.util.HashMap hashMap = new java.util.HashMap();
                        raVar.b(hashMap, pVar, i28);
                        sb6.append(new org.json.JSONObject(hashMap));
                        if (i28 != arrayList.size() - 1) {
                            sb6.append("#");
                        }
                    }
                    raVar.f190632w = sb6.toString().replace(",", ";");
                    raVar.f190630u.put("requestid", java.lang.Long.valueOf(j17));
                    java.util.HashMap c17 = raVar.c();
                    c17.put("issue_emo_num", java.lang.Integer.valueOf(arrayList.size()));
                    c17.put("issue_emo_info", raVar.f190632w);
                    raVar.e("chat_emo_bubble", "view_exp", c17);
                    raVar.f(arrayList, raVar.f190625p);
                    com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct suggestEmoiconStruct = raVar.f190624o;
                    suggestEmoiconStruct.f60998d = 0L;
                    suggestEmoiconStruct.k();
                    raVar.f190625p = arrayList.size();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
