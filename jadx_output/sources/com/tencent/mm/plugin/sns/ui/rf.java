package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class rf implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.sf f170418e;

    public rf(com.tencent.mm.plugin.sns.ui.sf sfVar, int i17) {
        this.f170418e = sfVar;
        this.f170417d = i17;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$14$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$14$1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0195, code lost:
    
        if ((r3 == null || r3.length() == 0) == false) goto L42;
     */
    @Override // ck5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c1(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.rf.c1(java.lang.String):void");
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$14$1");
        com.tencent.mm.plugin.sns.ui.sf sfVar = this.f170418e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.ui.tools.v4.f(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(sfVar.f170457e).getText().toString()));
        int i17 = this.f170417d;
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentFooter", "comment send failed, count over, currentCharacterCount:%d, maxCount:%d", valueOf, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = sfVar.f170457e;
        android.content.Context context = snsCommentFooter.getContext();
        java.lang.String r17 = i65.a.r(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.i(snsCommentFooter), com.tencent.mm.R.string.j9s);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        int ceil = (int) java.lang.Math.ceil(i17 / 2.0d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        db5.t7.m(context, java.lang.String.format(r17, java.lang.Integer.valueOf(ceil)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        ta4.x0 x0Var = snsCommentFooter.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        x0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hitWordLimitToast", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        x0Var.f416860h++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hitWordLimitToast", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$14$1");
    }
}
