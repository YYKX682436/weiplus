package ei3;

/* loaded from: classes14.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.u f253118d;

    public r(ei3.u uVar) {
        this.f253118d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f253118d.f253143t == null) {
            return;
        }
        ei3.u uVar = this.f253118d;
        uVar.E = true;
        uVar.m();
    }
}
