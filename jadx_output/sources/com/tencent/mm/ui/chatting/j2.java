package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class j2 implements com.tencent.mm.ui.chatting.pd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f201864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r01.g0 f201865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChatFooterCustom f201866c;

    public j2(com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom, android.widget.TextView textView, r01.g0 g0Var) {
        this.f201866c = chatFooterCustom;
        this.f201864a = textView;
        this.f201865b = g0Var;
    }

    @Override // com.tencent.mm.ui.chatting.pd
    public void a(boolean z17, java.lang.String str) {
        android.widget.TextView textView = this.f201864a;
        if (textView == null) {
            return;
        }
        if (z17) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.ui.chatting.i2(this), 500L);
            return;
        }
        r01.g0 g0Var = this.f201865b;
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", "dont setReddotText:%s", g0Var.f368076d);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f201866c.getContext();
        java.lang.String str2 = g0Var.f368075c;
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
    }
}
