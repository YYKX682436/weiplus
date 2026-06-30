package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.w5 f205488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.w5 f205489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w05.d f205490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205491g;

    public s5(com.tencent.mm.ui.chatting.viewitems.w5 w5Var, com.tencent.mm.ui.chatting.viewitems.w5 w5Var2, w05.d dVar, yb5.d dVar2) {
        this.f205488d = w5Var;
        this.f205489e = w5Var2;
        this.f205490f = dVar;
        this.f205491g = dVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.viewitems.w5 w5Var = this.f205488d;
        if (w5Var.getViewHolderScope() != null) {
            kotlinx.coroutines.y0 viewHolderScope = w5Var.getViewHolderScope();
            kotlin.jvm.internal.o.d(viewHolderScope);
            if (kotlinx.coroutines.z0.h(viewHolderScope)) {
                int i17 = w5Var.f205902f;
                int i18 = w5Var.f205901e;
                if (i17 > i18) {
                    i17 = i18;
                }
                w5Var.f205902f = i17;
                com.tencent.mm.ui.chatting.viewitems.w5 w5Var2 = this.f205489e;
                android.widget.TextView textView = w5Var2.f205898b;
                if (textView != null) {
                    textView.setTextSize(0, i17);
                }
                c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
                w05.d dVar = this.f205490f;
                java.lang.String w17 = dVar.w();
                int n17 = dVar.n();
                yb5.d dVar2 = this.f205491g;
                java.lang.String cj6 = ((j00.k1) e3Var).cj(w17, n17, dVar2.x(), dVar.z(), w5Var2.f205898b);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgEcsGiftChatroom", "exclusiveTitleStr:" + cj6);
                android.widget.TextView textView2 = w5Var2.f205898b;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                }
                android.widget.TextView textView3 = w5Var2.f205898b;
                if (textView3 == null) {
                    return;
                }
                textView3.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(dVar2.g(), cj6, w5Var.f205902f));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgEcsGiftChatroom", "view holder scope is null or is deactivate");
    }
}
