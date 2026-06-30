package er;

/* loaded from: classes12.dex */
public final class i implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er.j f255939d;

    public i(er.j jVar) {
        this.f255939d = jVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        this.f255939d.f(bundle != null ? bundle.getBoolean("KEY_RESULT", false) : false);
    }
}
