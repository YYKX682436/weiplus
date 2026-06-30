package dk5;

/* loaded from: classes11.dex */
public class s0 extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f234865n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f234866o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f234867p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f234868q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f234869r;

    /* renamed from: s, reason: collision with root package name */
    public final o13.x f234870s;

    /* renamed from: t, reason: collision with root package name */
    public int f234871t;

    public s0(com.tencent.mm.ui.contact.l4 l4Var, java.util.List list, boolean z17, boolean z18, java.util.List list2, int i17) {
        super(l4Var, list, z17, z18, i17);
        this.f234869r = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f234870s = new dk5.p0(this);
        this.f234871t = 0;
        this.f234865n = list2;
        this.f234867p = new java.util.ArrayList();
        this.f234868q = new java.util.HashSet();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f234871t;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        java.util.List list = this.f234867p;
        int size = ((java.util.ArrayList) list).size() - 1;
        com.tencent.mm.ui.contact.item.d dVar = null;
        while (true) {
            if (size < 0) {
                break;
            }
            dk5.r0 r0Var = (dk5.r0) ((java.util.ArrayList) list).get(size);
            int i18 = r0Var.f234840c;
            if (i18 == i17) {
                com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
                n0Var.f206903y = this.f207076d.getActivity().getString(com.tencent.mm.R.string.ig_, r0Var.f234838a);
                dVar = n0Var;
            } else {
                dVar = dVar;
                if (r0Var.f234841d == i17) {
                    com.tencent.mm.ui.contact.item.a1 a1Var = new com.tencent.mm.ui.contact.item.a1(i17);
                    a1Var.C = com.tencent.mm.R.string.ffq;
                    a1Var.D = r0Var.f234842e;
                    dVar = a1Var;
                } else if (i17 > i18) {
                    int i19 = (i17 - i18) - 1;
                    p13.y yVar = (p13.y) r0Var.f234843f.get(i19);
                    if (yVar.f351187e.equals("no_result\u200b")) {
                        dVar = new com.tencent.mm.ui.contact.item.x0(i17);
                    } else {
                        com.tencent.mm.ui.contact.item.u uVar = new com.tencent.mm.ui.contact.item.u(i17);
                        uVar.C = yVar;
                        uVar.A = r0Var.f234839b;
                        uVar.f206855x = true;
                        uVar.f206854w = i19 + 1;
                        int i27 = yVar.f351184b;
                        int i28 = yVar.f351185c;
                        uVar.f206853v = i27;
                        uVar.f206852u = i28;
                        dVar = uVar;
                    }
                }
            }
            if (dVar != null) {
                dVar.f206848q = r0Var.f234838a;
                dVar.f206851t = this.f207080h;
                dVar.f206836e = true;
                break;
            }
            size--;
            dVar = dVar;
        }
        return dVar;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        java.util.Iterator it = ((java.util.ArrayList) this.f234866o).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
    }

    @Override // com.tencent.mm.ui.contact.p4
    public boolean n(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        return u(i17);
    }

    public java.util.List t() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = ((java.util.ArrayList) this.f234867p).iterator();
        while (it.hasNext()) {
            dk5.r0 r0Var = (dk5.r0) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(r0Var.f234844g)) {
                hashSet.add(r0Var.f234844g);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(hashSet);
        return arrayList;
    }

    public final boolean u(int i17) {
        com.tencent.mm.ui.contact.l4 l4Var = this.f207076d;
        int headerViewsCount = i17 - l4Var.O3().getHeaderViewsCount();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f234867p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            dk5.r0 r0Var = (dk5.r0) arrayList.get(size);
            p13.y yVar = null;
            if (r0Var.f234841d == headerViewsCount) {
                if (r0Var.f234842e) {
                    int selectedItemPosition = l4Var.O3().getSelectedItemPosition();
                    r0Var.f234842e = false;
                    v();
                    l4Var.O3().setSelection(selectedItemPosition);
                } else {
                    r0Var.f234842e = true;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= r0Var.f234843f.size()) {
                            i18 = 0;
                            break;
                        }
                        p13.y yVar2 = (p13.y) r0Var.f234843f.get(i18);
                        if (yVar2.f351187e.equals(r0Var.f234844g) && i18 > 2) {
                            yVar = yVar2;
                            break;
                        }
                        i18++;
                    }
                    if (yVar != null) {
                        r0Var.f234843f.remove(i18);
                        r0Var.f234843f.add(0, yVar);
                    }
                    v();
                    l4Var.O3().setSelection(i17);
                }
                notifyDataSetChanged();
                return true;
            }
            int i19 = r0Var.f234840c;
            if (headerViewsCount == i19) {
                return true;
            }
            if (i17 > i19) {
                p13.y yVar3 = (p13.y) r0Var.f234843f.get((headerViewsCount - i19) - 1);
                if (yVar3.f351187e.equals("no_result\u200b")) {
                    return true;
                }
                com.tencent.mm.ui.transmit.MMCreateChatroomUI mMCreateChatroomUI = (com.tencent.mm.ui.transmit.MMCreateChatroomUI) l4Var;
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(r0Var.f234844g);
                java.util.HashSet hashSet = this.f234868q;
                if (K0) {
                    if (hashSet.contains(yVar3.f351187e)) {
                        return true;
                    }
                    mMCreateChatroomUI.f206450h.a(yVar3.f351187e, false);
                    java.lang.String str = yVar3.f351187e;
                    r0Var.f234844g = str;
                    hashSet.add(str);
                } else if (r0Var.f234844g.equals(yVar3.f351187e)) {
                    com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = mMCreateChatroomUI.f206450h;
                    java.lang.String str2 = r0Var.f234844g;
                    if (str2 != null) {
                        multiSelectContactView.g(str2, false, false);
                    } else {
                        multiSelectContactView.getClass();
                    }
                    hashSet.remove(r0Var.f234844g);
                    r0Var.f234844g = null;
                } else {
                    if (hashSet.contains(yVar3.f351187e)) {
                        return true;
                    }
                    hashSet.remove(r0Var.f234844g);
                    com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView2 = mMCreateChatroomUI.f206450h;
                    java.lang.String str3 = r0Var.f234844g;
                    if (str3 != null) {
                        multiSelectContactView2.g(str3, false, false);
                    } else {
                        multiSelectContactView2.getClass();
                    }
                    java.lang.String str4 = yVar3.f351187e;
                    r0Var.f234844g = str4;
                    mMCreateChatroomUI.f206450h.a(str4, false);
                    hashSet.add(r0Var.f234844g);
                }
                mMCreateChatroomUI.x7();
                notifyDataSetChanged();
                return true;
            }
        }
        return false;
    }

    public final void v() {
        java.util.Iterator it = ((java.util.ArrayList) this.f234867p).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            dk5.r0 r0Var = (dk5.r0) it.next();
            if (r0Var.f234843f.size() > 0) {
                r0Var.f234840c = i17;
                int i18 = i17 + 1;
                if (r0Var.f234843f.size() > 3) {
                    int size = r0Var.f234842e ? i18 + 3 : i18 + r0Var.f234843f.size();
                    r0Var.f234841d = size;
                    i17 = size + 1;
                } else {
                    i17 = i18 + r0Var.f234843f.size();
                }
            }
        }
        this.f234871t = i17;
        h();
        notifyDataSetChanged();
    }
}
