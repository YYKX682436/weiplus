package ql5;

/* loaded from: classes15.dex */
public abstract class d extends android.widget.BaseExpandableListAdapter {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f364595c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f364596a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.listview.AnimatedExpandableListView f364597b;

    public final ql5.g a(int i17) {
        android.util.SparseArray sparseArray = this.f364596a;
        ql5.g gVar = (ql5.g) sparseArray.get(i17);
        if (gVar != null) {
            return gVar;
        }
        ql5.g gVar2 = new ql5.g(null);
        sparseArray.put(i17, gVar2);
        return gVar2;
    }

    public abstract android.view.View b(int i17, int i18, boolean z17, android.view.View view, android.view.ViewGroup viewGroup);

    public abstract int c(int i17);

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getChildType(int i17, int i18) {
        return a(i17).f364606a ? 0 : 1;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getChildTypeCount() {
        return 2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final android.view.View getChildView(int i17, int i18, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        int i19;
        int i27;
        int animationDuration;
        int animationDuration2;
        ql5.g a17 = a(i17);
        if (!a17.f364606a) {
            return b(i17, i18, z17, view, viewGroup);
        }
        android.view.View view2 = view;
        if (!(view2 instanceof ql5.e)) {
            view2 = new ql5.e(viewGroup.getContext(), null);
            view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 0));
        }
        android.view.View view3 = view2;
        if (i18 < a17.f364608c) {
            view3.getLayoutParams().height = 0;
            return view3;
        }
        android.widget.ExpandableListView expandableListView = (android.widget.ExpandableListView) viewGroup;
        ql5.e eVar = (ql5.e) view3;
        ((java.util.ArrayList) eVar.f364598d).clear();
        android.graphics.drawable.Drawable divider = expandableListView.getDivider();
        int measuredWidth = viewGroup.getMeasuredWidth();
        int dividerHeight = expandableListView.getDividerHeight();
        if (divider != null) {
            eVar.f364599e = divider;
            eVar.f364600f = measuredWidth;
            eVar.f364601g = dividerHeight;
            divider.setBounds(0, 0, measuredWidth, dividerHeight);
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int height = viewGroup.getHeight();
        int c17 = c(i17);
        int i28 = a17.f364608c;
        int i29 = 0;
        while (true) {
            if (i28 >= c17) {
                i19 = 1;
                i27 = i29;
                break;
            }
            i19 = 1;
            int i37 = i28;
            int i38 = c17;
            android.view.View b17 = b(i17, i28, i28 == c17 + (-1), null, viewGroup);
            b17.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = i29 + b17.getMeasuredHeight();
            java.util.List list = eVar.f364598d;
            if (measuredHeight >= height) {
                b17.layout(0, 0, eVar.getWidth(), eVar.getHeight());
                ((java.util.ArrayList) list).add(b17);
                i27 = measuredHeight + (((i38 - i37) - 1) * (measuredHeight / (i37 + 1)));
                break;
            }
            b17.layout(0, 0, eVar.getWidth(), eVar.getHeight());
            ((java.util.ArrayList) list).add(b17);
            i28 = i37 + 1;
            i29 = measuredHeight;
            c17 = i38;
        }
        java.lang.Object tag = eVar.getTag();
        int intValue = tag != null ? ((java.lang.Integer) tag).intValue() : 0;
        boolean z18 = a17.f364607b;
        if (z18 && intValue != i19) {
            ql5.f fVar = new ql5.f(eVar, 0, i27, a17, null);
            animationDuration2 = this.f364597b.getAnimationDuration();
            fVar.setDuration(animationDuration2);
            fVar.setAnimationListener(new ql5.b(this, i17, eVar));
            eVar.startAnimation(fVar);
            eVar.setTag(java.lang.Integer.valueOf(i19));
        } else if (!z18 && intValue != 2) {
            if (a17.f364609d == -1) {
                a17.f364609d = i27;
            }
            ql5.f fVar2 = new ql5.f(eVar, a17.f364609d, 0, a17, null);
            animationDuration = this.f364597b.getAnimationDuration();
            fVar2.setDuration(animationDuration);
            fVar2.setAnimationListener(new ql5.c(this, i17, expandableListView, a17, eVar));
            eVar.startAnimation(fVar2);
            eVar.setTag(2);
        }
        return view3;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i17) {
        ql5.g a17 = a(i17);
        return a17.f364606a ? a17.f364608c + 1 : c(i17);
    }
}
