package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class mg extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.rg f209143d;

    public mg(com.tencent.mm.ui.rg rgVar, com.tencent.mm.ui.hg hgVar) {
        this.f209143d = rgVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f209143d.f209740s.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.rg rgVar = this.f209143d;
        com.tencent.mm.ui.og ogVar = (com.tencent.mm.ui.og) rgVar.f209740s.get(i17);
        android.content.Context context = rgVar.f209741t;
        com.tencent.mm.ui.qg qgVar = new com.tencent.mm.ui.qg(context, ogVar);
        boolean z17 = i17 == getCount() - 1;
        android.view.View inflate = rgVar.f209738q.inflate(com.tencent.mm.R.layout.c1i, viewGroup, false);
        qgVar.f209558f = inflate;
        qgVar.f209559g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        qgVar.f209560h = (android.widget.ImageView) qgVar.f209558f.findViewById(com.tencent.mm.R.id.h5n);
        qgVar.f209561i = (android.widget.TextView) qgVar.f209558f.findViewById(com.tencent.mm.R.id.k_3);
        qgVar.f209562m = (android.widget.TextView) qgVar.f209558f.findViewById(com.tencent.mm.R.id.osp);
        qgVar.f209563n = qgVar.f209558f.findViewById(com.tencent.mm.R.id.k7m);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(ogVar.f209476b.f209506a);
        com.tencent.mm.ui.pg pgVar = ogVar.f209476b;
        if (!K0) {
            qgVar.f209559g.setText(pgVar.f209506a);
        }
        int i18 = pgVar.f209509d;
        if (i18 > 0) {
            qgVar.f209559g.setTextColor(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, i18));
        }
        int i19 = pgVar.f209507b;
        if (i19 > 0) {
            qgVar.f209560h.setVisibility(0);
            qgVar.f209560h.setImageResource(i19);
        } else {
            qgVar.f209560h.setVisibility(8);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0("")) {
            qgVar.f209560h.setContentDescription("");
        }
        qgVar.f209562m.setBackgroundResource(com.tencent.mm.ui.tools.pd.a(context));
        if (z17) {
            qgVar.f209558f.setBackgroundResource(com.tencent.mm.R.drawable.b4h);
        } else {
            qgVar.f209558f.setBackgroundResource(com.tencent.mm.R.drawable.b4g);
        }
        qgVar.f209561i.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f480630ad4));
        if (!com.tencent.mm.plugin.newtips.model.i.l(ogVar.f209475a, qgVar)) {
            boolean z18 = ogVar.f209475a;
            com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
            if (z18) {
                android.view.View view2 = qgVar.f209563n;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.newtips.model.i.b(qgVar, rVar, true);
            } else {
                qgVar.f209561i.setVisibility(8);
                qgVar.f209562m.setVisibility(8);
                android.view.View view3 = qgVar.f209563n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.newtips.model.i.b(qgVar, com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NEW, false);
                com.tencent.mm.plugin.newtips.model.i.b(qgVar, com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_COUNTER, false);
                com.tencent.mm.plugin.newtips.model.i.b(qgVar, rVar, false);
            }
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(qgVar);
        return qgVar.f209558f;
    }
}
