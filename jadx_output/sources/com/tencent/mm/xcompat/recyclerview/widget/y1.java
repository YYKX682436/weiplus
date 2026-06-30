package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class y1 {

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.List f214702z = java.util.Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f214703d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f214704e;

    /* renamed from: p, reason: collision with root package name */
    public int f214712p;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214720x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.u0 f214721y;

    /* renamed from: f, reason: collision with root package name */
    public int f214705f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f214706g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f214707h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f214708i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f214709m = -1;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.y1 f214710n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.y1 f214711o = null;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f214713q = null;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f214714r = null;

    /* renamed from: s, reason: collision with root package name */
    public int f214715s = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.n1 f214716t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f214717u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f214718v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f214719w = -1;

    public y1(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("itemView may not be null");
        }
        this.f214703d = view;
    }

    public void b(java.lang.Object obj) {
        if (obj == null) {
            c(1024);
            return;
        }
        if ((1024 & this.f214712p) == 0) {
            if (this.f214713q == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.f214713q = arrayList;
                this.f214714r = java.util.Collections.unmodifiableList(arrayList);
            }
            ((java.util.ArrayList) this.f214713q).add(obj);
        }
    }

    public void c(int i17) {
        this.f214712p = i17 | this.f214712p;
    }

    public final int e() {
        int i17 = this.f214709m;
        return i17 == -1 ? this.f214705f : i17;
    }

    public java.util.List f() {
        java.util.List list;
        return ((this.f214712p & 1024) != 0 || (list = this.f214713q) == null || ((java.util.ArrayList) list).size() == 0) ? f214702z : this.f214714r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return (this.f214712p & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return (this.f214712p & 4) != 0;
    }

    public final boolean k() {
        if ((this.f214712p & 16) == 0) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (!n3.u0.i(this.f214703d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return (this.f214712p & 8) != 0;
    }

    public boolean r() {
        return this.f214716t != null;
    }

    public boolean s() {
        return (this.f214712p & 256) != 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + java.lang.Integer.toHexString(hashCode()) + " position=" + this.f214705f + " id=" + this.f214707h + ", oldPos=" + this.f214706g + ", pLpos:" + this.f214709m);
        if (r()) {
            sb6.append(" scrap ");
            sb6.append(this.f214717u ? "[changeScrap]" : "[attachedScrap]");
        }
        if (j()) {
            sb6.append(" invalid");
        }
        if (!h()) {
            sb6.append(" unbound");
        }
        boolean z17 = true;
        if ((this.f214712p & 2) != 0) {
            sb6.append(" update");
        }
        if (m()) {
            sb6.append(" removed");
        }
        if (y()) {
            sb6.append(" ignored");
        }
        if (s()) {
            sb6.append(" tmpDetached");
        }
        if (!k()) {
            sb6.append(" not recyclable(" + this.f214715s + ")");
        }
        if ((this.f214712p & 512) == 0 && !j()) {
            z17 = false;
        }
        if (z17) {
            sb6.append(" undefined adapter position");
        }
        if (this.f214703d.getParent() == null) {
            sb6.append(" no parent");
        }
        sb6.append("}");
        return sb6.toString();
    }

    public void v(int i17, boolean z17) {
        if (this.f214706g == -1) {
            this.f214706g = this.f214705f;
        }
        if (this.f214709m == -1) {
            this.f214709m = this.f214705f;
        }
        if (z17) {
            this.f214709m += i17;
        }
        this.f214705f += i17;
        android.view.View view = this.f214703d;
        if (view.getLayoutParams() != null) {
            ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f214427c = true;
        }
    }

    public void w() {
        if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Y1 && s()) {
            throw new java.lang.IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f214712p = 0;
        this.f214705f = -1;
        this.f214706g = -1;
        this.f214707h = -1L;
        this.f214709m = -1;
        this.f214715s = 0;
        this.f214710n = null;
        this.f214711o = null;
        java.util.List list = this.f214713q;
        if (list != null) {
            ((java.util.ArrayList) list).clear();
        }
        this.f214712p &= -1025;
        this.f214718v = 0;
        this.f214719w = -1;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.j(this);
    }

    public final void x(boolean z17) {
        int i17 = this.f214715s;
        int i18 = z17 ? i17 - 1 : i17 + 1;
        this.f214715s = i18;
        if (i18 < 0) {
            this.f214715s = 0;
            if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Y1) {
                throw new java.lang.RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            toString();
        } else if (!z17 && i18 == 1) {
            this.f214712p |= 16;
        } else if (z17 && i18 == 0) {
            this.f214712p &= -17;
        }
        if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z1) {
            toString();
        }
    }

    public boolean y() {
        return (this.f214712p & 128) != 0;
    }
}
