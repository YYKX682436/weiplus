package z21;

/* loaded from: classes14.dex */
public class n extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z21.q f469657a;

    public n(z21.q qVar) {
        this.f469657a = qVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        z21.p pVar;
        int i17 = message.what;
        z21.q qVar = this.f469657a;
        if (i17 == 2) {
            z21.p pVar2 = qVar.f469668m;
            if (pVar2 != null) {
                com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout = ((a31.r) pVar2).f994a;
                com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout.a(voiceSearchLayout);
                voiceSearchLayout.e(false, null);
                com.tencent.mm.sdk.platformtools.b4 b4Var = voiceSearchLayout.f71766s;
                if (b4Var != null) {
                    b4Var.d();
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 0) {
            if (i17 != 3 || (pVar = qVar.f469668m) == null) {
                return;
            }
            ((a31.r) pVar).a(new java.lang.String[0], -1L);
            return;
        }
        if (qVar.f469662d == 0) {
            gm0.j1.d().a(349, qVar);
        } else {
            gm0.j1.d().a(206, qVar);
        }
        if (qVar.f469662d != 0) {
            qVar.f469672q = new z21.j(z21.q.a(qVar), qVar.f469662d);
        } else if (qVar.f469667i) {
            qVar.f469672q = new z21.l(z21.q.a(qVar), 1);
        } else {
            qVar.f469672q = new z21.l(z21.q.a(qVar), 0);
        }
        gm0.j1.d().g(qVar.f469672q);
    }
}
