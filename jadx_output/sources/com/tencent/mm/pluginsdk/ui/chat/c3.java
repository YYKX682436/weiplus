package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f190215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.d3 f190216e;

    public c3(com.tencent.mm.pluginsdk.ui.chat.d3 d3Var, int i17) {
        this.f190216e = d3Var;
        this.f190215d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.d3 d3Var = this.f190216e;
        int length = d3Var.f190259a.length();
        int i17 = this.f190215d;
        if (i17 <= length) {
            android.view.View view = d3Var.f190261c.f190295d.f190030n4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d3Var.f190261c.f190295d.f190024m4.setVisibility(0);
            if (i17 == d3Var.f190259a.length()) {
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = d3Var.f190261c.f190295d;
                chatFooter.Z4 = true;
                chatFooter.C1();
            } else {
                d3Var.f190261c.f190295d.f190024m4.setText(d3Var.f190260b);
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(pg5.d.a(d3Var.f190261c.f190295d.getContext(), d3Var.f190259a));
                spannableStringBuilder.setSpan(d3Var.f190261c.f190295d.f189962b5, java.lang.Math.min(i17, spannableStringBuilder.length()), spannableStringBuilder.length(), 33);
                d3Var.f190261c.f190295d.f189961b4.setText(spannableStringBuilder);
            }
        }
    }
}
