package pn4;

/* loaded from: classes5.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.s1 f357051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(pn4.s1 s1Var) {
        super(1);
        this.f357051d = s1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        pn4.s1 s1Var = this.f357051d;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TranslateVoice2TxtHelper", "startGetDefaultTransLang response is null");
            ((com.tencent.mm.pluginsdk.ui.chat.z0) s1Var).a("");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TranslateVoice2TxtHelper", "startGetDefaultTransLang " + fVar.f70615a + ' ' + fVar.f70616b);
            if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                r45.nl6 nl6Var = (r45.nl6) fVar.f70618d;
                if (nl6Var == null || (str = nl6Var.getString(2)) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TranslateVoice2TxtHelper", "startGetDefaultTransLang ".concat(str));
                    ((com.tencent.mm.pluginsdk.ui.chat.z0) s1Var).a(str);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TranslateVoice2TxtHelper", "startGetDefaultTransLang summary_lang is empty");
                    ((com.tencent.mm.pluginsdk.ui.chat.z0) s1Var).a("");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TranslateVoice2TxtHelper", "startGetDefaultTransLang network error");
                ((com.tencent.mm.pluginsdk.ui.chat.z0) s1Var).a("");
            }
        }
        return jz5.f0.f302826a;
    }
}
