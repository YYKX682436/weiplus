package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes12.dex */
public class x extends android.widget.BaseAdapter implements com.tencent.mm.ui.gridviewheaders.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.gridviewheaders.t f208763d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f208764e;

    public x(com.tencent.mm.ui.gridviewheaders.t tVar) {
        this.f208763d = tVar;
        tVar.registerDataSetObserver(new com.tencent.mm.ui.gridviewheaders.v(this, null));
        this.f208764e = a(tVar);
    }

    public java.util.List a(com.tencent.mm.ui.gridviewheaders.t tVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            cw1.j3 j3Var = (cw1.j3) tVar;
            if (i17 >= j3Var.getCount()) {
                return arrayList;
            }
            long c17 = ((bw1.l) j3Var.f223026f.get(i17)).c();
            com.tencent.mm.ui.gridviewheaders.w wVar = (com.tencent.mm.ui.gridviewheaders.w) hashMap.get(java.lang.Long.valueOf(c17));
            if (wVar == null) {
                wVar = new com.tencent.mm.ui.gridviewheaders.w(this, i17);
                arrayList.add(wVar);
            }
            wVar.f208761a++;
            hashMap.put(java.lang.Long.valueOf(c17), wVar);
            i17++;
        }
    }

    @Override // com.tencent.mm.ui.gridviewheaders.b
    public int b(int i17) {
        try {
            return ((com.tencent.mm.ui.gridviewheaders.w) this.f208764e.get(i17)).f208761a;
        } catch (java.lang.IndexOutOfBoundsException e17) {
            e17.toString();
            return 0;
        }
    }

    @Override // com.tencent.mm.ui.gridviewheaders.b
    public int e() {
        return this.f208764e.size();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((cw1.j3) this.f208763d).getCount();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((cw1.j3) this.f208763d).getItem(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        ((cw1.j3) this.f208763d).getClass();
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return ((cw1.j3) this.f208763d).getView(i17, view, viewGroup);
    }

    @Override // com.tencent.mm.ui.gridviewheaders.b
    public android.view.View i(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        cw1.n3 n3Var;
        int i18 = ((com.tencent.mm.ui.gridviewheaders.w) this.f208764e.get(i17)).f208762b;
        cw1.j3 j3Var = (cw1.j3) this.f208763d;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI cleanChattingDetailOldUI = j3Var.f223025e;
        boolean z17 = false;
        if (view == null) {
            view = cleanChattingDetailOldUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.f488620yr, viewGroup, false);
            n3Var = new cw1.n3();
            n3Var.f223179b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gzf);
            n3Var.f223180c = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.f485233gz5);
            view.setTag(n3Var);
        } else {
            n3Var = (cw1.n3) view.getTag();
        }
        bw1.l item = j3Var.getItem(i18);
        n3Var.f223178a = i18;
        n3Var.f223179b.setText(k35.m1.d(cleanChattingDetailOldUI.getString(com.tencent.mm.R.string.f492149fe4), item.f24815g / 1000));
        android.widget.CheckBox checkBox = n3Var.f223180c;
        long c17 = item.c();
        java.util.HashSet hashSet = new java.util.HashSet();
        int i19 = 0;
        while (true) {
            if (i19 >= j3Var.f223026f.size()) {
                break;
            }
            if (((bw1.l) r5.get(i19)).c() == c17) {
                hashSet.add(java.lang.Integer.valueOf(i19));
            }
            i19++;
        }
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = true;
                break;
            }
            if (!j3Var.f223024d.contains(java.lang.Integer.valueOf(((java.lang.Integer) it.next()).intValue()))) {
                break;
            }
        }
        checkBox.setChecked(z17);
        return view;
    }
}
