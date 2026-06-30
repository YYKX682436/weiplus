package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class f5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb5.z f199010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f199011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.g5 f199012f;

    public f5(com.tencent.mm.ui.chatting.component.g5 g5Var, sb5.z zVar, android.content.Context context) {
        this.f199012f = g5Var;
        this.f199010d = zVar;
        this.f199011e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "delete message");
        sb5.z zVar = this.f199010d;
        com.tencent.mm.plugin.msg.MsgIdTalker[] msgIdTalkerArr = (com.tencent.mm.plugin.msg.MsgIdTalker[]) ((com.tencent.mm.ui.chatting.adapter.k) zVar).W.toArray(new com.tencent.mm.plugin.msg.MsgIdTalker[0]);
        java.util.Arrays.sort(msgIdTalkerArr, new com.tencent.mm.ui.chatting.component.e5(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = ((com.tencent.mm.ui.chatting.adapter.k) zVar).I.f152065o;
        int size = arrayList2.size();
        int i18 = size;
        for (com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker : msgIdTalkerArr) {
            do {
                size--;
                if (size >= 0) {
                    f9Var = ((rd5.d) arrayList2.get(size)).f394254d.f445300b;
                    if (f9Var.getMsgId() <= msgIdTalker.f149480d) {
                        break;
                    }
                }
            } while (f9Var.j2());
            long msgId = f9Var.getMsgId();
            long j17 = msgIdTalker.f149480d;
            if (msgId == j17) {
                for (int i19 = i18 - 1; i19 > size; i19--) {
                    arrayList.add(tg3.l1.a(((rd5.d) arrayList2.get(i19)).f394254d.f445300b));
                }
                i18 = size;
            }
            do {
                size--;
                if (size < 0) {
                    break;
                }
            } while (((rd5.d) arrayList2.get(size)).f394254d.f445300b.getMsgId() != j17);
            i18 = size;
        }
        com.tencent.mm.ui.chatting.component.g5 g5Var = this.f199012f;
        int i27 = ((com.tencent.mm.ui.chatting.component.a1) ((sb5.l) g5Var.f199079d.f198580d.f460708c.a(sb5.l.class))).A;
        int i28 = ((com.tencent.mm.ui.chatting.component.a1) ((sb5.l) g5Var.f199079d.f198580d.f460708c.a(sb5.l.class))).B;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.tencent.mm.ui.chatting.adapter.k) zVar).W;
        com.tencent.mm.ui.chatting.component.b5 b5Var = g5Var.f199079d;
        android.content.Context context = this.f199011e;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, context is null");
        } else if (copyOnWriteArraySet == null || copyOnWriteArraySet.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, select ids is empty");
        } else {
            com.tencent.mm.ui.chatting.component.b5.f198693t.a(new com.tencent.mm.ui.chatting.h3(copyOnWriteArraySet, db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.bot), true, false, null), b5Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingEditModeDelMsg", "do delete msg by QuickSelect, ClickCount=%d, ResultCount=%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
            pm0.v.K(null, new yd5.l(4L, copyOnWriteArraySet.size(), 0L, i27, i28, 1L));
        }
        if (arrayList.size() > 0) {
            com.tencent.mm.ui.chatting.i3.a(context, new java.util.concurrent.CopyOnWriteArraySet(arrayList), g5Var.f199079d);
        }
        tb5.i0 i0Var = tb5.i0.f417055a;
        java.util.List p07 = g5Var.f199079d.p0();
        tb5.g0 state = g5Var.f199079d.f198703q;
        kotlin.jvm.internal.o.g(state, "state");
        i0Var.b("multi_select_msg_del_succ", p07, state);
        g5Var.f199079d.o0();
    }
}
