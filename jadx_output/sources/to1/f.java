package to1;

/* loaded from: classes5.dex */
public final class f implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo1.o f420910a;

    public f(fo1.o oVar) {
        this.f420910a = oVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        fo1.n nVar;
        if (i17 != -1 || intent == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[permissionRegain] resultCode is ");
            sb6.append(i17);
            sb6.append(", dataIsNull=");
            sb6.append(intent == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SAFUDiskDevice", sb6.toString());
            nVar = fo1.n.f264888h;
        } else {
            java.io.Serializable serializableExtra = intent.getSerializableExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            com.tencent.mars.xlog.Log.i("MicroMsg.SAFUDiskDevice", "[permissionRegain] errorCode = " + serializableExtra);
            nVar = serializableExtra instanceof fo1.n ? (fo1.n) serializableExtra : null;
            if (nVar == null) {
                nVar = fo1.n.f264888h;
            }
        }
        this.f420910a.a(nVar);
    }
}
