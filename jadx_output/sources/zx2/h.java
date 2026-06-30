package zx2;

/* loaded from: classes2.dex */
public abstract class h extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout f477039v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence] */
    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void O6(zx2.i iVar, int i17) {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
        if (iVar == null || finderTabLayout == null) {
            return;
        }
        zx2.u j17 = finderTabLayout.j();
        j17.c(iVar.a());
        iVar.c((android.view.ViewGroup) j17.f477086f);
        iVar.e(false);
        if (iVar instanceof zx2.k) {
            zx2.k kVar = (zx2.k) iVar;
            ?? r47 = kVar.f477050h;
            if (r47.length() == 0) {
                r47 = kVar.i(getContext());
            }
            j17.f477084d = r47;
            zx2.w wVar = j17.f477088h;
            if (wVar != null) {
                wVar.b();
            }
        }
        j17.f477081a = iVar;
        java.util.ArrayList arrayList = finderTabLayout.f133100d;
        if (i17 >= 0) {
            finderTabLayout.b(j17, i17, arrayList.isEmpty());
        } else {
            finderTabLayout.b(j17, arrayList.size(), arrayList.isEmpty());
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void S6() {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
        if (finderTabLayout != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "ajustIndicator:" + finderTabLayout.getTabCount());
            if (finderTabLayout.getTabCount() <= 1) {
                return;
            }
            finderTabLayout.post(new zx2.e(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void T6() {
        zx2.u i17;
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
        if (finderTabLayout != null) {
            int tabCount = finderTabLayout.getTabCount();
            android.view.ViewGroup Z6 = Z6();
            if (Z6 != null) {
                boolean z17 = false;
                for (int i18 = 0; i18 < tabCount; i18++) {
                    com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout2 = this.f477039v;
                    java.lang.Object obj = (finderTabLayout2 == null || (i17 = finderTabLayout2.i(i18)) == null) ? null : i17.f477081a;
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                    int[] b17 = ((zx2.i) obj).b();
                    if (b17[0] > 0 || b17[1] > 0) {
                        v7(Z6, i18, i65.a.b(Z6.getContext(), b17[0]), i65.a.b(Z6.getContext(), b17[1]));
                        z17 = true;
                    }
                }
                if (z17) {
                    Z6.requestLayout();
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void U6() {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
        if (finderTabLayout != null) {
            finderTabLayout.a(new zx2.f(this, finderTabLayout));
            int i17 = 0;
            for (java.lang.Object obj : f7()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zx2.i iVar = (zx2.i) obj;
                iVar.f477040a = i17;
                O6(iVar, -1);
                i17 = i18;
            }
            S6();
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public android.view.ViewGroup Z6() {
        android.view.View childAt;
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
        if (finderTabLayout == null || (childAt = finderTabLayout.getChildAt(0)) == null) {
            return null;
        }
        return (android.view.ViewGroup) childAt;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public int a7() {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
        return finderTabLayout != null ? finderTabLayout.getSelectedTabPosition() : this.f133655d;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void g7() {
        com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider d76 = d7();
        zx2.d dVar = d76 instanceof zx2.d ? (zx2.d) d76 : null;
        if (dVar != null) {
            this.f133662n = dVar.f477034a;
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void h7() {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout a17 = c7().a();
        this.f477039v = a17;
        if (a17 == null) {
            return;
        }
        a17.H = false;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
        if (finderTabLayout != null) {
            finderTabLayout.setVisibility(4);
        }
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout2 = this.f477039v;
        if (finderTabLayout2 != null) {
            finderTabLayout2.post(new zx2.g(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void q7(int i17) {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
        if (finderTabLayout != null) {
            zx2.u uVar = finderTabLayout.f133101e;
            int i18 = uVar != null ? uVar.f477085e : 0;
            finderTabLayout.l(i17);
            java.util.ArrayList arrayList = finderTabLayout.f133100d;
            zx2.u uVar2 = (zx2.u) arrayList.remove(i17);
            if (uVar2 != null) {
                uVar2.f477087g = null;
                uVar2.f477088h = null;
                uVar2.f477081a = null;
                uVar2.f477082b = null;
                uVar2.f477083c = null;
                uVar2.f477084d = null;
                uVar2.f477085e = -1;
                uVar2.f477086f = null;
                ((m3.g) com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout.f133098x0).b(uVar2);
            }
            int size = arrayList.size();
            for (int i19 = i17; i19 < size; i19++) {
                ((zx2.u) arrayList.get(i19)).f477085e = i19;
            }
            if (i18 == i17) {
                finderTabLayout.m(arrayList.isEmpty() ? null : (zx2.u) arrayList.get(java.lang.Math.max(0, i17 - 1)), true);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void s7(int i17, boolean z17) {
        zx2.u i18;
        super.s7(i17, z17);
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
        if (finderTabLayout != null) {
            if (!(i17 >= 0 && i17 < finderTabLayout.getTabCount())) {
                finderTabLayout = null;
            }
            if (finderTabLayout == null || (i18 = finderTabLayout.i(i17)) == null) {
                return;
            }
            if (z17 || !i18.a()) {
                com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "FinderAlignTabUIC selectTab :" + i17);
                i18.b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
