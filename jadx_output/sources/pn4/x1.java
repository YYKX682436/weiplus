package pn4;

/* loaded from: classes4.dex */
public final class x1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.c2 f357247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn4.t1 f357248e;

    public x1(pn4.c2 c2Var, pn4.t1 t1Var) {
        this.f357247d = c2Var;
        this.f357248e = t1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        jz5.f0 f0Var;
        java.util.LinkedList linkedList;
        o01.a aVar = (o01.a) obj;
        q01.f fVar = aVar.f359284a;
        q01.f fVar2 = q01.f.f359276e;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (fVar == fVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TranslateVoice2TxtHelper", "onTranslateEnd " + aVar.f359285b + ' ' + aVar.f359286c + ' ' + aVar.f359287d);
            r45.kp3 kp3Var = (r45.kp3) aVar.f359289f;
            pn4.t1 t1Var = this.f357248e;
            pn4.c2 c2Var = this.f357247d;
            if (kp3Var == null || (linkedList = kp3Var.f378891e) == null) {
                f0Var = null;
            } else {
                if (!linkedList.isEmpty()) {
                    java.lang.String str = ((r45.dq6) linkedList.get(0)).f372669e;
                    if (!(str == null || str.length() == 0)) {
                        r45.dq6 dq6Var = (r45.dq6) linkedList.get(0);
                        com.tencent.mars.xlog.Log.i("MicroMsg.TranslateVoice2TxtHelper", "onTranslateEndSuccess " + dq6Var.f372668d + ' ' + dq6Var.f372669e);
                        int i17 = dq6Var.f372668d;
                        java.lang.String str2 = kp3Var.f378892f;
                        java.lang.String TranslatedText = dq6Var.f372669e;
                        kotlin.jvm.internal.o.f(TranslatedText, "TranslatedText");
                        int i18 = pn4.c2.f357063d;
                        c2Var.getClass();
                        pm0.v.X(new pn4.a2(t1Var, i17, str2, TranslatedText));
                        f0Var = f0Var2;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TranslateVoice2TxtHelper", "onTranslateEndSuccess msgList.isEmpty():" + linkedList.isEmpty() + ' ');
                java.lang.String str3 = kp3Var.f378892f;
                int i19 = pn4.c2.f357063d;
                c2Var.getClass();
                pm0.v.X(new pn4.a2(t1Var, -1, str3, ""));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                java.lang.String str4 = kp3Var != null ? kp3Var.f378892f : null;
                int i27 = pn4.c2.f357063d;
                c2Var.getClass();
                pm0.v.X(new pn4.a2(t1Var, -1, str4, ""));
            }
        }
        return f0Var2;
    }
}
