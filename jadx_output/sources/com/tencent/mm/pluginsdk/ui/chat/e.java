package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class e implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f190280d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f190281e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f190282f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f190283g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f190284h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f190285i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f190286m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f190287n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f190288o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f190289p = "undefined_reportName";

    public e(com.tencent.mm.pluginsdk.ui.chat.c cVar) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return this.f190288o;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f190280d;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        if (z17) {
            android.view.View view = this.f190287n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter$ViewHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter$ViewHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        android.view.View view2 = this.f190287n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter$ViewHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter$ViewHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }
}
