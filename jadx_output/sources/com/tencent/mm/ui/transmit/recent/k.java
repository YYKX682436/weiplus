package com.tencent.mm.ui.transmit.recent;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.transmit.recent.k f211058a = new com.tencent.mm.ui.transmit.recent.k();

    public final android.view.View a(android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        if (3 == i17) {
            if (sheet.D1 == null) {
                sheet.g();
            }
            if (sheet.E1 == null) {
                sheet.E1 = (android.widget.TextView) sheet.S.findViewById(com.tencent.mm.R.id.ptd);
            }
            android.widget.TextView textView = sheet.E1;
            if (textView != null) {
                textView.setVisibility(0);
                sheet.E1.setText(com.tencent.mm.R.string.ifg);
                if (sheet.f211857e2) {
                    sheet.E1.setTextColor(sheet.f211870m.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                } else {
                    sheet.E1.setTextColor(sheet.f211870m.getResources().getColor(com.tencent.mm.R.color.FG_0));
                }
            }
            return null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.cch, (android.view.ViewGroup) null);
        if (inflate != null) {
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ave);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.avf);
            com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
            context.getResources().getDimension(com.tencent.mm.R.dimen.f479723df);
            sheet.S1 = true;
            android.widget.ImageView imageView = sheet.M1;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            android.widget.LinearLayout linearLayout = sheet.U;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                sheet.U.removeAllViews();
                sheet.U.setGravity(17);
                sheet.U.addView(inflate, -1, -2);
            }
            if (i17 == 1) {
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                textView3.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                textView3.setVisibility(0);
            } else if (i17 == 2) {
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                textView3.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                textView3.setVisibility(0);
            } else if (i17 == 5) {
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                textView3.setVisibility(0);
            } else if (i17 != 6) {
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                textView3.setVisibility(0);
                com.tencent.mars.xlog.Log.w("MircoMsg.RecentForwardUtils", "invalid type:" + i17);
            } else {
                textView3.setVisibility(8);
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                android.view.ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                textView2.setLayoutParams(marginLayoutParams);
            }
        }
        return inflate;
    }
}
