package lj1;

/* loaded from: classes3.dex */
public final class c implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f318813a;

    public c(yz5.p pVar) {
        this.f318813a = pVar;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        if (obj instanceof java.lang.Exception) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiCheckWxaShortLink", "checkAsync exception" + ((java.lang.Exception) obj).getMessage());
        }
        this.f318813a.invoke(java.lang.Boolean.FALSE, null);
    }
}
