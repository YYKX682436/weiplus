package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes15.dex */
public class r extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.gridviewheaders.s f208758a;

    public r(com.tencent.mm.ui.gridviewheaders.s sVar) {
        this.f208758a = sVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f208758a.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f208758a.notifyDataSetInvalidated();
    }
}
