package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.s f206942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.u f206943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f206944f;

    public x(com.tencent.mm.ui.contact.item.z zVar, com.tencent.mm.ui.contact.item.s sVar, com.tencent.mm.ui.contact.item.u uVar, android.content.Context context) {
        this.f206942d = sVar;
        this.f206943e = uVar;
        this.f206944f = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.CharSequence] */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.CharSequence ellipsize;
        java.lang.String str;
        com.tencent.mm.ui.contact.item.u uVar = this.f206943e;
        com.tencent.mm.ui.contact.item.s sVar = this.f206942d;
        android.content.Context context = this.f206944f;
        try {
            int measuredWidth = ((android.view.ViewGroup) sVar.f206925c.getParent()).getMeasuredWidth();
            if (measuredWidth == 0) {
                return;
            }
            java.lang.String str2 = "@" + uVar.E;
            int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479628b3);
            android.widget.TextView textView = new android.widget.TextView(context);
            float f17 = h17;
            textView.getPaint().setTextSize(f17);
            float measureText = textView.getPaint().measureText(" " + str2);
            textView.getPaint().setTextSize(sVar.f206925c.getTextSize());
            double d17 = (double) measuredWidth;
            if (measureText >= 0.6d * d17) {
                ellipsize = android.text.TextUtils.ellipsize(uVar.f206818y, textView.getPaint(), (float) (d17 * 0.4d), android.text.TextUtils.TruncateAt.END);
                float measureText2 = textView.getPaint().measureText(ellipsize.toString());
                textView.getPaint().setTextSize(f17);
                str = android.text.TextUtils.ellipsize(str2, textView.getPaint(), (measuredWidth - measureText2) - 20.0f, android.text.TextUtils.TruncateAt.END);
            } else {
                ellipsize = android.text.TextUtils.ellipsize(uVar.f206818y, textView.getPaint(), measuredWidth - measureText, android.text.TextUtils.TruncateAt.END);
                str = str2;
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, ((java.lang.Object) ellipsize) + " " + ((java.lang.Object) str));
            android.content.res.ColorStateList e17 = i65.a.e(context, com.tencent.mm.R.color.f478526a7);
            i17.setSpan(new android.text.style.TextAppearanceSpan(null, 0, h17, e17, e17), ellipsize.length() + 1, ellipsize.length() + 1 + str.length(), 33);
            i17.setSpan(new r85.b(h17), ellipsize.length() + 1, ellipsize.length() + 1 + str.length(), 33);
            com.tencent.mm.plugin.fts.ui.n3.a(i17, sVar.f206925c);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactDataItemDelegate", "fillingViewItem Exception:%s %s", e18.getClass().getSimpleName(), e18.getMessage());
        }
    }
}
