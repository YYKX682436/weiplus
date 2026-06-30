package com.tencent.mm.plugin.finder.megavideo.multitask;

/* loaded from: classes8.dex */
public final class h extends jk3.v {
    public static final com.tencent.mm.plugin.finder.megavideo.multitask.c A = new com.tencent.mm.plugin.finder.megavideo.multitask.c(null);
    public static final com.tencent.mm.plugin.finder.megavideo.multitask.b B = new com.tencent.mm.plugin.finder.megavideo.multitask.b();

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f120864x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f120865y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f120866z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, ak3.c cVar) {
        super(cVar);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static void c0(com.tencent.mm.plugin.finder.megavideo.multitask.h hVar, android.graphics.Bitmap bitmap, int[] iArr, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bitmap = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        ak3.c cVar = hVar.f300111d;
        if (cVar != null) {
            if (bitmap == null) {
                bitmap = z17 ? hVar.f300123p : hVar.h(cVar.getBitmap());
            }
            hVar.l(bitmap, true);
        }
    }

    @Override // jk3.b
    public void B(boolean z17) {
        super.B(z17);
    }

    @Override // jk3.b
    public boolean E() {
        yz5.a aVar = this.f120866z;
        return !(aVar != null && !((java.lang.Boolean) aVar.invoke()).booleanValue());
    }

    @Override // jk3.v
    public void Q(boolean z17) {
        super.Q(true);
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        return super.U(i17, z17);
    }

    @Override // jk3.v
    public boolean Z() {
        yz5.a aVar = this.f120865y;
        return !(aVar != null && !((java.lang.Boolean) aVar.invoke()).booleanValue());
    }

    public final void d0(boolean z17) {
        if (z17) {
            dk3.f fVar = this.f300115h;
            if (fVar != null) {
                ((dk3.e) fVar).c();
                return;
            }
            return;
        }
        dk3.f fVar2 = this.f300115h;
        if (fVar2 != null) {
            dk3.e eVar = (dk3.e) fVar2;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "stop FloatIndicatorController");
            com.tencent.mm.sdk.platformtools.u3.h(new dk3.b(eVar));
            eVar.f234450b.h(null);
        }
    }

    @Override // jk3.b, jk3.e
    public void j() {
        yz5.a aVar = this.f120864x;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // jk3.b
    public boolean x() {
        return true;
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        super.y(i17, str);
        this.f300117j = new com.tencent.mm.plugin.finder.megavideo.multitask.e(this);
    }
}
