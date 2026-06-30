package ns4;

/* loaded from: classes8.dex */
public final class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms4.a f339588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339589e;

    public m(ms4.a aVar, ns4.s sVar) {
        this.f339588d = aVar;
        this.f339589e = sVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        js4.n nVar;
        js4.o oVar;
        ms4.a aVar = this.f339588d;
        if (aVar == null || (nVar = this.f339589e.f339637b) == null || (oVar = nVar.f301546d) == null) {
            return;
        }
        java.lang.String str = aVar.f330997c;
        if (str == null) {
            str = "";
        }
        oVar.a(aVar.f330995a, aVar.f330996b, str);
    }
}
