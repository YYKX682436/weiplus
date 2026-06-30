package i81;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i81.q f289602e;

    public m(i81.q qVar, java.lang.String str) {
        this.f289602e = qVar;
        this.f289601d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        i81.q qVar = this.f289602e;
        i81.p pVar = qVar.f289609h;
        if (pVar != null) {
            pVar.a(this.f289601d);
        }
        qVar.setVisibility(8);
    }
}
