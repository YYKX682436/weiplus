package qr;

/* loaded from: classes12.dex */
public final class w implements qr.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qr.x f366050a;

    public w(qr.x xVar) {
        this.f366050a = xVar;
    }

    @Override // qr.i
    public final void onResult(int i17, java.lang.String str) {
        qr.x xVar = this.f366050a;
        if (i17 == 0) {
            xVar.e(new qr.v(xVar));
        } else {
            xVar.a(i17);
        }
    }
}
