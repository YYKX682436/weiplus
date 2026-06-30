package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes8.dex */
public final class x8 extends com.tencent.mm.ui.component.UIComponent implements zy2.r8 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f117534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117534d = new com.tencent.mm.plugin.finder.live.viewmodel.w8(this);
    }

    public static final void O6(com.tencent.mm.plugin.finder.live.viewmodel.x8 x8Var, boolean z17) {
        x8Var.getClass();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.j9.a(ya2.r.f460525a, z17, 2, null, 4, null);
        g92.b bVar = g92.b.f269769e;
        m92.f fVar = new m92.f();
        if (((r45.e33) fVar.d().getCustom(17)) == null) {
            fVar.d().set(17, new r45.e33());
        }
        r45.e33 e33Var = (r45.e33) fVar.d().getCustom(17);
        if (e33Var != null) {
            e33Var.set(1, java.lang.Boolean.valueOf(z17));
        }
        bVar.S1(fVar, m92.j.f325005w);
    }

    public final void P6() {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.rbb);
        if (mMSwitchBtn != null) {
            r45.e33 e33Var = (r45.e33) g92.b.f269769e.k2().d().getCustom(17);
            mMSwitchBtn.setCheck(e33Var != null ? e33Var.getBoolean(1) : true);
            mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.finder.live.viewmodel.t8(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        P6();
    }
}
