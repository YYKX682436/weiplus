package tn5;

/* loaded from: classes15.dex */
public class g implements on5.h {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.PointF f420873a;

    /* renamed from: b, reason: collision with root package name */
    public on5.h f420874b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f420875c = true;

    @Override // on5.h
    public boolean a(android.view.View view) {
        on5.h hVar = this.f420874b;
        return hVar != null ? hVar.a(view) : c(view, this.f420873a, this.f420875c);
    }

    @Override // on5.h
    public boolean b(android.view.View view) {
        on5.h hVar = this.f420874b;
        return hVar != null ? hVar.b(view) : d(view, this.f420873a);
    }

    public final boolean c(android.view.View view, android.graphics.PointF pointF, boolean z17) {
        if (view == null) {
            return false;
        }
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof android.view.ViewGroup) && pointF != null) {
            if (!(!(view instanceof on5.g) && ((view instanceof android.widget.AbsListView) || (view instanceof android.widget.ScrollView) || (view instanceof n3.o0) || (view instanceof android.webkit.WebView) || (view instanceof n3.e0)))) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                android.graphics.PointF pointF2 = new android.graphics.PointF();
                for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                    android.view.View childAt = viewGroup.getChildAt(childCount - 1);
                    kotlin.jvm.internal.o.d(childAt);
                    if (e(view, childAt, pointF.x, pointF.y, pointF2)) {
                        java.lang.Object tag = childAt.getTag(com.tencent.mm.R.id.prl);
                        if (kotlin.jvm.internal.o.b("fixed", tag) || kotlin.jvm.internal.o.b("fixed-top", tag)) {
                            return false;
                        }
                        pointF.offset(pointF2.x, pointF2.y);
                        boolean c17 = c(childAt, pointF, z17);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return c17;
                    }
                }
            }
        }
        return z17 || view.canScrollVertically(-1);
    }

    public final boolean d(android.view.View view, android.graphics.PointF pointF) {
        if (view == null) {
            return false;
        }
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof android.view.ViewGroup) || pointF == null) {
            return true;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        android.graphics.PointF pointF2 = new android.graphics.PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            android.view.View childAt = viewGroup.getChildAt(childCount - 1);
            kotlin.jvm.internal.o.d(childAt);
            if (e(view, childAt, pointF.x, pointF.y, pointF2)) {
                java.lang.Object tag = childAt.getTag(com.tencent.mm.R.id.prl);
                if (kotlin.jvm.internal.o.b("fixed", tag) || kotlin.jvm.internal.o.b("fixed-bottom", tag)) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean d17 = d(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return d17;
            }
        }
        return true;
    }

    public final boolean e(android.view.View group, android.view.View child, float f17, float f18, android.graphics.PointF pointF) {
        kotlin.jvm.internal.o.g(group, "group");
        kotlin.jvm.internal.o.g(child, "child");
        if (child.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f17, f18};
        fArr[0] = (group.getScrollX() + f17) - child.getLeft();
        float scrollY = (fArr[1] + group.getScrollY()) - child.getTop();
        fArr[1] = scrollY;
        float f19 = fArr[0];
        boolean z17 = f19 >= 0.0f && scrollY >= 0.0f && f19 < ((float) child.getWidth()) && fArr[1] < ((float) child.getHeight());
        if (z17 && pointF != null) {
            pointF.set(fArr[0] - f17, fArr[1] - f18);
        }
        return z17;
    }
}
