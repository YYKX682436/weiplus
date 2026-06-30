package kh2;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh2.l f308003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kh2.l lVar) {
        super(4);
        this.f308003d = lVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean z17;
        final byte[] buf = (byte[]) obj;
        final int intValue = ((java.lang.Number) obj2).intValue();
        final float floatValue = ((java.lang.Number) obj3).floatValue();
        final float[][] fArr = (float[][]) obj4;
        kotlin.jvm.internal.o.g(buf, "buf");
        kh2.l lVar = this.f308003d;
        lh2.a aVar = lVar.f308007d;
        if (aVar != null) {
            aVar.b(buf, intValue);
        }
        final oy5.h hVar = (oy5.h) lVar.i();
        hVar.getClass();
        com.tme.karaoke.lib_singscore.ScorerNativeBridge.Companion.getClass();
        z17 = com.tme.karaoke.lib_singscore.ScorerNativeBridge.loadRet;
        if (z17) {
            android.os.Handler handler = hVar.f350117f;
            if (handler == null) {
                kotlin.jvm.internal.o.o("scoreHandler");
                throw null;
            }
            handler.post(new java.lang.Runnable() { // from class: oy5.h$$d
                @Override // java.lang.Runnable
                public final void run() {
                    oy5.h this$0 = oy5.h.this;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    this$0.f350114c.processWithBuffer(buf, floatValue, intValue, fArr);
                }
            });
        }
        return jz5.f0.f302826a;
    }
}
