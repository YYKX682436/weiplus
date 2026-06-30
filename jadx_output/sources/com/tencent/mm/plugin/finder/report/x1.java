package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public class x1 extends fc2.o {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f125428r;

    public x1(fc2.c cVar) {
        super(cVar);
        new android.graphics.Rect();
        this.f125428r = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.y0().r()).intValue() == 1;
    }

    @Override // fc2.o
    public fc2.a c(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        fc2.a h17 = h(i17);
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.base.TwoFeedFlowScrollEvent");
        fc2.y yVar = (fc2.y) h17;
        jz5.l j17 = j(recyclerView, this.f125428r);
        int intValue = ((java.lang.Number) j17.f302833d).intValue();
        int intValue2 = ((java.lang.Number) j17.f302834e).intValue();
        yVar.f261009g = intValue;
        yVar.f261010h = intValue2;
        yVar.f261012j = hc2.f1.m(recyclerView, intValue, intValue2);
        int i19 = this.f260960e;
        int i27 = yVar.f261009g;
        if (i19 != i27 || this.f260961f != yVar.f261010h) {
            if (i19 == Integer.MAX_VALUE || (i18 = this.f260961f) == Integer.MAX_VALUE) {
                i18 = yVar.f261010h;
            } else {
                if (i27 < i19) {
                    i19 = i27;
                }
                int i28 = yVar.f261010h;
                if (i28 > i18) {
                    i18 = i28;
                }
                i27 = i19;
            }
            yVar.f261011i = hc2.f1.m(recyclerView, i27, i18);
        }
        this.f260960e = yVar.f261009g;
        this.f260961f = yVar.f261010h;
        return yVar;
    }

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public fc2.y h(int i17) {
        return new fc2.y(i17);
    }

    public jz5.l j(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        return hc2.f1.s(recyclerView, z17);
    }
}
