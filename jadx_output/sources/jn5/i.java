package jn5;

/* loaded from: classes3.dex */
public final class i extends androidx.recyclerview.widget.z {
    public androidx.recyclerview.widget.k3 A;

    /* renamed from: t, reason: collision with root package name */
    public final yz5.p f300857t;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f300860w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Integer f300862y;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.animation.AccelerateDecelerateInterpolator f300858u = new android.view.animation.AccelerateDecelerateInterpolator();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f300859v = new java.util.ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f300861x = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f300863z = new java.util.ArrayList();

    public i(yz5.p pVar) {
        this.f300857t = pVar;
    }

    public final boolean I(androidx.recyclerview.widget.k3 k3Var) {
        return (k3Var == null || k3Var.itemView.getTag(com.tencent.mm.R.id.txo) == null) ? false : true;
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.n2
    public void s() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f300859v;
        arrayList.size();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f300863z;
        arrayList2.size();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f300861x;
        arrayList3.size();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            yz5.l lVar = (yz5.l) it.next();
            java.lang.Integer num = this.f300860w;
            if (num != null) {
                r5 = num.intValue();
            }
            lVar.invoke(java.lang.Integer.valueOf(r5));
        }
        arrayList.clear();
        this.f300860w = null;
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            ((java.lang.Runnable) it6.next()).run();
        }
        arrayList2.clear();
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            yz5.l lVar2 = (yz5.l) it7.next();
            java.lang.Integer num2 = this.f300862y;
            lVar2.invoke(java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
        }
        arrayList3.clear();
        this.f300862y = null;
        androidx.recyclerview.widget.k3 k3Var = this.A;
        if ((k3Var != null ? 1 : 0) != 0 && k3Var != null) {
            android.view.View view = k3Var.itemView;
            jn5.h hVar = new jn5.h(this);
            long j17 = this.f12170e;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.n(view, hVar, j17);
        }
        super.s();
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.o3
    public boolean t(androidx.recyclerview.widget.k3 k3Var) {
        android.view.View view;
        android.view.View view2;
        if (k3Var != null) {
            j(k3Var);
        }
        android.view.View view3 = k3Var != null ? k3Var.itemView : null;
        int top = (k3Var == null || (view2 = k3Var.itemView) == null) ? 0 : view2.getTop();
        if (k3Var != null && (view = k3Var.itemView) != null) {
            view.getHeight();
        }
        java.util.Objects.toString(k3Var);
        java.lang.Integer num = this.f300862y;
        this.f300862y = num == null ? java.lang.Integer.valueOf(top) : java.lang.Integer.valueOf(java.lang.Math.min(top, num.intValue()));
        ((java.util.ArrayList) this.f300861x).add(new jn5.b(view3, top, this, k3Var));
        return true;
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.o3
    public boolean u(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2, int i17, int i18, int i19, int i27) {
        I(k3Var);
        I(k3Var2);
        java.util.Objects.toString(k3Var);
        java.util.Objects.toString(k3Var2);
        return super.u(k3Var, k3Var2, i17, i18, i19, i27);
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.o3
    public boolean v(androidx.recyclerview.widget.k3 k3Var, int i17, int i18, int i19, int i27) {
        if (k3Var != null) {
            j(k3Var);
        }
        kotlin.jvm.internal.o.d(k3Var);
        int translationX = i19 - (i17 + ((int) k3Var.itemView.getTranslationX()));
        int translationY = i27 - (i18 + ((int) k3Var.itemView.getTranslationY()));
        android.view.View view = k3Var.itemView;
        if (translationX == 0 && translationY == 0) {
            x(k3Var);
            return false;
        }
        if (view != null) {
            view.getTop();
        }
        if (translationX != 0 && view != null) {
            view.setTranslationX(-translationX);
        }
        if (translationY != 0 && view != null) {
            view.setTranslationY(-translationY);
        }
        boolean I = I(k3Var);
        k3Var.toString();
        if (I) {
            this.A = k3Var;
        }
        ((java.util.ArrayList) this.f300863z).add(new jn5.e(view, translationX, translationY, this, k3Var));
        return true;
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.o3
    public boolean w(androidx.recyclerview.widget.k3 k3Var) {
        android.view.View view;
        android.view.View view2;
        if (k3Var != null) {
            j(k3Var);
        }
        android.view.View view3 = k3Var != null ? k3Var.itemView : null;
        int top = (k3Var == null || (view2 = k3Var.itemView) == null) ? 0 : view2.getTop();
        if (k3Var != null && (view = k3Var.itemView) != null) {
            view.getHeight();
        }
        java.util.Objects.toString(k3Var);
        java.lang.Integer num = this.f300860w;
        this.f300860w = num == null ? java.lang.Integer.valueOf(top) : java.lang.Integer.valueOf(java.lang.Math.min(top, num.intValue()));
        ((java.util.ArrayList) this.f300859v).add(new jn5.g(top, view3, this, k3Var));
        return true;
    }
}
