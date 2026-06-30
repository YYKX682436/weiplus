package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionUI f137189d;

    public w0(com.tencent.mm.plugin.flash.action.FaceFlashActionUI faceFlashActionUI) {
        this.f137189d = faceFlashActionUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.action.FaceFlashActionUI faceFlashActionUI = this.f137189d;
        faceFlashActionUI.Z6(i65.a.d(faceFlashActionUI.getContext(), com.tencent.mm.R.color.BW_0));
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_youtusdk_switch, false) && faceFlashActionUI.f137102d.getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "showFailedLayout [%s]FaceFlashActivity showFailedLayout, has shown");
            return;
        }
        faceFlashActionUI.f137102d.setVisibility(8);
        if (wz2.a.f()) {
            faceFlashActionUI.b7("fail");
        } else {
            faceFlashActionUI.f137103e.setVisibility(0);
        }
        faceFlashActionUI.f137103e.setCircleY(faceFlashActionUI.f137102d.getCircleY());
        faceFlashActionUI.f137103e.f137098p = faceFlashActionUI.f137102d.f137067f.getVisibility() == 0;
        com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout faceFlashActionProcessLayout = faceFlashActionUI.f137103e;
        java.lang.String str = faceFlashActionUI.f137106h;
        int height = faceFlashActionUI.getContentView().getHeight();
        faceFlashActionProcessLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionProcessLayout", "showFailedAnimation");
        try {
            if (faceFlashActionProcessLayout.f137098p) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f137096n.getLayoutParams();
                layoutParams.removeRule(3);
                int p17 = height - com.tencent.mm.ui.bk.p(faceFlashActionProcessLayout.getContext());
                int i17 = (int) faceFlashActionProcessLayout.f137097o;
                double d17 = p17 * 0.5d;
                if (i17 > d17) {
                    layoutParams.topMargin = ((int) d17) - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 100);
                } else {
                    layoutParams.topMargin = i17 - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 100);
                }
                faceFlashActionProcessLayout.f137096n.setLayoutParams(layoutParams);
            } else {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f137096n.getLayoutParams();
                layoutParams2.addRule(3, com.tencent.mm.R.id.dnt);
                layoutParams2.topMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 48);
                faceFlashActionProcessLayout.f137096n.setLayoutParams(layoutParams2);
            }
            faceFlashActionProcessLayout.f137092g.setImageResource(com.tencent.mm.R.drawable.f481431t6);
            faceFlashActionProcessLayout.f137092g.startAnimation(faceFlashActionProcessLayout.f137099q);
            faceFlashActionProcessLayout.f137091f.setImageDrawable(i65.a.i(faceFlashActionProcessLayout.getContext(), com.tencent.mm.R.raw.icons_filled_error3));
            faceFlashActionProcessLayout.f137091f.startAnimation(faceFlashActionProcessLayout.f137101s);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            faceFlashActionProcessLayout.f137090e.setText(wz2.a.b(jSONObject, i65.a.r(faceFlashActionProcessLayout.getContext(), com.tencent.mm.R.string.c6l)));
            java.lang.String optString = jSONObject.optString("otherVerifyTitle");
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionProcessLayout", "otherVerifyTitle is :%s", optString);
            if (android.text.TextUtils.isEmpty(optString)) {
                faceFlashActionProcessLayout.f137094i.setVisibility(4);
                faceFlashActionProcessLayout.f137093h.setBackgroundResource(com.tencent.mm.R.drawable.f481445td);
                faceFlashActionProcessLayout.f137093h.setTextColor(faceFlashActionProcessLayout.getContext().getResources().getColor(com.tencent.mm.R.color.f478948lo));
            } else {
                faceFlashActionProcessLayout.f137093h.setBackgroundResource(com.tencent.mm.R.drawable.t_);
                faceFlashActionProcessLayout.f137093h.setTextColor(faceFlashActionProcessLayout.getContext().getResources().getColor(com.tencent.mm.R.color.f478942li));
                faceFlashActionProcessLayout.f137094i.setVisibility(0);
                faceFlashActionProcessLayout.f137094i.setText(optString);
                faceFlashActionProcessLayout.f137094i.setOnClickListener(new com.tencent.mm.plugin.flash.action.c0(faceFlashActionProcessLayout, jSONObject));
            }
            java.lang.String optString2 = jSONObject.optString("err_feedback", "");
            faceFlashActionProcessLayout.f137095m.setVisibility(android.text.TextUtils.isEmpty(optString2) ? 4 : 0);
            com.tencent.mm.ui.bk.r0(faceFlashActionProcessLayout.f137095m.getPaint(), 0.8f);
            java.lang.String string = faceFlashActionProcessLayout.getContext().getResources().getString(com.tencent.mm.R.string.c6s);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new l72.c0(string, faceFlashActionProcessLayout.getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo), faceFlashActionProcessLayout.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_2), true, new com.tencent.mm.plugin.flash.action.d0(faceFlashActionProcessLayout, jSONObject, optString2)), 0, spannableString.length(), 17);
            faceFlashActionProcessLayout.f137095m.setClickable(true);
            android.widget.TextView textView = faceFlashActionProcessLayout.f137095m;
            le0.u uVar = (le0.u) i95.n0.c(le0.u.class);
            faceFlashActionProcessLayout.getContext();
            ((ke0.e) uVar).getClass();
            textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
            faceFlashActionProcessLayout.f137095m.setText(spannableString);
            boolean z17 = jSONObject.optInt("err_retry", 1) == 1;
            faceFlashActionProcessLayout.f137093h.setVisibility(0);
            faceFlashActionProcessLayout.f137093h.setText(z17 ? i65.a.r(faceFlashActionProcessLayout.getContext(), com.tencent.mm.R.string.c7v) : i65.a.r(faceFlashActionProcessLayout.getContext(), com.tencent.mm.R.string.c7r));
            faceFlashActionProcessLayout.f137093h.setOnClickListener(new com.tencent.mm.plugin.flash.action.e0(faceFlashActionProcessLayout, z17, jSONObject, optString));
            if (faceFlashActionProcessLayout.f137094i.getVisibility() == 0 && faceFlashActionProcessLayout.f137095m.getVisibility() == 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f137094i.getLayoutParams();
                layoutParams3.bottomMargin = i65.a.b(faceFlashActionProcessLayout.getContext(), 108);
                faceFlashActionProcessLayout.f137094i.setLayoutParams(layoutParams3);
                android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f137093h.getLayoutParams();
                layoutParams4.removeRule(12);
                layoutParams4.addRule(2, com.tencent.mm.R.id.dnk);
                layoutParams4.bottomMargin = i65.a.b(faceFlashActionProcessLayout.getContext(), 16);
                faceFlashActionProcessLayout.f137093h.setLayoutParams(layoutParams4);
            }
            if (faceFlashActionProcessLayout.f137094i.getVisibility() != 0 && faceFlashActionProcessLayout.f137095m.getVisibility() != 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f137093h.getLayoutParams();
                layoutParams5.addRule(12);
                layoutParams5.removeRule(2);
                layoutParams5.bottomMargin = i65.a.b(faceFlashActionProcessLayout.getContext(), 96);
                faceFlashActionProcessLayout.f137093h.setLayoutParams(layoutParams5);
            }
            if (faceFlashActionProcessLayout.f137094i.getVisibility() == 0 && faceFlashActionProcessLayout.f137095m.getVisibility() != 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f137094i.getLayoutParams();
                layoutParams6.bottomMargin = i65.a.b(faceFlashActionProcessLayout.getContext(), 96);
                faceFlashActionProcessLayout.f137094i.setLayoutParams(layoutParams6);
                android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f137093h.getLayoutParams();
                layoutParams7.removeRule(12);
                layoutParams7.addRule(2, com.tencent.mm.R.id.dnk);
                layoutParams7.bottomMargin = i65.a.b(faceFlashActionProcessLayout.getContext(), 16);
                faceFlashActionProcessLayout.f137093h.setLayoutParams(layoutParams7);
            }
            if (faceFlashActionProcessLayout.f137094i.getVisibility() != 0 && faceFlashActionProcessLayout.f137095m.getVisibility() == 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f137093h.getLayoutParams();
                layoutParams8.addRule(12);
                layoutParams8.removeRule(2);
                layoutParams8.bottomMargin = i65.a.b(faceFlashActionProcessLayout.getContext(), 108);
                faceFlashActionProcessLayout.f137093h.setLayoutParams(layoutParams8);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "parse face failed result error.%s", str);
            faceFlashActionProcessLayout.f137090e.setText(str);
            faceFlashActionProcessLayout.f137095m.setVisibility(4);
            faceFlashActionProcessLayout.f137093h.setVisibility(0);
            faceFlashActionProcessLayout.f137093h.setText(i65.a.r(faceFlashActionProcessLayout.getContext(), com.tencent.mm.R.string.c7v));
            faceFlashActionProcessLayout.f137093h.setOnClickListener(new com.tencent.mm.plugin.flash.action.f0(faceFlashActionProcessLayout));
        }
        java.lang.String str2 = faceFlashActionUI.f137106h;
        try {
            vz2.c.h(new org.json.JSONObject(str2).optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 1));
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e18, "parse face fail result error.%s", str2);
        }
    }
}
