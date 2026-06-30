package gq1;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final gq1.p f274499a = new gq1.p();

    /* renamed from: b, reason: collision with root package name */
    public final gq1.q f274500b = new gq1.q();

    public boolean a(byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconProtocal", "dataIn is null or nil");
            return false;
        }
        a42.a aVar = new a42.a(bArr.length);
        aVar.b(bArr, 0, bArr.length);
        boolean a17 = this.f274499a.a(aVar);
        return !a17 ? a17 : this.f274500b.a(aVar);
    }
}
