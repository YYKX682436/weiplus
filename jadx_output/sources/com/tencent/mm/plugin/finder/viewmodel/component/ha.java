package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ha extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f134600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134600d = new java.util.LinkedList();
    }

    public static com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a P6(com.tencent.mm.plugin.finder.viewmodel.component.ha haVar, int i17, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar, yz5.l lVar, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            lVar = null;
        }
        haVar.getClass();
        return new com.tencent.mm.plugin.finder.viewmodel.component.fa(haVar, i17, lVar, aVar);
    }

    public final int O6() {
        java.lang.Integer num = (java.lang.Integer) this.f134600d.peek();
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
