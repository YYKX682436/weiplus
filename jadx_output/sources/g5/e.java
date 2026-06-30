package g5;

/* loaded from: classes13.dex */
public class e extends g5.d {
    public e(android.content.Context context, m5.a aVar) {
        super(h5.j.a(context, aVar).f279000c);
    }

    @Override // g5.d
    public boolean a(j5.w wVar) {
        return wVar.f297773j.f1385a == a5.b0.CONNECTED;
    }

    @Override // g5.d
    public boolean b(java.lang.Object obj) {
        f5.b bVar = (f5.b) obj;
        return android.os.Build.VERSION.SDK_INT >= 26 ? (bVar.f259568a && bVar.f259569b) ? false : true : true ^ bVar.f259568a;
    }
}
