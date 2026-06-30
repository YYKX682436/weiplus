package xc2;

/* loaded from: classes2.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f453117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f453118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(java.lang.ref.WeakReference weakReference, in5.s0 s0Var) {
        super(0);
        this.f453117d = weakReference;
        this.f453118e = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = (in5.s0) this.f453117d.get();
        if (s0Var != null) {
            androidx.recyclerview.widget.f2 f2Var = s0Var.f293122f;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = f2Var instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var : null;
            java.lang.Object w07 = wxRecyclerAdapter != null ? wxRecyclerAdapter.w0(s0Var.getItemViewType()) : null;
            com.tencent.mm.plugin.finder.convert.qe qeVar = w07 instanceof com.tencent.mm.plugin.finder.convert.qe ? (com.tencent.mm.plugin.finder.convert.qe) w07 : null;
            if (qeVar != null) {
                qeVar.t(this.f453118e);
            }
            com.tencent.mars.xlog.Log.w("Finder.JumperUtils", "adjust seekbar layout on highlight drawer close");
        } else {
            com.tencent.mars.xlog.Log.w("Finder.JumperUtils", "holder is null, skip adjust seekbar layout");
        }
        return jz5.f0.f302826a;
    }
}
