package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class b8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f123556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123557e;

    public b8(android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123556d = linearLayout;
        this.f123557e = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f123556d;
        int measuredHeight = view.getMeasuredHeight();
        while (view.getId() != com.tencent.mm.R.id.gyg) {
            measuredHeight += view.getTop();
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view == null) {
                break;
            }
        }
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123557e;
        int measuredHeight2 = measuredHeight + obVar.h7().M.getMeasuredHeight();
        if (measuredHeight2 > 0) {
            android.app.Activity context = obVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = (com.tencent.mm.plugin.finder.profile.uic.o0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.o0.class);
            if (o0Var == null) {
                return;
            }
            o0Var.N = measuredHeight2;
        }
    }
}
