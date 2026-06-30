package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class z8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f124418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f124420f;

    public z8(bw5.o50 o50Var, com.tencent.mm.plugin.finder.profile.uic.ob obVar, bw5.ar0 ar0Var) {
        this.f124418d = o50Var;
        this.f124419e = obVar;
        this.f124420f = ar0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleRadioPlayBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
        eVar.f292106c = this.f124420f.f25422d;
        il4.f fVar = eVar.f292122s;
        java.util.Map map = fVar.f292132d;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124419e;
        map.put("finderusername", obVar.getUsername());
        fVar.f292131c = il4.l.f292142a.h(obVar.getContext());
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", "handleRadioPlayBtn play categoryId: " + this.f124418d.c() + ", userName: " + obVar.getUsername());
        if (obVar.getFragmentMode()) {
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).rj(null, null, this.f124418d, null, eVar);
        } else {
            qk.f9.b(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), obVar.getContext(), true, null, eVar, this.f124418d, null, this.f124420f, null, 164, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleRadioPlayBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
