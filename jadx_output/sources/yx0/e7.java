package yx0;

/* loaded from: classes5.dex */
public final class e7 implements com.tencent.maas.camstudio.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467288a;

    public e7(yz5.l lVar) {
        this.f467288a = lVar;
    }

    @Override // com.tencent.maas.camstudio.u
    public final void onProgress(float f17) {
        yz5.l lVar = this.f467288a;
        if (lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(f17));
        }
    }
}
