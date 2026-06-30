package ef0;

/* loaded from: classes8.dex */
public final class u3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.z3 f252335d;

    public u3(ef0.z3 z3Var) {
        this.f252335d = z3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.xs2 xs2Var;
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        ef0.z3 z3Var = this.f252335d;
        z3Var.getClass();
        if (aVar == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleTingTaskBarRecommendData path: ");
        sb6.append(aVar.f105331e);
        sb6.append(", ctrlType: ");
        com.tencent.mm.protobuf.g gVar = null;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = aVar.f105329c;
        sb6.append(jbVar != null ? java.lang.Integer.valueOf(jbVar.field_ctrType) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotFeatureService", sb6.toString());
        if (kotlin.jvm.internal.o.b(aVar.f105331e, "Listen.SlideOver")) {
            qk.h9 h9Var = (qk.h9) i95.n0.c(qk.h9.class);
            if (jbVar != null && (xs2Var = jbVar.N) != null) {
                gVar = xs2Var.getByteString(7);
            }
            z3Var.f252381f.postValue(((ef0.d4) h9Var).Ai(gVar));
        }
    }
}
