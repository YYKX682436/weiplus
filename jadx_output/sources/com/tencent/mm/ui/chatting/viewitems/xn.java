package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class xn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f205998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f205999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.yn f206000f;

    public xn(com.tencent.mm.ui.chatting.viewitems.yn ynVar, java.lang.Long l17, int i17) {
        this.f206000f = ynVar;
        this.f205998d = l17;
        this.f205999e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.yn ynVar = this.f206000f;
        ((java.lang.Long) ynVar.f206089a.getTag(com.tencent.mm.R.id.bon)).longValue();
        if (((java.lang.Long) ynVar.f206089a.getTag(com.tencent.mm.R.id.bon)).longValue() == this.f205998d.longValue()) {
            int length = ynVar.f206090b.length();
            int i17 = this.f205999e;
            if (i17 < length) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                java.lang.CharSequence charSequence = ynVar.f206090b;
                spannableStringBuilder.append(charSequence.subSequence(0, charSequence.length())).setSpan(ynVar.f206091c.f206169g, i17, ynVar.f206090b.length(), 33);
                android.view.View view = ynVar.f206089a;
                if (view instanceof com.tencent.mm.ui.widget.MMNeat7extView) {
                    ((com.tencent.mm.ui.widget.MMNeat7extView) view).b(spannableStringBuilder);
                }
            }
        }
    }
}
