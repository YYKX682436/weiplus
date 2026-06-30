package cq4;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView f221485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView) {
        super(2);
        this.f221485d = vLogThumbView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        kp4.a info = (kp4.a) obj2;
        kotlin.jvm.internal.o.g(info, "info");
        if (!info.e() && info.f311079i >= 0) {
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this.f221485d;
            cq4.t onSelectCallback = vLogThumbView.getOnSelectCallback();
            if (onSelectCallback != null) {
                int i17 = info.f311079i;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("EDIT_VLOG_SELECT_TRACK", i17);
                ((bp4.c4) onSelectCallback).f23136a.w(ju3.c0.f301874e2, bundle);
            }
            vLogThumbView.H = info.f311079i;
            vLogThumbView.F = info.c();
            vLogThumbView.G = info.a();
            vLogThumbView.f176136g.y(info.f311079i);
        }
        return jz5.f0.f302826a;
    }
}
