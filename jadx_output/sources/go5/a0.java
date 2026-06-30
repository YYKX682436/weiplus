package go5;

/* loaded from: classes14.dex */
public final class a0 implements com.tencent.mm.plugin.voip.model.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ go5.c0 f274116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go5.b f274117b;

    public a0(go5.c0 c0Var, go5.b bVar) {
        this.f274116a = c0Var;
        this.f274117b = bVar;
    }

    @Override // com.tencent.mm.plugin.voip.model.b
    public final int a(byte[] bArr, int i17) {
        go5.c0 c0Var = this.f274116a;
        if (c0Var.f274125b.capacity() < i17) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
            kotlin.jvm.internal.o.f(allocateDirect, "allocateDirect(...)");
            c0Var.f274125b = allocateDirect;
        }
        c0Var.f274125b.clear();
        java.nio.ByteBuffer buffer = c0Var.f274125b;
        ((go5.t) this.f274117b).getClass();
        kotlin.jvm.internal.o.g(buffer, "buffer");
        buffer.clear();
        if (!(com.tencent.mm.plugin.voipmp.platform.v0.f177287b.h(buffer, i17) >= 0)) {
            return -1;
        }
        c0Var.f274125b.get(bArr);
        return 0;
    }
}
