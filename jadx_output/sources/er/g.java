package er;

/* loaded from: classes5.dex */
public final class g implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f255938a;

    public g(com.tencent.mm.ipcinvoker.r rVar) {
        this.f255938a = rVar;
    }

    @Override // dr.q
    public void a(boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("KEY_RESULT", z17);
        com.tencent.mm.ipcinvoker.r rVar = this.f255938a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
