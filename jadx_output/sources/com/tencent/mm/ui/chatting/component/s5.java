package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class s5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.b5 f199910d;

    public s5(com.tencent.mm.ui.chatting.component.b5 b5Var) {
        this.f199910d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        long[] jArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.b5 b5Var = this.f199910d;
        sb5.z zVar = (sb5.z) b5Var.f198580d.f460708c.a(sb5.z.class);
        yb5.d chattingContext = b5Var.f198580d;
        java.lang.String x17 = chattingContext.x();
        java.util.concurrent.CopyOnWriteArraySet msgIdSet = ((com.tencent.mm.ui.chatting.adapter.k) zVar).W;
        com.tencent.mm.ui.chatting.component.oi oiVar = com.tencent.mm.ui.chatting.component.qi.f199786f;
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(msgIdSet, "msgIdSet");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = msgIdSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(pt0.f0.f358209b1.n(x17, ((com.tencent.mm.plugin.msg.MsgIdTalker) it.next()).f149480d));
        }
        if (oiVar.a(chattingContext, arrayList2)) {
            fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
            android.app.Activity context = b5Var.f198580d.g();
            java.lang.String x18 = b5Var.f198580d.x();
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.tencent.mm.ui.chatting.adapter.k) zVar).W;
            ((gb0.n) kVar).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            bh5.c cVar = new bh5.c();
            android.content.Intent intent = new android.content.Intent();
            if (copyOnWriteArraySet != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArraySet, 10));
                java.util.Iterator it6 = copyOnWriteArraySet.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(java.lang.Long.valueOf(((com.tencent.mm.plugin.msg.MsgIdTalker) it6.next()).f149480d));
                }
                jArr = kz5.n0.T0(arrayList3);
            } else {
                jArr = null;
            }
            intent.putExtra("key_msg_id_list", jArr);
            intent.putExtra("key_talker", x18);
            intent.putExtra("key_is_multi_select", true);
            intent.putExtra("key_material_origin", "chat");
            pf5.j0.a(intent, com.tencent.mm.feature.openmsg.uic.n.class);
            pf5.j0.a(intent, com.tencent.mm.feature.openmsg.uic.p0.class);
            pf5.j0.a(intent, com.tencent.mm.feature.openmsg.uic.b.class);
            cVar.d(intent);
            cVar.f20922a.f20924a = context;
            cVar.a(com.tencent.mm.feature.openmsg.ui.OpenMsgUI.class.getName());
            cVar.b(com.tencent.mm.feature.openmsg.ui.OpenMsgHalfScreenDialog.class);
            cVar.g();
        }
        tb5.i0.f417055a.c(b5Var.p0(), "open", b5Var.f198580d.x(), b5Var.f198703q);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
