package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class u5 implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f202735a;

    public u5(yb5.d dVar) {
        this.f202735a = dVar;
    }

    @Override // j45.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3001) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelper", "gotoEditUI() REQUEST_CODE_VIEW_GROUP_SOLITATIRE resultCode:%s", java.lang.Integer.valueOf(i18));
            if (-1 != i18 || intent == null) {
                return;
            }
            ((com.tencent.mm.ui.chatting.component.sk) ((sb5.f2) this.f202735a.f460708c.a(sb5.f2.class))).m0(intent.getStringExtra("key_group_solitatire_content"));
        }
    }
}
