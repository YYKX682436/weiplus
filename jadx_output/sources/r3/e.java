package r3;

/* loaded from: classes13.dex */
public class e extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final r3.d f368933a;

    public e(r3.d dVar) {
        this.f368933a = dVar;
    }

    @Override // android.widget.Filter
    public java.lang.CharSequence convertResultToString(java.lang.Object obj) {
        return ((androidx.appcompat.widget.k2) this.f368933a).d((android.database.Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            r3.d r0 = r4.f368933a
            androidx.appcompat.widget.k2 r0 = (androidx.appcompat.widget.k2) r0
            if (r5 != 0) goto L9
            java.lang.String r5 = ""
            goto L10
        L9:
            r0.getClass()
            java.lang.String r5 = r5.toString()
        L10:
            androidx.appcompat.widget.SearchView r1 = r0.f9628r
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 != 0) goto L2e
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L20
            goto L2e
        L20:
            android.app.SearchableInfo r1 = r0.f9629s     // Catch: java.lang.RuntimeException -> L2e
            r2 = 50
            android.database.Cursor r5 = r0.j(r1, r5, r2)     // Catch: java.lang.RuntimeException -> L2e
            if (r5 == 0) goto L2e
            r5.getCount()     // Catch: java.lang.RuntimeException -> L2e
            goto L2f
        L2e:
            r5 = r3
        L2f:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L3f
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L44
        L3f:
            r5 = 0
            r0.count = r5
            r0.values = r3
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.e.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        r3.d dVar = this.f368933a;
        android.database.Cursor cursor = ((r3.c) dVar).f368927f;
        java.lang.Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((androidx.appcompat.widget.k2) dVar).c((android.database.Cursor) obj);
    }
}
