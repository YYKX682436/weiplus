package fo5;

/* loaded from: classes14.dex */
public final class l0 implements lo5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f265017b;

    public l0(fo5.r0 r0Var, boolean z17) {
        this.f265016a = r0Var;
        this.f265017b = z17;
    }

    public void a(lo5.b op6) {
        boolean z17;
        kotlin.jvm.internal.o.g(op6, "op");
        int ordinal = op6.ordinal();
        er4.r rVar = er4.r.MP_ROOM_TYPE_VIDEO;
        fo5.r0 r0Var = this.f265016a;
        boolean z18 = this.f265017b;
        if (ordinal == 0) {
            er4.r rVar2 = r0Var.f265083b;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "onBannerOperationDone:SlideUpward :isSubCall: " + z18);
            if (!z18) {
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.i0(r0Var, null), 3, null);
                return;
            }
            er4.r roomType = r0Var.f265083b;
            kotlin.jvm.internal.o.g(roomType, "roomType");
            z17 = roomType == rVar;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.m(context, i65.a.r(context, z17 ? com.tencent.mm.R.string.kbn : com.tencent.mm.R.string.kbp));
            return;
        }
        if (ordinal == 1) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.f0(z18, r0Var, null), 3, null);
            return;
        }
        if (ordinal == 2) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.h0(r0Var, z18, null), 3, null);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        er4.r roomType2 = r0Var.f265083b;
        if (!z18) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.j0(r0Var, null), 3, null);
            return;
        }
        kotlin.jvm.internal.o.g(roomType2, "roomType");
        z17 = roomType2 == rVar;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        db5.t7.m(context2, i65.a.r(context2, z17 ? com.tencent.mm.R.string.kbm : com.tencent.mm.R.string.kbo));
    }

    public void b(int i17, bp5.h renderTargetHolder, boolean z17) {
        kotlin.jvm.internal.o.g(renderTargetHolder, "renderTargetHolder");
        fo5.r0 r0Var = this.f265016a;
        ro5.b bVar = r0Var.f265097p;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("renderController");
            throw null;
        }
        bVar.c(i17, renderTargetHolder);
        if (z17) {
            ro5.b bVar2 = r0Var.f265097p;
            if (bVar2 != null) {
                bVar2.e();
            } else {
                kotlin.jvm.internal.o.o("renderController");
                throw null;
            }
        }
    }
}
