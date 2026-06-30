package x51;

/* loaded from: classes5.dex */
public class x implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m3.a f452108a;

    public x(m3.a aVar) {
        this.f452108a = aVar;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        int i18 = iArr[0];
        m3.a aVar = this.f452108a;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExportFileUtil", "[+] onPermissionGranted");
            aVar.accept(java.lang.Boolean.TRUE);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExportFileUtil", "[-] onPermissionGranted");
            aVar.accept(java.lang.Boolean.FALSE);
        }
    }
}
