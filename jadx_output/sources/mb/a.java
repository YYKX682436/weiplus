package mb;

/* loaded from: classes9.dex */
public class a implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mb.e f325277d;

    public a(mb.e eVar) {
        this.f325277d = eVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        mb.e eVar = this.f325277d;
        mb.d dVar = eVar.f325283d;
        if (dVar != null) {
            ((nz2.l) dVar).a(2101, -1, eVar.f325284e, -1);
        }
    }
}
