package fi3;

/* loaded from: classes10.dex */
public class b implements fi3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fi3.e f262953a;

    public b(fi3.e eVar) {
        this.f262953a = eVar;
    }

    @Override // fi3.p
    public void a(byte[] bArr, boolean z17, long j17) {
        fi3.e eVar = this.f262953a;
        if (eVar.f262975v == null) {
            int i17 = pu5.i.f358473b;
            eVar.f262975v = pu5.f.a("remuxer_encode", -2);
            eVar.f262975v.start();
            eVar.f262976w = new fi3.d(eVar, eVar.f262975v.getLooper());
        }
        if (eVar.f262976w != null) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            byte[] m17 = bArr != null ? ei3.x.f253187d.m(java.lang.Integer.valueOf(bArr.length)) : null;
            if (m17 != null) {
                java.lang.System.arraycopy(bArr, 0, m17, 0, m17.length);
            }
            obtain.obj = m17;
            obtain.arg1 = z17 ? 1 : 0;
            obtain.arg2 = (int) j17;
            eVar.f262976w.sendMessage(obtain);
        }
    }
}
