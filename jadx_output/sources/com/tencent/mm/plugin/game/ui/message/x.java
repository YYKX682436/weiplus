package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.database.Cursor f141653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f141654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.y f141655f;

    public x(com.tencent.mm.plugin.game.ui.message.y yVar, android.database.Cursor cursor, int i17) {
        this.f141655f = yVar;
        this.f141653d = cursor;
        this.f141654e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.message.y yVar = this.f141655f;
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = yVar.f141660e;
        interactiveMsgMRecycleView.f141495h2 = new com.tencent.mm.plugin.game.ui.message.f0(interactiveMsgMRecycleView, yVar.f141659d, this.f141653d, this.f141654e);
        yVar.f141660e.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(yVar.f141659d));
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView2 = yVar.f141660e;
        interactiveMsgMRecycleView2.setAdapter(interactiveMsgMRecycleView2.f141495h2);
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView3 = yVar.f141660e;
        com.tencent.mm.plugin.game.ui.message.f0 f0Var = interactiveMsgMRecycleView3.f141495h2;
        java.lang.String str = interactiveMsgMRecycleView3.f141499l2;
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) f0Var.f141549e;
            if (i17 >= linkedList.size()) {
                i17 = 0;
                break;
            } else if (str.equals(((com.tencent.mm.plugin.game.model.e1) linkedList.get(i17)).field_gameMsgId)) {
                break;
            } else {
                i17++;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(interactiveMsgMRecycleView3, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$5$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        interactiveMsgMRecycleView3.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(interactiveMsgMRecycleView3, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$5$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        yVar.f141660e.f141495h2.notifyDataSetChanged();
    }
}
