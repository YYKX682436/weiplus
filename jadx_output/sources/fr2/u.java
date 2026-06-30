package fr2;

/* loaded from: classes2.dex */
public final class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.x f265757d;

    public u(fr2.x xVar) {
        this.f265757d = xVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        fr2.x xVar = this.f265757d;
        r45.zz2 zz2Var = xVar.f265771o;
        if (zz2Var == null) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "setOnMenuSelectedListener: share info is null");
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 20002) {
            i95.m c17 = i95.n0.c(zy2.db.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.db dbVar = (zy2.db) c17;
            androidx.appcompat.app.AppCompatActivity activity = xVar.getActivity();
            android.app.Activity context = xVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            ((b92.s2) dbVar).Bi(activity, zz2Var, nyVar != null ? nyVar.V6() : null, "");
            return;
        }
        if (itemId != 20003) {
            return;
        }
        zy2.db dbVar2 = (zy2.db) i95.n0.c(zy2.db.class);
        androidx.appcompat.app.AppCompatActivity context2 = xVar.getActivity();
        android.app.Activity context3 = xVar.getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar2 != null ? nyVar2.V6() : null;
        ((b92.s2) dbVar2).getClass();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "shareFinderLiveThemeToSnsTimeLine: themeId=" + zz2Var.f392483g + ", main_title=" + zz2Var.f392480d);
        ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareLiveTheme", "com.tencent.mm.feature.sns.SnsShareObjectService");
        new r45.hd2();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareLiveTheme", "com.tencent.mm.feature.sns.SnsShareObjectService");
        r45.hd2 hd2Var = new r45.hd2();
        hd2Var.set(0, zz2Var.f392480d);
        hd2Var.set(1, zz2Var.f392481e);
        hd2Var.set(3, zz2Var.f392483g);
        hd2Var.set(2, zz2Var.f392482f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        java.lang.String i18 = zy2.d5.i(hd2Var);
        kotlin.jvm.internal.o.f(i18, "makeLiveThemeContent(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        intent.putExtra("ksnsupload_finder_live_theme_xml", i18);
        intent.putExtra("Ksnsupload_type", 40);
        intent.putExtra("need_result", true);
        if (context2 instanceof com.tencent.mm.ui.MMFragmentActivity) {
            j45.l.x((com.tencent.mm.ui.MMFragmentActivity) context2, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new com.tencent.mm.plugin.finder.assist.o6(context2, zz2Var, V6));
        } else {
            j45.l.u(context2, ".plugin.sns.ui.SnsUploadUI", intent, null);
        }
    }
}
