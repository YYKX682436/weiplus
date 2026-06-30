package uw;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final uw.g f431492a = new uw.g();

    public final java.lang.CharSequence a(java.lang.CharSequence msgContent, int i17, android.content.Context context) {
        kotlin.jvm.internal.o.g(msgContent, "msgContent");
        kotlin.jvm.internal.o.g(context, "context");
        if (!zv.q.f476079a.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceDigestUtil", "[BS]getOfficialAccountsFusionDigest box switch is false");
            return msgContent;
        }
        java.lang.String obj = msgContent.toString();
        if (!r26.n0.D(obj, "{{HEART}}", false, 2, null)) {
            return msgContent;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(obj);
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int L = r26.n0.L(obj, "{{HEART}}", i18, false, 4, null);
            if (L == -1) {
                break;
            }
            int i27 = i19 + 1;
            if (i19 >= 10) {
                break;
            }
            i18 = L + 9;
            spannableStringBuilder.replace(L, i18, (java.lang.CharSequence) " ");
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.biz_heart_medium_darkmode : com.tencent.mm.R.raw.biz_heart_medium, context.getTheme());
            drawable.setBounds(0, 0, i17, i17);
            spannableStringBuilder.setSpan(new al5.w(drawable, 1), L, L + 1, 33);
            i19 = i27;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceDigestUtil", "replace digest : " + ((java.lang.Object) spannableStringBuilder));
        return spannableStringBuilder;
    }

    public final long b(long j17, long j18) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j19 = 1000 * j17;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceDigestUtil", "[BRS]safeClampBoxDisplayTime: svrBoxTime (" + j17 + ") is 0. Replacing with currentTimestamp (" + currentTimeMillis + ").");
            return currentTimeMillis;
        }
        bw5.d5 d5Var = bw5.d5.EcsBrandTimelineBoxDisplayTimeErr;
        if (j19 > currentTimeMillis) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceDigestUtil", "[BRS]safeClampBoxDisplayTime FAILED: svrBoxTime (" + j17 + ") is invalid (svrBoxTime > currentTimestamp). Replacing with currentTimestamp (" + currentTimeMillis + ").");
            y02.v0 a17 = y02.x0.f458634d.a();
            if (a17 != null) {
                a17.p1(d5Var, 1, java.lang.String.valueOf(j17));
            }
            return currentTimeMillis;
        }
        if (j19 >= j18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceDigestUtil", "[BRS]safeClampBoxDisplayTime SUCCESS. svrBoxTime (" + j19 + ") is valid and returned.");
            return j19;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceDigestUtil", "[BRS]safeClampBoxDisplayTime FAILED: svrBoxTime (" + j17 + ") is invalid (svrBoxTime < localBoxTime). Replacing with localBoxTime (" + j18 + ").");
        y02.v0 a18 = y02.x0.f458634d.a();
        if (a18 != null) {
            a18.p1(d5Var, 2, java.lang.String.valueOf(j17));
        }
        return j18;
    }
}
