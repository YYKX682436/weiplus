package w21;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f442424d;

    public l(w21.k kVar, com.tencent.mm.storage.f9 f9Var) {
        this.f442424d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.v8 v8Var = w21.k.f442400u;
        if (v8Var != null) {
            v8Var.a(this.f442424d);
        }
    }
}
