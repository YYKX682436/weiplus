package u4;

/* loaded from: classes13.dex */
public class c0 extends androidx.fragment.app.b3 {
    public static boolean y(androidx.transition.Transition transition) {
        return (androidx.fragment.app.b3.j(transition.f12385h) && androidx.fragment.app.b3.j(transition.f12387m) && androidx.fragment.app.b3.j(transition.f12388n)) ? false : true;
    }

    @Override // androidx.fragment.app.b3
    public void a(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((androidx.transition.Transition) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.b3
    public void b(java.lang.Object obj, java.util.ArrayList arrayList) {
        androidx.transition.Transition transition = (androidx.transition.Transition) obj;
        if (transition == null) {
            return;
        }
        int i17 = 0;
        if (transition instanceof androidx.transition.TransitionSet) {
            androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) transition;
            int size = transitionSet.L.size();
            while (i17 < size) {
                b((i17 < 0 || i17 >= transitionSet.L.size()) ? null : (androidx.transition.Transition) transitionSet.L.get(i17), arrayList);
                i17++;
            }
            return;
        }
        if (y(transition) || !androidx.fragment.app.b3.j(transition.f12386i)) {
            return;
        }
        int size2 = arrayList.size();
        while (i17 < size2) {
            transition.c((android.view.View) arrayList.get(i17));
            i17++;
        }
    }

    @Override // androidx.fragment.app.b3
    public void c(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        u4.g1.a(viewGroup, (androidx.transition.Transition) obj);
    }

    @Override // androidx.fragment.app.b3
    public boolean e(java.lang.Object obj) {
        return obj instanceof androidx.transition.Transition;
    }

    @Override // androidx.fragment.app.b3
    public java.lang.Object g(java.lang.Object obj) {
        if (obj != null) {
            return ((androidx.transition.Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.b3
    public java.lang.Object k(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.transition.Transition transition = (androidx.transition.Transition) obj;
        androidx.transition.Transition transition2 = (androidx.transition.Transition) obj2;
        androidx.transition.Transition transition3 = (androidx.transition.Transition) obj3;
        if (transition != null && transition2 != null) {
            androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
            transitionSet.X(transition);
            transitionSet.X(transition2);
            transitionSet.b0(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        androidx.transition.TransitionSet transitionSet2 = new androidx.transition.TransitionSet();
        if (transition != null) {
            transitionSet2.X(transition);
        }
        transitionSet2.X(transition3);
        return transitionSet2;
    }

    @Override // androidx.fragment.app.b3
    public java.lang.Object l(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
        if (obj != null) {
            transitionSet.X((androidx.transition.Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.X((androidx.transition.Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.X((androidx.transition.Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.b3
    public void n(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((androidx.transition.Transition) obj).F(view);
        }
    }

    @Override // androidx.fragment.app.b3
    public void o(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        androidx.transition.Transition transition = (androidx.transition.Transition) obj;
        int i17 = 0;
        if (transition instanceof androidx.transition.TransitionSet) {
            androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) transition;
            int size = transitionSet.L.size();
            while (i17 < size) {
                o((i17 < 0 || i17 >= transitionSet.L.size()) ? null : (androidx.transition.Transition) transitionSet.L.get(i17), arrayList, arrayList2);
                i17++;
            }
            return;
        }
        if (y(transition)) {
            return;
        }
        java.util.ArrayList arrayList3 = transition.f12386i;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i17 < size2) {
            transition.c((android.view.View) arrayList2.get(i17));
            i17++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                transition.F((android.view.View) arrayList.get(size3));
            }
        }
    }

    @Override // androidx.fragment.app.b3
    public void p(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((androidx.transition.Transition) obj).a(new u4.z(this, view, arrayList));
    }

    @Override // androidx.fragment.app.b3
    public void q(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3) {
        ((androidx.transition.Transition) obj).a(new u4.a0(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.b3
    public void r(java.lang.Object obj, android.graphics.Rect rect) {
        if (obj != null) {
            ((androidx.transition.Transition) obj).K(new u4.b0(this, rect));
        }
    }

    @Override // androidx.fragment.app.b3
    public void s(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            i(view, rect);
            ((androidx.transition.Transition) obj).K(new u4.y(this, rect));
        }
    }

    @Override // androidx.fragment.app.b3
    public void v(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) obj;
        java.util.ArrayList arrayList2 = transitionSet.f12386i;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            androidx.fragment.app.b3.d(arrayList2, (android.view.View) arrayList.get(i17));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.b3
    public void w(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) obj;
        if (transitionSet != null) {
            java.util.ArrayList arrayList3 = transitionSet.f12386i;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            o(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.b3
    public java.lang.Object x(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
        transitionSet.X((androidx.transition.Transition) obj);
        return transitionSet;
    }
}
