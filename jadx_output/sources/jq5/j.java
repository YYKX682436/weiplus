package jq5;

/* loaded from: classes5.dex */
public final class j implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jq5.m f301275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f301276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f301277c;

    public j(jq5.m mVar, kotlinx.coroutines.q qVar, android.content.Context context) {
        this.f301275a = mVar;
        this.f301276b = qVar;
        this.f301277c = context;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.o.d(iArr);
        int length = iArr.length;
        boolean z17 = false;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                break;
            }
            if (iArr[i18] != 0) {
                z17 = true;
                break;
            }
            i18++;
        }
        kotlinx.coroutines.q qVar = this.f301276b;
        jq5.m mVar = this.f301275a;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.WeDropPermissionManager", "[handlePermissionResult] permission=" + mVar.f301279a + " granted");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WeDrop.WeDropPermissionManager", "[handlePermissionResult] permission=" + mVar.f301279a + " not granted");
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        jq5.l.a(jq5.n.f301282a, this.f301277c, mVar);
    }
}
