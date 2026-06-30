package zm5;

/* loaded from: classes3.dex */
public final class k implements db5.d8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zm5.l f474230a;

    public k(zm5.l lVar) {
        this.f474230a = lVar;
    }

    @Override // db5.d8
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryPageUIC", "SingClickOver");
        zm5.l lVar = this.f474230a;
        if (lVar.f474240n) {
            lVar.getActivity().finish();
        }
    }

    @Override // db5.d8
    public void b() {
    }
}
