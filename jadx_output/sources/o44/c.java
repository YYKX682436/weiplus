package o44;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f342863a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f342864b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f342865c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f342866d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f342867e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f342868f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f342869g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f342870h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f342871i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.FrameLayout f342872j;

    /* renamed from: k, reason: collision with root package name */
    public ab4.b f342873k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f342874l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f342875m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f342876n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f342877o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f342878p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f342879q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f342880r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f342881s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f342882t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f342883u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f342884v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.drawable.Drawable f342885w;

    public static o44.c g(android.content.Context context, android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inflateCard", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        android.view.View inflate = i17 == 1 ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cpm, viewGroup, false) : i17 == 2 ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cpn, viewGroup, false) : null;
        if (inflate == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateCard", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return null;
        }
        o44.c cVar = new o44.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        cVar.f342864b = context;
        cVar.f342863a = i17;
        cVar.f342865c = inflate;
        cVar.f342867e = inflate.findViewById(com.tencent.mm.R.id.cgi);
        cVar.f342866d = inflate.findViewById(com.tencent.mm.R.id.mqh);
        cVar.f342868f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gzm);
        cVar.f342869g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odh);
        cVar.f342870h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cuv);
        cVar.f342871i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.gxc);
        cVar.f342872j = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.gxf);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.azj);
        cVar.f342875m = textView;
        if (i17 == 1) {
            cVar.f342874l = textView;
        } else {
            cVar.f342874l = inflate.findViewById(com.tencent.mm.R.id.b0r);
        }
        cVar.f342876n = inflate.findViewById(com.tencent.mm.R.id.mm_);
        cVar.f342877o = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mma);
        cVar.f342878p = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.mm9);
        cVar.f342879q = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mmb);
        cVar.f342883u = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.crf);
        cVar.f342881s = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f485369hf3);
        cVar.f342880r = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485371hf5);
        cVar.f342882t = inflate.findViewById(com.tencent.mm.R.id.f485370hf4);
        try {
            com.tencent.mm.ui.bk.r0(cVar.f342869g.getPaint(), 0.8f);
            cVar.a(i17);
            cVar.b();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("HBCardViewWrapper", "adapter oldMode exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateCard", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        return cVar;
    }

    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adapterFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        m(this.f342868f, 14);
        if (i17 == 1) {
            m(this.f342869g, 20);
            m(this.f342870h, 14);
            m(this.f342880r, 14);
        } else {
            m(this.f342877o, 16);
            m(this.f342879q, 14);
            m(this.f342883u, 12);
            m(this.f342869g, 20);
            m(this.f342870h, 14);
        }
        m(this.f342875m, 17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adapterFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adapterLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        n(this.f342871i, 174, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT);
        n(this.f342872j, 174, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT);
        n(this.f342874l, 184, 48);
        n(this.f342881s, 18, 18);
        android.widget.TextView textView = this.f342880r;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = f(2);
                this.f342880r.setLayoutParams(layoutParams);
            }
        }
        int i17 = this.f342863a;
        if (i17 == 1) {
            o(this.f342868f, 0);
            o(this.f342869g, 32);
            o(this.f342870h, 10);
            o(this.f342871i, 0);
            o(this.f342872j, 0);
            o(this.f342874l, 19);
            o(this.f342882t, 15);
            if (this.f342882t != null) {
                int f17 = f(5);
                this.f342882t.setPadding(f17, f17, f17, f17);
            }
        } else if (i17 == 2) {
            o(this.f342868f, 32);
            o(this.f342876n, 32);
            o(this.f342869g, 10);
            o(this.f342865c.findViewById(com.tencent.mm.R.id.gxd), 0);
            n(this.f342883u, 152, 39);
            o(this.f342874l, 19);
            o(this.f342870h, 16);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adapterLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cardAppeared", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f342865c.getVisibility();
        java.util.Objects.toString(this.f342873k);
        ab4.b bVar = this.f342873k;
        if (bVar != null) {
            bVar.J();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardAppeared", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cardWillAppear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f342865c.getVisibility();
        java.util.Objects.toString(this.f342873k);
        ab4.b bVar = this.f342873k;
        if (bVar != null) {
            bVar.K();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardWillAppear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cardWillDisappear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f342865c.getVisibility();
        java.util.Objects.toString(this.f342873k);
        ab4.b bVar = this.f342873k;
        if (bVar != null) {
            bVar.M();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardWillDisappear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public int f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        int n17 = (int) za4.z0.n(i17, 375);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        return n17;
    }

    public void h(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnEnabled", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (z17) {
            this.f342884v.setAlpha(255);
            this.f342874l.setBackground(this.f342884v);
            this.f342874l.setEnabled(true);
        } else {
            this.f342884v.setAlpha(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS);
            this.f342874l.setBackground(this.f342884v);
            this.f342874l.setEnabled(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnEnabled", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void i(int i17) {
        android.widget.TextView textView;
        android.graphics.drawable.Drawable drawable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnIconVisibility", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (this.f342863a != 2 || (textView = this.f342875m) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnIconVisibility", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return;
        }
        if (i17 != 0 || (drawable = this.f342885w) == null) {
            textView.setCompoundDrawables(null, null, null, null);
            this.f342875m.setCompoundDrawablePadding(0);
        } else {
            textView.setCompoundDrawables(drawable, null, null, null);
            this.f342875m.setCompoundDrawablePadding(i65.a.b(this.f342864b, 4));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnIconVisibility", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void j(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnText", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f342875m.setText(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnText", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public void k(f54.o oVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f342868f.setText(oVar.f259725a);
        this.f342870h.setText(oVar.f259726b);
        j(oVar.f259728d);
        h(true);
        this.f342865c.setRotation(0.0f);
        android.widget.TextView textView = this.f342883u;
        if (textView != null) {
            textView.setText(oVar.f259727c);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b A[Catch: all -> 0x016c, TryCatch #4 {all -> 0x016c, blocks: (B:36:0x00e0, B:38:0x00f0, B:40:0x00f6, B:41:0x00fb, B:43:0x010b, B:44:0x0127, B:46:0x013a, B:48:0x0148, B:65:0x0119), top: B:35:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013a A[Catch: all -> 0x016c, TryCatch #4 {all -> 0x016c, blocks: (B:36:0x00e0, B:38:0x00f0, B:40:0x00f6, B:41:0x00fb, B:43:0x010b, B:44:0x0127, B:46:0x013a, B:48:0x0148, B:65:0x0119), top: B:35:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119 A[Catch: all -> 0x016c, TryCatch #4 {all -> 0x016c, blocks: (B:36:0x00e0, B:38:0x00f0, B:40:0x00f6, B:41:0x00fb, B:43:0x010b, B:44:0x0127, B:46:0x013a, B:48:0x0148, B:65:0x0119), top: B:35:0x00e0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(f54.p r20) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o44.c.l(f54.p):void");
    }

    public void m(android.widget.TextView textView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRelativeFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRelativeFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        } else {
            textView.setTextSize(0, f(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRelativeFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        }
    }

    public final void n(android.view.View view, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return;
        }
        int f17 = f(i17);
        int f18 = f(i18);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != f17 || layoutParams.height != f18) {
            layoutParams.width = f17;
            layoutParams.height = f18;
            view.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    public final void o(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewMarginTop", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewMarginTop", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return;
        }
        int f17 = f(i17);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.topMargin != f17) {
                marginLayoutParams.topMargin = f17;
                view.setLayoutParams(layoutParams);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewMarginTop", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }
}
