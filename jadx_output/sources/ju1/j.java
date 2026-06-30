package ju1;

/* loaded from: classes9.dex */
public final class j extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f301740d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f301741e;

    public j(boolean z17) {
        this.f301740d = z17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.ArrayList arrayList = this.f301741e;
        if (arrayList != null) {
            return 0 + arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        ju1.a x17 = x(i17);
        if (x17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CouponAndGiftCardListAdapter", "[getItemId] position=" + i17 + " itemCount=" + getItemCount() + " }");
            return 0L;
        }
        java.lang.String str = x17.f301689b;
        if (str == null) {
            str = "";
        }
        r45.tt ttVar = x17.f301690c;
        java.lang.String str2 = ttVar != null ? ttVar.f386765d : null;
        java.lang.String concat = str.concat(str2 != null ? str2 : "");
        if (concat == null || concat.length() == 0) {
            return x17.hashCode();
        }
        return (concat + i17).hashCode();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        ju1.a x17 = x(i17);
        if (x17 != null) {
            return x17.f301688a;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r3 != 5) goto L149;
     */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r23, int r24) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ju1.j.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(i17 != 0 ? (i17 == 1 || !(i17 == 2 || i17 == 3 || i17 == 4 || i17 != 5)) ? com.tencent.mm.R.layout.f488289p7 : com.tencent.mm.R.layout.f488305pn : com.tencent.mm.R.layout.f488371ri, parent, false);
        if (this.f301740d) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.6f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter$CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter$CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        kotlin.jvm.internal.o.d(inflate);
        return new ju1.i(inflate, i17);
    }

    public final ju1.a x(int i17) {
        java.util.ArrayList arrayList = this.f301741e;
        if (arrayList == null) {
            return null;
        }
        boolean z17 = false;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            return (ju1.a) arrayList.get(i17);
        }
        return null;
    }
}
