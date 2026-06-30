package gq5;

/* loaded from: classes5.dex */
public final class a implements aq5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gq5.e f274615a;

    public a(gq5.e eVar) {
        this.f274615a = eVar;
    }

    @Override // aq5.q0
    public void a() {
        gq5.e eVar = this.f274615a;
        com.tencent.mars.xlog.Log.i(eVar.T6(), "onConnected() called");
        eVar.V6();
    }

    @Override // aq5.q0
    public void b(int i17, byte[] data, r45.y77 fileInfo) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(fileInfo, "fileInfo");
        gq5.e eVar = this.f274615a;
        com.tencent.mars.xlog.Log.i(eVar.T6(), "onReceiveFile() called, fileIndex: " + i17 + ", dataSize: " + data.length);
        eVar.Z6(i17, data, fileInfo);
    }

    @Override // aq5.q0
    public void c(bw5.ge0 userInfo) {
        kotlin.jvm.internal.o.g(userInfo, "userInfo");
        com.tencent.mars.xlog.Log.w(this.f274615a.T6(), "onConnectStart() called, " + userInfo.getHeadImgUrl() + ", " + userInfo.getNickName());
    }

    @Override // aq5.q0
    public void d() {
        gq5.e eVar = this.f274615a;
        com.tencent.mars.xlog.Log.i(eVar.T6(), "onPrepareSendFileOk() called");
        eVar.Y6();
    }

    @Override // aq5.q0
    public void e(int i17, byte[] data, r45.y77 fileInfo) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(fileInfo, "fileInfo");
        gq5.e eVar = this.f274615a;
        com.tencent.mars.xlog.Log.i(eVar.T6(), "onSendFile() called, fileIndex: " + i17 + ", dataSize: " + data.length);
        eVar.a7(i17, data, fileInfo);
    }

    @Override // aq5.q0
    public void f(r45.b87 prepareSendRequest, int i17) {
        kotlin.jvm.internal.o.g(prepareSendRequest, "prepareSendRequest");
        gq5.e eVar = this.f274615a;
        com.tencent.mars.xlog.Log.i(eVar.T6(), "onPrepareSend() called prepareErrorCode:" + i17);
        eVar.X6(prepareSendRequest, i17);
    }

    @Override // aq5.q0
    public void g(int i17) {
        gq5.e eVar = this.f274615a;
        com.tencent.mars.xlog.Log.i(eVar.T6(), "onDisconnect() called, errorCode: " + i17);
        j75.f Q6 = eVar.Q6();
        eq5.h hVar = Q6 != null ? (eq5.h) Q6.getState() : null;
        if (hVar != null) {
            hVar.getClass();
        }
        eVar.W6(i17);
    }
}
