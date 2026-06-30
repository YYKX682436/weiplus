package md4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final md4.e f325877a = new md4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f325878b = new java.util.ArrayList(java.util.Arrays.asList(java.lang.Double.valueOf(0.75d), java.lang.Double.valueOf(1.0d), java.lang.Double.valueOf(1.3333333333333333d)));

    public final void a(android.widget.ImageView imageView, com.tencent.mm.storage.z3 contact, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachRound", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        kotlin.jvm.internal.o.g(contact, "contact");
        if (z17 || !contact.r2()) {
            o11.f fVar = new o11.f();
            fVar.f342091o = com.tencent.mm.R.drawable.bgo;
            fVar.f342079c = true;
            fVar.f342096t = true;
            n11.a.b().h(str, imageView, fVar.a());
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, contact.d1());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachRound", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
    }

    public final android.view.View b(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildSnsCardView", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(pc4.d.f353410a.x() ? com.tencent.mm.R.layout.dzv : com.tencent.mm.R.layout.dzu, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildSnsCardView", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        return inflate;
    }

    public final java.lang.String c(java.lang.String url) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheKey", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        kotlin.jvm.internal.o.g(url, "url");
        byte[] bytes = url.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheKey", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        return g17;
    }

    public final java.util.List d(com.tencent.mm.protocal.protobuf.TimeLineObject tlObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        kotlin.jvm.internal.o.g(tlObject, "tlObject");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowImageStyle", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        r45.a90 a90Var = tlObject.ContentObj;
        r45.hh4 hh4Var = a90Var.f369843n;
        boolean z17 = (hh4Var != null && hh4Var.f376149d == 8) && hh4Var.f376160r > 0 && a90Var.f369840h.size() > 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowImageStyle", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        if (!z17) {
            java.util.List a17 = qa4.f.a(tlObject);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
            return a17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (pc4.d.f353410a.a()) {
            arrayList.add(qa4.f.a(tlObject).get(1));
        } else {
            arrayList.add(qa4.f.a(tlObject).get(0));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        return arrayList;
    }

    public final void e(android.view.View root, java.lang.String url, float f17, float f18, java.lang.String str, java.lang.String str2, int i17) {
        java.lang.String str3;
        int i18;
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        android.content.Context context;
        md4.e eVar;
        android.widget.ImageView imageView2;
        double d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCardView", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(url, "url");
        android.widget.ImageView imageView3 = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.bcb);
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.b9_);
        android.widget.ImageView imageView4 = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.f483402sj4);
        android.widget.TextView textView3 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f483403sj5);
        android.widget.TextView textView4 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.ptk);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.sj6);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.sj7);
        android.widget.ImageView imageView5 = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.szt);
        android.content.Context context2 = root.getContext();
        imageView3.setImageResource(com.tencent.mm.R.color.f478492d);
        kotlin.jvm.internal.o.d(context2);
        kotlin.jvm.internal.o.d(imageView5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateThumbSize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        boolean x17 = pc4.d.f353410a.x();
        int i19 = be1.r.CTRL_INDEX;
        if (x17) {
            str3 = "updateCardView";
            i18 = 138;
        } else {
            str3 = "updateCardView";
            i18 = 169;
        }
        int b17 = i65.a.b(context2, i18);
        if (f17 <= 0.0f || f18 <= 0.0f) {
            imageView = imageView4;
            textView = textView4;
            context = context2;
            android.view.ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = b17;
                layoutParams.height = b17;
                imageView3.setLayoutParams(layoutParams);
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView5.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = b17;
                layoutParams2.height = b17;
                imageView5.setLayoutParams(layoutParams2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateThumbSize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        } else {
            textView = textView4;
            double d18 = b17;
            imageView = imageView4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findClosestRatio", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
            if (f17 <= 0.0f || f18 <= 0.0f) {
                context = context2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findClosestRatio", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
                d17 = 0.75d;
            } else {
                double d19 = f17 / f18;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findClosestRatio", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
                java.util.ArrayList arrayList = (java.util.ArrayList) f325878b;
                context = context2;
                d17 = ((java.lang.Number) arrayList.get(0)).doubleValue();
                double abs = java.lang.Math.abs(d19 - d17);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    double doubleValue = ((java.lang.Number) it.next()).doubleValue();
                    double abs2 = java.lang.Math.abs(d19 - doubleValue);
                    if (abs2 < abs) {
                        d17 = doubleValue;
                        abs = abs2;
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findClosestRatio", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findClosestRatio", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
            }
            int i27 = (int) (d18 / d17);
            android.view.ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = b17;
                layoutParams3.height = i27;
                imageView3.setLayoutParams(layoutParams3);
            }
            android.view.ViewGroup.LayoutParams layoutParams4 = imageView5.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = b17;
                layoutParams4.height = i27;
                imageView5.setLayoutParams(layoutParams4);
            }
            android.view.ViewGroup.LayoutParams layoutParams5 = imageView5.getLayoutParams();
            layoutParams5.width = b17;
            layoutParams5.height = i27;
            imageView5.setLayoutParams(layoutParams5);
            if (f17 / f18 < 0.33000001311302185d) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBizSharePicImageViewCropWithLongPic", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
                if (imageView3 instanceof com.tencent.mm.view.CropImageView) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizPicMsgCardHelper", "updateBizSharePicImageViewCrop");
                    ((com.tencent.mm.view.CropImageView) imageView3).setCropRect(new android.graphics.RectF(0.0f, 0.0f, 1.0f, 0.2f));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBizSharePicImageViewCropWithLongPic", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetBizSharePicImageViewCropWithLongPic", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
                if (imageView3 instanceof com.tencent.mm.view.CropImageView) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizPicMsgCardHelper", "resetBizSharePicImageViewCropWithLongPic");
                    ((com.tencent.mm.view.CropImageView) imageView3).setCropRect(new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetBizSharePicImageViewCropWithLongPic", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateThumbSize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        }
        kotlin.jvm.internal.o.d(textView2);
        kotlin.jvm.internal.o.d(findViewById);
        kotlin.jvm.internal.o.d(findViewById2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateContentSize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        pc4.d dVar = pc4.d.f353410a;
        if (dVar.x()) {
            i19 = 150;
        }
        android.content.Context context3 = context;
        int b18 = i65.a.b(context3, i19);
        android.view.ViewGroup.LayoutParams layoutParams6 = textView2.getLayoutParams();
        layoutParams6.width = b18;
        textView2.setLayoutParams(layoutParams6);
        android.view.ViewGroup.LayoutParams layoutParams7 = findViewById.getLayoutParams();
        layoutParams7.width = b18;
        findViewById.setLayoutParams(layoutParams7);
        android.view.ViewGroup.LayoutParams layoutParams8 = findViewById2.getLayoutParams();
        layoutParams8.width = b18;
        findViewById2.setLayoutParams(layoutParams8);
        if (dVar.x()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/improve/loader/BizPicMsgCardHelper", "updateContentSize", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/item/improve/loader/BizPicMsgCardHelper", "updateContentSize", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/item/improve/loader/BizPicMsgCardHelper", "updateContentSize", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/item/improve/loader/BizPicMsgCardHelper", "updateContentSize", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateContentSize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        java.lang.String obj = str2 != null ? r26.n0.u0(str2).toString() : null;
        if (android.text.TextUtils.isEmpty(obj)) {
            textView2.setVisibility(4);
        } else {
            textView2.setVisibility(0);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context3, obj));
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.okr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(i17), obj}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        imageView3.setContentDescription(format);
        if (dVar.x()) {
            imageView3.setImportantForAccessibility(2);
        }
        if (android.text.TextUtils.isEmpty(url)) {
            eVar = this;
        } else {
            o11.f fVar = new o11.f();
            fVar.f342091o = com.tencent.mm.R.color.amn;
            fVar.f342077a = true;
            eVar = this;
            fVar.D = eVar.c(url);
            n11.a.b().h(url, imageView3, fVar.a());
        }
        textView.setText(java.lang.String.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshSrcInfo", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        if (str == null || imageView == null || textView3 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPicMsgCardHelper", "param null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshSrcInfo", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPicMsgCardHelper", "srcUsername null");
            }
            if (c01.e2.G(str)) {
                imageView2 = imageView;
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView2, str);
            } else {
                imageView2 = imageView;
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView2, " ");
                imageView2.setImageResource(com.tencent.mm.R.drawable.bgo);
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView3.getTextSize();
            ((ke0.e) xVar).getClass();
            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, "", textSize));
            imageView2.setVisibility(0);
            textView3.setVisibility(0);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                e17 = str;
            }
            imageView2.setTag(str);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (n17 == null || ((int) n17.E2) <= 0)) {
                imageView2.setTag(str);
                ((c01.k7) c01.n8.a()).b(str, 3, new md4.b(new java.lang.ref.WeakReference(imageView2), textView3, context3));
            } else if (c01.e2.G(str)) {
                kotlin.jvm.internal.o.d(n17);
                if (!n17.r2()) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                    if (com.tencent.mm.modelavatar.g.a(str) == null) {
                        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
                        if (n07 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n07.d())) {
                            eVar.a(imageView2, n17, n07.d(), true);
                        }
                    }
                }
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                float textSize2 = textView3.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, e17, textSize2));
            } else {
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string2 = context3.getResources().getString(com.tencent.mm.R.string.f493199oj4);
                float textSize3 = textView3.getTextSize();
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, string2, textSize3));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshSrcInfo", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        }
        if (dVar.x()) {
            root.getViewTreeObserver().addOnGlobalLayoutListener(new md4.c(root));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
    }

    public final void f(android.view.View root, r45.jj4 media, java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCardView", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(media, "media");
        r45.lj4 lj4Var = media.f377865p;
        e(root, "", lj4Var.f379520d, lj4Var.f379521e, str, str2, i17);
        android.widget.ImageView imageView = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.bcb);
        imageView.setTag(media.f377855d);
        com.tencent.mm.plugin.sns.model.l4.hj().o(media, imageView, hashCode(), true, com.tencent.mm.storage.s7.d(), false, null, new md4.d(media, imageView));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCardView", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
    }
}
