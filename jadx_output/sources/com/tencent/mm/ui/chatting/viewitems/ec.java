package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ec implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f203867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f203868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.fc f203869f;

    public ec(com.tencent.mm.ui.chatting.viewitems.fc fcVar, java.lang.Long l17, int i17) {
        this.f203869f = fcVar;
        this.f203867d = l17;
        this.f203868e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.fc fcVar = this.f203869f;
        if (((java.lang.Long) fcVar.f203955a.getTag(com.tencent.mm.R.id.bon)).longValue() == this.f203867d.longValue()) {
            int length = fcVar.f203956b.length();
            int i17 = this.f203868e;
            if (i17 < length) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                java.lang.CharSequence charSequence = fcVar.f203956b;
                spannableStringBuilder.append(charSequence.subSequence(0, charSequence.length())).setSpan(fcVar.f203957c.f204031g, i17, fcVar.f203956b.length(), 33);
                android.view.View view = fcVar.f203955a;
                if (view instanceof com.tencent.mm.ui.widget.MMNeat7extView) {
                    ((com.tencent.mm.ui.widget.MMNeat7extView) view).b(spannableStringBuilder);
                }
            }
        }
    }
}
