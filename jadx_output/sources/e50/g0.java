package e50;

/* loaded from: classes15.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e50.z0 f249494d;

    public g0(e50.z0 z0Var) {
        this.f249494d = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        io.flutter.embedding.engine.dart.DartExecutor dartExecutor;
        e50.z0 z0Var = this.f249494d;
        pi0.q qVar = z0Var.f249558e;
        if (qVar == null || (flutterEngine = qVar.f354701e) == null || (dartExecutor = flutterEngine.getDartExecutor()) == null) {
            return;
        }
        e50.m1 Di = z0Var.Di();
        Di.getClass();
        Di.f249522a = dartExecutor;
        java.util.ArrayList arrayList = (java.util.ArrayList) Di.f249523b;
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e50.l1 l1Var = (e50.l1) it.next();
                dartExecutor.send(l1Var.f249518a, l1Var.f249519b, l1Var.f249520c);
            }
            arrayList.clear();
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) Di.f249524c;
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                e50.k1 k1Var = (e50.k1) it6.next();
                dartExecutor.setMessageHandler(k1Var.f249514a, k1Var.f249515b);
            }
            arrayList2.clear();
        }
    }
}
