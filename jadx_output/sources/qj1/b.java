package qj1;

/* loaded from: classes4.dex */
public final class b extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f363866d = {l75.n0.getCreateSQLs(qj1.a.f363865d, "AppBrandCommonKVBinaryData")};

    public b(l75.k0 k0Var) {
        super(k0Var, qj1.a.f363865d, "AppBrandCommonKVBinaryData", null);
    }

    public void D0(java.lang.String str, byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        qj1.a aVar = new qj1.a();
        aVar.field_key = str;
        aVar.field_value = bArr;
        super.replace(aVar);
    }

    public void y0(java.lang.String str) {
        qj1.a aVar = new qj1.a();
        aVar.field_key = str;
        aVar.field_value = new byte[0];
        super.replace(aVar);
    }

    public byte[] z0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        qj1.a aVar = new qj1.a();
        aVar.field_key = str;
        if (super.get(aVar, new java.lang.String[0])) {
            return aVar.field_value;
        }
        return null;
    }
}
