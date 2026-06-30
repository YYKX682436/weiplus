package fa;

/* loaded from: classes15.dex */
public class l extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f260626d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public o.u f260627e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f260628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fa.u f260629g;

    public l(fa.u uVar) {
        this.f260629g = uVar;
        x();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f260626d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        fa.n nVar = (fa.n) this.f260626d.get(i17);
        if (nVar instanceof fa.o) {
            return 2;
        }
        if (nVar instanceof fa.m) {
            return 3;
        }
        if (nVar instanceof fa.p) {
            return ((fa.p) nVar).f260632a.hasSubMenu() ? 1 : 0;
        }
        throw new java.lang.RuntimeException("Unknown item type.");
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        fa.t tVar = (fa.t) k3Var;
        int itemViewType = getItemViewType(i17);
        java.util.ArrayList arrayList = this.f260626d;
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                ((android.widget.TextView) tVar.itemView).setText(((fa.p) arrayList.get(i17)).f260632a.f341808h);
                return;
            } else {
                if (itemViewType != 2) {
                    return;
                }
                fa.o oVar = (fa.o) arrayList.get(i17);
                tVar.itemView.setPadding(0, oVar.f260630a, 0, oVar.f260631b);
                return;
            }
        }
        com.google.android.material.internal.NavigationMenuItemView navigationMenuItemView = (com.google.android.material.internal.NavigationMenuItemView) tVar.itemView;
        fa.u uVar = this.f260629g;
        navigationMenuItemView.setIconTintList(uVar.f260643p);
        if (uVar.f260641n) {
            navigationMenuItemView.setTextAppearance(uVar.f260640m);
        }
        android.content.res.ColorStateList colorStateList = uVar.f260642o;
        if (colorStateList != null) {
            navigationMenuItemView.setTextColor(colorStateList);
        }
        android.graphics.drawable.Drawable drawable = uVar.f260644q;
        android.graphics.drawable.Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(navigationMenuItemView, newDrawable);
        fa.p pVar = (fa.p) arrayList.get(i17);
        navigationMenuItemView.setNeedsEmptyIcon(pVar.f260633b);
        navigationMenuItemView.setHorizontalPadding(uVar.f260645r);
        navigationMenuItemView.setIconPadding(uVar.f260646s);
        navigationMenuItemView.a(pVar.f260632a, 0);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        androidx.recyclerview.widget.k3 qVar;
        fa.u uVar = this.f260629g;
        if (i17 == 0) {
            qVar = new fa.q(uVar.f260639i, viewGroup, uVar.f260649v);
        } else if (i17 == 1) {
            qVar = new fa.s(uVar.f260639i, viewGroup);
        } else {
            if (i17 != 2) {
                if (i17 != 3) {
                    return null;
                }
                return new fa.k(uVar.f260635e);
            }
            qVar = new fa.r(uVar.f260639i, viewGroup);
        }
        return qVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
        fa.t tVar = (fa.t) k3Var;
        if (tVar instanceof fa.q) {
            com.google.android.material.internal.NavigationMenuItemView navigationMenuItemView = (com.google.android.material.internal.NavigationMenuItemView) tVar.itemView;
            android.widget.FrameLayout frameLayout = navigationMenuItemView.F;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.E.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void x() {
        boolean z17;
        if (this.f260628f) {
            return;
        }
        this.f260628f = true;
        java.util.ArrayList arrayList = this.f260626d;
        arrayList.clear();
        arrayList.add(new fa.m());
        fa.u uVar = this.f260629g;
        int size = uVar.f260636f.l().size();
        boolean z18 = false;
        int i17 = -1;
        int i18 = 0;
        boolean z19 = false;
        int i19 = 0;
        while (i18 < size) {
            o.u uVar2 = (o.u) uVar.f260636f.l().get(i18);
            if (uVar2.isChecked()) {
                y(uVar2);
            }
            if (uVar2.isCheckable()) {
                uVar2.f(z18);
            }
            if (uVar2.hasSubMenu()) {
                o.o0 o0Var = uVar2.f341818u;
                if (o0Var.hasVisibleItems()) {
                    if (i18 != 0) {
                        arrayList.add(new fa.o(uVar.f260648u, z18 ? 1 : 0));
                    }
                    arrayList.add(new fa.p(uVar2));
                    int size2 = o0Var.size();
                    int i27 = z18 ? 1 : 0;
                    int i28 = i27;
                    while (i27 < size2) {
                        o.u uVar3 = (o.u) o0Var.getItem(i27);
                        if (uVar3.isVisible()) {
                            if (i28 == 0 && uVar3.getIcon() != null) {
                                i28 = 1;
                            }
                            if (uVar3.isCheckable()) {
                                uVar3.f(z18);
                            }
                            if (uVar2.isChecked()) {
                                y(uVar2);
                            }
                            arrayList.add(new fa.p(uVar3));
                        }
                        i27++;
                        z18 = false;
                    }
                    if (i28 != 0) {
                        int size3 = arrayList.size();
                        for (int size4 = arrayList.size(); size4 < size3; size4++) {
                            ((fa.p) arrayList.get(size4)).f260633b = true;
                        }
                    }
                }
                z17 = true;
            } else {
                int i29 = uVar2.f341805e;
                if (i29 != i17) {
                    i19 = arrayList.size();
                    z19 = uVar2.getIcon() != null;
                    if (i18 != 0) {
                        i19++;
                        int i37 = uVar.f260648u;
                        arrayList.add(new fa.o(i37, i37));
                    }
                } else if (!z19 && uVar2.getIcon() != null) {
                    int size5 = arrayList.size();
                    for (int i38 = i19; i38 < size5; i38++) {
                        ((fa.p) arrayList.get(i38)).f260633b = true;
                    }
                    z17 = true;
                    z19 = true;
                    fa.p pVar = new fa.p(uVar2);
                    pVar.f260633b = z19;
                    arrayList.add(pVar);
                    i17 = i29;
                }
                z17 = true;
                fa.p pVar2 = new fa.p(uVar2);
                pVar2.f260633b = z19;
                arrayList.add(pVar2);
                i17 = i29;
            }
            i18++;
            z18 = false;
        }
        this.f260628f = z18 ? 1 : 0;
    }

    public void y(o.u uVar) {
        if (this.f260627e == uVar || !uVar.isCheckable()) {
            return;
        }
        o.u uVar2 = this.f260627e;
        if (uVar2 != null) {
            uVar2.setChecked(false);
        }
        this.f260627e = uVar;
        uVar.setChecked(true);
    }
}
