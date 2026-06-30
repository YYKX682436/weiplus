package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class yi implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f212592a;

    public yi(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        this.f212592a = singleChatInfoUI;
    }

    @Override // i50.n
    public void a(boolean z17) {
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f212592a;
        if (!z17) {
            singleChatInfoUI.f197075i.S(false);
            return;
        }
        ((h13.l0) ((f13.e) i95.n0.c(f13.e.class))).fj(singleChatInfoUI.f197071e.d1());
        singleChatInfoUI.f197075i.H(singleChatInfoUI.getResources().getString(com.tencent.mm.R.string.feu, new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(((h13.l0) ((f13.e) i95.n0.c(f13.e.class))).Ai(singleChatInfoUI.f197071e.d1())))));
    }
}
