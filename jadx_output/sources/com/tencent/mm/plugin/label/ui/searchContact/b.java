package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.a f143343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.d f143344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f143345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.d f143346g;

    public b(com.tencent.mm.plugin.label.ui.searchContact.a aVar, com.tencent.mm.plugin.label.ui.searchContact.d dVar, android.content.Context context, com.tencent.mm.plugin.label.ui.searchContact.d dVar2) {
        this.f143343d = aVar;
        this.f143344e = dVar;
        this.f143345f = context;
        this.f143346g = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.CharSequence ellipsize;
        java.lang.String str;
        com.tencent.mm.plugin.label.ui.searchContact.d dVar = this.f143344e;
        com.tencent.mm.plugin.label.ui.searchContact.a aVar = this.f143343d;
        android.content.Context context = this.f143345f;
        try {
            android.widget.TextView textView = aVar.f143338p;
            kotlin.jvm.internal.o.d(textView);
            android.view.ViewParent parent = textView.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int measuredWidth = ((android.view.ViewGroup) parent).getMeasuredWidth();
            if (measuredWidth == 0) {
                return;
            }
            java.lang.String str2 = "@" + dVar.f143353i;
            int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479628b3);
            android.widget.TextView textView2 = new android.widget.TextView(context);
            float f17 = h17;
            textView2.getPaint().setTextSize(f17);
            float measureText = textView2.getPaint().measureText(" " + str2);
            android.text.TextPaint paint = textView2.getPaint();
            android.widget.TextView textView3 = aVar.f143338p;
            kotlin.jvm.internal.o.d(textView3);
            paint.setTextSize(textView3.getTextSize());
            double d17 = measuredWidth;
            if (measureText >= 0.6d * d17) {
                ellipsize = android.text.TextUtils.ellipsize(dVar.f143351g, textView2.getPaint(), (float) (d17 * 0.4d), android.text.TextUtils.TruncateAt.END);
                kotlin.jvm.internal.o.f(ellipsize, "ellipsize(...)");
                float measureText2 = textView2.getPaint().measureText(ellipsize.toString());
                textView2.getPaint().setTextSize(f17);
                ?? ellipsize2 = android.text.TextUtils.ellipsize(str2, textView2.getPaint(), (measuredWidth - measureText2) - 20, android.text.TextUtils.TruncateAt.END);
                kotlin.jvm.internal.o.f(ellipsize2, "ellipsize(...)");
                str = ellipsize2;
            } else {
                ellipsize = android.text.TextUtils.ellipsize(dVar.f143351g, textView2.getPaint(), measuredWidth - measureText, android.text.TextUtils.TruncateAt.END);
                kotlin.jvm.internal.o.f(ellipsize, "ellipsize(...)");
                str = str2;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((java.lang.Object) ellipsize);
            sb6.append(' ');
            sb6.append((java.lang.Object) str);
            java.lang.String sb7 = sb6.toString();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, sb7);
            android.content.res.ColorStateList e17 = i65.a.e(context, com.tencent.mm.R.color.a0k);
            i17.setSpan(new android.text.style.TextAppearanceSpan(null, 0, h17, e17, e17), ellipsize.length() + 1, ellipsize.length() + 1 + str.length(), 33);
            i17.setSpan(new r85.b(h17), ellipsize.length() + 1, ellipsize.length() + 1 + str.length(), 33);
            u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
            android.widget.TextView textView4 = aVar.f143338p;
            ((s50.r0) yVar).getClass();
            com.tencent.mm.plugin.fts.ui.n3.a(i17, textView4);
        } catch (java.lang.Exception e18) {
            this.f143346g.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactDataItem", "fillingViewItem Exception:%s %s", e18.getClass().getSimpleName(), e18.getMessage());
        }
    }
}
