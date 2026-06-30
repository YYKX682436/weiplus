package wl5;

/* loaded from: classes15.dex */
public class l implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f447115d;

    public l(wl5.x xVar) {
        this.f447115d = xVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        int i17;
        boolean z17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/textview/SelectableTextHelper$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "onLongClick.", new java.lang.Object[0]);
        wl5.x xVar = this.f447115d;
        if (wl5.y.o(xVar.f447165j).length() <= 0) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        xVar.I = false;
        if (xVar.f447166k != null) {
            xVar.O = true;
            xVar.P = false;
            xVar.Q = false;
            java.lang.CharSequence o17 = wl5.y.o(xVar.f447165j);
            if (o17 instanceof android.text.SpannableString) {
                android.text.SpannableString spannableString = (android.text.SpannableString) o17;
                xVar.getClass();
                xVar.f447156a0 = new java.util.ArrayList();
                int i19 = 0;
                while (i19 < spannableString.length()) {
                    int nextSpanTransition = spannableString.nextSpanTransition(i19, spannableString.length(), android.text.style.ImageSpan.class);
                    android.text.style.ImageSpan[] imageSpanArr = (android.text.style.ImageSpan[]) spannableString.getSpans(i19, nextSpanTransition, android.text.style.ImageSpan.class);
                    if (1 == imageSpanArr.length) {
                        wl5.s sVar = new wl5.s(xVar);
                        sVar.f447149a = i19;
                        sVar.f447150b = nextSpanTransition;
                        xVar.f447156a0.add(sVar);
                    } else {
                        com.tencent.mm.ui.yk.b("SelectableTextHelper", "other situation occur! length: %d.", java.lang.Integer.valueOf(imageSpanArr.length));
                    }
                    com.tencent.mm.ui.yk.a("SelectableTextHelper", "spans from %d to %d.", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(nextSpanTransition));
                    i19 = nextSpanTransition;
                }
                com.tencent.mm.ui.yk.a("SelectableTextHelper", xVar.f447156a0.toString(), new java.lang.Object[0]);
            }
            xVar.i();
            int i27 = xVar.C;
            if (i27 <= 0 || i27 >= wl5.y.o(xVar.f447165j).length()) {
                int size = xVar.f447172q.size();
                if (size > 0) {
                    int k17 = wl5.y.k(xVar.f447165j, xVar.f447177v, xVar.f447178w);
                    for (int i28 = 0; i28 < size; i28++) {
                        int[] iArr = (int[]) xVar.f447172q.get(i28);
                        com.tencent.mm.ui.yk.a("SelectableTextHelper", "start:%s, end:%s, type:%s", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]));
                        int i29 = iArr[0];
                        if (k17 >= i29 && k17 <= (i18 = iArr[1])) {
                            xVar.f447168m = true;
                            xVar.f447173r = iArr[2];
                            xVar.s(i29, i18);
                            xVar.f447166k.a();
                            xVar.M = false;
                            xVar.N = false;
                            xVar.q();
                            xVar.o();
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                    xVar.f447173r = 1;
                    xVar.s(0, wl5.y.o(xVar.f447165j).length());
                    xVar.M = true;
                    xVar.N = false;
                    xVar.o();
                    xVar.f447166k.c(view);
                }
            } else {
                xVar.f447173r = 0;
                xVar.s(0, xVar.C);
                xVar.M = false;
                xVar.N = false;
                xVar.q();
                xVar.o();
            }
        } else {
            xVar.O = false;
            xVar.f447173r = 1;
            int k18 = wl5.y.k(xVar.f447165j, xVar.f447177v, xVar.f447178w);
            int length = wl5.y.o(xVar.f447165j).length();
            if (xVar.f447172q.size() > 0) {
                int[] iArr2 = (int[]) xVar.f447172q.get(0);
                int i37 = iArr2[0];
                if (k18 >= i37 && k18 <= (i17 = iArr2[1])) {
                    xVar.s(i37, i17);
                }
            } else {
                int k19 = wl5.y.k(xVar.f447165j, xVar.f447177v, xVar.f447178w);
                int i38 = k19 + 2;
                int length2 = wl5.y.o(xVar.f447165j).length();
                if (i38 > length2) {
                    i38 = length2;
                }
                xVar.s(k19, i38);
            }
            xVar.i();
            xVar.M = false;
            xVar.N = false;
            if (xVar.T || k18 < length) {
                xVar.q();
            }
            xVar.o();
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
