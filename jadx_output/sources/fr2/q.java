package fr2;

/* loaded from: classes2.dex */
public final class q extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public wq2.h f265751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity act) {
        super(act);
        kotlin.jvm.internal.o.g(act, "act");
    }

    public final int O6() {
        wq2.h hVar = this.f265751d;
        com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeTagFragment liveThemeTagFragment = null;
        if (hVar == null) {
            kotlin.jvm.internal.o.o("mainViewCallback");
            throw null;
        }
        gr2.p0 p0Var = (gr2.p0) ((jz5.n) hVar.f448539k).getValue();
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = p0Var.f274810f;
        int currentItem = finderViewPager != null ? finderViewPager.getCurrentItem() : p0Var.f274812h;
        if (currentItem >= 0) {
            java.util.LinkedList linkedList = p0Var.f274809e;
            if (currentItem < linkedList.size() && linkedList.size() != 0) {
                liveThemeTagFragment = (com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeTagFragment) linkedList.get(currentItem);
            }
        }
        return liveThemeTagFragment != null ? liveThemeTagFragment.getB() : hVar.f448533e;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr2.q.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        wq2.h hVar = this.f265751d;
        if (hVar == null) {
            kotlin.jvm.internal.o.o("mainViewCallback");
            throw null;
        }
        hVar.f448540l.f274829b.dead();
        gr2.p0 p0Var = (gr2.p0) ((jz5.n) hVar.f448539k).getValue();
        p0Var.f274813i.dead();
        p0Var.f274810f = null;
        p0Var.f274811g = null;
        kotlinx.coroutines.z0.e(hVar.f448530b, null, 1, null);
        kotlinx.coroutines.z0.e(hVar.f448531c, null, 1, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (this.f265751d != null) {
            return;
        }
        kotlin.jvm.internal.o.o("mainViewCallback");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f265751d != null) {
            return;
        }
        kotlin.jvm.internal.o.o("mainViewCallback");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        if (this.f265751d != null) {
            return;
        }
        kotlin.jvm.internal.o.o("mainViewCallback");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        if (this.f265751d != null) {
            return;
        }
        kotlin.jvm.internal.o.o("mainViewCallback");
        throw null;
    }
}
