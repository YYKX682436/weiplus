package ya2;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context) {
        super(1);
        this.f460510d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        r45.mw1 mw1Var;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = fVar != null && fVar.f70615a == 0;
        android.content.Context context = this.f460510d;
        if (z17 && fVar.f70616b == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderGetLiveIncomePage success: ");
            java.lang.Object obj2 = (r45.j71) fVar.f70618d;
            if (obj2 == null) {
                obj2 = "";
            }
            sb6.append(pm0.b0.g(obj2));
            com.tencent.mars.xlog.Log.i("FinderRouterApi", sb6.toString());
            r45.j71 j71Var = (r45.j71) fVar.f70618d;
            if (j71Var == null || (list2 = j71Var.getList(1)) == null) {
                i17 = 0;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : list2) {
                    if (((r45.mw1) obj3).getInteger(0) == 4) {
                        arrayList.add(obj3);
                    }
                }
                i17 = arrayList.size();
            }
            if (i17 <= 1) {
                r45.j71 j71Var2 = (r45.j71) fVar.f70618d;
                if (j71Var2 == null || (list = j71Var2.getList(1)) == null) {
                    mw1Var = null;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : list) {
                        if (((r45.mw1) obj4).getInteger(0) == 4) {
                            arrayList2.add(obj4);
                        }
                    }
                    mw1Var = (r45.mw1) kz5.n0.Z(arrayList2);
                }
                js4.i iVar = (js4.i) gm0.j1.s(js4.i.class);
                android.content.Context context2 = this.f460510d;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("INCOME_RESP_DATA", ((r45.j71) fVar.f70618d).initialProtobufBytes());
                int integer = mw1Var != null ? mw1Var.getInteger(1) : 1;
                r45.j71 j71Var3 = (r45.j71) fVar.f70618d;
                boolean z18 = j71Var3 != null ? j71Var3.getBoolean(3) : false;
                r45.j71 j71Var4 = (r45.j71) fVar.f70618d;
                ((ms4.z) iVar).h(context2, intent, "", integer, z18, j71Var4 != null ? j71Var4.getString(2) : null);
            } else {
                android.content.Context context3 = this.f460510d;
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLiveIncomeUI.class);
                intent2.putExtra("PARAMS_DATA", ((r45.j71) fVar.f70618d).initialProtobufBytes());
                if (!(context instanceof android.app.Activity)) {
                    intent2.addFlags(268435456);
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent2);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi$getIncomePageInfoAndEnterIncome$1", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context3, "com/tencent/mm/plugin/finder/api/FinderRouterApi$getIncomePageInfoAndEnterIncome$1", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else {
            com.tencent.mars.xlog.Log.e("FinderRouterApi", "CgiFinderGetLiveIncomePage failed");
            db5.t7.g(context, context.getString(com.tencent.mm.R.string.cnc));
        }
        return jz5.f0.f302826a;
    }
}
