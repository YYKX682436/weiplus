package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes11.dex */
public abstract class n3 {
    public static boolean a(java.lang.CharSequence charSequence, android.widget.TextView textView) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        textView.setText(charSequence, android.widget.TextView.BufferType.SPANNABLE);
        textView.setVisibility(0);
        return true;
    }

    public static boolean b(java.lang.String str, android.widget.TextView textView) {
        if (textView == null) {
            return false;
        }
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        textView.setVisibility(0);
        return true;
    }

    public static void c(java.lang.CharSequence charSequence, android.widget.TextView textView, float f17) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence, android.widget.TextView.BufferType.SPANNABLE);
        textView.setVisibility(0);
        textView.setTextSize(0, f17);
    }

    public static java.lang.CharSequence d(android.content.Context context, java.util.List list, java.lang.String[] strArr, p13.r rVar, android.text.TextPaint textPaint, java.lang.String str) {
        u50.u uVar = new u50.u();
        uVar.f424771a = context;
        uVar.f424772b = list;
        uVar.f424773c = strArr;
        uVar.f424774d = rVar;
        uVar.f424775e = textPaint;
        uVar.f424776f = str;
        uVar.f424777g = com.tencent.mm.plugin.fts.ui.b.f138016a;
        return e(uVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0088. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence e(u50.u r18) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fts.ui.n3.e(u50.u):java.lang.CharSequence");
    }

    public static java.lang.String f(int i17) {
        int i18;
        switch (i17) {
            case org.chromium.net.NetError.ERR_BLOCKED_BY_ORB /* -32 */:
                i18 = com.tencent.mm.R.string.p7i;
                break;
            case org.chromium.net.NetError.ERR_H2_OR_QUIC_REQUIRED /* -31 */:
                i18 = com.tencent.mm.R.string.p6r;
                break;
            case org.chromium.net.NetError.ERR_BLOCKED_BY_CSP /* -30 */:
                i18 = com.tencent.mm.R.string.p7j;
                break;
            case -29:
                i18 = com.tencent.mm.R.string.p3i;
                break;
            case -28:
                i18 = com.tencent.mm.R.string.o3v;
                break;
            case -27:
                i18 = com.tencent.mm.R.string.o3u;
                break;
            case -26:
            case -25:
            case -24:
                i18 = com.tencent.mm.R.string.idm;
                break;
            case -23:
                i18 = com.tencent.mm.R.string.ffw;
                break;
            case -22:
            case -19:
            case -18:
            case -17:
            case -16:
            case -14:
            case -12:
            case -10:
            case -9:
            default:
                i18 = 0;
                break;
            case -21:
                i18 = com.tencent.mm.R.string.idx;
                break;
            case -20:
                i18 = com.tencent.mm.R.string.fg9;
                break;
            case -15:
                i18 = com.tencent.mm.R.string.ffz;
                break;
            case -13:
                i18 = com.tencent.mm.R.string.fg8;
                break;
            case -11:
                i18 = com.tencent.mm.R.string.f492157fg0;
                break;
            case -8:
                i18 = com.tencent.mm.R.string.fg7;
                break;
            case -7:
                i18 = com.tencent.mm.R.string.ffv;
                break;
            case -6:
                i18 = com.tencent.mm.R.string.ffu;
                break;
            case -5:
                i18 = com.tencent.mm.R.string.ffx;
                break;
            case -4:
                i18 = com.tencent.mm.R.string.ffq;
                break;
            case -3:
                i18 = com.tencent.mm.R.string.ffp;
                break;
            case -2:
                i18 = com.tencent.mm.R.string.ffy;
                break;
            case -1:
                i18 = com.tencent.mm.R.string.fft;
                break;
        }
        if (i18 == 0) {
            return null;
        }
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(i18);
    }

    public static boolean g(android.content.Context context) {
        if (!k23.c1.f303536h.a(context).U6()) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            if (!((z13.f) a17).e7()) {
                return false;
            }
        }
        return true;
    }

    public static boolean h() {
        return !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
    }

    public static final void i(android.view.View view, boolean z17) {
        if (z17) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
        } else {
            view.setBackgroundResource(com.tencent.mm.R.drawable.ae7);
        }
    }

    public static final void j(android.view.View view, boolean z17) {
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static void k(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, int i17, boolean z17, int i18, int i19) {
        imageView.setTag(((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).d(str, str2, z17, i18, i19));
        imageView.hashCode();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (i17 <= 0 || (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(str2))) {
                imageView.setVisibility(8);
                return;
            } else {
                imageView.setImageResource(i17);
                return;
            }
        }
        com.tencent.mm.plugin.fts.n nVar = (com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        android.graphics.Bitmap e17 = nVar.e(nVar.d(str, str2, z17, i18, i19));
        if (e17 == null || e17.isRecycled()) {
            if (i17 > 0) {
                imageView.setImageResource(i17);
            } else {
                imageView.setImageResource(com.tencent.mm.R.color.a9e);
            }
            com.tencent.mm.plugin.fts.n nVar2 = (com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
            java.lang.String d17 = nVar2.d(str, str2, z17, i18, i19);
            imageView.setTag(d17);
            imageView.hashCode();
            if (nVar2.f137769c) {
                com.tencent.mm.plugin.fts.k kVar = new com.tencent.mm.plugin.fts.k(nVar2, d17, str, str2, z17, i18, i19, new com.tencent.mm.plugin.fts.i(nVar2, imageView, context));
                java.util.Set set = nVar2.f137776j;
                if (set.add(d17)) {
                    int i27 = nVar2.f137770d + 1;
                    nVar2.f137770d = i27;
                    int i28 = i27 % 2;
                    nVar2.f137770d = i28;
                    nVar2.f137772f[i28].post(kVar);
                } else {
                    set.toString();
                }
            }
        } else {
            imageView.setImageDrawable(new t13.m(context.getResources(), e17));
            imageView.postInvalidate();
        }
        imageView.setVisibility(0);
    }
}
