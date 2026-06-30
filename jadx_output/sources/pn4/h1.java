package pn4;

/* loaded from: classes4.dex */
public final class h1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.k1 f357112d;

    public h1(pn4.k1 k1Var) {
        this.f357112d = k1Var;
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
            com.tencent.mars.xlog.Log.i("MicroMsg.Translate.TranslateInWritingHelper", "onTranslateEnd " + aVar.f359285b + ' ' + aVar.f359286c + ' ' + aVar.f359287d);
            r45.kp3 kp3Var = (r45.kp3) aVar.f359289f;
            pn4.k1 k1Var = this.f357112d;
            if (kp3Var == null || (linkedList = kp3Var.f378891e) == null) {
                f0Var = null;
            } else {
                if (!linkedList.isEmpty()) {
                    java.lang.String str = ((r45.dq6) linkedList.get(0)).f372669e;
                    if (!(str == null || str.length() == 0)) {
                        r45.dq6 dq6Var = (r45.dq6) linkedList.get(0);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Translate.TranslateInWritingHelper", "onTranslateEndSuccess " + dq6Var.f372668d + ' ' + dq6Var.f372669e);
                        int i17 = dq6Var.f372668d;
                        java.lang.String TranslatedText = dq6Var.f372669e;
                        kotlin.jvm.internal.o.f(TranslatedText, "TranslatedText");
                        k1Var.getClass();
                        ((nn4.a) com.tencent.mm.sdk.event.q.f192403a.a(nn4.a.class)).O6(new nn4.b(i17, TranslatedText));
                        f0Var = f0Var2;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Translate.TranslateInWritingHelper", "onTranslateEndSuccess msgList.isEmpty():" + linkedList.isEmpty() + ' ');
                ((nn4.a) com.tencent.mm.sdk.event.q.f192403a.a(nn4.a.class)).O6(new nn4.b(-1, ""));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                k1Var.getClass();
                ((nn4.a) com.tencent.mm.sdk.event.q.f192403a.a(nn4.a.class)).O6(new nn4.b(-1, ""));
            }
        }
        return f0Var2;
    }
}
