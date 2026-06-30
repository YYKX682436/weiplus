package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class m0 extends com.tencent.mm.pluginsdk.ui.otherway.p0 {
    public m0(com.tencent.mm.pluginsdk.ui.otherway.a aVar, kb0.g gVar) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.otherway.p0, com.tencent.mm.pluginsdk.ui.otherway.o0, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, com.tencent.mm.pluginsdk.ui.otherway.w data, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.String str2;
        lb0.d dVar;
        com.tencent.mm.pluginsdk.model.a c17;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(data, "data");
        super.h(holder, data, i17, i18, z17, list);
        xj.m mVar = data.f191022o;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.tab);
        if (linearLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            kotlin.jvm.internal.o.f(layoutParams, "getLayoutParams(...)");
            int f17 = i65.a.f(linearLayout.getContext(), com.tencent.mm.R.dimen.als);
            if (f17 > layoutParams.height) {
                layoutParams.height = f17;
                linearLayout.setLayoutParams(layoutParams);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.e1t);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e1s);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.taa);
        xj.m mVar2 = data.f191022o;
        java.lang.Object obj3 = jz5.f0.f302826a;
        if (mVar2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adInfo hintText: ");
            java.lang.String str3 = mVar2.f454754b;
            sb6.append(str3);
            sb6.append(", adDescText: ");
            java.lang.String str4 = mVar2.f454755c;
            sb6.append(str4);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenWayAdLineItemConvert", sb6.toString());
            java.lang.Integer num = data.f191027t;
            java.lang.String str5 = "";
            if (num != null) {
                if (((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(num.intValue()) && (c17 = (dVar = lb0.d.f317669a).c(data.f191021n)) != null) {
                    java.lang.String d17 = dVar.d(c17, textView2 != null ? textView2.getContext() : null);
                    if (d17 != null) {
                        str5 = d17;
                    }
                }
            }
            if (textView != null) {
                if (!r26.n0.N(str5)) {
                    str3 = str5;
                }
                textView.setText(str3);
            }
            com.tencent.mm.pluginsdk.ui.otherway.x xVar = data.f191014d;
            if (xVar == null || (str2 = xVar.f191031g) == null || imageView == null) {
                obj2 = null;
            } else {
                com.tencent.mm.pluginsdk.ui.otherway.o0.f190982e.c(str2, imageView, 0.0f, false);
                obj2 = obj3;
            }
            if (obj2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenWayAdLineItemConvert", "onBindViewHolder iconUrl is null");
            }
            if (!r26.n0.N(str4)) {
                if (textView2 != null) {
                    textView2.setText(str4);
                }
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
            obj = obj3;
        } else {
            obj = null;
        }
        if (obj == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenWayAdLineItemConvert", "onBindViewHolder adInfo is null");
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.tac);
        if (textView3 != null) {
            textView3.setText(com.tencent.mm.R.string.ocr);
            android.text.TextPaint paint = textView3.getPaint();
            kotlin.jvm.internal.o.f(paint, "getPaint(...)");
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(0.8f);
            textView3.setVisibility(0);
        }
        if (mVar != null && (str = mVar.f454753a) != null) {
            i95.m c18 = i95.n0.c(xj.i.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            xj.i.gg((xj.i) c18, str, wj.w0.f446541d, null, 4, null);
            java.lang.Integer num2 = data.f191027t;
            if (num2 != null) {
                int intValue = num2.intValue();
                lb0.d dVar2 = lb0.d.f317669a;
                com.tencent.mm.pluginsdk.model.a c19 = dVar2.c(data.f191021n);
                if (c19 != null) {
                    com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("recent_use_app_mmkv", 2, null);
                    if (N != null) {
                        r45.mk5 mk5Var = new r45.mk5();
                        long c27 = c01.id.c();
                        byte[] j17 = N.j(str);
                        if ((j17 != null ? mk5Var.parseFrom(j17) : null) == null) {
                            mk5Var.f380605d = c27;
                            mk5Var.f380607f = dVar2.e(intValue, c19) + c27;
                        }
                        if (mk5Var.f380605d == 0) {
                            mk5Var.f380605d = c27;
                        }
                        if (mk5Var.f380607f == 0) {
                            mk5Var.f380607f = dVar2.e(intValue, c19) + c27;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenByOtherMMKV", "addExposeRecord: " + str + " firstExposedTime: " + mk5Var.f380605d + " expiredTime: " + mk5Var.f380607f + " lastClickedTime: " + mk5Var.f380606e + ", curTimeMs: " + c27);
                        N.H(str, mk5Var.toByteArray());
                    }
                } else {
                    obj3 = null;
                }
                r10 = obj3;
            }
        }
        if (r10 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenWayAdLineItemConvert", "ad expose report adInfo is null");
        }
    }
}
