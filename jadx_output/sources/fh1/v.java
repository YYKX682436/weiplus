package fh1;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262608e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fh1.z zVar, java.lang.String str) {
        super(0);
        this.f262607d = zVar;
        this.f262608e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fh1.z zVar = this.f262607d;
        java.lang.String str = zVar.f262631e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRemoveFrameSet name:");
        java.lang.String frameSetName = this.f262608e;
        sb6.append(frameSetName);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        fh1.x0 a17 = zVar.a();
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        fq0.x xVar = (fq0.x) a17.C.remove(frameSetName);
        if (xVar != null) {
            xVar.i();
        }
        return jz5.f0.f302826a;
    }
}
