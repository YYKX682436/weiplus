package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class s extends com.tencent.mm.xcompat.recyclerview.widget.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.v f214630a;

    public s(com.tencent.mm.xcompat.recyclerview.widget.v vVar) {
        this.f214630a = vVar;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k1
    public void b(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        com.tencent.mm.xcompat.recyclerview.widget.v vVar = this.f214630a;
        int computeVerticalScrollRange = vVar.f214678s.computeVerticalScrollRange();
        int i19 = vVar.f214677r;
        int i27 = computeVerticalScrollRange - i19;
        int i28 = vVar.f214660a;
        vVar.f214679t = i27 > 0 && i19 >= i28;
        int computeHorizontalScrollRange = vVar.f214678s.computeHorizontalScrollRange();
        int i29 = vVar.f214676q;
        boolean z17 = computeHorizontalScrollRange - i29 > 0 && i29 >= i28;
        vVar.f214680u = z17;
        boolean z18 = vVar.f214679t;
        if (!z18 && !z17) {
            if (vVar.f214681v != 0) {
                vVar.c(0);
                return;
            }
            return;
        }
        if (z18) {
            float f17 = i19;
            vVar.f214671l = (int) ((f17 * (computeVerticalScrollOffset + (f17 / 2.0f))) / computeVerticalScrollRange);
            vVar.f214670k = java.lang.Math.min(i19, (i19 * i19) / computeVerticalScrollRange);
        }
        if (vVar.f214680u) {
            float f18 = computeHorizontalScrollOffset;
            float f19 = i29;
            vVar.f214674o = (int) ((f19 * (f18 + (f19 / 2.0f))) / computeHorizontalScrollRange);
            vVar.f214673n = java.lang.Math.min(i29, (i29 * i29) / computeHorizontalScrollRange);
        }
        int i37 = vVar.f214681v;
        if (i37 == 0 || i37 == 1) {
            vVar.c(1);
        }
    }
}
