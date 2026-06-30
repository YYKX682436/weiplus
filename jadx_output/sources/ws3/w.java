package ws3;

/* loaded from: classes9.dex */
public class w extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws3.y f449192a;

    public w(ws3.y yVar, ws3.r rVar) {
        this.f449192a = yVar;
    }

    public final int[] a(java.lang.String str, java.lang.String str2) {
        if (str.equals(str2)) {
            return vs3.a.f439873f;
        }
        if (str2 != null && str.length() == str2.length()) {
            int[] iArr = {-1, -1};
            int i17 = 0;
            for (int length = str.length() - 1; length > 0; length--) {
                if (str2.charAt(length) != str.charAt(length)) {
                    i17++;
                    if (i17 > 2) {
                        break;
                    }
                    iArr[i17 - 1] = length;
                }
            }
            if (i17 <= 2) {
                return iArr;
            }
        }
        return vs3.a.f439874g;
    }

    @Override // android.widget.Filter
    public synchronized android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        boolean z17;
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String a17 = charSequence != null ? vs3.b.a(charSequence.toString()) : "";
        if (a17.equals(this.f449192a.f449201h) && !a17.equals("")) {
            this.f449192a.f449203m.post(new ws3.v(this));
            filterResults.count = this.f449192a.f449197d.size();
            filterResults.values = this.f449192a.f449197d;
            return filterResults;
        }
        ws3.y yVar = this.f449192a;
        yVar.f449201h = a17;
        java.util.List list = yVar.f449199f;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = this.f449192a.f449199f.iterator();
            while (it.hasNext()) {
                ((vs3.a) it.next()).f439879e = vs3.a.f439873f;
            }
        }
        if (this.f449192a.f449204n.b()) {
            java.lang.System.currentTimeMillis();
            int i17 = ws3.y.f449196q;
            com.tencent.mars.xlog.Log.i("MicroMsg.MobileHistoryAdapter", "performFiltering2 " + ((java.lang.Object) charSequence));
            vs3.a Di = us3.e.Di();
            if (Di != null && a17.equals(Di.f439875a)) {
                return filterResults;
            }
            java.util.List list2 = this.f449192a.f449205o;
            if (list2 == null || list2.isEmpty()) {
                ws3.y yVar2 = this.f449192a;
                yVar2.f449205o = o25.b.e(yVar2.f449202i);
            }
            java.util.List<java.lang.String[]> list3 = this.f449192a.f449205o;
            if (list3 != null) {
                for (java.lang.String[] strArr : list3) {
                    java.lang.String a18 = vs3.b.a(strArr[2]);
                    int[] a19 = a(this.f449192a.f449201h, a18);
                    if (vs3.a.f439873f.equals(a19)) {
                        return filterResults;
                    }
                    if (!vs3.a.f439874g.equals(a19) && arrayList.size() < 4) {
                        vs3.a aVar = new vs3.a(a18, strArr[1], 1);
                        aVar.f439879e = a19;
                        arrayList.add(aVar);
                    }
                }
            }
            for (vs3.a aVar2 : us3.e.Ai().Bi()) {
                int[] a27 = a(this.f449192a.f449201h, vs3.b.a(aVar2.f439875a));
                if (vs3.a.f439873f.equals(a27)) {
                    return filterResults;
                }
                if (!vs3.a.f439874g.equals(a27) && arrayList.size() < 4) {
                    aVar2.f439879e = a27;
                    arrayList.add(aVar2);
                }
            }
            int i18 = ws3.y.f449196q;
            java.lang.System.currentTimeMillis();
            z17 = true;
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f449192a.f449201h)) {
                arrayList.addAll(this.f449192a.f449199f);
            } else {
                int i19 = ws3.y.f449196q;
                com.tencent.mars.xlog.Log.i("MicroMsg.MobileHistoryAdapter", "performFiltering1 " + ((java.lang.Object) charSequence));
                for (vs3.a aVar3 : this.f449192a.f449199f) {
                    if (aVar3.f439875a.startsWith(this.f449192a.f449201h)) {
                        arrayList.add(aVar3);
                    }
                }
            }
            z17 = false;
        }
        filterResults.count = arrayList.size();
        filterResults.values = arrayList;
        this.f449192a.f449198e = z17;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        java.lang.Object obj = filterResults.values;
        ws3.y yVar = this.f449192a;
        if (obj == null) {
            yVar.f449197d = new java.util.ArrayList();
        } else {
            yVar.f449197d = (java.util.List) obj;
        }
        if (filterResults.count == 0) {
            yVar.f449204n.L = true;
        } else {
            yVar.f449204n.L = false;
        }
        int i17 = ws3.y.f449196q;
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileHistoryAdapter", "results.count " + filterResults.count);
        if (filterResults.count > 0) {
            yVar.notifyDataSetChanged();
        }
    }
}
