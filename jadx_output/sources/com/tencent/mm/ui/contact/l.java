package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class l implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f207002d;

    public l(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f207002d = addressUIFragment;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = this.f207002d;
        int i17 = 0;
        if (addressUIFragment.getString(com.tencent.mm.R.string.ibx).equals(str)) {
            addressUIFragment.f206307o.setSelection(0);
            return;
        }
        java.lang.String[] strArr = addressUIFragment.f206309q.B;
        if (strArr == null) {
            return;
        }
        if ("↑".equals(str)) {
            addressUIFragment.f206307o.setSelection(0);
            return;
        }
        if ("☆".equals(str)) {
            android.widget.ListView listView = addressUIFragment.f206307o;
            listView.setSelection(listView.getHeaderViewsCount());
            return;
        }
        while (i17 < strArr.length && (str2 = strArr[i17]) != null) {
            if (str2.equals(str)) {
                com.tencent.mm.ui.contact.e eVar = addressUIFragment.f206309q;
                int[] iArr = eVar.A;
                if (iArr != null && i17 >= 0 && i17 < iArr.length) {
                    i17 = iArr[i17];
                }
                int i18 = i17 + eVar.H;
                android.widget.ListView listView2 = addressUIFragment.f206307o;
                listView2.setSelection(i18 + listView2.getHeaderViewsCount());
                return;
            }
            i17++;
        }
    }
}
