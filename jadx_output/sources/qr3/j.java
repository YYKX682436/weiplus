package qr3;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p14 f366092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.n14 f366093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qr3.o f366094f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.p14 p14Var, r45.n14 n14Var, qr3.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f366092d = p14Var;
        this.f366093e = n14Var;
        this.f366094f = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qr3.j(this.f366092d, this.f366093e, this.f366094f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qr3.j jVar = (qr3.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.p14 p14Var = this.f366092d;
        r45.n14 n14Var = this.f366093e;
        qr3.o oVar = this.f366094f;
        if (p14Var == null && n14Var == null && !oVar.O6().f154175e.r2()) {
            com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "show empty view!");
            oVar.P6(true, oVar.O6().f154174d);
        } else {
            if (x51.t1.b(oVar.f366106g)) {
                oVar.f366106g = n14Var != null ? n14Var.f380990d : null;
            }
            oVar.O6().f154188u.add(oVar);
            qr3.o.f366102m = n14Var;
            if (n14Var == null) {
                com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "resp == null");
            } else {
                java.util.LinkedList<r45.wb> linkedList = n14Var.f380991e;
                com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "scopeList.size = " + linkedList.size());
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (((r45.wb) it.next()).f389025f != 0) {
                        oVar.f366103d++;
                    }
                }
                com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "effectiveAuthScopeItemNum = " + oVar.f366103d);
                int i17 = oVar.f366103d;
                if (i17 > 0) {
                    for (int i18 = 0; i18 < 4; i18++) {
                        ((com.tencent.mm.ui.base.preference.h0) oVar.O6().f154174d).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(oVar.getContext(), null), -1);
                    }
                    com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(oVar.getContext());
                    preference.G = com.tencent.mm.R.layout.f488686a23;
                    java.lang.String string = oVar.getResources().getString(com.tencent.mm.R.string.bc6);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{oVar.f366104e}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    preference.L(format);
                    ((com.tencent.mm.ui.base.preference.h0) oVar.O6().f154174d).d(preference, -1);
                    for (r45.wb wbVar : linkedList) {
                        if (wbVar.f389025f != 0) {
                            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = new com.tencent.mm.ui.base.preference.CheckBoxPreference(oVar.getContext());
                            checkBoxPreference.L(wbVar.f389024e);
                            checkBoxPreference.L = wbVar.f389025f == 1;
                            checkBoxPreference.C(wbVar.f389023d);
                            checkBoxPreference.f197785v = false;
                            ((com.tencent.mm.ui.base.preference.h0) oVar.O6().f154174d).d(checkBoxPreference, -1);
                            com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "add preference: %s", wbVar.f389024e);
                        }
                    }
                    oVar.P6(false, oVar.O6().f154174d);
                } else if (i17 == 0 && n14Var.f380992f.size() == 0) {
                    oVar.O6().f154175e.r2();
                }
            }
            if (n14Var == null) {
                com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "resp == null");
            } else if (n14Var.f380992f.size() == 0) {
                com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "privacy_scope_item_list.size == 0");
            } else {
                ((com.tencent.mm.ui.base.preference.h0) oVar.O6().f154174d).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(oVar.getContext(), null), -1);
                com.tencent.mm.ui.base.preference.Preference preference2 = new com.tencent.mm.ui.base.preference.Preference(oVar.getContext());
                preference2.G = com.tencent.mm.R.layout.byv;
                preference2.L(oVar.getResources().getString(com.tencent.mm.R.string.bc8));
                preference2.C("NewBizInfoAuthMainUI");
                ((com.tencent.mm.ui.base.preference.h0) oVar.O6().f154174d).d(preference2, -1);
            }
            ((com.tencent.mm.ui.base.preference.h0) oVar.O6().f154174d).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(oVar.getContext(), null), -1);
            com.tencent.mm.ui.base.preference.Preference preference3 = new com.tencent.mm.ui.base.preference.Preference(oVar.getContext());
            preference3.G = com.tencent.mm.R.layout.byv;
            preference3.L(oVar.getResources().getString(com.tencent.mm.R.string.an6));
            preference3.C("NewBizInfoRecordUI");
            ((com.tencent.mm.ui.base.preference.h0) oVar.O6().f154174d).d(preference3, -1);
            oVar.P6(false, oVar.O6().f154174d);
        }
        return jz5.f0.f302826a;
    }
}
