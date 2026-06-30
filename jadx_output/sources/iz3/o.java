package iz3;

/* loaded from: classes12.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry3.q f296091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ry3.q qVar) {
        super(1);
        this.f296091d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ry3.o oVar;
        iz3.j jVar = (iz3.j) obj;
        if (jVar != null) {
            jz5.g gVar = kz3.d.f313872a;
            ry3.q qVar = this.f296091d;
            java.lang.String valueOf = java.lang.String.valueOf(qVar.f401543a);
            kz3.a aVar = new kz3.a();
            ry3.p pVar = jVar.f296084a;
            java.lang.String str = (pVar == null || (oVar = pVar.f401541o) == null) ? null : oVar.f401526a;
            if (str == null) {
                str = "";
            }
            aVar.f313864a = str;
            java.lang.String str2 = qVar.f401552j;
            aVar.f313865b = str2 != null ? str2 : "";
            boolean z17 = true;
            aVar.f313866c = 1;
            if (valueOf != null && valueOf.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                kz3.d.f313873b.put(valueOf, aVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
