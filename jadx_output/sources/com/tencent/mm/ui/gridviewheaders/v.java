package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes12.dex */
public final class v extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.gridviewheaders.x f208760a;

    public v(com.tencent.mm.ui.gridviewheaders.x xVar, com.tencent.mm.ui.gridviewheaders.u uVar) {
        this.f208760a = xVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.gridviewheaders.x xVar = this.f208760a;
        xVar.f208764e = xVar.a(xVar.f208763d);
        xVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.tencent.mm.ui.gridviewheaders.x xVar = this.f208760a;
        xVar.f208764e = xVar.a(xVar.f208763d);
        xVar.notifyDataSetInvalidated();
    }
}
