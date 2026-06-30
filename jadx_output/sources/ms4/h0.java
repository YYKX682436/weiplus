package ms4;

/* loaded from: classes8.dex */
public final class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms4.a f331039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ js4.o f331040e;

    public h0(ms4.a aVar, js4.o oVar) {
        this.f331039d = aVar;
        this.f331040e = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        js4.o oVar;
        ms4.a aVar = this.f331039d;
        if (aVar == null || (oVar = this.f331040e) == null) {
            return;
        }
        java.lang.String str = aVar.f330997c;
        if (str == null) {
            str = "";
        }
        oVar.a(aVar.f330995a, aVar.f330996b, str);
    }
}
