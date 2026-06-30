package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class z8 implements n52.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f206285a;

    public z8(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment) {
        this.f206285a = chattingUIFragment;
    }

    @Override // n52.d
    public void a(android.view.View view, int i17, int i18, int i19) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        sb5.z zVar;
        if (view != null && i18 >= 0 && i19 > 0 && (zVar = (chattingUIFragment = this.f206285a).f198268s) != null) {
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            android.view.ViewGroup f17 = chattingUIFragment.f198269t.f();
            p52.g gVar = p52.g.f352010d;
            ((c61.w8) paVar).Vi(f17, zVar, 0, i18, i19, 2L, "temp_6", 1, false);
        }
    }

    @Override // n52.d
    public void b(android.view.View view, int i17, int i18) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        sb5.z zVar;
        if (view == null || (zVar = (chattingUIFragment = this.f206285a).f198268s) == null) {
            return;
        }
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        android.view.ViewGroup f17 = chattingUIFragment.f198269t.f();
        p52.g gVar = p52.g.f352010d;
        ((c61.w8) paVar).Vi(f17, zVar, 0, i17, i18, 2L, "temp_6", 1, false);
    }
}
