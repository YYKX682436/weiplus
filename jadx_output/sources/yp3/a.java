package yp3;

/* loaded from: classes7.dex */
public final class a implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f464399a;

    public a(long j17) {
        this.f464399a = j17;
    }

    @Override // com.tencent.mm.vfs.t6
    public final boolean accept(com.tencent.mm.vfs.r6 f17) {
        kotlin.jvm.internal.o.g(f17, "f");
        return this.f464399a - f17.B() > yp3.b.f464400a;
    }
}
