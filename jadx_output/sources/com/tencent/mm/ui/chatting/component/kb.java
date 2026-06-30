package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class kb implements com.tencent.mm.ui.chatting.component.mn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jb f199359a;

    public kb(com.tencent.mm.ui.chatting.component.jb jbVar) {
        this.f199359a = jbVar;
    }

    public void a(boolean z17) {
        com.tencent.mm.ui.chatting.component.ho hoVar = (com.tencent.mm.ui.chatting.component.ho) ((sb5.o2) this.f199359a.f198580d.f460708c.a(sb5.o2.class));
        hoVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TranslateWhileWriteComponent", "setTranslating() called with: enable = " + z17);
        if (z17) {
            if (hoVar.f199191u.length() == 0) {
                hoVar.u0(com.tencent.mm.ui.chatting.component.kn.f199376d);
            }
            hoVar.y0();
        } else {
            hoVar.v0(-1);
            hoVar.w0(true);
        }
        com.tencent.mm.ui.chatting.component.ln lnVar = hoVar.A;
        lnVar.getClass();
        com.tencent.mm.sdk.platformtools.o4.M(lnVar.f199451a.r0()).putInt(lnVar.a("useTrans"), 0);
    }
}
