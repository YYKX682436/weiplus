package p53;

/* loaded from: classes5.dex */
public class t implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        a43.k kVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        synchronized (a43.k.class) {
            if (a43.k.f1222c == null) {
                a43.k.f1222c = new a43.k();
            }
            kVar = a43.k.f1222c;
        }
        kVar.a(bundle.getString("url"), bundle.getString("savePath"), 0, new p53.s(this, rVar));
    }
}
