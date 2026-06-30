package ra3;

/* loaded from: classes9.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f393541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, java.lang.String str) {
        super(1);
        this.f393541d = j17;
        this.f393542e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String pathByLiteAppLocalId;
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        return (!r26.i0.y(path, "liteappLocalId://", false) || (pathByLiteAppLocalId = com.tencent.mm.plugin.lite.LiteAppCenter.getPathByLiteAppLocalId(this.f393541d, this.f393542e, path)) == null) ? path : pathByLiteAppLocalId;
    }
}
