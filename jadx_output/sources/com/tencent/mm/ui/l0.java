package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f209050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.m0 f209051e;

    public l0(com.tencent.mm.ui.m0 m0Var, android.view.View view) {
        this.f209051e = m0Var;
        this.f209050d = view;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        final com.tencent.mm.ui.o0 o0Var = (com.tencent.mm.ui.o0) this.f209050d.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.AllRemindMsgUI", "[onMMMenuItemSelected] delete item:%s", o0Var);
        com.tencent.mm.modelsimple.t1.a(new com.tencent.mm.sdk.coroutines.LifecycleScope("AllRemindMsgUI", this.f209051e.f209085d.f209395i, 1), 2, o0Var.f209442i, new yz5.r() { // from class: com.tencent.mm.ui.l0$$a
            @Override // yz5.r
            public final java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                final com.tencent.mm.ui.l0 l0Var = com.tencent.mm.ui.l0.this;
                final com.tencent.mm.ui.o0 o0Var2 = o0Var;
                final java.lang.Integer num = (java.lang.Integer) obj;
                final java.lang.Integer num2 = (java.lang.Integer) obj2;
                final java.lang.String str = (java.lang.String) obj3;
                l0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.AllRemindMsgUI", "SetMsgRemindCgi callback, errType: %s, errCode: %s, errMsg: %s", num, num2, str);
                ((ku5.t0) ku5.t0.f312615d).D(new java.lang.Runnable() { // from class: com.tencent.mm.ui.l0$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.ui.l0 l0Var2 = com.tencent.mm.ui.l0.this;
                        l0Var2.getClass();
                        int intValue = num.intValue();
                        com.tencent.mm.ui.m0 m0Var = l0Var2.f209051e;
                        if (intValue == 0 && num2.intValue() == 0) {
                            java.util.LinkedList linkedList = m0Var.f209085d.f209395i.f196573h;
                            if (linkedList != null) {
                                final com.tencent.mm.ui.o0 o0Var3 = o0Var2;
                                linkedList.removeIf(new java.util.function.Predicate() { // from class: com.tencent.mm.ui.l0$$c
                                    @Override // java.util.function.Predicate
                                    public final boolean test(java.lang.Object obj5) {
                                        return java.util.Objects.equals(((com.tencent.mm.ui.o0) obj5).f209443j, com.tencent.mm.ui.o0.this.f209442i.f379675d);
                                    }
                                });
                            }
                            m0Var.f209085d.f209395i.f196572g.notifyDataSetChanged();
                            return;
                        }
                        androidx.appcompat.app.AppCompatActivity context = m0Var.f209085d.f209395i.getContext();
                        java.lang.String string = m0Var.f209085d.f209395i.getString(com.tencent.mm.R.string.hcq);
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        java.lang.String str2 = str;
                        if (str2 != null) {
                            string = str2;
                        }
                        dp.a.makeText(context, string, 0).show();
                    }
                });
                return jz5.f0.f302826a;
            }
        });
    }
}
