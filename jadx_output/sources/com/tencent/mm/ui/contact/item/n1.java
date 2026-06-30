package com.tencent.mm.ui.contact.item;

/* loaded from: classes.dex */
public final class n1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.q1 f206905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f206907f;

    public n1(com.tencent.mm.ui.contact.item.q1 q1Var, java.lang.String str, int i17) {
        this.f206905d = q1Var;
        this.f206906e = str;
        this.f206907f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.contact.item.q1 q1Var = this.f206905d;
        java.lang.String str = this.f206906e;
        int i18 = this.f206907f;
        com.tencent.mm.ui.contact.item.q1.g(q1Var, str, i18);
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e.p(i18, str);
        rl5.r rVar = q1Var.F;
        if (rVar != null) {
            rVar.a();
        }
    }
}
