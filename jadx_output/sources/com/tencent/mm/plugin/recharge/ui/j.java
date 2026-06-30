package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class j extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.k f155193a;

    public j(com.tencent.mm.plugin.recharge.ui.k kVar, com.tencent.mm.plugin.recharge.ui.a aVar) {
        this.f155193a = kVar;
    }

    @Override // android.widget.Filter
    public synchronized android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        boolean z17;
        int[] iArr;
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String a17 = charSequence != null ? vs3.b.a(charSequence.toString()) : "";
        if (a17.equals(this.f155193a.f155199h)) {
            this.f155193a.f155200i.f155086g.post(new com.tencent.mm.plugin.recharge.ui.g(this));
            return filterResults;
        }
        com.tencent.mm.plugin.recharge.ui.k kVar = this.f155193a;
        kVar.f155199h = a17;
        boolean a18 = kVar.f155200i.a();
        boolean z18 = false;
        if (a18) {
            java.lang.System.currentTimeMillis();
            java.util.Objects.toString(charSequence);
            for (vs3.a aVar : this.f155193a.f155197f) {
                if (aVar.f439875a.equals(this.f155193a.f155199h)) {
                    aVar.f439879e = vs3.a.f439873f;
                    arrayList.clear();
                    arrayList.add(aVar);
                }
            }
            if (arrayList.size() <= 0) {
                com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText = this.f155193a.f155200i;
                if (mallEditText.f155096t == null) {
                    try {
                        mallEditText.f155096t = o25.b.e(mallEditText.getContext());
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallEditText", e17, "", new java.lang.Object[0]);
                    }
                }
                java.util.List list = this.f155193a.f155200i.f155096t;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.String[] strArr = (java.lang.String[]) it.next();
                        java.lang.String a19 = vs3.b.a(strArr[2]);
                        java.lang.String str = this.f155193a.f155199h;
                        if (str.equals(a19)) {
                            iArr = vs3.a.f439873f;
                        } else {
                            if (a19 != null && str.length() == a19.length()) {
                                int[] iArr2 = {-1, -1};
                                int i17 = 0;
                                for (int length = str.length() - 1; length > 0; length--) {
                                    if (a19.charAt(length) != str.charAt(length)) {
                                        i17++;
                                        if (i17 > 2) {
                                            break;
                                        }
                                        iArr2[i17 - 1] = length;
                                    }
                                }
                                if (i17 <= 2) {
                                    iArr = iArr2;
                                }
                            }
                            iArr = vs3.a.f439874g;
                        }
                        int[] iArr3 = vs3.a.f439873f;
                        if (iArr3.equals(iArr)) {
                            vs3.a aVar2 = new vs3.a(a19, strArr[1], 1);
                            aVar2.f439879e = iArr3;
                            arrayList.clear();
                            arrayList.add(aVar2);
                            break;
                        }
                        if (!vs3.a.f439874g.equals(iArr) && arrayList.size() < 5) {
                            vs3.a aVar3 = new vs3.a(a19, strArr[1], 1);
                            aVar3.f439879e = iArr;
                            arrayList.add(aVar3);
                        }
                    }
                }
            }
            java.lang.System.currentTimeMillis();
            z17 = true;
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f155193a.f155199h)) {
                arrayList.addAll(this.f155193a.f155197f);
            } else {
                java.util.Objects.toString(charSequence);
                for (vs3.a aVar4 : this.f155193a.f155197f) {
                    if (aVar4.f439875a.startsWith(this.f155193a.f155199h)) {
                        arrayList.add(aVar4);
                    }
                }
            }
            z17 = false;
        }
        if (arrayList.size() == 0) {
            this.f155193a.f155200i.f155086g.post(new com.tencent.mm.plugin.recharge.ui.h(this));
        } else {
            if (arrayList.size() == 1 && this.f155193a.f155200i.a()) {
                vs3.a aVar5 = (vs3.a) arrayList.get(0);
                if (vs3.a.f439873f.equals(aVar5.f439879e)) {
                    this.f155193a.f155200i.f155086g.post(new com.tencent.mm.plugin.recharge.ui.i(this, aVar5));
                }
            }
            z18 = z17;
        }
        com.tencent.mm.plugin.recharge.ui.k kVar2 = this.f155193a;
        java.util.List list2 = kVar2.f155195d;
        kVar2.f155195d = arrayList;
        kVar2.f155196e = z18;
        filterResults.count = arrayList.size();
        filterResults.values = this.f155193a.f155195d;
        list2.clear();
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
    }
}
