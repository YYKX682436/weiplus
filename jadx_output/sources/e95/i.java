package e95;

/* loaded from: classes11.dex */
public class i extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e95.j f250420a;

    public i(e95.j jVar) {
        this.f250420a = jVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        ((com.tencent.wcdb.AbstractCursor) this.f250420a).mPos = -1;
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        ((com.tencent.wcdb.AbstractCursor) this.f250420a).mPos = -1;
    }
}
