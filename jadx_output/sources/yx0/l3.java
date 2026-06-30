package yx0;

/* loaded from: classes5.dex */
public final class l3 implements com.tencent.maas.camstudio.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467433b;

    public l3(yx0.b8 b8Var, java.lang.String str) {
        this.f467432a = b8Var;
        this.f467433b = str;
    }

    @Override // com.tencent.maas.camstudio.u
    public final void onProgress(float f17) {
        yz5.p pVar = this.f467432a.f467187p;
        if (pVar != null) {
            pVar.invoke(this.f467433b, java.lang.Float.valueOf(f17));
        }
    }
}
