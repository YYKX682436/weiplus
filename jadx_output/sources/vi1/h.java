package vi1;

/* loaded from: classes3.dex */
public final class h implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f437325a;

    public h(yz5.l lVar) {
        this.f437325a = lVar;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        if (obj instanceof java.lang.Exception) {
            com.tencent.mars.xlog.Log.e("Luggage.FULL.CgiPhoneNumber", "CgiCheckVerifyCode " + ((java.lang.Exception) obj).getMessage());
        }
        yz5.l lVar = this.f437325a;
        if (lVar != null) {
            lVar.invoke(null);
        }
    }
}
