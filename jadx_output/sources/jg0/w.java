package jg0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(jg0.x xVar) {
        super(0);
        this.f299633d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = true;
        if (!com.tencent.mm.storage.z3.L4(this.f299633d.f299638i.f41048a) && (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("VoiceCdnUploadSwitch", 0) != 1 || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendVoiceMode()) != 0)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
