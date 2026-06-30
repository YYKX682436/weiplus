package g30;

/* loaded from: classes9.dex */
public class b implements qr.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g30.e f268021a;

    public b(g30.e eVar) {
        this.f268021a = eVar;
    }

    @Override // qr.i
    public void onResult(int i17, java.lang.String str) {
        g30.e eVar = this.f268021a;
        if (i17 == 0) {
            eVar.wi();
        } else {
            eVar.Bi(5);
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiBypService", "uploadCDN error");
        }
    }
}
