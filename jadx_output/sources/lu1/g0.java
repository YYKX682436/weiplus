package lu1;

/* loaded from: classes15.dex */
public abstract class g0 {
    public static java.lang.String a(int i17, java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardViewUtil", "toApply is null");
            return "";
        }
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardViewUtil", "unitSpace is 0");
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = 0;
        while (i18 < str.length()) {
            sb6.append(str.charAt(i18));
            i18++;
            if (i18 % i17 == 0) {
                if (z17) {
                    sb6.append(" ");
                } else if (i18 != str.length()) {
                    sb6.append("-");
                }
            }
        }
        return sb6.toString();
    }

    public static void b(android.widget.ImageView imageView, java.lang.String str, int i17, int i18, boolean z17) {
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            imageView.setImageResource(i18);
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f342083g = lp0.b.D();
        fVar.f342082f = xt1.q.m(str);
        fVar.f342078b = true;
        fVar.f342096t = z17;
        fVar.f342077a = true;
        fVar.f342087k = i17;
        fVar.f342086j = i17;
        fVar.f342091o = i18;
        n11.a.b().h(str, imageView, fVar.a());
    }

    public static void c(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, int i17, int i18, boolean z17, int i19) {
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            d(context, imageView, i18, i19);
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f342083g = lp0.b.D();
        fVar.f342082f = xt1.q.m(str);
        fVar.f342078b = true;
        fVar.f342096t = z17;
        fVar.f342077a = true;
        fVar.f342087k = i17;
        fVar.f342086j = i17;
        fVar.f342091o = i18;
        n11.a.b().i(str, imageView, fVar.a(), new lu1.d0(imageView, i19, context, i18));
    }

    public static void d(android.content.Context context, android.widget.ImageView imageView, int i17, int i18) {
        com.tencent.mm.sdk.platformtools.u3.h(new lu1.e0(imageView, i17, i18));
    }

    public static void e(android.widget.TextView textView, int i17) {
        switch (i17) {
            case 0:
                textView.setText(com.tencent.mm.R.string.avs);
                return;
            case 1:
                textView.setText(com.tencent.mm.R.string.avn);
                return;
            case 2:
                textView.setText(com.tencent.mm.R.string.avq);
                return;
            case 3:
                textView.setText(com.tencent.mm.R.string.avp);
                return;
            case 4:
                textView.setText(com.tencent.mm.R.string.avt);
                return;
            case 5:
                textView.setText(com.tencent.mm.R.string.avu);
                return;
            case 6:
                textView.setText(com.tencent.mm.R.string.avo);
                return;
            case 7:
                textView.setText(com.tencent.mm.R.string.avr);
                return;
            default:
                return;
        }
    }
}
