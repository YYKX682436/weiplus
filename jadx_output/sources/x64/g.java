package x64;

/* loaded from: classes4.dex */
public class g extends w64.a {
    public g(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        this.f443283a = adClickActionInfo;
    }

    @Override // w64.a
    public boolean c(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick");
        if (adClickActionInfo == null || snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick");
            return false;
        }
        a84.u0.a((com.tencent.mm.modelsns.SnsAdClick) dVar.a("snsAdClick", null), 42);
        android.content.Context context = view.getContext();
        x64.f fVar = new x64.f(context, snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        fVar.f452285p = adClickActionInfo;
        if (fVar.f452278f == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cqu, (android.view.ViewGroup) null);
            fVar.f452279g = inflate;
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.bys);
            android.widget.TextView textView = (android.widget.TextView) fVar.f452279g.findViewById(com.tencent.mm.R.id.f487165nr4);
            fVar.f452280h = (android.widget.ImageView) fVar.f452279g.findViewById(com.tencent.mm.R.id.f487696ph4);
            fVar.f452281i = (android.widget.TextView) fVar.f452279g.findViewById(com.tencent.mm.R.id.f487697ph5);
            fVar.f452282m = (android.widget.TextView) fVar.f452279g.findViewById(com.tencent.mm.R.id.nri);
            fVar.f452283n = (android.widget.TextView) fVar.f452279g.findViewById(com.tencent.mm.R.id.nr8);
            if (findViewById != null) {
                findViewById.setOnClickListener(new x64.b(fVar));
            }
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.j6o);
                textView.setOnClickListener(new x64.c(fVar));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, true, 0);
            fVar.f452278f = k0Var;
            k0Var.s(fVar.f452279g, true);
            fVar.f452278f.e(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        android.widget.TextView textView2 = fVar.f452281i;
        if (textView2 != null) {
            textView2.setText(adClickActionInfo.U);
        }
        android.widget.TextView textView3 = fVar.f452282m;
        if (textView3 != null) {
            textView3.setText(adClickActionInfo.V);
        }
        android.widget.TextView textView4 = fVar.f452283n;
        if (textView4 != null) {
            textView4.setText(adClickActionInfo.W);
        }
        o94.c.a(com.tencent.mm.R.id.n5u, adClickActionInfo.T, fVar.f452280h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        if (!fVar.f452278f.i()) {
            fVar.f452278f.v();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick");
        return true;
    }
}
