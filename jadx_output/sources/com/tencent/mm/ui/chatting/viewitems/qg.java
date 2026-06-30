package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class qg {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f205362a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f205363b;

    static {
        java.lang.Double valueOf = java.lang.Double.valueOf(0.75d);
        java.lang.Double valueOf2 = java.lang.Double.valueOf(1.3333333333333333d);
        f205362a = new java.util.ArrayList(java.util.Arrays.asList(valueOf, java.lang.Double.valueOf(1.0d), valueOf2));
        f205363b = new java.util.ArrayList(java.util.Arrays.asList(valueOf, valueOf2));
    }

    public static double a(int i17, float f17, float f18) {
        if (f17 <= 0.0f || f18 <= 0.0f) {
            return 0.75d;
        }
        double d17 = f17 / f18;
        java.util.List list = f205362a;
        if (i17 == 0) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            double doubleValue = ((java.lang.Double) arrayList.get(0)).doubleValue();
            double abs = java.lang.Math.abs(d17 - doubleValue);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                double doubleValue2 = ((java.lang.Double) it.next()).doubleValue();
                double abs2 = java.lang.Math.abs(d17 - doubleValue2);
                if (abs2 < abs) {
                    doubleValue = doubleValue2;
                    abs = abs2;
                }
            }
            return doubleValue;
        }
        if (i17 != 1) {
            return ((java.lang.Double) ((java.util.ArrayList) list).get(0)).doubleValue();
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) f205363b;
        double doubleValue3 = ((java.lang.Double) arrayList2.get(0)).doubleValue();
        double abs3 = java.lang.Math.abs(d17 - doubleValue3);
        java.util.Iterator it6 = arrayList2.iterator();
        double d18 = abs3;
        double d19 = doubleValue3;
        while (it6.hasNext()) {
            double doubleValue4 = ((java.lang.Double) it6.next()).doubleValue();
            double abs4 = java.lang.Math.abs(d17 - doubleValue4);
            if (abs4 < d18) {
                d19 = doubleValue4;
                d18 = abs4;
            }
        }
        return d19;
    }

    public static java.lang.String b(java.lang.String str) {
        return ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str) ? "miniProgram" : r01.z.n(str) ? "biz" : "";
    }

    public static int c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        if (com.tencent.mm.storage.z3.z3(str)) {
            return 2;
        }
        if (r01.z.n(str)) {
            return 1;
        }
        return com.tencent.mm.storage.z3.S3(str) ? 3 : 0;
    }

    public static void d(android.content.Context context, java.lang.String str, android.widget.ImageView imageView, android.widget.TextView textView) {
        if (context == null || str == null || imageView == null || textView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizUtils", "refreshBizSrcInfoNew param null");
            return;
        }
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        if (com.tencent.mm.storage.z3.F3(str) && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi()) {
            imageView.setImageResource(com.tencent.mm.R.raw.photo_accounts_regular);
        } else {
            imageView.setImageResource(com.tencent.mm.R.raw.official_accounts_new_regular);
        }
        if (imageView instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_1));
        }
        g(context, str, textView);
    }

    public static void e(android.content.Context context, java.lang.String str, android.widget.ImageView imageView, android.widget.TextView textView) {
        if (context == null || str == null || imageView == null || textView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizUtils", "param null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizUtils", "srcUsername null");
        }
        if (c01.e2.G(str)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, " ");
            imageView.setImageResource(com.tencent.mm.R.drawable.bgo);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, "", textSize));
        imageView.setVisibility(0);
        textView.setVisibility(0);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            e17 = str;
        }
        imageView.setTag(str);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (n17 == null || ((int) n17.E2) <= 0)) {
            imageView.setTag(str);
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(imageView);
            ((c01.k7) c01.n8.a()).b(str, 5, new com.tencent.mm.ui.chatting.viewitems.og(weakReference, textView, context));
            return;
        }
        if (!c01.e2.G(str)) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.aj6);
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize2));
            return;
        }
        if (!n17.r2()) {
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            if (com.tencent.mm.modelavatar.g.a(str) == null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
                if (n07 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n07.d())) {
                    lr1.m.a(imageView, n17, n07.d(), true);
                }
            }
        }
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        float textSize3 = textView.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, e17, textSize3));
    }

    public static void f(android.content.Context context, java.lang.String str, android.widget.ImageView imageView, android.widget.TextView textView, boolean z17, boolean z18, boolean z19) {
        if (context == null || str == null || imageView == null || textView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizUtils", "refreshSrcInfo param null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizUtils", "refreshSrcInfo srcUsername null");
        }
        boolean z27 = imageView instanceof com.tencent.mm.ui.widget.imageview.WeImageView;
        if (z27) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setIconColor(0);
        }
        if (z18) {
            imageView.setVisibility(0);
            imageView.setImageResource(com.tencent.mm.R.raw.icons_filled_channel);
            if (z27) {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setIconColor(context.getColor(com.tencent.mm.R.color.f478526a7));
            }
            g(context, str, textView);
        } else {
            imageView.setLayerPaint(null);
            e(context, str, imageView, textView);
        }
        if (!z17) {
            imageView.setVisibility(8);
        }
        if (z19) {
            java.lang.CharSequence text = textView.getText();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = context.getResources().getString(com.tencent.mm.R.string.ajg);
            if (text == null) {
                text = "";
            }
            objArr[1] = text;
            textView.setText(context.getString(com.tencent.mm.R.string.n4t, objArr));
        }
    }

    public static void g(android.content.Context context, java.lang.String str, android.widget.TextView textView) {
        if (context == null || str == null || textView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizUtils", "param null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizUtils", "srcUsername null");
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, "", textSize));
        textView.setVisibility(0);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            e17 = str;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (n17 == null || ((int) n17.E2) <= 0)) {
            ((c01.k7) c01.n8.a()).b(str, 5, new com.tencent.mm.ui.chatting.viewitems.pg(textView, context));
        } else {
            if (c01.e2.G(str)) {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                float textSize2 = textView.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, e17, textSize2));
                return;
            }
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.aj6);
            float textSize3 = textView.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize3));
        }
    }

    public static void h(android.widget.TextView textView, ot0.q qVar, java.lang.String str) {
        if (textView == null) {
            return;
        }
        if (qVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemBizUtils", "setFriendInfo, param error");
            textView.setText("");
            return;
        }
        ot0.f fVar = (ot0.f) qVar.y(ot0.f.class);
        if (fVar == null || fVar.f348461h != 1) {
            textView.setText("");
            return;
        }
        java.lang.String string = textView.getContext().getString(com.tencent.mm.R.string.f492564gz4);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        textView.setText(string != null ? string : "");
    }

    public static boolean i(ot0.q qVar, ot0.f fVar) {
        if (fVar == null || qVar == null || com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348722w)) {
            return false;
        }
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(qVar.f348674k)) {
            return fVar.f348455b >= 0 || fVar.f348466m == 1;
        }
        return false;
    }

    public static void j(android.widget.ImageView imageView) {
        if (imageView != null && (imageView instanceof com.tencent.mm.view.CropImageView)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizUtils", "updateBizSharePicImageViewCrop");
            ((com.tencent.mm.view.CropImageView) imageView).setCropRect(new android.graphics.RectF(0.0f, 0.0f, 1.0f, 0.2f));
        }
    }
}
