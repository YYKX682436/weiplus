package o72;

/* loaded from: classes.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f343332d;

    public e3(o72.i3 i3Var, byte[] bArr) {
        this.f343332d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.u().c().w(225283, com.tencent.mm.sdk.platformtools.t8.l(this.f343332d));
    }

    public java.lang.String toString() {
        return super.toString() + "|save";
    }
}
