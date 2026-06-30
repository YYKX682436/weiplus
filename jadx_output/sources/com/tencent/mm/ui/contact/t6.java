package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class t6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f207194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f207195e;

    public t6(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI, java.util.List list) {
        this.f207195e = onlyChatContactMgrUI;
        this.f207194d = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI = this.f207195e;
        int i18 = onlyChatContactMgrUI.f206511p;
        w11.h0 h0Var = new w11.h0(this.f207194d, 8388608, 2, i18);
        gm0.j1.n().f273288b.g(h0Var);
        onlyChatContactMgrUI.f206515t.f55373e = r1.size();
        onlyChatContactMgrUI.f206515t.f55376h = onlyChatContactMgrUI.f206503e.t();
        onlyChatContactMgrUI.f206515t.f55381m = java.lang.System.currentTimeMillis() - onlyChatContactMgrUI.f206515t.f55381m;
        onlyChatContactMgrUI.f206510o = db5.e1.Q(onlyChatContactMgrUI.getContext(), onlyChatContactMgrUI.getString(com.tencent.mm.R.string.f490573yv), onlyChatContactMgrUI.getString(com.tencent.mm.R.string.f489882ed), true, true, new com.tencent.mm.ui.contact.s6(this, h0Var));
    }
}
