package iy4;

/* loaded from: classes11.dex */
public class v0 implements i40.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f296015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iy4.r0 f296016b;

    public v0(iy4.r0 r0Var, com.tencent.mm.storage.f9 f9Var) {
        this.f296016b = r0Var;
        this.f296015a = f9Var;
    }

    @Override // i40.a
    public void a(long j17, long j18) {
    }

    @Override // i40.a
    public void c() {
        this.f296016b.c(this.f296015a.getMsgId());
    }

    @Override // i40.a
    public void d(int i17, int i18, java.lang.String str, boolean z17) {
        if (z17) {
            this.f296016b.c(this.f296015a.getMsgId());
        }
    }

    @Override // i40.a
    public void e() {
    }
}
