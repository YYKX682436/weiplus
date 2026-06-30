package vx5;

/* loaded from: classes13.dex */
public class m implements tx5.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.xweb.pinus.sdk.y f441381a;

    public m() {
        by5.c4.c("PinusStorage", "PinusWebStorage, Default.");
    }

    @Override // tx5.e
    public void a() {
        com.tencent.xweb.pinus.sdk.y yVar = this.f441381a;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // tx5.e
    public void b(java.lang.String str) {
        com.tencent.xweb.pinus.sdk.y yVar = this.f441381a;
        if (yVar != null) {
            yVar.b(str);
            return;
        }
        by5.c4.f("PinusStorage", "delete origin(" + str + ") result is " + vx5.k.f441374a.g(80006, new java.lang.Object[]{str}));
    }

    public m(com.tencent.xweb.pinus.sdk.y yVar) {
        this.f441381a = yVar;
    }
}
