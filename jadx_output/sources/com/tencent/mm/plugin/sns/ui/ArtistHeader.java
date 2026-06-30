package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ArtistHeader extends android.widget.LinearLayout implements com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.za f166194d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.k0 f166195e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k2 f166196f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f166197g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f166198h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f166199i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Context f166200m;

    public ArtistHeader(android.content.Context context) {
        super(context);
        this.f166194d = null;
        this.f166196f = null;
        this.f166200m = null;
        d(context);
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 a(com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.tencent.mm.ui.widget.dialog.k2 k2Var = artistHeader.f166196f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        return k2Var;
    }

    public static /* synthetic */ r45.za b(com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        r45.za zaVar = artistHeader.f166194d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        return zaVar;
    }

    public static void c(com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader, android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        artistHeader.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showHDAvatar", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.widget.ImageView imageView = artistHeader.f166197g;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showHDAvatar", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public final void d(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cqq, (android.view.ViewGroup) this, true);
        this.f166200m = context;
        com.tencent.mm.plugin.sns.ui.k0 k0Var = new com.tencent.mm.plugin.sns.ui.k0(this);
        this.f166195e = k0Var;
        k0Var.f169597a = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a58);
        this.f166195e.f169598b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482284a8);
        this.f166195e.f169599c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482286aa);
        this.f166195e.f169600d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482285a9);
        this.f166195e.f169601e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a_);
        this.f166195e.f169597a.setOnClickListener(new com.tencent.mm.plugin.sns.ui.g0(this, context));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        if (this.f166194d == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k2 k2Var = this.f166196f;
        if (k2Var != null && k2Var.isShowing()) {
            if (!z17 && (str2 = this.f166194d.f391845h.f369879d.f377855d) != null && str2.equals(str)) {
                android.content.Context context = this.f166200m;
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.j_9), 0).show();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                return;
            } else {
                android.widget.ImageView imageView = this.f166197g;
                if (imageView != null) {
                    imageView.post(new com.tencent.mm.plugin.sns.ui.i0(this));
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public void setBackClickListener(com.tencent.mm.plugin.sns.ui.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackClickListener", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackClickListener", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public void setUserName(r45.za zaVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        if (zaVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ArtistHeader", "userName or selfName is null ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            return;
        }
        this.f166194d = zaVar;
        com.tencent.mm.plugin.sns.model.l4.hj().e0(zaVar.f391845h.f369879d, this.f166195e.f169597a, this.f166200m.hashCode(), com.tencent.mm.storage.s7.f195307k);
        this.f166195e.f169599c.setText(zaVar.f391841d);
        this.f166195e.f169598b.setText(zaVar.f391844g);
        this.f166195e.f169601e.setText(zaVar.f391842e);
        this.f166195e.f169600d.setText(zaVar.f391843f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public ArtistHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166194d = null;
        this.f166196f = null;
        this.f166200m = null;
        d(context);
    }
}
