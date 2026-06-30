package za3;

/* loaded from: classes15.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.i1 f470908d;

    public e1(za3.i1 i1Var) {
        this.f470908d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        ab3.h hVar;
        int i17;
        int i18;
        int i19;
        int i27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i28 = iArr[0];
        int i29 = iArr[1];
        za3.i1 i1Var = this.f470908d;
        java.util.List list = i1Var.f470944b;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.content.Context context = i1Var.f470943a;
            float d17 = com.tencent.mm.sdk.platformtools.j.d(context, 85.0f);
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hVar = i1Var.f470954l;
                if (!hasNext) {
                    break;
                }
                r45.mw6 mw6Var = (r45.mw6) it.next();
                r45.wa5 wa5Var = mw6Var.f380873e;
                za3.i1 i1Var2 = i1Var;
                int i37 = i29;
                android.graphics.Point pointByGeoPoint = hVar.getPointByGeoPoint(wa5Var.f389011d, wa5Var.f389012e);
                double d18 = mw6Var.f380873e.f389011d;
                int i38 = pointByGeoPoint.x - i28;
                int i39 = pointByGeoPoint.y - i37;
                if (java.lang.Math.sqrt((i38 * i38) + (i39 * i39)) < d17) {
                    arrayList2.add(mw6Var.f380872d);
                }
                i1Var = i1Var2;
                i29 = i37;
            }
            int i47 = i29;
            za3.i1 i1Var3 = i1Var;
            r45.mw6 mw6Var2 = i1Var3.f470945c;
            if (mw6Var2 != null) {
                r45.wa5 wa5Var2 = mw6Var2.f380873e;
                android.graphics.Point pointByGeoPoint2 = hVar.getPointByGeoPoint(wa5Var2.f389011d, wa5Var2.f389012e);
                double d19 = i1Var3.f470945c.f380873e.f389011d;
                int i48 = pointByGeoPoint2.x - i28;
                int i49 = pointByGeoPoint2.y - i47;
                if (java.lang.Math.sqrt((i48 * i48) + (i49 * i49)) < d17) {
                    arrayList2.add(i1Var3.f470945c.f380872d);
                }
            }
            arrayList2.size();
            if (arrayList2.size() > 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "12", 0, 0, 0);
                arrayList2.size();
                com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(context, com.tencent.mm.R.style.f494823x9);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f488167j2, (android.view.ViewGroup) null);
                com.tencent.mm.ui.base.MMGridPaper mMGridPaper = (com.tencent.mm.ui.base.MMGridPaper) viewGroup.findViewById(com.tencent.mm.R.id.cz_);
                mMGridPaper.B = 8;
                mMGridPaper.C = 15;
                mMGridPaper.setDialogMode(true);
                mMGridPaper.G = 3;
                mMGridPaper.F = 3;
                mMGridPaper.setMaxRow(3);
                mMGridPaper.setMaxCol(3);
                mMGridPaper.setHeaderView(null);
                mMGridPaper.B = 8;
                mMGridPaper.C = 15;
                mMGridPaper.setItemWidthInDp(70);
                mMGridPaper.setItemHeightInDp(70);
                k2Var.setCanceledOnTouchOutside(true);
                k2Var.setContentView(viewGroup);
                za3.b bVar = new za3.b();
                mMGridPaper.setGridPaperAdapter(bVar);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    arrayList3.add((java.lang.String) it6.next());
                }
                if (arrayList3.size() < 3) {
                    mMGridPaper.setMaxCol(arrayList3.size());
                } else {
                    mMGridPaper.setMaxCol(3);
                }
                android.view.ViewGroup.LayoutParams layoutParams = mMGridPaper.getLayoutParams();
                int b17 = i65.a.b(context, 70);
                int b18 = i65.a.b(context, 8);
                if (arrayList3.size() > 0) {
                    if (arrayList3.size() < 3) {
                        i19 = b17 * arrayList3.size();
                        i27 = b18 * (arrayList3.size() - 1);
                    } else {
                        i19 = b17 * 3;
                        i27 = b18 * 2;
                    }
                    i17 = i19 + i27;
                } else {
                    i17 = 0;
                }
                com.tencent.mm.sdk.platformtools.j.f(context);
                arrayList3.size();
                layoutParams.width = i17;
                int b19 = i65.a.b(context, 70);
                int b27 = i65.a.b(context, 15);
                if (arrayList3.size() > 0) {
                    if (arrayList3.size() > 3) {
                        if (arrayList3.size() <= 6) {
                            b19 *= 2;
                        } else {
                            b19 = (b19 * 3) + (b27 * 2);
                            b27 = i65.a.b(context, 10);
                        }
                    }
                    i18 = b19 + b27;
                } else {
                    i18 = 0;
                }
                layoutParams.height = i18;
                mMGridPaper.setLayoutParams(layoutParams);
                mMGridPaper.requestLayout();
                java.util.ArrayList arrayList4 = bVar.f470889b;
                arrayList4.clear();
                java.util.Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    arrayList4.add((java.lang.String) it7.next());
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(bVar.f228552a == null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMGridPaperAdapter", "notifyDataSetChange, notifier is null ? %B", objArr);
                db5.u2 u2Var = bVar.f228552a;
                if (u2Var != null) {
                    com.tencent.mm.ui.base.MMGridPaper mMGridPaper2 = ((db5.m2) u2Var).f228439a;
                    mMGridPaper2.f197405n = mMGridPaper2.f197406o * mMGridPaper2.f197411t * mMGridPaper2.f197412u;
                    mMGridPaper2.d();
                }
                k2Var.show();
            }
            arrayList2.size();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
