package no4;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ no4.c f338768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(no4.c cVar) {
        super(0);
        this.f338768d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.vlog.model.h0 h0Var = com.tencent.mm.plugin.vlog.model.j0.f175632a;
        com.tencent.mm.plugin.vlog.model.i0 scene = this.f338768d.f338771b;
        h0Var.getClass();
        kotlin.jvm.internal.o.g(scene, "scene");
        java.lang.String str = (java.lang.String) com.tencent.mm.plugin.vlog.model.h0.f175594b.get(scene);
        if (str == null) {
            str = "";
        }
        return new nv3.l("MusicLoading", str);
    }
}
