package vw3;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerItemSettingUI f441113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.repairer.ui.RepairerItemSettingUI repairerItemSettingUI) {
        super(1);
        this.f441113d = repairerItemSettingUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hx3.b state = (hx3.b) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof hx3.a)) {
            java.lang.String string = ((hx3.a) dVar).f285657b.getString(1);
            if (string == null) {
                string = "";
            }
            this.f441113d.setMMTitle(string);
        }
        return jz5.f0.f302826a;
    }
}
