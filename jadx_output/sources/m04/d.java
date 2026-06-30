package m04;

/* loaded from: classes12.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.search.ui.FTSInfoUI f322556d;

    public d(com.tencent.mm.plugin.search.ui.FTSInfoUI fTSInfoUI) {
        this.f322556d = fTSInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.List<android.util.Pair> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/search/ui/FTSInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (intValue == 1) {
            bx1.t tVar = (bx1.t) i95.n0.c(bx1.t.class);
            com.tencent.mm.plugin.search.ui.FTSInfoUI.T6();
            ((fq3.w) tVar).getClass();
            new tq3.c().run();
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.requireAccountInitialized();
            mq3.c cVar = nVar.f265535t;
            cVar.getClass();
            android.database.Cursor h17 = cVar.f330775a.h(java.lang.String.format("SELECT chat, openrmf, staytimedev, sendmsgrmf, consumemsgrmf, totallsp, rank FROM %s ORDER BY totallsp DESC;", "C2CChatUsageResult"), null);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (h17.moveToNext()) {
                try {
                    arrayList2.add(new android.util.Pair(h17.getString(0), java.lang.String.format("open %.2f stay: %.2f send: %.2f consume: %.2f\ntotal: %.2f rank: %d", java.lang.Double.valueOf(h17.getDouble(1)), java.lang.Double.valueOf(h17.getDouble(2)), java.lang.Double.valueOf(h17.getDouble(3)), java.lang.Double.valueOf(h17.getDouble(4)), java.lang.Double.valueOf(h17.getDouble(5)), java.lang.Integer.valueOf(h17.getInt(6)))));
                } catch (java.lang.Throwable th6) {
                    if (h17 != null) {
                        h17.close();
                    }
                    throw th6;
                }
            }
            h17.close();
            list = arrayList2;
        } else if (intValue == 2) {
            bx1.t tVar2 = (bx1.t) i95.n0.c(bx1.t.class);
            long T6 = com.tencent.mm.plugin.search.ui.FTSInfoUI.T6();
            ((fq3.w) tVar2).getClass();
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.requireAccountInitialized();
            list = nVar2.f265532q.h(T6);
        } else {
            if (intValue != 3) {
                yj0.a.h(this, "com/tencent/mm/plugin/search/ui/FTSInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            bx1.t tVar3 = (bx1.t) i95.n0.c(bx1.t.class);
            long T62 = com.tencent.mm.plugin.search.ui.FTSInfoUI.T6();
            ((fq3.w) tVar3).getClass();
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.requireAccountInitialized();
            list = nVar3.f265533r.h(T62);
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (android.util.Pair pair : list) {
            stringBuffer.append("[");
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = (java.lang.String) pair.first;
            ((sg3.a) v0Var).getClass();
            stringBuffer.append(c01.a2.e(str));
            stringBuffer.append("]\n");
            stringBuffer.append((java.lang.String) pair.second);
            stringBuffer.append("\n");
        }
        this.f322556d.f160043h.setText(stringBuffer.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/search/ui/FTSInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
