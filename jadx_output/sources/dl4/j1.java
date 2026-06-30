package dl4;

/* loaded from: classes3.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.z f235422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235423e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ff0.z zVar, java.lang.String str) {
        super(0);
        this.f235422d = zVar;
        this.f235423e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ff0.z zVar = this.f235422d;
        if (zVar != null) {
            ((com.tencent.mm.sdk.platformtools.r2) dl4.m1.f235437b).put(this.f235423e, zVar);
        }
        return jz5.f0.f302826a;
    }
}
