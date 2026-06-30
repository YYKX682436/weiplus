package jp3;

/* loaded from: classes12.dex */
public final class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301003b;

    public i(java.lang.String str, java.lang.String str2) {
        this.f301002a = str;
        this.f301003b = str2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        byte[] initialProtobufBytes;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        jp3.t tVar = jp3.t.f301029a;
        java.lang.String str = this.f301002a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f70616b);
        java.lang.String str2 = fVar.f70617c;
        r45.ru6 ru6Var = (r45.ru6) fVar.f70618d;
        tVar.c("uploadonlineopenresource", str, valueOf, str2, (ru6Var == null || (initialProtobufBytes = ru6Var.initialProtobufBytes()) == null) ? null : java.lang.Integer.valueOf(initialProtobufBytes.length));
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintLogic", "[doUploadFailResult] cgi resp: " + fVar);
        java.lang.String str3 = this.f301003b;
        if (str3 == null || str3.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[deleteFile] error, path is empty!");
        } else if (com.tencent.mm.vfs.w6.j(str3)) {
            com.tencent.mm.vfs.w6.h(str3);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[deleteFile] error, file is not exits, path: " + str3 + '!');
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintLogic", "[doUploadFailResult] cgi failed, errCode: " + fVar.f70616b);
        }
        return jz5.f0.f302826a;
    }
}
