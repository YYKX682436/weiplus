package vo4;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.i f438625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.m1 f438626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vo4.i iVar, com.tencent.mm.plugin.vlog.model.m1 m1Var) {
        super(0);
        this.f438625d = iVar;
        this.f438626e = m1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        vo4.i iVar = this.f438625d;
        vo4.r rVar = iVar.f438634e;
        rVar.getClass();
        com.tencent.mm.plugin.vlog.model.m1 scriptModel = this.f438626e;
        kotlin.jvm.internal.o.g(scriptModel, "scriptModel");
        rVar.f438673b = scriptModel;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setEffectConfig ");
        sb6.append(rVar.hashCode());
        sb6.append(", previewPlay:");
        boolean z17 = rVar.f438672a;
        sb6.append(z17);
        sb6.append(", scale:[");
        sb6.append(iVar.f438640k);
        sb6.append(", ");
        sb6.append(iVar.f438641l);
        sb6.append("] : ");
        sb6.append(scriptModel.f175676d);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", sb6.toString());
        rVar.c(true);
        java.util.ArrayList arrayList = rVar.f438676e;
        arrayList.clear();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        for (com.tencent.mm.plugin.vlog.model.p0 p0Var : scriptModel.f175674b) {
            boolean z19 = p0Var instanceof com.tencent.mm.plugin.vlog.model.p1;
            vo4.s sVar = rVar.f438677f;
            if (z19) {
                int i17 = sVar.f438685c;
                sVar.f438685c = i17 + 1;
                is0.c cVar = sVar.f438683a[i17 % 2];
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptTexCache", "requestExternalTex: " + cVar);
                int i18 = cVar != null ? cVar.f294395e : -1;
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", "prepare VideoMaterial:" + p0Var.f175710c + ", texture:" + i18);
                obj = z17 ? new vo4.x(i18, rVar.f438681j, rVar.f438682k, (com.tencent.mm.plugin.vlog.model.p1) p0Var, rVar.f438675d) : new vo4.l(i18, rVar.f438681j, rVar.f438682k, (com.tencent.mm.plugin.vlog.model.p1) p0Var);
            } else if (p0Var instanceof com.tencent.mm.plugin.vlog.model.n0) {
                int i19 = sVar.f438686d;
                sVar.f438686d = i19 + 1;
                is0.c cVar2 = sVar.f438684b[i19 % 2];
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptTexCache", "requestNormalTex: " + cVar2);
                int i27 = cVar2 != null ? cVar2.f294395e : -1;
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", "prepare ImageMaterial:" + p0Var.f175710c + ", texture:" + i27);
                obj = new vo4.j(i27, rVar.f438681j, rVar.f438682k, (com.tencent.mm.plugin.vlog.model.n0) p0Var);
            } else {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", "init cacheMaterialPlayer put " + p0Var.f175710c);
            }
        }
        java.util.Iterator it = kz5.n0.K0(arrayList, 1).iterator();
        while (it.hasNext()) {
            ((vo4.b) it.next()).c();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", "init prepare all material player cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        return jz5.f0.f302826a;
    }
}
