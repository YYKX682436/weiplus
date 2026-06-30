package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class a6 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f198365d;

    public a6(yb5.d dVar) {
        this.f198365d = dVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.lang.CharSequence z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yb5.d dVar = this.f198365d;
        if (((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).f199263e.N0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: isScrolling return");
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        if (((sb5.s) cVar.a(sb5.s.class)).u()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: isFinderScene return:%s", dVar.x());
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (((sb5.x) cVar.a(sb5.x.class)).t()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: isGameLifeScene return:%s", dVar.x());
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).G0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: isBizFansChat return:%s", dVar.x());
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).H0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: isBizPhotoFansChat return:%s", dVar.x());
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) cVar.a(sb5.s0.class));
        java.lang.String lastText = jbVar.f199263e.getLastText();
        int selectionStart = jbVar.f199263e.getSelectionStart();
        if (selectionStart < 0) {
            selectionStart = 0;
        } else if (selectionStart > lastText.length()) {
            selectionStart = lastText.length();
        }
        if ((erVar != null && c01.z1.r().equals(erVar.f203906b)) || erVar.f203906b.equals("notifymessage") || erVar.f203906b.equals("appbrand_notify_message") || com.tencent.mm.storage.z3.r4(erVar.f203906b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: tag.userName return %s", erVar.f203906b);
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) cVar.a(sb5.s0.class))).f199263e.getIsVoiceInputPanleShow()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingListAvatarListener", "ChatFooter VoiceInputPanel Show NOW!!!");
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        sb5.f fVar = (sb5.f) cVar.a(sb5.f.class);
        if (!com.tencent.mm.storage.z3.R4(dVar.x())) {
            com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) fVar;
            if (!aVar.f198754s) {
                if ((c01.e2.J(dVar.x()) && !dVar.x().contains("@")) || com.tencent.mm.storage.z3.L3(dVar.x())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick special - talker:%s", dVar.x());
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10976, 0, 1, 1);
                    java.lang.CharSequence Bi = (!aVar.f198753r || aVar.f198754s) ? ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Bi(erVar.f203906b) : ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) cVar.a(sb5.n.class))).s0(erVar.f203906b);
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(lastText);
                    stringBuffer.insert(selectionStart, Bi);
                    jbVar.f199263e.k1(stringBuffer.toString(), selectionStart + Bi.length(), true);
                    jbVar.f199263e.setMode(1);
                }
                yj0.a.i(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10976, 0, 1, 0);
        com.tencent.mm.storage.b3 b3Var = (com.tencent.mm.storage.b3) c01.d9.b().l();
        java.lang.String str = erVar.f203909e;
        com.tencent.mm.storage.a3 z08 = b3Var.z0(str);
        com.tencent.mm.ui.chatting.component.biz.a aVar2 = (com.tencent.mm.ui.chatting.component.biz.a) fVar;
        if (aVar2.f198754s) {
            z07 = ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) cVar.a(sb5.n.class))).s0(erVar.f203906b);
        } else {
            z07 = z08 == null ? null : z08.z0(erVar.f203906b);
            if (com.tencent.mm.sdk.platformtools.t8.J0(z07)) {
                z07 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Bi(erVar.f203906b);
            }
        }
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(lastText);
        stringBuffer2.insert(selectionStart, "@" + ((java.lang.Object) z07) + (char) 8197);
        jbVar.f199263e.k1(stringBuffer2.toString(), selectionStart + z07.length() + 2, true);
        jbVar.f199263e.r(str, erVar.f203906b, z07.toString());
        jbVar.f199263e.setMode(1);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingListAvatarListener", "update at someone record from log click");
        ((qd0.c) ((rd0.s0) i95.n0.c(rd0.s0.class))).wi(str, erVar.f203906b);
        if (!aVar2.f198754s && z08 != null) {
            com.tencent.mm.autogen.mmdata.rpt.LongPressHeadImageAtUserStruct longPressHeadImageAtUserStruct = new com.tencent.mm.autogen.mmdata.rpt.LongPressHeadImageAtUserStruct();
            int i17 = z08.L0(c01.z1.r()) ? 1 : z08.G0(c01.z1.r()) ? 2 : 3;
            longPressHeadImageAtUserStruct.f58695d = longPressHeadImageAtUserStruct.b("ChatName", dVar.x(), true);
            longPressHeadImageAtUserStruct.f58697f = z08.field_memberCount;
            longPressHeadImageAtUserStruct.f58696e = i17;
            longPressHeadImageAtUserStruct.k();
            longPressHeadImageAtUserStruct.o();
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
