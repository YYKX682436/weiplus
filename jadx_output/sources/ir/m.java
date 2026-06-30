package ir;

/* loaded from: classes15.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir.o f293875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir.q f293876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ir.o oVar, ir.q qVar) {
        super(0);
        this.f293875d = oVar;
        this.f293876e = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ir.o oVar = this.f293875d;
        com.tencent.mm.view.manager.i iVar = (com.tencent.mm.view.manager.i) oVar.f293881b;
        final com.tencent.mm.view.manager.d dVar = iVar.f213662d;
        ir.q qVar = this.f293876e;
        dVar.f213644t = qVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onUpdateData: group size %s", java.lang.Integer.valueOf(qVar.f293890a.size()));
        if (((ir.q) dVar.f213644t).f293890a.size() > 0) {
            ir.t0 t0Var = (ir.t0) ((ir.q) dVar.f213644t).f293890a.get(0);
            if (t0Var instanceof ir.c1) {
                ir.c1 c1Var = (ir.c1) t0Var;
                dVar.f213650z = c1Var;
                dVar.O.f339038e = c1Var.f293823e.f293817d;
            } else {
                dVar.f213650z = null;
            }
            if (((ir.q) dVar.f213644t).f293892c.size() != 1 || dVar.f213650z == null) {
                dVar.f213639o.setVisibility(0);
            } else {
                dVar.f213639o.setVisibility(8);
            }
        }
        java.util.ArrayList data = ((ir.q) dVar.f213644t).f293892c;
        lr.f1 f1Var = dVar.f213641q;
        f1Var.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = f1Var.f320517e;
        arrayList.clear();
        arrayList.addAll(data);
        if (f1Var.f320520h != null) {
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b(((ir.y0) it.next()).f293919a.c(), f1Var.f320520h)) {
                    break;
                }
                i17++;
            }
            if (i17 < 0) {
                i17 = 0;
            }
            f1Var.y(i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "update %s, %s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(data.size()));
        java.util.ArrayList models = ((ir.q) dVar.f213644t).f293890a;
        lr.x xVar = dVar.f213631g;
        xVar.getClass();
        kotlin.jvm.internal.o.g(models, "models");
        java.util.ArrayList arrayList2 = xVar.f320606m;
        arrayList2.clear();
        arrayList2.addAll(models);
        dVar.Q.f339062j = dVar.f213642r.f293853l ? 1 : 0;
        int i18 = dVar.f213628d;
        int i19 = 0;
        while (true) {
            if (i19 < ((ir.q) dVar.f213644t).f293891b.size()) {
                if (((ir.r) ((ir.q) dVar.f213644t).f293891b.get(i19)).a(dVar.f213627c)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(dVar.K)) {
                        i18 = i19;
                        break;
                    }
                    i18 = i19;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(dVar.K) && ((ir.r) ((ir.q) dVar.f213644t).f293891b.get(i19)).a(dVar.K)) {
                    break;
                }
                i19++;
            } else {
                break;
            }
        }
        i19 = -1;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(dVar.K) && i19 != -1) {
            dVar.f213627c = dVar.K;
            i18 = i19;
        }
        if (iVar.f213661c) {
            androidx.recyclerview.widget.RecyclerView recyclerView = dVar.f213630f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager$2", "onUpdateData", "(Lcom/tencent/mm/emoji/model/panel/IEmojiPanelData;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/view/manager/SmileyPanelManager$2", "onUpdateData", "(Lcom/tencent/mm/emoji/model/panel/IEmojiPanelData;)V", "Undefined", "scrollToPosition", "(I)V");
            dVar.k(i18, false);
            if (i18 < ((ir.q) dVar.f213644t).f293890a.size()) {
                ((ir.t0) ((ir.q) dVar.f213644t).f293890a.get(i18)).e();
                iVar.f213661c = false;
            }
        } else if (!dVar.f213633i.f330822j && dVar.f213644t != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = dVar.f213630f;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(recyclerView2, arrayList4.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager", "checkTabSelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView2.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(recyclerView2, "com/tencent/mm/view/manager/SmileyPanelManager", "checkTabSelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            if (i18 >= 0 && i18 < ((ir.q) dVar.f213644t).f293891b.size()) {
                final int i27 = ((ir.q) dVar.f213644t).f293893d + i18;
                if (dVar.f213639o != null) {
                    f1Var.y(i27);
                    dVar.f213639o.post(new java.lang.Runnable() { // from class: com.tencent.mm.view.manager.d$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.recyclerview.widget.RecyclerView recyclerView3 = com.tencent.mm.view.manager.d.this.f213639o;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList5.add(java.lang.Integer.valueOf(i27));
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(recyclerView3, arrayList5.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager", "lambda$checkTabSelected$1", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            recyclerView3.c1(((java.lang.Integer) arrayList5.get(0)).intValue());
                            yj0.a.f(recyclerView3, "com/tencent/mm/view/manager/SmileyPanelManager", "lambda$checkTabSelected$1", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        }
                    });
                }
                dVar.m(i18);
            }
        }
        androidx.recyclerview.widget.c0 c0Var = oVar.f293884e;
        if (c0Var != null) {
            c0Var.a(new ir.k(oVar));
        }
        androidx.recyclerview.widget.c0 c0Var2 = oVar.f293885f;
        if (c0Var2 != null) {
            c0Var2.a(new ir.l(oVar));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelData", "updateData: end");
        oVar.f293886g = false;
        if (oVar.f293887h) {
            oVar.f293887h = false;
            oVar.b();
        }
        return jz5.f0.f302826a;
    }
}
