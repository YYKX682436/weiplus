package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class v extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191947e;

    public v(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191947e = appChooserUI;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.acr;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.content.pm.ResolveInfo resolveInfo;
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = (com.tencent.mm.pluginsdk.ui.otherway.x) cVar;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.e1s);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.e1t);
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.e1r);
        android.graphics.drawable.Drawable drawable = xVar.f191030f;
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191947e;
        if (drawable == null) {
            new com.tencent.mm.pluginsdk.ui.tools.c0(appChooserUI).execute(xVar);
        }
        imageView.setImageDrawable(xVar.f191030f);
        java.lang.CharSequence charSequence = xVar.f191029e;
        if (appChooserUI.E && (resolveInfo = xVar.f191028d) != null && resolveInfo.activityInfo.packageName.equals(appChooserUI.F)) {
            charSequence = android.text.TextUtils.concat(charSequence, appChooserUI.getString(com.tencent.mm.R.string.f490365sy));
            if (appChooserUI.A == null) {
                appChooserUI.A = xVar;
            }
        }
        textView.setText(charSequence);
        boolean z18 = xVar.f191032h;
        if ((!z18 || xVar.f191033i || (z18 && xVar.f191035n && appChooserUI.H >= appChooserUI.I)) && !xVar.f191034m) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        com.tencent.mm.pluginsdk.ui.tools.e0 e0Var = appChooserUI.N;
        if (e0Var == com.tencent.mm.pluginsdk.ui.tools.e0.UNINSTALL) {
            if (xVar.f191034m) {
                textView2.setText(com.tencent.mm.R.string.f490499wt);
            } else {
                textView2.setText(com.tencent.mm.R.string.f490375t8);
            }
            textView2.setEnabled(true);
            return;
        }
        if (e0Var == com.tencent.mm.pluginsdk.ui.tools.e0.DOWNLOADING) {
            textView2.setText(com.tencent.mm.R.string.f490380td);
            textView2.setEnabled(false);
        } else if (e0Var == com.tencent.mm.pluginsdk.ui.tools.e0.DOWNLOADED) {
            if (xVar.f191034m) {
                textView2.setText(com.tencent.mm.R.string.f490577yz);
            } else {
                textView2.setText(com.tencent.mm.R.string.f490576yy);
            }
            textView2.setEnabled(true);
        }
    }
}
