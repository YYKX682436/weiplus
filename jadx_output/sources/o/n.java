package o;

/* loaded from: classes15.dex */
public class n implements o.g0, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f341748d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.LayoutInflater f341749e;

    /* renamed from: f, reason: collision with root package name */
    public o.r f341750f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.appcompat.view.menu.ExpandedMenuView f341751g;

    /* renamed from: h, reason: collision with root package name */
    public o.f0 f341752h;

    /* renamed from: i, reason: collision with root package name */
    public o.m f341753i;

    public n(android.content.Context context, int i17) {
        this.f341748d = context;
        this.f341749e = android.view.LayoutInflater.from(context);
    }

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
        o.f0 f0Var = this.f341752h;
        if (f0Var != null) {
            f0Var.a(rVar, z17);
        }
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        if (this.f341751g == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        androidx.appcompat.view.menu.ExpandedMenuView expandedMenuView = this.f341751g;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // o.g0
    public void c(boolean z17) {
        o.m mVar = this.f341753i;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
        if (this.f341748d != null) {
            this.f341748d = context;
            if (this.f341749e == null) {
                this.f341749e = android.view.LayoutInflater.from(context);
            }
        }
        this.f341750f = rVar;
        o.m mVar = this.f341753i;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = ((android.os.Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f341751g.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // o.g0
    public void g(o.f0 f0Var) {
        this.f341752h = f0Var;
    }

    @Override // o.g0
    public int getId() {
        return 0;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // o.g0
    public boolean i(o.o0 o0Var) {
        if (!o0Var.hasVisibleItems()) {
            return false;
        }
        o.s sVar = new o.s(o0Var);
        android.content.Context context = o0Var.f341780d;
        androidx.appcompat.app.l lVar = new androidx.appcompat.app.l(context);
        androidx.appcompat.app.h hVar = lVar.f9193a;
        o.n nVar = new o.n(hVar.f9129a, com.tencent.mm.R.layout.f487893au);
        sVar.f341802f = nVar;
        nVar.f341752h = sVar;
        o0Var.b(nVar, context);
        o.n nVar2 = sVar.f341802f;
        if (nVar2.f341753i == null) {
            nVar2.f341753i = new o.m(nVar2);
        }
        hVar.f9142n = nVar2.f341753i;
        hVar.f9143o = sVar;
        android.view.View view = o0Var.f341794u;
        if (view != null) {
            hVar.f9133e = view;
        } else {
            hVar.f9131c = o0Var.f341793t;
            hVar.f9132d = o0Var.f341792s;
        }
        hVar.f9140l = sVar;
        androidx.appcompat.app.m a17 = lVar.a();
        sVar.f341801e = a17;
        a17.setOnDismissListener(sVar);
        android.view.WindowManager.LayoutParams attributes = sVar.f341801e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        sVar.f341801e.show();
        o.f0 f0Var = this.f341752h;
        if (f0Var == null) {
            return true;
        }
        f0Var.c(o0Var);
        return true;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        this.f341750f.q(this.f341753i.getItem(i17), this, 0);
    }
}
