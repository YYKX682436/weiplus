package qn2;

/* loaded from: classes3.dex */
public final class c0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f365047d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f365048e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cz1 f365049f;

    public c0(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f365047d = liveData;
        this.f365048e = new java.util.LinkedList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f365048e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f488920au3, null);
        kotlin.jvm.internal.o.d(inflate);
        return new qn2.b0(this, inflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x03c6, code lost:
    
        if (r2.getBoolean(1) != true) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0411  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1, types: [rn2.x2] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v35 */
    @Override // androidx.recyclerview.widget.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(qn2.b0 r23, int r24) {
        /*
            Method dump skipped, instructions count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.c0.onBindViewHolder(qn2.b0, int):void");
    }

    public final void y(java.util.LinkedList linkedList, r45.cz1 cz1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWinnerList,ori size:");
        java.util.LinkedList linkedList2 = this.f365048e;
        sb6.append(linkedList2.size());
        sb6.append(",new size:");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.LiveLotteryWinnerListAdapter", sb6.toString());
        this.f365049f = cz1Var;
        linkedList2.clear();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add((r45.zy1) it.next());
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        qn2.b0 holder = (qn2.b0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        com.tencent.mars.xlog.Log.i("Finder.LiveLotteryWinnerListAdapter", "onBindViewHolder payload, pos:" + i17 + ",payloads:" + payloads);
        if (!payloads.isEmpty()) {
            java.util.Iterator it = payloads.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        onBindViewHolder(holder, i17);
    }
}
