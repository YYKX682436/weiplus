package yg5;

/* loaded from: classes10.dex */
public final class i extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg5.l f462353d;

    public i(yg5.l lVar) {
        this.f462353d = lVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        yg5.l lVar = this.f462353d;
        java.util.ArrayList arrayList = lVar.f462358l2.f152065o;
        int u07 = parent.u0(view);
        if (u07 >= 0 && u07 < arrayList.size()) {
            yg5.f fVar = (yg5.f) arrayList.get(u07);
            if (fVar instanceof yg5.e) {
                java.util.Iterator it = arrayList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    yg5.f fVar2 = (yg5.f) it.next();
                    if ((fVar2 instanceof yg5.e) && kotlin.jvm.internal.o.b(((yg5.e) fVar2).f462349e, ((yg5.e) fVar).f462349e)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 >= 0 && i17 < arrayList.size()) {
                    int i18 = (u07 - i17) % lVar.f462356j2;
                    outRect.top = yg5.l.g1(lVar, 4.0f);
                    outRect.bottom = yg5.l.g1(lVar, 4.0f);
                    outRect.left = yg5.l.g1(lVar, 4.0f);
                    outRect.right = yg5.l.g1(lVar, 4.0f);
                    if (i18 == 0) {
                        outRect.left = 0;
                    }
                    if (i18 == lVar.f462356j2 - 1) {
                        outRect.right = 0;
                    }
                }
            }
        }
    }
}
