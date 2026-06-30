package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.o f153534d;

    public n(com.tencent.mm.plugin.profile.o oVar) {
        this.f153534d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.o oVar = this.f153534d;
        if (oVar.f153551k == null) {
            oVar.f153551k = (android.view.ViewGroup) oVar.f153541a.findViewById(com.tencent.mm.R.id.coz);
        }
        android.view.ViewGroup viewGroup = oVar.f153551k;
        if (viewGroup == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(15, -1);
            android.view.ViewGroup viewGroup2 = oVar.f153551k;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setLayoutParams(layoutParams2);
        }
    }
}
