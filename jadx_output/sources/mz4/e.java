package mz4;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f333273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz4.d f333274f;

    public e(mz4.d dVar, java.lang.String str, java.util.ArrayList arrayList) {
        this.f333274f = dVar;
        this.f333272d = str;
        this.f333273e = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        mz4.d dVar = this.f333274f;
        hz4.r b17 = hz4.s.b(dVar.f333229a, this.f333272d, this.f333273e, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", "updateDataByHtml, mDataList size = " + dVar.f333229a.size() + ", dataListEmpty = " + (dVar.f333229a == null));
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", "updateDataByHtml, start mNotifyListener.setUpNoteData(dataItems, true)");
        lz4.a aVar = dVar.f333230b;
        if (aVar != null) {
            ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).B7(b17, true);
        }
    }
}
