package mq4;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f330787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f330788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mq4.e0 f330790g;

    public d0(mq4.e0 e0Var, int i17, int i18, java.lang.String str) {
        this.f330790g = e0Var;
        this.f330787d = i17;
        this.f330788e = i18;
        this.f330789f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        mq4.e0 e0Var = this.f330790g;
        com.tencent.mm.modelbase.u0 u0Var = e0Var.f330794e;
        if (u0Var != null) {
            u0Var.onSceneEnd(this.f330787d, this.f330788e, this.f330789f, e0Var);
        }
    }
}
