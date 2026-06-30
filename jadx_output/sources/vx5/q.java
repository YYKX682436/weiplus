package vx5;

/* loaded from: classes13.dex */
public class q extends com.tencent.xweb.y {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.xweb.pinus.sdk.i f441386a;

    public q(com.tencent.xweb.pinus.sdk.i iVar) {
        this.f441386a = iVar;
    }

    @Override // com.tencent.xweb.z
    public void a() {
        com.tencent.xweb.pinus.sdk.i iVar = this.f441386a;
        if (iVar != null) {
            ((com.tencent.xweb.pinus.sdk.j) iVar).a();
        }
    }

    @Override // com.tencent.xweb.z
    public void b() {
        com.tencent.xweb.pinus.sdk.i iVar = this.f441386a;
        if (iVar != null) {
            ((com.tencent.xweb.pinus.sdk.j) iVar).b();
        }
    }

    @Override // com.tencent.xweb.y
    public void c(java.lang.String str) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.i iVar = this.f441386a;
        if (iVar != null) {
            com.tencent.xweb.pinus.sdk.j jVar = (com.tencent.xweb.pinus.sdk.j) iVar;
            jVar.getClass();
            try {
                synchronized (jVar) {
                    i0Var = jVar.f220448d;
                    if (i0Var == null) {
                        i0Var = new by5.i0(jVar.f220445a, "confirm", java.lang.String.class);
                        jVar.f220448d = i0Var;
                    }
                }
                i0Var.b(str);
            } catch (java.lang.UnsupportedOperationException unused) {
            }
        }
    }
}
