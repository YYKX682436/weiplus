package to1;

/* loaded from: classes5.dex */
public final class e implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ro1.h f420909a;

    public e(ro1.h hVar) {
        this.f420909a = hVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("deviceId") : null;
        ro1.h hVar = this.f420909a;
        if (i17 != 0) {
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                hVar.a(stringExtra);
                return;
            }
        }
        hVar.onFailed(-2);
    }
}
