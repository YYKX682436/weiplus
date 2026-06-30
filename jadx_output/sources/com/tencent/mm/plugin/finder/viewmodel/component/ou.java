package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ou implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ru f135485d;

    public ou(com.tencent.mm.plugin.finder.viewmodel.component.ru ruVar) {
        this.f135485d = ruVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.ru ruVar = this.f135485d;
        ruVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.PostQualityUIC", "showBottomSheet");
        if (xy2.c.e(ruVar.getActivity()).length() > 0) {
            com.tencent.mars.xlog.Log.i("Finder.PostQualityUIC", "showBottomSheet return ,finder account exit");
            return;
        }
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(ruVar.getActivity());
        e3Var.f(com.tencent.mm.R.layout.aiu);
        e3Var.f131959f.findViewById(com.tencent.mm.R.id.gqz).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.qu(e3Var));
        ((android.widget.ImageView) e3Var.f131959f.findViewById(com.tencent.mm.R.id.f485151gr1)).setImageResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.drawable.cif : com.tencent.mm.R.drawable.cie);
        e3Var.i();
        ruVar.f135835d = null;
    }
}
