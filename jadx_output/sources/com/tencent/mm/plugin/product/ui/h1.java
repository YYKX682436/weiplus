package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class h1 implements com.tencent.mm.plugin.product.ui.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductUI f153296a;

    public h1(com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI) {
        this.f153296a = mallProductUI;
    }

    @Override // com.tencent.mm.plugin.product.ui.v
    public void a(int i17, int i18, java.lang.String str) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI = this.f153296a;
        if (i17 != 0 || i18 != 0) {
            if (i18 != -10010003) {
                mallProductUI.f153192d = str;
                mallProductUI.showDialog(-10001);
                return;
            }
            mallProductUI.setContentViewVisibility(0);
            mallProductUI.f153247e.setVisibility(8);
            mallProductUI.f153248f.setVisibility(0);
            java.util.List list = mallProductUI.f153261v.f448550c;
            if (list == null || list.size() <= 0) {
                return;
            }
            mallProductUI.f153259t.f153359e = list;
            return;
        }
        wq3.t tVar = mallProductUI.f153261v.f448549b;
        if (tVar == null) {
            mallProductUI.showOptionMenu(false);
        } else {
            mallProductUI.showOptionMenu(true);
            mallProductUI.setContentViewVisibility(0);
            mallProductUI.f153247e.setVisibility(0);
            mallProductUI.f153248f.setVisibility(8);
            xq3.c cVar = tVar.f448599e;
            if (cVar != null) {
                mallProductUI.f153250h.setText(cVar.f456059d);
                android.widget.TextView textView = mallProductUI.f153251i;
                xq3.c cVar2 = tVar.f448599e;
                textView.setText(wq3.h.c(cVar2.f456062g, cVar2.f456063h, cVar2.f456075w));
                mallProductUI.f153252m.setText(wq3.h.b(r3.f456061f, tVar.f448599e.f456075w));
            }
            if (mallProductUI.f153261v.g() <= 0) {
                mallProductUI.f153260u.setEnabled(false);
                mallProductUI.f153260u.setText(com.tencent.mm.R.string.f492476gs3);
            } else if (mallProductUI.f153261v.f448549b.f448598d <= 0) {
                mallProductUI.f153260u.setEnabled(false);
                mallProductUI.f153260u.setText(com.tencent.mm.R.string.f492475gs2);
            } else {
                mallProductUI.f153260u.setEnabled(true);
                if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f448604j)) {
                    mallProductUI.f153260u.setText(com.tencent.mm.R.string.grr);
                } else {
                    mallProductUI.f153260u.setText(tVar.f448604j);
                }
            }
            xq3.c cVar3 = tVar.f448599e;
            if (cVar3 == null || (linkedList = cVar3.f456074v) == null || linkedList.size() <= 0) {
                mallProductUI.f153256q.setVisibility(8);
            } else {
                mallProductUI.f153256q.setVisibility(0);
                mallProductUI.f153257r.c(tVar.f448599e.f456074v);
                mallProductUI.f153257r.notifyDataSetChanged();
            }
            xq3.c cVar4 = tVar.f448599e;
            if (cVar4 == null || com.tencent.mm.sdk.platformtools.t8.K0(cVar4.f456066n)) {
                mallProductUI.f153255p.setVisibility(8);
                mallProductUI.f153253n.setVisibility(8);
            } else {
                mallProductUI.f153255p.setVisibility(0);
                mallProductUI.f153253n.setVisibility(0);
                mallProductUI.f153253n.setText(tVar.f448599e.f456066n);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f448605k)) {
                mallProductUI.f153254o.setVisibility(8);
            } else {
                mallProductUI.f153254o.setVisibility(0);
                mallProductUI.f153254o.setText(tVar.f448605k);
            }
            mallProductUI.showOptionMenu(true);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mallProductUI.f153261v.f448558k)) {
                y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                com.tencent.mm.plugin.product.ui.o oVar = new com.tencent.mm.plugin.product.ui.o(mallProductUI.f153261v.f448558k);
                ((x60.e) fVar).getClass();
                mallProductUI.f153249g.setImageBitmap(x51.w0.d(oVar));
                ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(mallProductUI);
            }
        }
        android.widget.Button button = mallProductUI.f153260u;
        if (button != null) {
            button.postDelayed(new com.tencent.mm.plugin.product.ui.g1(this), 200L);
        }
    }
}
