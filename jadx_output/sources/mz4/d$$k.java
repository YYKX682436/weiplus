package mz4;

/* loaded from: classes12.dex */
public final /* synthetic */ class d$$k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.d f333263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f333264e;

    public /* synthetic */ d$$k(mz4.d dVar, boolean z17) {
        this.f333263d = dVar;
        this.f333264e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lz4.a aVar;
        mz4.d dVar = this.f333263d;
        boolean z17 = this.f333264e;
        boolean z18 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.List list = dVar.f333229a;
        objArr[0] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", "clear mDataList, size:%d", objArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[clear] stack = ");
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(com.tencent.mm.sdk.platformtools.z3.b(true));
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", sb6.toString());
        synchronized (dVar) {
            java.util.List list2 = dVar.f333229a;
            if (list2 != null) {
                list2.clear();
            } else {
                z18 = false;
            }
        }
        dVar.f333234f = 0;
        dVar.f333233e = 0;
        if (z18 && z17 && (aVar = dVar.f333230b) != null) {
            ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).t7();
        }
    }
}
