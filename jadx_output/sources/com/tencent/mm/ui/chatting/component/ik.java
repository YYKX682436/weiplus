package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class ik implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jk f199234d;

    public ik(com.tencent.mm.ui.chatting.component.jk jkVar) {
        this.f199234d = jkVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/SearchComponent$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.chatting.component.jk jkVar = this.f199234d;
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) jkVar.f199305s.getItem(i17);
        if (f9Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) {
            jkVar.p0();
            com.tencent.mm.ui.chatting.component.b5 b5Var = (com.tencent.mm.ui.chatting.component.b5) ((sb5.d0) jkVar.f198580d.f460708c.a(sb5.d0.class));
            com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) b5Var.f198580d.f460708c.a(sb5.z.class));
            if (kVar.W0(tg3.l1.a(f9Var))) {
                b5Var.f198694e.c(kVar.L0());
                b5Var.f198694e.setVisibility(0);
                b5Var.f198695f.b();
            }
            if (!jkVar.f199301o) {
                jkVar.f199301o = true;
                ((com.tencent.mm.ui.chatting.ChattingUIFragment) jkVar.f198580d.f460719n).h1(true);
                ((com.tencent.mm.ui.chatting.ChattingUIFragment) jkVar.f198580d.f460718m).f198269t.setTranscriptMode(0);
            }
            ((com.tencent.mm.ui.chatting.ChattingUIFragment) jkVar.f198580d.f460719n).B.setIsTopShowAll(false);
            ((com.tencent.mm.ui.chatting.ChattingUIFragment) jkVar.f198580d.f460719n).i1(false);
            sb5.z zVar = (sb5.z) jkVar.f198580d.f460708c.a(sb5.z.class);
            com.tencent.mm.ui.chatting.adapter.k kVar2 = (com.tencent.mm.ui.chatting.adapter.k) zVar;
            kVar2.T0(f9Var.Q0(), f9Var.getMsgId(), hd5.n.ACTION_POSITION, new sb5.y());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/SearchComponent$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
