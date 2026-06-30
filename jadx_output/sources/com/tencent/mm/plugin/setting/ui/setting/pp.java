package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class pp implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.rp f161455d;

    public pp(com.tencent.mm.plugin.setting.ui.setting.rp rpVar) {
        this.f161455d = rpVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.setting.ui.setting.rp rpVar = this.f161455d;
        g4Var.s(0, rpVar.f161522d.getString(com.tencent.mm.R.string.h__), rpVar.f161522d.getString(com.tencent.mm.R.string.inh), rpVar.f161522d.getResources().getDrawable(com.tencent.mm.R.raw.circle_notreceive), false);
        g4Var.s(1, rpVar.f161522d.getString(com.tencent.mm.R.string.h_b), rpVar.f161522d.getString(com.tencent.mm.R.string.inh), rpVar.f161522d.getResources().getDrawable(com.tencent.mm.R.raw.circle_notvisible), false);
    }
}
