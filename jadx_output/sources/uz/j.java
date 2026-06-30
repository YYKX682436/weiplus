package uz;

/* loaded from: classes8.dex */
public class j implements m43.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uz.m f432060a;

    public j(uz.m mVar) {
        this.f432060a = mVar;
    }

    @Override // m43.b
    public void a() {
        if (nv1.a.f340429a == null) {
            synchronized (nv1.a.f340430b) {
                if (nv1.a.f340429a == null) {
                    nv1.a.f340429a = new com.tencent.mm.sdk.platformtools.n3("CDNDownloader#WorkThread");
                }
            }
        }
        nv1.a.f340429a.postDelayed(new uz.i(this), 0L);
    }
}
