package yz3;

@j95.b
/* loaded from: classes12.dex */
public final class w extends i95.w implements ry3.j {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f468548d = jz5.h.b(yz3.t.f468545d);

    public sy3.c Ai(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        return new kz3.l(context, i17);
    }

    public int Bi() {
        return ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.scanner.model.d1.f158863u).getValue()).intValue();
    }

    public boolean Di(int i17, java.util.List list) {
        if (list != null && bz3.h.f36777d) {
            if (i17 == 1 && gx5.f.f277461d) {
                return true;
            }
            int i18 = com.tencent.mm.plugin.scanner.k1.f158749a;
            boolean z17 = list.size() > 0 && ((java.lang.Float) list.get(0)).floatValue() > 0.0f;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanServiceImpl", "needShowOCRMenu hasText: " + z17);
            if (z17) {
                return true;
            }
        }
        return false;
    }

    public long Ni(ry3.p pVar, ry3.r rVar) {
        if (pVar == null) {
            return 0L;
        }
        pVar.f401528b = 1;
        if (pVar.f401527a == 0) {
            pVar.f401527a = java.lang.System.currentTimeMillis();
        }
        ((iz3.s) ((jz5.n) this.f468548d).getValue()).d(pVar.f401527a, pVar, new yz3.v(rVar));
        return pVar.f401527a;
    }

    public void wi(long j17) {
        iz3.k a17;
        iz3.s sVar = (iz3.s) ((jz5.n) this.f468548d).getValue();
        sVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageSceneUploader", "cancel");
        sVar.f296099e.remove(java.lang.Long.valueOf(j17));
        iz3.j jVar = (iz3.j) sVar.f296098d.remove(java.lang.Long.valueOf(j17));
        if (jVar != null) {
            gm0.j1.d().c(jVar.f296085b);
            ry3.p pVar = jVar.f296084a;
            if (pVar == null || (a17 = sVar.a(pVar)) == null) {
                return;
            }
            a17.b(j17);
        }
    }
}
