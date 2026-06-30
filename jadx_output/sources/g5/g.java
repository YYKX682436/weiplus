package g5;

/* loaded from: classes13.dex */
public class g extends g5.d {
    static {
        a5.a0.e("NetworkNotRoamingCtrlr");
    }

    public g(android.content.Context context, m5.a aVar) {
        super(h5.j.a(context, aVar).f279000c);
    }

    @Override // g5.d
    public boolean a(j5.w wVar) {
        return wVar.f297773j.f1385a == a5.b0.NOT_ROAMING;
    }

    @Override // g5.d
    public boolean b(java.lang.Object obj) {
        f5.b bVar = (f5.b) obj;
        return (bVar.f259568a && bVar.f259571d) ? false : true;
    }
}
