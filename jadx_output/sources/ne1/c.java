package ne1;

/* loaded from: classes7.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne1.d f336514d;

    public c(ne1.d dVar) {
        this.f336514d = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ne1.e eVar = this.f336514d.f336516e;
        eVar.f336517a.a(eVar.f336518b, eVar.f336519c.o("fail user canceled updateApp"));
    }
}
