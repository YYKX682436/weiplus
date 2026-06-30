package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f191550a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f191551b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.ListViewInScrollView f191552c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f191553d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.BaseAdapter f191554e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f191555f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f191556g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f191557h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f191558i;

    public d0(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI, android.content.Context context) {
        this.f191550a = context;
        this.f191552c = (com.tencent.mm.ui.ListViewInScrollView) android.view.View.inflate(context, com.tencent.mm.R.layout.f488123hs, null);
    }

    public void a(boolean z17) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f191551b;
        if (j0Var != null) {
            if (z17) {
                j0Var.z(com.tencent.mm.R.string.f490592zd, this.f191557h);
                this.f191551b.u(com.tencent.mm.R.string.f490591zc, this.f191556g);
            } else {
                j0Var.z(com.tencent.mm.R.string.f490592zd, null);
                this.f191551b.u(com.tencent.mm.R.string.f490591zc, null);
            }
        }
    }
}
