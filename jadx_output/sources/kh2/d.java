package kh2;

/* loaded from: classes10.dex */
public final class d implements com.tme.karaoke.lib_singscore.IAllGroveCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f307995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kh2.l f307996b;

    public d(yz5.l lVar, kh2.l lVar2) {
        this.f307995a = lVar;
        this.f307996b = lVar2;
    }

    @Override // com.tme.karaoke.lib_singscore.IAllGroveCallback
    public void allGrove(com.tme.karaoke.lib_singscore.NoteItem[] noteItemArr) {
        java.util.ArrayList arrayList;
        jh2.b bVar;
        if (noteItemArr != null) {
            arrayList = new java.util.ArrayList(noteItemArr.length);
            for (com.tme.karaoke.lib_singscore.NoteItem noteItem : noteItemArr) {
                this.f307996b.getClass();
                if (noteItem == null) {
                    bVar = new jh2.b();
                } else {
                    jh2.b bVar2 = new jh2.b();
                    bVar2.f299803a = noteItem.startTime;
                    bVar2.f299804b = noteItem.duration;
                    bVar2.f299805c = noteItem.endTime;
                    bVar2.f299806d = noteItem.height;
                    bVar = bVar2;
                }
                arrayList.add(bVar);
            }
        } else {
            arrayList = null;
        }
        kotlin.jvm.internal.o.e(arrayList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.live.ktv.score.IKTVSongScoreCore.NoteItem>");
        yz5.l lVar = this.f307995a;
        if (lVar != null) {
            lVar.invoke(arrayList);
        }
    }
}
