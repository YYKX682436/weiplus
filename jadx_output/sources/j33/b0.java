package j33;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j33.c0 f297402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.view.AlbumScrollBarContainer f297403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(j33.c0 c0Var, com.tencent.mm.plugin.gallery.view.AlbumScrollBarContainer albumScrollBarContainer) {
        super(0);
        this.f297402d = c0Var;
        this.f297403e = albumScrollBarContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j33.c0 c0Var = this.f297402d;
        com.tencent.mars.xlog.Log.i(c0Var.f297425m, "focus to normal fist anim end");
        sa5.d.d(this.f297403e, 0, c0Var.f297421f, new j33.a0(c0Var), 1, null);
        return jz5.f0.f302826a;
    }
}
