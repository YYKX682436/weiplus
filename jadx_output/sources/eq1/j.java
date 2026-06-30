package eq1;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final eq1.j f255821a = new eq1.j();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f255822b = jz5.h.b(eq1.i.f255819d);

    public final void a() {
        com.tencent.mm.sdk.platformtools.o4 d17 = d();
        d17.remove(c());
        com.tencent.mars.xlog.Log.i("MicroMsg.BizDigestUtil", "clearFusionDigest ret: " + d17);
    }

    public final long b() {
        return d().q("biz_digest_notify_updated_time", 0L);
    }

    public final java.lang.String c() {
        return gm0.j1.b().j() + "_BizFusionSummaryContent";
    }

    public final com.tencent.mm.sdk.platformtools.o4 d() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f255822b).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(int r21, android.content.Context r22, com.tencent.mm.storage.l4 r23) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.j.e(int, android.content.Context, com.tencent.mm.storage.l4):java.lang.CharSequence");
    }

    public final android.text.SpannableString f(int i17, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.drawable.bxr);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        drawable.setBounds(0, 0, i17, i17);
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@");
        spannableString.setSpan(wVar, 0, 1, 33);
        return spannableString;
    }

    public final boolean g() {
        byte[] j17 = d().j(c());
        if (j17 == null) {
            return false;
        }
        if (!(j17.length == 0)) {
            try {
                new com.tencent.wechat.mm.biz.e5().parseFrom(j17);
            } catch (com.google.protobuf.y6 unused) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String h(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("<(/)?([a-zA-Z0-9_]+)(\\s+[^>]*?)?>", 2);
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.util.regex.Matcher matcher = compile.matcher(source);
        kotlin.jvm.internal.o.f(matcher, "matcher(...)");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "");
        }
        matcher.appendTail(stringBuffer);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    public final java.lang.CharSequence i(android.content.Context context, java.util.Map map, java.lang.String str, int i17) {
        java.lang.String str2 = (java.lang.String) map.get(str + ".font_bold");
        java.lang.String str3 = (java.lang.String) map.get(str + ".content");
        if (str3 == null) {
            return null;
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString n17 = com.tencent.mm.pluginsdk.ui.span.c0.n(context, str3, i17);
        if (kotlin.jvm.internal.o.b(str2, "1")) {
            n17.setSpan(new com.tencent.mm.ui.base.span.BoldForegroundColorSpan(b3.l.getColor(context, com.tencent.mm.R.color.FG_0)), 0, n17.length(), 17);
        }
        return n17;
    }

    public final void j() {
        com.tencent.mm.storage.l4 p17;
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if (Di == null || (p17 = Di.p("officialaccounts")) == null) {
            return;
        }
        p17.c2(2048);
        Di.W(p17, p17.h1());
    }

    public final void k(com.tencent.wechat.mm.biz.e5 e5Var) {
        if (e5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizDigestUtil", "updateFusionDigest fusionSummary is null");
            return;
        }
        byte[] byteArray = e5Var.toByteArray();
        kotlin.jvm.internal.o.d(byteArray);
        if (byteArray.length == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizDigestUtil", "updateFusionDigest with empty fusionSummary");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizDigestUtil", "updateFusionDigest ret: " + d().H(c(), byteArray));
    }
}
