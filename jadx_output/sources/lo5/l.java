package lo5;

/* loaded from: classes14.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo5.m f320219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.GridLayout f320220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320221f;

    public l(lo5.m mVar, android.widget.GridLayout gridLayout, java.lang.String str) {
        this.f320219d = mVar;
        this.f320220e = gridLayout;
        this.f320221f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.View] */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        int i17;
        int measuredWidth = this.f320220e.getMeasuredWidth();
        lo5.m mVar = this.f320219d;
        mVar.E = measuredWidth;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPFloatCardManager", "updateMemberUi: ");
        android.view.View view = mVar.f301236e;
        if (view != null) {
            android.widget.GridLayout gridLayout = (android.widget.GridLayout) view.findViewById(com.tencent.mm.R.id.f486170kg2);
            java.util.ArrayList arrayList = mVar.G;
            if (arrayList != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    if (true ^ kotlin.jvm.internal.o.b((java.lang.String) obj, this.f320221f)) {
                        arrayList2.add(obj);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    map = mVar.I;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.String str = (java.lang.String) it.next();
                    java.lang.Object obj2 = (android.view.View) ((java.util.LinkedHashMap) map).get(str);
                    if (obj2 == 0) {
                        obj2 = new android.widget.ImageView(view.getContext());
                        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(obj2, str, null);
                    }
                    arrayList3.add(new jz5.l(str, obj2));
                }
                java.util.Map q17 = kz5.c1.q(arrayList3);
                ((java.util.LinkedHashMap) map).clear();
                map.putAll(q17);
                gridLayout.removeAllViews();
                if (arrayList2.size() > 13) {
                    mVar.w();
                    i17 = 2;
                } else {
                    mVar.w();
                    i17 = 1;
                }
                gridLayout.setRowCount(i17);
                int i18 = (int) ((gridLayout.getResources().getDisplayMetrics().density * 2) + 0.5f);
                int i19 = (mVar.E - ((i18 * 2) * 13)) / 13;
                if (i19 <= 0) {
                    return;
                }
                java.util.Iterator it6 = ((java.util.LinkedHashMap) map).entrySet().iterator();
                int i27 = 0;
                while (it6.hasNext()) {
                    android.view.View view2 = (android.view.View) ((java.util.Map.Entry) it6.next()).getValue();
                    android.widget.GridLayout.LayoutParams layoutParams = i27 < 13 ? new android.widget.GridLayout.LayoutParams(android.widget.GridLayout.spec(0, 1), android.widget.GridLayout.spec(i27, 1)) : new android.widget.GridLayout.LayoutParams(android.widget.GridLayout.spec(1, 1), android.widget.GridLayout.spec(i27 - 13, 1));
                    layoutParams.setMargins(i18, i18, i18, i18);
                    layoutParams.setGravity(8388659);
                    layoutParams.width = i19;
                    layoutParams.height = i19;
                    if (view2.getParent() != null) {
                        android.view.ViewParent parent = view2.getParent();
                        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((android.view.ViewGroup) parent).removeView(view2);
                    }
                    gridLayout.addView(view2, layoutParams);
                    i27++;
                }
            }
        }
    }
}
