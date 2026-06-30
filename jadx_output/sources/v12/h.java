package v12;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v12.i f432506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v12.i iVar) {
        super(0);
        this.f432506d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MagicSnsTimeline", "biz disconnect");
        v12.i iVar = this.f432506d;
        v12.f fVar = iVar.f432507d;
        if (fVar != null) {
            fVar.f432503e = null;
        }
        iVar.f432507d = null;
        return jz5.f0.f302826a;
    }
}
