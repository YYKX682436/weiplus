package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class p9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LiveTalkRoomTipsBar f209496d;

    public p9(com.tencent.mm.ui.LiveTalkRoomTipsBar liveTalkRoomTipsBar) {
        this.f209496d = liveTalkRoomTipsBar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/LiveTalkRoomTipsBar$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.LiveTalkRoomTipsBar.f196869v;
        com.tencent.mm.ui.LiveTalkRoomTipsBar liveTalkRoomTipsBar = this.f209496d;
        liveTalkRoomTipsBar.c(true, true);
        com.tencent.mm.ui.report.m0 m0Var = com.tencent.mm.ui.report.m0.f209698a;
        java.lang.String str = liveTalkRoomTipsBar.f196883t;
        liveTalkRoomTipsBar.getClass();
        throw null;
    }
}
