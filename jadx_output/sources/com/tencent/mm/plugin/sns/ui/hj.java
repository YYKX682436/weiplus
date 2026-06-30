package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class hj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f168508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jj f168509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f168510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f168511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168513i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(boolean z17, com.tencent.mm.plugin.sns.ui.jj jjVar, java.lang.CharSequence charSequence, android.text.SpannableString spannableString, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168508d = z17;
        this.f168509e = jjVar;
        this.f168510f = charSequence;
        this.f168511g = spannableString;
        this.f168512h = str;
        this.f168513i = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        com.tencent.mm.plugin.sns.ui.hj hjVar = new com.tencent.mm.plugin.sns.ui.hj(this.f168508d, this.f168509e, this.f168510f, this.f168511g, this.f168512h, this.f168513i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        return hjVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        com.tencent.mm.plugin.sns.ui.hj hjVar = (com.tencent.mm.plugin.sns.ui.hj) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hjVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f168508d;
        com.tencent.mm.plugin.sns.ui.jj jjVar = this.f168509e;
        if (z17) {
            int a17 = ym5.x.a(jjVar.getContext(), 4.0f);
            android.widget.TextView textView = jjVar.f167165d.f168186c;
            textView.setPadding(textView.getPaddingLeft(), jjVar.f167165d.f168186c.getPaddingTop(), jjVar.f167165d.f168186c.getPaddingRight(), a17);
        }
        android.widget.ImageView imageView = jjVar.f167165d.f168184a;
        android.content.Context context = jjVar.getContext();
        java.lang.CharSequence charSequence = this.f168510f;
        imageView.setContentDescription(context.getString(com.tencent.mm.R.string.j9d, charSequence));
        jjVar.f167165d.f168185b.setText(this.f168511g);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f168512h)) {
            jjVar.f167165d.f168185b.setVisibility(8);
        }
        jjVar.f167165d.f168186c.setText(charSequence);
        if (jjVar.f167174p) {
            jjVar.f167165d.f168187d.setVisibility(0);
            jjVar.f167165d.f168187d.setText(this.f168513i);
        } else {
            jjVar.f167165d.f168187d.setVisibility(8);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        return f0Var;
    }
}
