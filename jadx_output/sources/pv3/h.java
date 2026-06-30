package pv3;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv3.m f358596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pv3.m mVar) {
        super(0);
        this.f358596d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.vlog.model.h0 h0Var = com.tencent.mm.plugin.vlog.model.j0.f175632a;
        com.tencent.mm.plugin.vlog.model.i0 scene = this.f358596d.f358614a;
        h0Var.getClass();
        kotlin.jvm.internal.o.g(scene, "scene");
        java.lang.String str = (java.lang.String) com.tencent.mm.plugin.vlog.model.h0.f175594b.get(scene);
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            return new nv3.l("FeedLoading", str);
        }
        return null;
    }
}
