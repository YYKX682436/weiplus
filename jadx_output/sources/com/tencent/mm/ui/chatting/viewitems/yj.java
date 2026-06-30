package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class yj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.vq f206087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f206088e;

    public yj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.viewitems.vq vqVar) {
        this.f206088e = chattingItemDyeingTemplate;
        this.f206087d = vqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.storage.f9 c17;
        com.tencent.mm.ui.chatting.viewitems.wq wqVar;
        com.tencent.mm.ui.chatting.view.FoldableCellLayout foldableCellLayout;
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.vq vqVar = this.f206087d;
        vqVar.f205887k.setVisibility(8);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        com.tencent.mm.storage.f9 c18 = erVar.c();
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f206088e;
        if (((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.k0.class))).s0()) {
            int d17 = erVar.d();
            com.tencent.mm.ui.chatting.component.g9 g9Var = (com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.k0.class));
            if (g9Var.s0() && (c17 = erVar.c()) != null && (wqVar = vqVar.f205890n) != null && (foldableCellLayout = wqVar.f205957a) != null && foldableCellLayout.getVisibility() == 0) {
                com.tencent.mm.ui.chatting.view.FoldableCellLayout foldableCellLayout2 = vqVar.f205890n.f205957a;
                java.util.List o07 = g9Var.o0(c17.getMsgId());
                long msgId = c17.getMsgId();
                if (g9Var.s0() && (map = g9Var.f199085f) != null && (map2 = g9Var.f199088i) != null && (map3 = g9Var.f199087h) != null) {
                    java.util.HashSet hashSet = (java.util.HashSet) g9Var.f199091o;
                    hashSet.add(java.lang.Long.valueOf(msgId));
                    java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) map).remove(java.lang.Long.valueOf(msgId));
                    if (l17 != null) {
                        if (msgId < l17.longValue()) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingServiceNotifyComponent", "head msg id is large than end msg id!");
                        } else {
                            for (long longValue = l17.longValue(); longValue <= msgId; longValue++) {
                                ((java.util.HashMap) map2).remove(java.lang.Long.valueOf(longValue));
                                hashSet.add(java.lang.Long.valueOf(longValue));
                            }
                            ((java.util.HashMap) g9Var.f199086g).remove(l17);
                        }
                    }
                    java.util.Set set = (java.util.Set) ((java.util.HashMap) map3).remove(l17);
                    int size = set != null ? (d17 - set.size()) + 1 : 0;
                    sb5.z zVar = (sb5.z) g9Var.f198580d.f460708c.a(sb5.z.class);
                    if (zVar != null) {
                        ((com.tencent.mm.ui.chatting.adapter.k) zVar).I0(size);
                    }
                }
                android.view.LayoutInflater from = android.view.LayoutInflater.from(foldableCellLayout2.getContext());
                foldableCellLayout2.removeAllViews();
                java.util.Iterator it = ((java.util.ArrayList) o07).iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                    i17++;
                    com.tencent.mm.ui.chatting.viewitems.xg xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(from, com.tencent.mm.R.layout.f488476uc);
                    com.tencent.mm.ui.chatting.viewitems.xq xqVar = new com.tencent.mm.ui.chatting.viewitems.xq();
                    xqVar.a(xgVar);
                    xqVar.checkBox.setVisibility(8);
                    xqVar.timeTV.setVisibility(8);
                    chattingItemDyeingTemplate.C0(xqVar, chattingItemDyeingTemplate.f203175s, f9Var, erVar.f203906b);
                    foldableCellLayout2.a(xgVar, new android.widget.FrameLayout.LayoutParams(-2, -2));
                    if (i17 >= 3) {
                        break;
                    }
                }
                foldableCellLayout2.post(new com.tencent.mm.ui.chatting.viewitems.ch(chattingItemDyeingTemplate, foldableCellLayout2, g9Var));
            }
        } else {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 2, c18);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.p0(chattingItemDyeingTemplate, vqVar, erVar, erVar.d());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
