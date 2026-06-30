package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class e4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.g4 f200455d;

    public e4(com.tencent.mm.ui.chatting.g4 g4Var) {
        this.f200455d = g4Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.chatting.g4 g4Var = this.f200455d;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) g4Var.f200522a.f460708c.a(sb5.z.class))).W;
        if (copyOnWriteArraySet != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(copyOnWriteArraySet);
            java.util.Collections.sort(arrayList, new com.tencent.mm.ui.chatting.d4(this));
            long[] jArr = new long[arrayList.size()];
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                jArr[i17] = ((com.tencent.mm.plugin.msg.MsgIdTalker) it.next()).f149480d;
                i17++;
            }
            intent.putExtra("k_outside_expose_proof_item_list", jArr);
            intent.putExtra("k_username", g4Var.f200522a.x());
            g4Var.f200522a.g().setResult(-1, intent);
        } else {
            g4Var.f200522a.g().setResult(0, intent);
        }
        intent.putExtra("k_is_group_chat", g4Var.f200522a.D());
        g4Var.f200522a.d();
        return false;
    }
}
