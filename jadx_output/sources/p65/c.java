package p65;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {
    public c(p65.a aVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        fs.k2 k2Var = fs.k2.INSTANCE;
        k2Var.a(fs.n.class);
        java.util.Iterator it = k2Var.a(com.tencent.mm.sdk.event.n.class).all().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
