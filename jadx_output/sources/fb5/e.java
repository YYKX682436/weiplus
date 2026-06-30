package fb5;

/* loaded from: classes12.dex */
public abstract class e extends android.widget.BaseAdapter implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f260885d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f260886e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f260887f;

    public e(android.content.Context context) {
        if (context == null) {
            throw new java.lang.NullPointerException("context is null.");
        }
        this.f260886e = context;
        this.f260885d = new android.util.SparseArray();
        this.f260887f = new fb5.d(this);
    }

    public abstract java.lang.Object[] a(int i17);

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public fb5.c getItem(int i17) {
        fb5.c cVar = null;
        if (i17 < 0 || i17 > getCount()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseMutilDataItemAdapter", "The given position(%d) is illegal.", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.util.SparseArray sparseArray = this.f260885d;
        fb5.c cVar2 = (fb5.c) sparseArray.get(i17);
        if (cVar2 == null) {
            or1.m mVar = (or1.m) this;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) mVar.f347527g;
                if (i18 >= arrayList.size()) {
                    cVar2 = new or1.n2(null);
                    break;
                }
                or1.k kVar = (or1.k) arrayList.get(i18);
                int m17 = mVar.m(kVar);
                i19 += m17;
                if (!kVar.f347519f || i17 != i19 - m17) {
                    boolean z17 = kVar.f347520g;
                    if (z17 && i17 == i19 - 1) {
                        cVar2 = new or1.y1(null, kVar.f347514a, kVar.f347515b, mVar.f347530m);
                        break;
                    }
                    if (i17 < i19) {
                        int i27 = (i17 - i19) + kVar.f347515b + (z17 ? 1 : 0);
                        r45.xp xpVar = (r45.xp) ((java.util.LinkedList) kVar.f347518e).get(i27);
                        long j17 = kVar.f347514a;
                        or1.l lVar = mVar.f347536s;
                        if (xpVar == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BizSearchResultAdapter", "data is null.");
                        } else {
                            cVar = j17 == 1 ? new or1.c(xpVar) : j17 == 4 ? new or1.n2(xpVar) : j17 == 1073741824 ? new or1.n2(xpVar) : new or1.n2(xpVar);
                            if (cVar instanceof pr1.a) {
                                pr1.a aVar = (pr1.a) cVar;
                                aVar.f357932f = i27;
                                aVar.f357931e = i17;
                                aVar.f357933g = lVar;
                            }
                        }
                        cVar2 = cVar;
                    } else {
                        i18++;
                    }
                } else {
                    r45.qp qpVar = ((java.util.LinkedList) kVar.f347521h).size() == 0 ? null : (r45.qp) ((java.util.LinkedList) kVar.f347521h).get(0);
                    if (qpVar != null) {
                        cVar2 = new or1.c0(qpVar.f384156f);
                        break;
                    }
                    i18++;
                }
            }
            sparseArray.put(i17, cVar2);
        }
        return cVar2;
    }

    @Override // android.widget.Adapter
    public abstract int getCount();

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (getItem(i17) == null) {
            getCount();
            return 0;
        }
        if (getItem(i17) == null) {
            return 0;
        }
        return getItem(i17).f260881a;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fb5.a aVar;
        java.lang.System.currentTimeMillis();
        fb5.c item = getItem(i17);
        if (item == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseMutilDataItemAdapter", "DataItem is null.");
            return view;
        }
        java.lang.System.currentTimeMillis();
        fb5.b c17 = item.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseMutilDataItemAdapter", "ViewItem is null.");
            return view;
        }
        android.content.Context context = this.f260886e;
        if (view == null) {
            view = c17.c(context, viewGroup, view);
            aVar = item.b();
            c17.a(view, aVar);
            view.setTag(aVar);
        } else {
            aVar = (fb5.a) view.getTag();
        }
        java.lang.Object[] a17 = a(i17);
        iz5.a.d(null, aVar);
        if (!item.f260883c) {
            item.a(context, aVar, a17);
        }
        java.lang.System.currentTimeMillis();
        c17.b(context, aVar, item, a17);
        java.lang.System.currentTimeMillis();
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 7;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/sortview/BaseMultiDataItemAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        fb5.c item = getItem(i17);
        if (item == null) {
            yj0.a.h(this, "com/tencent/mm/ui/base/sortview/BaseMultiDataItemAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        fb5.b c17 = item.c();
        if (c17 == null) {
            yj0.a.h(this, "com/tencent/mm/ui/base/sortview/BaseMultiDataItemAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else if (c17.d(this.f260886e, view, item, a(i17))) {
            yj0.a.h(this, "com/tencent/mm/ui/base/sortview/BaseMultiDataItemAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            yj0.a.h(this, "com/tencent/mm/ui/base/sortview/BaseMultiDataItemAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
