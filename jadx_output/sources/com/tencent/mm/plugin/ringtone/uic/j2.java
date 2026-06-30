package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class j2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b3 f158437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f158438b;

    public j2(com.tencent.mm.plugin.ringtone.uic.b3 b3Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f158437a = b3Var;
        this.f158438b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.ringtone.uic.b3 b3Var = this.f158437a;
        androidx.appcompat.app.AppCompatActivity activity = b3Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.ringtone.uic.a2) zVar.a(activity).a(com.tencent.mm.plugin.ringtone.uic.a2.class)).P6(false, 2048L, 80);
        b3Var.f158367w = true;
        androidx.appcompat.app.AppCompatActivity activity2 = b3Var.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.a2) zVar.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.a2.class)).O6();
        com.tencent.mm.autogen.mmdata.rpt.ring_recommend_tipsStruct ring_recommend_tipsstruct = new com.tencent.mm.autogen.mmdata.rpt.ring_recommend_tipsStruct();
        ring_recommend_tipsstruct.f63157d = 3L;
        ring_recommend_tipsstruct.k();
        this.f158438b.B();
    }
}
