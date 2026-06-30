package tt2;

/* loaded from: classes3.dex */
public final class i extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f421934h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f421935i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public xt2.i5 f421936m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.q f421937n;

    public i() {
        float f17 = com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.f126323i;
        xt2.i5 i5Var = com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.f126326o;
        i5Var.f456795e = false;
        i5Var.f456798h = false;
        this.f421936m = i5Var;
    }

    public static final void E(tt2.i iVar, in5.r0 r0Var, int i17, tt2.e eVar) {
        iVar.getClass();
        boolean z17 = !eVar.f421873b;
        eVar.f421873b = z17;
        if (r0Var instanceof tt2.f) {
            ((tt2.f) r0Var).f421896e.setChecked(z17);
        } else if (r0Var instanceof tt2.d) {
            ((tt2.d) r0Var).f421854e.setChecked(z17);
        }
        yz5.q qVar = iVar.f421937n;
        if (qVar != null) {
            android.view.View itemView = r0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            qVar.invoke(itemView, java.lang.Integer.valueOf(i17), eVar.f421872a);
        }
    }

    public final java.lang.String I(int i17) {
        r45.yv2 yv2Var;
        gk2.e eVar = gk2.e.f272471n;
        boolean z17 = false;
        if (eVar != null && (yv2Var = ((mm2.f6) eVar.a(mm2.f6.class)).f329051x0) != null && yv2Var.getInteger(0) == 1) {
            z17 = true;
        }
        return z17 ? java.lang.String.valueOf(i17 + 1) : java.lang.String.valueOf(getItemCount() - i17);
    }

    public final java.util.List J() {
        java.util.ArrayList arrayList = this.f421934h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(M(((tt2.e) it.next()).f421872a));
        }
        return arrayList2;
    }

    public final void K(java.util.ArrayList arrayList, java.lang.String str) {
        if (zl2.q4.f473933a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str + ':');
            if (arrayList != null) {
                int i17 = 0;
                for (java.lang.Object obj : arrayList) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    sb6.append("[" + i17 + ',' + ((tt2.e) obj).f421872a.getItemId() + ']');
                    i17 = i18;
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveShoppingEditAdapter", sb6.toString());
        }
    }

    public final int L() {
        java.util.ArrayList arrayList = this.f421934h;
        int i17 = 0;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((tt2.e) it.next()).f421873b && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        return i17;
    }

    public final r45.y46 M(so2.j5 j5Var) {
        r45.y46 y46Var = new r45.y46();
        if (j5Var instanceof cm2.m0) {
            y46Var.set(0, java.lang.Long.valueOf(((cm2.m0) j5Var).f43369w));
            y46Var.set(1, 0);
        } else if (j5Var instanceof cm2.i0) {
            y46Var.set(0, java.lang.Long.valueOf(((cm2.i0) j5Var).f43354v.getLong(0)));
            y46Var.set(1, 3);
        }
        return y46Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        int size = this.f421934h.size();
        zl2.r4.f473950a.M2("FinderLiveShoppingEditAdapter", "getItemCount " + size);
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((tt2.e) this.f421934h.get(i17)).f421872a instanceof cm2.i0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x040a  */
    @Override // in5.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(in5.r0 r33, int r34) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.i.x(in5.r0, int):void");
    }

    @Override // in5.q0
    public void y(in5.r0 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            x(holder, i17);
            return;
        }
        if (holder instanceof tt2.f) {
            java.util.Iterator it = payloads.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(it.next(), 1)) {
                    ((tt2.f) holder).f421898g.setText(I(i17));
                }
            }
        }
        if (holder instanceof tt2.d) {
            java.util.Iterator it6 = payloads.iterator();
            while (it6.hasNext()) {
                if (kotlin.jvm.internal.o.b(it6.next(), 1)) {
                    ((android.widget.TextView) ((jz5.n) ((tt2.d) holder).f421856g).getValue()).setText(I(i17));
                }
            }
        }
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e98, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new tt2.d(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.az_, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new tt2.f(this, inflate2);
    }
}
