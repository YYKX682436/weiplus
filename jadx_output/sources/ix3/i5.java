package ix3;

/* loaded from: classes3.dex */
public final class i5 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295450d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f295451e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f295452f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f295453g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f295454h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f295455i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f295456m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f295457n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f295458o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f295459p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f295460q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f295461r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f295462s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f295463t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f295464u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295450d = jz5.h.b(ix3.h5.f295433d);
        this.f295451e = jz5.h.b(new ix3.g5(this));
        this.f295452f = jz5.h.b(ix3.o4.f295522d);
        this.f295453g = jz5.h.b(ix3.q4.f295539d);
        this.f295454h = jz5.h.b(ix3.b5.f295370d);
        this.f295455i = jz5.h.b(new ix3.x4(activity));
        this.f295456m = jz5.h.b(new ix3.v4(activity));
        jz5.h.b(ix3.u4.f295578d);
        this.f295457n = jz5.h.b(new ix3.w4(activity));
        this.f295458o = jz5.h.b(new ix3.y4(activity));
        this.f295459p = jz5.h.b(new ix3.a5(activity));
        this.f295460q = jz5.h.b(new ix3.z4(activity));
        this.f295461r = jz5.h.b(new ix3.r4(activity));
        this.f295462s = jz5.h.b(ix3.s4.f295556d);
        this.f295463t = jz5.h.b(new ix3.t4(activity));
        this.f295464u = jz5.h.b(new ix3.p4(activity));
    }

    public final android.text.SpannableStringBuilder T6(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, int i17) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) (str + '\n'));
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), length, spannableStringBuilder.length() - 1, 33);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i17), length, spannableStringBuilder.length() - 1, 33);
        return spannableStringBuilder;
    }

    public final android.text.SpannableStringBuilder U6(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, java.lang.String str2) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) ("\u3000\u3000" + str + (char) 12288));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(d7()), length, spannableStringBuilder.length(), 33);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) (str2 + '\n'));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Number) ((jz5.n) this.f295454h).getValue()).intValue()), length2, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final android.text.SpannableStringBuilder V6(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, java.lang.String str2) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) ("\u3000\u3000" + str + (char) 12288));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(d7()), length, spannableStringBuilder.length(), 33);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str2).append("\n");
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Number) ((jz5.n) this.f295454h).getValue()).intValue()), length2, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), length2, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final android.text.SpannableStringBuilder W6(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, boolean z17, java.lang.String str2) {
        boolean B = r26.n0.B(str, "/c2c/", true);
        java.lang.String str3 = B ? "[C2C]" : "[非C2C]";
        jz5.g gVar = this.f295462s;
        int intValue = B ? ((java.lang.Number) ((jz5.n) this.f295461r).getValue()).intValue() : ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        spannableStringBuilder.length();
        spannableStringBuilder.append("\u3000\u3000路径\u3000");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str3);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(intValue), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(" ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue()), length2, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append("\n");
        if (z17 && str2 != null) {
            spannableStringBuilder.length();
            spannableStringBuilder.append("\u3000\u3000\u3000\u3000\u3000");
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append("[TMP] ");
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Number) ((jz5.n) this.f295463t).getValue()).intValue()), length3, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), length3, spannableStringBuilder.length(), 33);
            int length4 = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) str2.concat("\n"));
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue()), length4, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final android.text.SpannableStringBuilder X6(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) (str + '\n'));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(d7()), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final android.text.SpannableStringBuilder Y6(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) ("▎ " + str));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) (" · " + str2 + '\n'));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(z19 ? ((java.lang.Number) ((jz5.n) this.f295460q).getValue()).intValue() : z18 ? ((java.lang.Number) ((jz5.n) this.f295459p).getValue()).intValue() : z17 ? ((java.lang.Number) ((jz5.n) this.f295458o).getValue()).intValue() : d7()), length2, spannableStringBuilder.length() - 1, 33);
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), length, spannableStringBuilder.length() - 1, 33);
        return spannableStringBuilder;
    }

    public final java.lang.String Z6(long j17, long j18) {
        if (j18 <= 0) {
            return "0%";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((int) ((((float) j17) / ((float) j18)) * 100));
        sb6.append('%');
        return sb6.toString();
    }

    public final java.lang.String a7(int i17) {
        if (i17 <= 0) {
            return "0 B";
        }
        double d17 = i17;
        int log10 = (int) (java.lang.Math.log10(d17) / java.lang.Math.log10(1024.0d));
        java.lang.String format = java.lang.String.format("%.2f %s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d17 / java.lang.Math.pow(1024.0d, log10)), new java.lang.String[]{"B", "KB", "MB", "GB", "TB"}[log10]}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    public final int b7(java.lang.String str) {
        java.lang.Integer h17;
        if (str == null || str.length() == 0) {
            return -1;
        }
        try {
            android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            java.lang.String extractMetadata = mediaMetadataRetriever.extractMetadata(20);
            mediaMetadataRetriever.release();
            if (extractMetadata == null || (h17 = r26.h0.h(extractMetadata)) == null) {
                return 0;
            }
            return h17.intValue();
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public final int c7() {
        return ((java.lang.Number) ((jz5.n) this.f295464u).getValue()).intValue();
    }

    public final int d7() {
        return ((java.lang.Number) ((jz5.n) this.f295453g).getValue()).intValue();
    }

    public final wf0.w1 e7() {
        return (wf0.w1) ((jz5.n) this.f295450d).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0624 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x062d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0636 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f7(com.tencent.mm.storage.f9 r64) {
        /*
            Method dump skipped, instructions count: 3002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ix3.i5.f7(com.tencent.mm.storage.f9):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.emp;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("视频消息调试页面");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.c5(this));
        }
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(getIntent().getStringExtra("Chat_User"), longExtra);
        f7(n17);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P63 = P6();
        if (P63 != null) {
            P63.addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new ix3.f5(this, n17));
        }
    }
}
