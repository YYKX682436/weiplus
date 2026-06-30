package com.tencent.mm.plugin.subapp.ui.openapi;

/* loaded from: classes8.dex */
public class AppHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public android.widget.ImageView M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public fg4.f Q;
    public boolean R;
    public boolean S;

    public AppHeaderPreference(android.content.Context context) {
        super(context);
        this.R = false;
        this.S = false;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        java.lang.String str;
        this.M = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cav);
        this.N = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cdv);
        this.L = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cdf);
        this.P = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483889cd0);
        this.S = true;
        fg4.f fVar = this.Q;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HeaderPreference", "initView : bindView = " + this.S);
        } else {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI appProfileUI = ((fg4.i) fVar).f262476a;
            android.graphics.Bitmap Di = ((kt.c) i0Var).Di(appProfileUI.f172403d.field_appId, 1, i65.a.g(appProfileUI));
            if (this.M != null && Di != null && !Di.isRecycled()) {
                this.M.setImageBitmap(Di);
            }
            fg4.i iVar = (fg4.i) this.Q;
            iVar.getClass();
            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
            com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI appProfileUI2 = iVar.f262476a;
            java.lang.String Ui = ((kt.c) i0Var2).Ui(appProfileUI2.getContext(), appProfileUI2.f172403d);
            if (this.L != null && Ui != null && Ui.length() > 0) {
                this.L.setText(Ui);
            }
            com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI appProfileUI3 = ((fg4.i) this.Q).f262476a;
            androidx.appcompat.app.AppCompatActivity context = appProfileUI3.getContext();
            com.tencent.mm.pluginsdk.model.app.m mVar = appProfileUI3.f172403d;
            if (context == null || mVar == null) {
                str = null;
            } else {
                java.lang.String m17 = com.tencent.mm.pluginsdk.model.app.w.m(context);
                str = m17.equalsIgnoreCase("zh_CN") ? mVar.field_appDiscription : (m17.equalsIgnoreCase("zh_TW") || m17.equalsIgnoreCase("zh_HK")) ? com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appDiscription_tw) ? mVar.field_appDiscription : mVar.field_appDiscription_tw : m17.equalsIgnoreCase("en") ? com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appDiscription_en) ? mVar.field_appDiscription : mVar.field_appDiscription_en : com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appDiscription_en) ? mVar.field_appDiscription : mVar.field_appDiscription_en;
            }
            if (str != null) {
                this.P.setText(str);
                this.P.setVisibility(0);
            } else {
                this.P.setVisibility(8);
            }
            boolean z17 = this.R;
            if (this.N != null) {
                fg4.i iVar2 = (fg4.i) this.Q;
                iVar2.getClass();
                java.lang.String string = iVar2.f262476a.getContext().getString(z17 ? com.tencent.mm.R.string.iwo : com.tencent.mm.R.string.iwu);
                android.content.Context context2 = this.f197770d;
                if (z17) {
                    if (string == null || string.length() <= 0) {
                        this.N.setVisibility(8);
                    } else {
                        android.widget.TextView textView = this.N;
                        iz5.a.g(null, context2 != null);
                        textView.setTextColor(new com.tencent.mm.ui.tools.gd(context2).f210448a[0]);
                        this.N.setText(string);
                        this.N.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.drawable.bni, 0, 0, 0);
                    }
                } else if (string == null || string.length() <= 0) {
                    this.N.setVisibility(8);
                } else {
                    this.N.setTextColor(com.tencent.mm.ui.tools.gd.a(context2));
                    this.N.setText(string);
                    this.N.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.drawable.bnh, 0, 0, 0);
                }
            }
        }
        super.t(view);
    }

    public AppHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = false;
        this.S = false;
    }

    public AppHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.R = false;
        this.S = false;
    }
}
