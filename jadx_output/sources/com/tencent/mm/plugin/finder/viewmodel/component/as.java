package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class as extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f133800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f133801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var) {
        super(1);
        this.f133800d = hsVar;
        this.f133801e = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        pq5.g l17;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed it = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showSurveyLayout-1 feedId = ");
        long itemId = it.getItemId();
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = this.f133800d;
        sb6.append(hsVar.T6(itemId));
        sb6.append(", holder=");
        in5.s0 s0Var = this.f133801e;
        sb6.append(hsVar.V6(s0Var));
        sb6.append(", itemView=");
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        sb6.append(hsVar.W6(itemView));
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        com.tencent.mm.plugin.finder.viewmodel.component.hs.A.add(java.lang.Long.valueOf(it.getItemId()));
        r45.al2 al2Var = (r45.al2) com.tencent.mm.plugin.finder.viewmodel.component.hs.C.get(java.lang.Long.valueOf(it.getItemId()));
        if (al2Var != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.hs.D.put(java.lang.Long.valueOf(it.getItemId()), new com.tencent.mm.plugin.finder.viewmodel.component.pq(com.tencent.mm.plugin.finder.viewmodel.component.rq.f135823d, 0L, 0, hsVar.f134658n, null, null, null, null, null, null, null, null, 4086, null));
            kr2.q.f311317h.a().g(al2Var.getLong(0));
            r45.yk2 w76 = com.tencent.mm.plugin.finder.viewmodel.component.hs.w7(hsVar, s0Var, null, 2, null);
            if (w76 != null) {
                java.util.LinkedList list = w76.getList(1);
                kotlin.jvm.internal.o.f(list, "getQuestions(...)");
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (((r45.zk2) obj2).getLong(0) == w76.getLong(2)) {
                        break;
                    }
                }
                r45.zk2 zk2Var = (r45.zk2) obj2;
                if (zk2Var != null) {
                    if (hsVar.g7(s0Var)) {
                        hsVar.k7(s0Var, zk2Var, null);
                    } else {
                        if (zk2Var.getInteger(3) != 1) {
                            int integer = zk2Var.getInteger(4);
                            if (integer == 1) {
                                hsVar.n7(s0Var, zk2Var, null);
                            } else if (integer == 2) {
                                hsVar.m7(s0Var, zk2Var, null);
                            }
                        } else {
                            hsVar.l7(s0Var, zk2Var, null);
                        }
                    }
                    r45.al2 al2Var2 = (r45.al2) com.tencent.mm.plugin.finder.viewmodel.component.hs.C.get(java.lang.Long.valueOf(((so2.j5) s0Var.f293125i).getItemId()));
                    if (al2Var2 != null) {
                        long j17 = al2Var2.getLong(0);
                        long j18 = w76.getLong(0);
                        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "surveyShow taskId=" + j17 + ", surveyId=" + j18);
                        if (hsVar.getActivity() instanceof com.tencent.mm.ui.MMActivity) {
                            l17 = new db2.x2(j17, j18).l();
                            androidx.appcompat.app.AppCompatActivity activity = hsVar.getActivity();
                            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                            l17.f((com.tencent.mm.ui.MMActivity) activity);
                        } else {
                            l17 = new db2.x2(j17, j18).l();
                        }
                        l17.h(com.tencent.mm.plugin.finder.viewmodel.component.ds.f134161a);
                    }
                }
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.P9).getValue()).r()).intValue();
            long j19 = intValue == 0 ? al2Var.getFloat(9) * 1000 : intValue * 1000;
            if (j19 > 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "showSurveyLayout timerHandler.postDelayed " + j19 + " ms");
                hsVar.f134653f.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.zr(hsVar, s0Var), j19);
            }
        }
        return jz5.f0.f302826a;
    }
}
