package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class k8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174032d;

    public k8(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174032d = textStatusEditActivity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174032d;
        boolean z17 = false;
        g4Var.p(com.tencent.mm.R.id.jgs, textStatusEditActivity.getString(com.tencent.mm.R.string.jun), textStatusEditActivity.getString(com.tencent.mm.R.string.f490412u9), 0);
        g4Var.f(com.tencent.mm.R.id.jgx, textStatusEditActivity.getString(com.tencent.mm.R.string.ipw));
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() || ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi()) {
            textStatusEditActivity.getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            android.graphics.drawable.Drawable drawable = textStatusEditActivity.getDrawable(com.tencent.mm.R.drawable.bqx);
            com.tencent.mm.ui.uk.f(drawable, android.graphics.Color.parseColor("#F99234"));
            int dimensionPixelSize = textStatusEditActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479852h1);
            ak4.a aVar = new ak4.a(drawable, 1);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            spannableStringBuilder.append((char) 8199);
            spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((java.lang.CharSequence) textStatusEditActivity.getString(com.tencent.mm.R.string.gup));
            g4Var.f(com.tencent.mm.R.id.jgw, spannableStringBuilder);
        }
        com.tencent.mm.plugin.textstatus.ui.g8 d76 = textStatusEditActivity.d7();
        if (!d76.f173904f && !android.text.TextUtils.isEmpty(d76.f173900b)) {
            z17 = true;
        }
        if (z17 || textStatusEditActivity.F != null) {
            g4Var.d(com.tencent.mm.R.id.jgv, textStatusEditActivity.getResources().getColor(com.tencent.mm.R.color.f478532ac), textStatusEditActivity.getString(com.tencent.mm.R.string.gut));
        }
    }
}
