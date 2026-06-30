package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes15.dex */
public class c extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.gridviewheaders.h f208730a;

    public c(com.tencent.mm.ui.gridviewheaders.h hVar) {
        this.f208730a = hVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.gridviewheaders.h hVar = this.f208730a;
        hVar.f208743f = 0;
        com.tencent.mm.ui.gridviewheaders.b bVar = hVar.f208741d;
        int e17 = bVar.e();
        if (e17 == 0) {
            hVar.f208743f = bVar.getCount();
        } else {
            for (int i17 = 0; i17 < e17; i17++) {
                hVar.f208743f += bVar.b(i17) + hVar.f208746i;
            }
        }
        hVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.tencent.mm.ui.gridviewheaders.h hVar = this.f208730a;
        ((java.util.ArrayList) hVar.f208745h).clear();
        hVar.notifyDataSetInvalidated();
    }
}
