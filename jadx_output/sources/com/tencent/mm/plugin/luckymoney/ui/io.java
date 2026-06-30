package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class io implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.jo f147035d;

    public io(com.tencent.mm.plugin.luckymoney.ui.jo joVar) {
        this.f147035d = joVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.jo joVar = this.f147035d;
        if (joVar.getContext().isFinishing() || joVar.getContext().isDestroyed()) {
            return;
        }
        if (!joVar.O6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[updateRightTextOptionMenuRedDot] do not show reddot");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = joVar.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI");
        r45.lm5 c76 = ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI) activity).c7();
        if (c76 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[updateRightTextOptionMenuRedDot] redDotData == null");
            return;
        }
        int i17 = c76.f379622d;
        if (i17 == 1) {
            joVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[doShowNewRedDotStyle]");
            android.widget.TextView textView = (android.widget.TextView) joVar.getActivity().findViewById(com.tencent.mm.R.id.f482486fu);
            android.widget.TextView textView2 = (android.widget.TextView) joVar.getActivity().findViewById(com.tencent.mm.R.id.bzc);
            if (textView == null || textView2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[doShowNewRedDotStyle] actionOptionTv == null || actionOptionRedTv == null");
                return;
            }
            textView2.setVisibility(0);
            textView.setPadding(i65.a.b(joVar.getContext(), 4), 0, i65.a.b(joVar.getContext(), 16), 0);
            textView2.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.Cdo(joVar));
            return;
        }
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[updateRightTextOptionMenuRedDot] unknown type");
            return;
        }
        joVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[doShowUpdateRedDotStyle]");
        androidx.appcompat.app.AppCompatActivity activity2 = joVar.getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI");
        ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI) activity2).i7(27);
        android.widget.TextView textView3 = (android.widget.TextView) joVar.getActivity().findViewById(com.tencent.mm.R.id.f482486fu);
        if (textView3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[doShowUpdateRedDotStyle] actionOptionTv == null");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity3 = joVar.getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI");
        ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI) activity3).updateOptionMenuRedDot(1, true);
        android.view.View inflate = com.tencent.mm.ui.id.b(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.f489250dv5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        com.tencent.mm.plugin.luckymoney.ui.mo moVar = new com.tencent.mm.plugin.luckymoney.ui.mo(inflate);
        joVar.f147075d = moVar;
        moVar.setAnimationStyle(com.tencent.mm.R.style.f494259ya);
        moVar.setFocusable(false);
        moVar.getContentView().setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.eo(moVar, joVar));
        moVar.getContentView().postDelayed(new com.tencent.mm.plugin.luckymoney.ui.fo(moVar), 3000L);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) moVar.getContentView().findViewById(com.tencent.mm.R.id.f485823rw1);
        java.lang.String str = c76.f379631p;
        if (str == null || str.length() == 0) {
            cdnImageView.setVisibility(8);
        } else {
            cdnImageView.setVisibility(0);
            cdnImageView.setUrl(c76.f379631p);
        }
        java.lang.String g17 = com.tencent.mm.plugin.luckymoney.model.m5.g(c76);
        if (g17 == null || g17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[doShowUpdateRedDotStyle] title isNullOrEmpty");
            return;
        }
        android.widget.TextView textView4 = (android.widget.TextView) moVar.getContentView().findViewById(com.tencent.mm.R.id.f485825rw3);
        android.widget.ImageView imageView = (android.widget.ImageView) moVar.getContentView().findViewById(com.tencent.mm.R.id.f485827rw5);
        textView4.setText(g17);
        textView3.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.ho(joVar, moVar, textView3, imageView), 50L);
    }
}
