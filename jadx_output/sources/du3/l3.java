package du3;

/* loaded from: classes10.dex */
public final class l3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243648d;

    public l3(du3.t3 t3Var) {
        this.f243648d = t3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((hk0.o) obj).f281783b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "goto finish");
            du3.t3 t3Var = this.f243648d;
            t3Var.H();
            nu3.m mVar = nu3.m.f340229a;
            int[] iArr = new int[3];
            qk.o9 o9Var = t3Var.f243729s;
            qk.v7 b17 = o9Var != null ? o9Var.b() : null;
            kotlin.jvm.internal.o.d(b17);
            iArr[0] = ((f65.r) b17).b();
            qk.o9 o9Var2 = t3Var.f243729s;
            qk.v7 b18 = o9Var2 != null ? o9Var2.b() : null;
            kotlin.jvm.internal.o.d(b18);
            iArr[1] = ((f65.r) b18).e();
            iArr[2] = -1;
            mVar.g(iArr);
            mVar.i(1, 2L);
            qk.o9 o9Var3 = t3Var.f243729s;
            qk.v7 b19 = o9Var3 != null ? o9Var3.b() : null;
            kotlin.jvm.internal.o.d(b19);
            boolean z17 = ((f65.r) b19).g() || t3Var.C;
            nu3.i iVar = nu3.i.f340218a;
            iVar.n("KEY_PHOTO_IS_EDITED_BOOLEAN", java.lang.Boolean.valueOf(z17));
            nu3.e.f340200c = z17;
            java.lang.Object b27 = iVar.l().b("KEY_EDIT_SESSION_ID", 0L);
            kotlin.jvm.internal.o.f(b27, "getReportValue(...)");
            nu3.e.f340201d = ((java.lang.Number) b27).longValue();
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 118L, 1L, false);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 127L, 1L, false);
            if (t3Var.A) {
                return;
            }
            android.content.Context context = t3Var.f243719f.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            if (((android.app.Activity) context).isFinishing()) {
                return;
            }
            t3Var.A = true;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "dofinish time: " + elapsedRealtime + ' ' + z17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            l45.q qVar = t3Var.f243726p;
            if (qVar != null) {
                arrayList.addAll(((l45.n) qVar).j());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doFinish: currentSelectedEmojiList size=");
            l45.q qVar2 = t3Var.f243726p;
            sb6.append(qVar2 != null ? java.lang.Integer.valueOf(((java.util.ArrayList) ((l45.n) qVar2).j()).size()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", sb6.toString());
            qk.o9 o9Var4 = t3Var.f243729s;
            if (o9Var4 != null) {
                o9Var4.g(new du3.v2(elapsedRealtime, t3Var, arrayList, z17, null), false);
            }
        }
    }
}
