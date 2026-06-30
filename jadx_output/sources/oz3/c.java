package oz3;

/* loaded from: classes12.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oz3.e f350254a;

    public c(oz3.e eVar) {
        this.f350254a = eVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeOcrNormalReporter", "scanCodeReportOcrNormal callback codeContent: " + this.f350254a.f350259c + ", errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b);
        return jz5.f0.f302826a;
    }
}
