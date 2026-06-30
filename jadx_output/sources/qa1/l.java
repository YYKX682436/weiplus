package qa1;

/* loaded from: classes14.dex */
public class l implements qa1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa1.m f361004a;

    public l(qa1.m mVar) {
        this.f361004a = mVar;
    }

    @Override // qa1.o
    public void onDone() {
        qa1.m mVar = this.f361004a;
        int i17 = mVar.f361005d;
        qa1.p pVar = mVar.f361009h;
        if (i17 == 0) {
            pVar.f361011g = new qa1.a(pVar);
        } else {
            int i18 = qa1.p.f361010p;
            if ((i17 & 1) > 0) {
                if ((i17 & 2) > 0) {
                    throw new java.lang.IllegalArgumentException("not support live and record at same time now");
                }
            }
            if ((i17 & 2) > 0) {
                pVar.f361011g = new qa1.w(pVar);
            } else {
                if (!((i17 & 1) > 0)) {
                    throw new java.lang.IllegalArgumentException("invalid flag");
                }
                pVar.f361011g = new qa1.f0(pVar);
            }
        }
        pVar.f361011g.init();
        pVar.f361011g.A(pVar.f361012h, new qa1.k(this));
    }
}
