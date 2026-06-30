package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class k2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b3 f158441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f158442b;

    public k2(com.tencent.mm.plugin.ringtone.uic.b3 b3Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f158441a = b3Var;
        this.f158442b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.ringtone.uic.b3 b3Var = this.f158441a;
        androidx.appcompat.app.AppCompatActivity activity = b3Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.ringtone.uic.a2) zVar.a(activity).a(com.tencent.mm.plugin.ringtone.uic.a2.class)).P6(true, 2048L, 80);
        b3Var.f158367w = true;
        androidx.appcompat.app.AppCompatActivity activity2 = b3Var.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.a2) zVar.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.a2.class)).O6();
        db5.t7.h(b3Var.getActivity(), i65.a.r(b3Var.getActivity(), com.tencent.mm.R.string.iwo));
        this.f158442b.B();
        com.tencent.mm.autogen.mmdata.rpt.ring_recommend_tipsStruct ring_recommend_tipsstruct = new com.tencent.mm.autogen.mmdata.rpt.ring_recommend_tipsStruct();
        ring_recommend_tipsstruct.f63157d = 2L;
        ring_recommend_tipsstruct.k();
    }
}
