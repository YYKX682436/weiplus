package com.tencent.mm.plugin.finder.megavideo.multitask;

/* loaded from: classes8.dex */
public final class n extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f120874x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f120875y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.megavideo.multitask.m f120873z = new com.tencent.mm.plugin.finder.megavideo.multitask.m(null);
    public static final com.tencent.mm.plugin.finder.megavideo.multitask.l A = new com.tencent.mm.plugin.finder.megavideo.multitask.l();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, ak3.c cVar) {
        super(cVar);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // jk3.b
    public void B(boolean z17) {
        super.B(z17);
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        return super.U(i17, z17);
    }

    @Override // jk3.v
    public void V(boolean z17, int i17, jk3.c animType) {
        kotlin.jvm.internal.o.g(animType, "animType");
        super.V(z17, i17, animType);
    }

    @Override // jk3.v
    public boolean Z() {
        yz5.a aVar = this.f120875y;
        return !(aVar != null && !((java.lang.Boolean) aVar.invoke()).booleanValue());
    }

    @Override // jk3.b, jk3.e
    public void j() {
        yz5.a aVar = this.f120874x;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // jk3.b
    public boolean x() {
        return true;
    }
}
