package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class o implements com.tencent.mm.plugin.voip.ui.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f177185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.k f177186b;

    public o(com.tencent.mm.plugin.voip.widget.k kVar, android.content.Intent intent) {
        this.f177186b = kVar;
        this.f177185a = intent;
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public boolean a() {
        com.tencent.mm.plugin.voip.widget.k kVar = this.f177186b;
        if (!kVar.f177163n) {
            return vq4.n0.f(kVar.f177161i) || vq4.n0.h(kVar.f177161i);
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kde);
        com.tencent.mm.plugin.voip.widget.k kVar2 = this.f177186b;
        android.content.Intent intent = this.f177185a;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = kVar.f177162m.d1();
        ((sg3.a) v0Var).getClass();
        kVar2.f(intent, string, c01.a2.e(d17), string, false);
        if (vq4.n0.f(kVar.f177161i) || vq4.n0.h(kVar.f177161i)) {
            kVar.f177159g = true;
            return true;
        }
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(40);
        kVar.b(false);
        return false;
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public void b() {
        com.tencent.mm.plugin.voip.ui.g gVar = this.f177186b.f177156d;
        if (gVar != null) {
            gVar.f();
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public void c(android.content.Intent intent, com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView) {
        boolean booleanExtra = intent.getBooleanExtra("Voip_Is_Talking", false);
        com.tencent.mm.plugin.voip.widget.k kVar = this.f177186b;
        if (booleanExtra) {
            com.tencent.mm.plugin.voip.ui.t0 Ai = gq4.v.Ai();
            java.lang.String a17 = kVar.a();
            com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = Ai.f176987a;
            if (voipViewFragment != null) {
                voipViewFragment.f(a17);
            }
        } else {
            com.tencent.mm.plugin.voip.ui.t0 Ai2 = gq4.v.Ai();
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kcf);
            com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment2 = Ai2.f176987a;
            if (voipViewFragment2 != null) {
                voipViewFragment2.e(string);
            }
        }
        if (kVar.f177163n && kVar.f177159g) {
            kVar.f177159g = false;
            kVar.f177157e = baseSmallView;
            kVar.d();
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public void d() {
        com.tencent.mm.plugin.voip.widget.k kVar = this.f177186b;
        com.tencent.mm.plugin.voip.ui.g gVar = kVar.f177156d;
        if (gVar != null) {
            gVar.c(kVar);
        }
    }
}
