package mz4;

/* loaded from: classes12.dex */
public final /* synthetic */ class d$$g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.d f333250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f333252f;

    public /* synthetic */ d$$g(mz4.d dVar, int i17, boolean z17) {
        this.f333250d = dVar;
        this.f333251e = i17;
        this.f333252f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lz4.a aVar;
        mz4.d dVar = this.f333250d;
        java.util.List list = dVar.f333229a;
        int i17 = this.f333251e;
        if (list != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", "[removeWithOutSync] , mDataList = " + dVar.f333229a + ", position = " + i17 + ", mDataList size = " + dVar.f333229a.size());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", "[removeWithOutSync] , mDataList = " + dVar.f333229a + ", position = " + i17);
        }
        java.util.List list2 = dVar.f333229a;
        boolean z17 = false;
        if (list2 != null && i17 >= 0 && i17 < list2.size()) {
            dVar.E((iz4.c) dVar.f333229a.get(i17), false);
            dVar.f333229a.remove(i17);
            z17 = true;
        }
        if (z17 && this.f333252f && (aVar = dVar.f333230b) != null) {
            ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).x1(i17);
            if (i17 <= 0) {
                ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) dVar.f333230b).u7(i17, dVar.f333229a.size() - i17);
            } else {
                int i18 = i17 - 1;
                ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) dVar.f333230b).u7(i18, dVar.f333229a.size() - i18);
            }
        }
    }
}
