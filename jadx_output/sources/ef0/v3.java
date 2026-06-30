package ef0;

/* loaded from: classes8.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.z3 f252345d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(ef0.z3 z3Var) {
        super(0);
        this.f252345d = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.j0 j0Var;
        ef0.z3 z3Var = this.f252345d;
        for (java.lang.String path : (java.util.ArrayList) ((jz5.n) z3Var.f252379d).getValue()) {
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
            kotlin.jvm.internal.o.g(path, "path");
            int hashCode = path.hashCode();
            if (hashCode == -1947195044) {
                if (path.equals("Listen.Music.Bubble")) {
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.M0;
                }
                j0Var = null;
            } else if (hashCode != -215995941) {
                if (hashCode == 1206099673 && path.equals("Listen.CircleX.Bubble")) {
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.O0;
                }
                j0Var = null;
            } else {
                if (path.equals("Listen.NonMusic.Bubble")) {
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.N0;
                }
                j0Var = null;
            }
            androidx.lifecycle.j0 j0Var2 = j0Var != null ? j0Var : null;
            if (j0Var2 != null) {
                ef0.s3 s3Var = new ef0.s3(z3Var);
                j0Var2.observeForever(s3Var);
                com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) j0Var2.getValue();
                if (aVar != null) {
                    s3Var.onChanged(aVar);
                }
            }
        }
        zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
        ef0.t3 t3Var = new ef0.t3(z3Var);
        ((c61.t8) caVar).getClass();
        androidx.lifecycle.j0 j0Var3 = com.tencent.mm.plugin.finder.extension.reddot.aa.L0;
        j0Var3.observeForever(t3Var);
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) j0Var3.getValue();
        if (z9Var != null) {
            t3Var.onChanged(z9Var);
        }
        ef0.u3 u3Var = new ef0.u3(z3Var);
        androidx.lifecycle.j0 j0Var4 = com.tencent.mm.plugin.finder.extension.reddot.aa.P0;
        j0Var4.observeForever(u3Var);
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var2 = (com.tencent.mm.plugin.finder.extension.reddot.z9) j0Var4.getValue();
        if (z9Var2 != null) {
            u3Var.onChanged(z9Var2);
        }
        return jz5.f0.f302826a;
    }
}
