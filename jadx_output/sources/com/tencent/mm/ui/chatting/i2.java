package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.j2 f201828d;

    public i2(com.tencent.mm.ui.chatting.j2 j2Var) {
        this.f201828d = j2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.j2 j2Var = this.f201828d;
        android.graphics.drawable.Drawable drawable = j2Var.f201866c.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.b8i);
        drawable.setBounds(0, 0, com.tencent.mm.ui.zk.a(j2Var.f201866c.getContext(), 8), com.tencent.mm.ui.zk.a(j2Var.f201866c.getContext(), 8));
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@");
        spannableString.setSpan(wVar, 0, 1, 33);
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", "setReddotText：%s", j2Var.f201865b.f368076d);
        android.widget.TextView textView = j2Var.f201864a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = j2Var.f201866c.getContext();
        java.lang.String str = j2Var.f201865b.f368075c;
        ((ke0.e) xVar).getClass();
        sb6.append((java.lang.Object) com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
        sb6.append(" ");
        textView.setText(android.text.TextUtils.concat(sb6.toString(), spannableString));
    }
}
