package wv1;

/* loaded from: classes12.dex */
public abstract class e extends wv1.a {
    @Override // wv1.a
    public void l(androidx.recyclerview.widget.k3 k3Var) {
        wv1.o oVar = (wv1.o) k3Var;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            o(oVar);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new wv1.d(this, oVar));
        }
    }

    public java.lang.String m() {
        return "";
    }

    @Override // wv1.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(wv1.o oVar, int i17, wv1.a aVar) {
        boolean containsKey;
        oVar.f449960e.setTag(this);
        oVar.f449968p.setTag(this);
        n11.a b17 = n11.a.b();
        java.lang.String m17 = m();
        android.content.Context b18 = b();
        com.tencent.mm.sdk.platformtools.r2 r2Var = xv1.d.f457391a;
        o11.g gVar = (o11.g) r2Var.get(4);
        if (gVar == null) {
            o11.f fVar = new o11.f();
            fVar.f342085i = 1;
            fVar.f342098v = true;
            fVar.f342087k = i65.a.B(b18) / 4;
            fVar.f342086j = i65.a.B(b18) / 4;
            fVar.f342093q = com.tencent.mm.R.color.a0y;
            gVar = fVar.a();
            r2Var.put(4, gVar);
        }
        b17.h(m17, oVar.f449960e, gVar);
        android.view.View view = oVar.f449964i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        oVar.f449965m.setVisibility(8);
        oVar.f449962g.setVisibility(8);
        oVar.f449963h.setVisibility(8);
        android.view.View view2 = oVar.f449968p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.CheckBox checkBox = oVar.f449967o;
        checkBox.setVisibility(0);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            o(oVar);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new wv1.d(this, oVar));
        }
        xv1.b a17 = a();
        long f17 = f();
        java.util.Map map = a17.f457388b;
        if (map == null) {
            containsKey = false;
        } else {
            containsKey = ((java.util.concurrent.ConcurrentHashMap) map).containsKey(java.lang.Long.valueOf(f17));
        }
        android.widget.ImageView imageView = oVar.f449966n;
        if (containsKey) {
            imageView.setVisibility(8);
            checkBox.setChecked(true);
        } else {
            imageView.setVisibility(0);
            checkBox.setChecked(false);
        }
        if (i()) {
            android.view.View view3 = oVar.f449959d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        android.view.View view4 = oVar.f449959d;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(0.6f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void o(wv1.o oVar) {
        int i17 = this.f449933e;
        if (i17 == 0) {
            oVar.f449969q.setVisibility(8);
            oVar.f449961f.setVisibility(8);
            android.widget.CheckBox checkBox = oVar.f449967o;
            checkBox.setVisibility(0);
            android.view.View view = oVar.f449968p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setChecked(false);
            oVar.f449970r.setVisibility(8);
            return;
        }
        if (i17 == 1) {
            oVar.f449969q.setVisibility(0);
            oVar.f449961f.setVisibility(8);
            oVar.f449967o.setVisibility(8);
            android.view.View view2 = oVar.f449968p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f449970r.setVisibility(8);
            return;
        }
        if (i17 == 2) {
            oVar.f449969q.setVisibility(0);
            com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = oVar.f449961f;
            mMPinProgressBtn.setVisibility(0);
            oVar.f449967o.setVisibility(8);
            android.view.View view3 = oVar.f449968p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f449970r.setVisibility(8);
            long j17 = this.f449932d;
            if (j17 > 0) {
                int i18 = (int) ((((float) this.f449931c) / ((float) j17)) * 100.0f);
                if (i18 == -1 || i18 >= 100) {
                    mMPinProgressBtn.setProgress(100);
                    return;
                } else {
                    mMPinProgressBtn.setProgress(i18);
                    return;
                }
            }
            return;
        }
        if (i17 == 3) {
            oVar.f449969q.setVisibility(8);
            oVar.f449961f.setVisibility(8);
            oVar.f449967o.setVisibility(0);
            android.view.View view4 = oVar.f449968p;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f449970r.setVisibility(8);
            return;
        }
        if (i17 == 4) {
            oVar.f449969q.setVisibility(8);
            oVar.f449961f.setVisibility(8);
            oVar.f449967o.setVisibility(8);
            android.view.View view5 = oVar.f449968p;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f449970r.setVisibility(0);
            return;
        }
        if (i17 != 5) {
            return;
        }
        oVar.f449969q.setVisibility(8);
        oVar.f449961f.setVisibility(8);
        oVar.f449967o.setVisibility(8);
        android.view.View view6 = oVar.f449968p;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        oVar.f449970r.setVisibility(0);
    }
}
