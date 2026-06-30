package ir2;

/* loaded from: classes2.dex */
public final class l1 extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f294174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f294175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f294176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f294177d;

    public l1(java.util.List list, java.util.List list2, ir2.p1 p1Var, java.util.Map map) {
        this.f294174a = list;
        this.f294175b = list2;
        this.f294176c = p1Var;
        this.f294177d = map;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        java.util.Set keySet;
        boolean z17 = false;
        java.util.Map map = this.f294177d;
        if (map != null && (keySet = map.keySet()) != null && keySet.contains(java.lang.Integer.valueOf(i18))) {
            z17 = true;
        }
        boolean z18 = !z17;
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", "areContentsTheSame oldItemPosition:" + i17 + " newItemPosition:" + i18 + " isSame:" + z18);
        return z18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (((com.tencent.mm.plugin.finder.model.BaseFinderFeed) r3).getFeedObject().field_id == r2.getFeedObject().field_id) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0090, code lost:
    
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", "areItemsTheSame oldItemPosition:" + r9 + " newItemPosition:" + r10 + " isSame:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r3.getFeedObject().getLocalId() == r2.getFeedObject().getLocalId()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r0.getItemId() == r1.getItemId()) goto L22;
     */
    @Override // androidx.recyclerview.widget.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(int r9, int r10) {
        /*
            r8 = this;
            java.util.List r0 = r8.f294174a
            java.lang.Object r0 = r0.get(r9)
            ir2.i1 r0 = (ir2.i1) r0
            java.util.List r1 = r8.f294175b
            java.lang.Object r1 = r1.get(r10)
            so2.j5 r1 = (so2.j5) r1
            ir2.p1 r2 = r8.f294176c
            r2.getClass()
            so2.j5 r2 = r0.f294154d
            boolean r3 = r2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L81
            boolean r3 = r1 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L81
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.getFeedObject()
            long r2 = r2.field_id
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            so2.j5 r3 = r0.f294154d
            if (r2 == 0) goto L4f
            r2 = r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r2.getFeedObject()
            long r6 = r6.field_id
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L4f
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.getFeedObject()
            long r0 = r0.field_id
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.getFeedObject()
            long r2 = r2.field_id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L8f
            goto L8d
        L4f:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.getFeedObject()
            long r6 = r2.getLocalId()
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L81
            r2 = r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r2.getFeedObject()
            long r6 = r6.getLocalId()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L81
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.getFeedObject()
            long r0 = r0.getLocalId()
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.getFeedObject()
            long r2 = r2.getLocalId()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L8f
            goto L8d
        L81:
            long r2 = r0.getItemId()
            long r0 = r1.getItemId()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L8f
        L8d:
            r0 = 1
            goto L90
        L8f:
            r0 = 0
        L90:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "areItemsTheSame oldItemPosition:"
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " newItemPosition:"
            r1.append(r9)
            r1.append(r10)
            java.lang.String r9 = " isSame:"
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            java.lang.String r10 = "Finder.DataMerger"
            com.tencent.mars.xlog.Log.i(r10, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ir2.l1.b(int, int):boolean");
    }

    @Override // androidx.recyclerview.widget.b0
    public java.lang.Object c(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getChangePayload oldItemPosition:");
        sb6.append(i17);
        sb6.append(" newItemPosition:");
        sb6.append(i18);
        sb6.append(" payload:");
        java.util.Map map = this.f294177d;
        sb6.append(map != null ? map.get(java.lang.Integer.valueOf(i18)) : null);
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", sb6.toString());
        if (map != null) {
            return map.get(java.lang.Integer.valueOf(i18));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getNewListSize: ");
        java.util.List list = this.f294175b;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", sb6.toString());
        return list.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getOldListSize: ");
        java.util.List list = this.f294174a;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", sb6.toString());
        return list.size();
    }
}
