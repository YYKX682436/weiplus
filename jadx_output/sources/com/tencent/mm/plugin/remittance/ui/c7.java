package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f157659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI f157660e;

    public c7(android.widget.TextView textView, com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI) {
        this.f157659d = textView;
        this.f157660e = remittanceNewBaseUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        android.widget.TextView textView = this.f157659d;
        textPaint.setTextSize(textView.getTextSize());
        com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = this.f157660e;
        java.lang.String string = remittanceNewBaseUI.getString(com.tencent.mm.R.string.hya, com.tencent.mm.wallet_core.ui.r1.x(remittanceNewBaseUI.f157439g));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        int breakText = textPaint.breakText(string, true, textView.getWidth(), null);
        if (breakText > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String substring = string.substring(0, breakText);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            sb6.append(substring);
            sb6.append((char) 8203);
            java.lang.String substring2 = string.substring(breakText);
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            sb6.append(substring2);
            string = sb6.toString();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceNewBaseUtilUIC", "paint.breakText fail, singleLineLength <= 0");
        }
        java.lang.String format = java.lang.String.format("(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{remittanceNewBaseUI.L}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(remittanceNewBaseUI.L)) {
            if (textPaint.measureText(string + format) > textView.getWidth() * 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUtilUIC", "dynamicFinalNameWidth greater than mReceiverNameTv width");
                float measureText = textPaint.measureText(format);
                float measureText2 = textPaint.measureText("...");
                float width = (((textView.getWidth() * 2) - measureText) - measureText2) - i65.a.b(remittanceNewBaseUI, 8);
                int breakText2 = textPaint.breakText(string, true, width, null);
                if (breakText2 >= 1) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    java.lang.String substring3 = string.substring(0, breakText2 - 1);
                    kotlin.jvm.internal.o.f(substring3, "substring(...)");
                    sb7.append(substring3);
                    sb7.append("...(");
                    sb7.append(remittanceNewBaseUI.L);
                    sb7.append(')');
                    string = sb7.toString();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceNewBaseUtilUIC", "paint.breakText fail, len < 1");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUtilUIC", "calculate result: targetStr is %s, realNameWidth is %s, pointWidth is %s, remainingWidth is %s, len is %s", string, java.lang.Float.valueOf(measureText), java.lang.Float.valueOf(measureText2), java.lang.Float.valueOf(width), java.lang.Integer.valueOf(breakText2));
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(remittanceNewBaseUI, string, textSize));
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceNewBaseUI.L)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUtilUIC", "real name is null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUtilUIC", "width enough");
            string = string + format;
        }
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(remittanceNewBaseUI, string, textSize2));
    }
}
