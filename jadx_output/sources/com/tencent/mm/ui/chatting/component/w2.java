package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f200147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y2 f200148e;

    public w2(com.tencent.mm.ui.chatting.component.y2 y2Var, android.view.View view) {
        this.f200148e = y2Var;
        this.f200147d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingBizHalfScreenComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f200148e.f200279s = 3;
        yb5.d dVar = this.f200148e.f198580d;
        ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) dVar.f460718m).C0().removeHeaderView(this.f200147d);
        ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f200148e.f198580d.f460717l).B.setIsTopShowAll(false);
        this.f200148e.f198580d.f460717l.y0(true, 0);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingBizHalfScreenComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
