package fp4;

/* loaded from: classes10.dex */
public final class o implements fp4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fp4.s f265369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f265370b;

    public o(fp4.s sVar, ju3.d0 d0Var) {
        this.f265369a = sVar;
        this.f265370b = d0Var;
    }

    @Override // fp4.e
    public void a(long j17, long j18, boolean z17) {
        bv3.d dVar;
        bv3.d dVar2;
        bv3.d dVar3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCropCallback: [");
        sb6.append(j17);
        sb6.append(", ");
        sb6.append(j18);
        sb6.append("], onUp:");
        sb6.append(z17);
        sb6.append(", showTime start:");
        fp4.s sVar = this.f265369a;
        zu3.a aVar = sVar.f265385t;
        java.lang.Long l17 = null;
        sb6.append((aVar == null || (dVar3 = aVar.f475760c) == null) ? null : java.lang.Long.valueOf(dVar3.c()));
        sb6.append(" end:");
        zu3.a aVar2 = sVar.f265385t;
        if (aVar2 != null && (dVar2 = aVar2.f475760c) != null) {
            l17 = java.lang.Long.valueOf(dVar2.b());
        }
        sb6.append(l17);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogTimeEditPlugin", sb6.toString());
        if (sVar.f265381p != j17) {
            sVar.f265381p = j17;
            sVar.f265382q = j18;
        } else {
            sVar.f265381p = j17;
            sVar.f265382q = j18;
            j17 = j18;
        }
        zu3.a aVar3 = sVar.f265385t;
        if (aVar3 != null && (dVar = aVar3.f475759b) != null) {
            dVar.d(sVar.f265381p, sVar.f265382q);
        }
        ju3.c0 c0Var = ju3.c0.f301890n2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("EDIT_CROP_VLOG_LENGTH_START_TIME_LONG", sVar.f265381p);
        bundle.putLong("EDIT_CROP_VLOG_LENGTH_END_TIME_LONG", sVar.f265382q);
        bundle.putLong("EDIT_CROP_VLOG_SEEKTIME_LONG", j17);
        bundle.putBoolean("EDIT_CROP_VLOG_ON_UP_BOOLEAN", z17);
        this.f265370b.w(c0Var, bundle);
    }
}
