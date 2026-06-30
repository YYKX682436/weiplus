package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class m9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LiveTalkRoomTipsBar f209100d;

    public m9(com.tencent.mm.ui.LiveTalkRoomTipsBar liveTalkRoomTipsBar) {
        this.f209100d = liveTalkRoomTipsBar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/LiveTalkRoomTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.LiveTalkRoomTipsBar.f196869v;
        this.f209100d.getClass();
        yj0.a.h(this, "com/tencent/mm/ui/LiveTalkRoomTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
