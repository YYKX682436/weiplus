package r3;

/* loaded from: classes13.dex */
public class b extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3.c f368924a;

    public b(r3.c cVar) {
        this.f368924a = cVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        r3.c cVar = this.f368924a;
        cVar.f368925d = true;
        cVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        r3.c cVar = this.f368924a;
        cVar.f368925d = false;
        cVar.notifyDataSetInvalidated();
    }
}
