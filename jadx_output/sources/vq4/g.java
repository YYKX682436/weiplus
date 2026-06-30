package vq4;

/* loaded from: classes12.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vq4.i f439297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vq4.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439297e = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vq4.g(this.f439297e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vq4.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        long e17;
        int a17;
        java.lang.Double d17;
        double doubleValue;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f439296d;
        if (i18 != 0 && i18 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            vq4.i iVar = this.f439297e;
            vq4.y yVar = (vq4.y) iVar.f439303b.getValue();
            yVar.getClass();
            android.content.Intent registerReceiver = yVar.f439389a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z17 = iVar.f439314m;
            jz5.g gVar = iVar.f439303b;
            if (z17) {
                ((vq4.y) gVar.getValue()).getClass();
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("batterymanager");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
                if (((android.os.BatteryManager) systemService).isCharging()) {
                    iVar.f439314m = false;
                }
            }
            ((vq4.y) gVar.getValue()).getClass();
            int intExtra = (registerReceiver != null ? registerReceiver.getIntExtra("temperature", 0) : 0) / 10;
            if (intExtra != Integer.MAX_VALUE && intExtra != Integer.MIN_VALUE) {
                ((java.util.ArrayList) iVar.f439311j).add(new java.lang.Integer(intExtra));
            }
            ((vq4.y) gVar.getValue()).getClass();
            java.util.Iterator it = vq4.y.f439388b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i17 = Integer.MIN_VALUE;
                    break;
                }
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File((java.lang.String) it.next()));
                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(fileInputStream);
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    java.lang.String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    d17 = java.lang.Double.valueOf(java.lang.Double.parseDouble(readLine));
                } catch (java.lang.NumberFormatException | java.lang.Exception unused) {
                    d17 = null;
                }
                if (d17 != null) {
                    double doubleValue2 = d17.doubleValue();
                    if (-30.0d <= doubleValue2 && doubleValue2 <= 250.0d) {
                        doubleValue = d17.doubleValue();
                    } else {
                        double d18 = 1000;
                        double doubleValue3 = d17.doubleValue() / d18;
                        doubleValue = ((-30.0d) > doubleValue3 ? 1 : ((-30.0d) == doubleValue3 ? 0 : -1)) <= 0 && (doubleValue3 > 250.0d ? 1 : (doubleValue3 == 250.0d ? 0 : -1)) <= 0 ? d17.doubleValue() / d18 : 0.0d;
                    }
                    i17 = (int) doubleValue;
                }
            }
            if (i17 != Integer.MAX_VALUE && i17 != Integer.MIN_VALUE) {
                ((java.util.ArrayList) iVar.f439312k).add(new java.lang.Integer(i17));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfilerMonitor", "startMonitor: currentTmp battery " + intExtra + " cpu " + i17);
            if (fp.e0.e() && (a17 = (int) pj.h.a()) != -1) {
                ((java.util.ArrayList) iVar.f439313l).add(new java.lang.Integer(a17));
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfilerMonitor", "startMonitor: currentTmp phone " + a17);
            }
            iVar.f439307f = (iVar.f439307f + com.tencent.matrix.util.PssInfo.f53113s.b().f53114d) / 2;
            int i19 = s26.a.f402368f;
            e17 = s26.c.e(1, s26.d.f402373h);
            this.f439296d = 1;
        } while (kotlinx.coroutines.k1.c(e17, this) != aVar);
        return aVar;
    }
}
