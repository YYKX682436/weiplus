package w51;

/* loaded from: classes15.dex */
public class h implements q51.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w51.i f442979a;

    public h(w51.i iVar) {
        this.f442979a = iVar;
    }

    @Override // q51.b
    public void onItemSelected(int i17) {
        w51.i iVar = this.f442979a;
        v51.c cVar = iVar.f442983d;
        if (cVar != null) {
            cVar.a(iVar.f442981b.getCurrentItem());
        }
    }
}
