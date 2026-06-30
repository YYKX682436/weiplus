package l01;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l01.i f314771d;

    public h(l01.i iVar) {
        this.f314771d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.i iVar = this.f314771d;
        byte[] g17 = iVar.f314776f.g(iVar.f314774d);
        l01.t tVar = iVar.f314775e;
        if (tVar != null) {
            tVar.a(g17);
        }
    }
}
