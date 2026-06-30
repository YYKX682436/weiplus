package r3;

/* loaded from: classes13.dex */
public class a extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3.c f368923a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r3.c cVar) {
        super(new android.os.Handler());
        this.f368923a = cVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        android.database.Cursor cursor;
        r3.c cVar = this.f368923a;
        if (!cVar.f368926e || (cursor = cVar.f368927f) == null || cursor.isClosed()) {
            return;
        }
        cVar.f368925d = cVar.f368927f.requery();
    }
}
