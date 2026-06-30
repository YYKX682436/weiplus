package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class yl implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f130071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.cm f130072e;

    public yl(in5.s0 s0Var, com.tencent.mm.plugin.finder.ui.cm cmVar) {
        this.f130071d = s0Var;
        this.f130072e = cmVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.s0 s0Var = this.f130071d;
        lb2.j jVar = (lb2.j) s0Var.f293125i;
        java.util.Set stringSet = com.tencent.mm.sdk.platformtools.o4.R("finder_debug_settings_fav").getStringSet("fav_1", kz5.r0.f314002d);
        kotlin.jvm.internal.o.d(stringSet);
        java.util.HashSet hashSet = new java.util.HashSet(stringSet);
        com.tencent.mm.plugin.finder.ui.cm cmVar = this.f130072e;
        java.lang.String str = (cmVar.f129002e.f129265p == 2 || hashSet.contains(jVar.f317749d)) ? "取消收藏" : "收藏";
        android.content.Context context = s0Var.f293121e;
        java.util.List i17 = kz5.c0.i(str, "关闭");
        java.lang.Integer[] numArr = new java.lang.Integer[2];
        numArr[0] = java.lang.Integer.valueOf((cmVar.f129002e.f129265p == 2 || hashSet.contains(jVar.f317749d)) ? -1 : 1);
        numArr[1] = 0;
        db5.e1.b(context, "", i17, kz5.c0.i(numArr), "", new com.tencent.mm.plugin.finder.ui.xl(hashSet, jVar, s0Var));
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
