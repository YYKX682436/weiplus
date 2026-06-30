package eq1;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f255790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.modelbase.f fVar, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f255790d = fVar;
        this.f255791e = str;
        this.f255792f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.modelbase.f fVar = this.f255790d;
        if (((com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2)) != null) {
            eq1.h hVar = eq1.h.f255812a;
            com.tencent.mars.xlog.Log.i("BizChatUtil", "it.resp.feedObject != null");
            java.lang.Object obj = eq1.h.f255814c;
            ((com.tencent.mm.sdk.platformtools.r2) obj).put(this.f255791e, (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2));
        }
        yz5.l lVar = this.f255792f;
        if (lVar != null) {
            lVar.invoke((com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2));
        }
        return jz5.f0.f302826a;
    }
}
