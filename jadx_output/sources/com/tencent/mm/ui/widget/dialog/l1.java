package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class l1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f211914d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f211915e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.AdapterView.OnItemLongClickListener f211916f;

    /* renamed from: g, reason: collision with root package name */
    public db5.g4 f211917g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f211918h;

    public l1(com.tencent.mm.ui.widget.dialog.k0 k0Var, boolean z17) {
        this.f211918h = k0Var;
        this.f211914d = z17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        int size = this.f211917g.size();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f211918h;
        boolean z17 = this.f211914d;
        if (!z17 || !k0Var.f211861g2) {
            size += k0Var.M.size();
        }
        return k0Var.f211891y1 ? (z17 && k0Var.f211861g2) ? size : size + 1 : size;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 < 0 || i17 >= this.f211917g.size()) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f211918h;
            if (k0Var.M.size() > 0 && i17 < this.f211917g.size() + k0Var.M.size()) {
                return 2;
            }
            if (k0Var.f211891y1 && i17 == this.f211917g.size() + k0Var.M.size()) {
                return 3;
            }
        } else {
            android.view.MenuItem item = this.f211917g.getItem(i17);
            boolean z17 = item instanceof db5.h4;
            if (z17 && ((db5.h4) item).H) {
                return 5;
            }
            if (item instanceof db5.v5) {
                if (((db5.v5) item).M == 1) {
                    return 4;
                }
            }
            if (z17 && !((db5.h4) item).f228380x) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03e5  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r41, int r42) {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.dialog.l1.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f211918h;
        int i18 = k0Var.R1;
        return new com.tencent.mm.ui.widget.dialog.k1(this, i18 == 0 ? android.view.LayoutInflater.from(k0Var.f211870m).inflate(com.tencent.mm.R.layout.f489269by0, viewGroup, false) : i18 == 2 ? android.view.LayoutInflater.from(k0Var.f211870m).inflate(com.tencent.mm.R.layout.f489270by1, viewGroup, false) : i17 == 5 ? android.view.LayoutInflater.from(k0Var.f211870m).inflate(com.tencent.mm.R.layout.ejx, viewGroup, false) : android.view.LayoutInflater.from(k0Var.f211870m).inflate(com.tencent.mm.R.layout.f489271by2, viewGroup, false));
    }
}
