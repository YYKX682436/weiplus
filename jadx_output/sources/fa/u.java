package fa;

/* loaded from: classes15.dex */
public class u implements o.g0 {

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.material.internal.NavigationMenuView f260634d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f260635e;

    /* renamed from: f, reason: collision with root package name */
    public o.r f260636f;

    /* renamed from: g, reason: collision with root package name */
    public int f260637g;

    /* renamed from: h, reason: collision with root package name */
    public fa.l f260638h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.LayoutInflater f260639i;

    /* renamed from: m, reason: collision with root package name */
    public int f260640m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f260641n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.res.ColorStateList f260642o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.res.ColorStateList f260643p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f260644q;

    /* renamed from: r, reason: collision with root package name */
    public int f260645r;

    /* renamed from: s, reason: collision with root package name */
    public int f260646s;

    /* renamed from: t, reason: collision with root package name */
    public int f260647t;

    /* renamed from: u, reason: collision with root package name */
    public int f260648u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f260649v = new fa.j(this);

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.f260634d != null) {
            android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
            this.f260634d.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        fa.l lVar = this.f260638h;
        if (lVar != null) {
            lVar.getClass();
            android.os.Bundle bundle2 = new android.os.Bundle();
            o.u uVar = lVar.f260627e;
            if (uVar != null) {
                bundle2.putInt("android:menu:checked", uVar.f341804d);
            }
            android.util.SparseArray<? extends android.os.Parcelable> sparseArray2 = new android.util.SparseArray<>();
            java.util.ArrayList arrayList = lVar.f260626d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                fa.n nVar = (fa.n) arrayList.get(i17);
                if (nVar instanceof fa.p) {
                    o.u uVar2 = ((fa.p) nVar).f260632a;
                    android.view.View actionView = uVar2 != null ? uVar2.getActionView() : null;
                    if (actionView != null) {
                        com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray = new com.google.android.material.internal.ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(uVar2.f341804d, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f260635e != null) {
            android.util.SparseArray<android.os.Parcelable> sparseArray3 = new android.util.SparseArray<>();
            this.f260635e.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // o.g0
    public void c(boolean z17) {
        fa.l lVar = this.f260638h;
        if (lVar != null) {
            lVar.x();
            lVar.notifyDataSetChanged();
        }
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
        this.f260639i = android.view.LayoutInflater.from(context);
        this.f260636f = rVar;
        this.f260648u = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480292tp);
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
        o.u uVar;
        android.view.View actionView;
        com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray;
        o.u uVar2;
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f260634d.restoreHierarchyState(sparseParcelableArray);
            }
            android.os.Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                fa.l lVar = this.f260638h;
                lVar.getClass();
                int i17 = bundle2.getInt("android:menu:checked", 0);
                java.util.ArrayList arrayList = lVar.f260626d;
                if (i17 != 0) {
                    lVar.f260628f = true;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size) {
                            break;
                        }
                        fa.n nVar = (fa.n) arrayList.get(i18);
                        if ((nVar instanceof fa.p) && (uVar2 = ((fa.p) nVar).f260632a) != null && uVar2.f341804d == i17) {
                            lVar.y(uVar2);
                            break;
                        }
                        i18++;
                    }
                    lVar.f260628f = false;
                    lVar.x();
                }
                android.util.SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        fa.n nVar2 = (fa.n) arrayList.get(i19);
                        if ((nVar2 instanceof fa.p) && (uVar = ((fa.p) nVar2).f260632a) != null && (actionView = uVar.getActionView()) != null && (parcelableSparseArray = (com.google.android.material.internal.ParcelableSparseArray) sparseParcelableArray2.get(uVar.f341804d)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            android.util.SparseArray<android.os.Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f260635e.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // o.g0
    public int getId() {
        return this.f260637g;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // o.g0
    public boolean i(o.o0 o0Var) {
        return false;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        return false;
    }
}
