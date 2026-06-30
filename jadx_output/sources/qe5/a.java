package qe5;

/* loaded from: classes12.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.b f362068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qe5.b bVar) {
        super(1);
        this.f362068d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kd5.e state = (kd5.e) obj;
        kotlin.jvm.internal.o.g(state, "state");
        kd5.i iVar = (kd5.i) state.a(kd5.i.class);
        qe5.b bVar = this.f362068d;
        if (iVar != null) {
            bVar.V6(iVar.f306897b);
        }
        if (((kd5.h) state.a(kd5.h.class)) != null) {
            bVar.getClass();
            com.tencent.mm.pluginsdk.model.app.u5.wi().add(bVar);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(bVar, android.os.Looper.getMainLooper());
        }
        return jz5.f0.f302826a;
    }
}
