package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class p9 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f205242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f205243g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.ad4 f205244h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(int i17, r35.m3 m3Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, java.lang.CharSequence charSequence, r45.ad4 ad4Var) {
        super(i17, m3Var);
        this.f205240d = dVar;
        this.f205241e = f9Var;
        this.f205242f = mMNeat7extView;
        this.f205243g = charSequence;
        this.f205244h = ad4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        yb5.d dVar = this.f205240d;
        if (!((com.tencent.mm.ui.chatting.component.pc) ((sb5.v0) dVar.f460708c.a(sb5.v0.class))).m0(this.f205241e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgGroupSolitatire", "not fold");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view != null) {
            view.setTag(com.tencent.mm.R.id.bqt, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.SPANNABLE;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f205242f;
        mMNeat7extView.c(this.f205243g, bufferType, null);
        sb5.v0 v0Var = (sb5.v0) dVar.f460708c.a(sb5.v0.class);
        long longValue = ((java.lang.Long) mMNeat7extView.getTag(com.tencent.mm.R.id.bon)).longValue();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) ((com.tencent.mm.ui.chatting.component.pc) v0Var).f199682e;
        if (!arrayList2.contains(java.lang.Long.valueOf(longValue))) {
            arrayList2.add(java.lang.Long.valueOf(longValue));
        }
        x63.p Ai = ((t63.e) i95.n0.c(t63.e.class)).Ai();
        java.lang.String x17 = dVar.x();
        Ai.getClass();
        com.tencent.mm.autogen.mmdata.rpt.SolitaireMsgFoldClickStruct solitaireMsgFoldClickStruct = new com.tencent.mm.autogen.mmdata.rpt.SolitaireMsgFoldClickStruct();
        solitaireMsgFoldClickStruct.f60846d = solitaireMsgFoldClickStruct.b("ChatName", x17, true);
        r45.ad4 ad4Var = this.f205244h;
        solitaireMsgFoldClickStruct.f60847e = ad4Var.f369947i;
        solitaireMsgFoldClickStruct.f60848f = solitaireMsgFoldClickStruct.b("Identifier", ad4Var.f369948m, true);
        solitaireMsgFoldClickStruct.f60849g = ad4Var.f369943e.size();
        solitaireMsgFoldClickStruct.f60850h = ad4Var.f369946h;
        solitaireMsgFoldClickStruct.k();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
