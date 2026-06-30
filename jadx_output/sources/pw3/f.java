package pw3;

/* loaded from: classes8.dex */
public class f extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f358699a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pw3.h f358700b;

    public f(pw3.h hVar, pw3.e eVar) {
        this.f358700b = hVar;
    }

    @Override // android.widget.Filter
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        java.util.List list = this.f358699a;
        ((java.util.ArrayList) list).clear();
        pw3.h hVar = this.f358700b;
        ((java.util.ArrayList) hVar.f358706f).clear();
        for (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel : hVar.f358704d) {
            if (!com.tencent.mm.sdk.platformtools.t8.J0(charSequence) && transferRecordParcel.f156475i.contains(charSequence)) {
                java.lang.String str = transferRecordParcel.f156475i;
                int indexOf = str.indexOf((java.lang.String) charSequence);
                int length = charSequence.length() + indexOf;
                com.tencent.mars.xlog.Log.i("MicroMsg.PayeeAutoCompleteAdapter", "match payee: %s, start: %s, end: %s", str, java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(length));
                ((java.util.ArrayList) hVar.f358706f).add(new android.util.Pair(java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(length)));
                ((java.util.ArrayList) list).add(transferRecordParcel);
            }
        }
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        filterResults.count = ((java.util.ArrayList) list).size();
        filterResults.values = list;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        java.util.List list = (java.util.List) filterResults.values;
        pw3.h hVar = this.f358700b;
        hVar.f358705e = list;
        com.tencent.mars.xlog.Log.i("MicroMsg.PayeeAutoCompleteAdapter", "match count: %d", java.lang.Integer.valueOf(list.size()));
        hVar.notifyDataSetChanged();
    }
}
