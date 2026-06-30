package r45;

/* loaded from: classes2.dex */
public class xr0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390351d;

    /* renamed from: e, reason: collision with root package name */
    public int f390352e;

    /* renamed from: f, reason: collision with root package name */
    public long f390353f;

    /* renamed from: g, reason: collision with root package name */
    public long f390354g;

    /* renamed from: h, reason: collision with root package name */
    public int f390355h;

    /* renamed from: i, reason: collision with root package name */
    public int f390356i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xr0)) {
            return false;
        }
        r45.xr0 xr0Var = (r45.xr0) fVar;
        return n51.f.a(this.BaseResponse, xr0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f390351d), java.lang.Integer.valueOf(xr0Var.f390351d)) && n51.f.a(java.lang.Integer.valueOf(this.f390352e), java.lang.Integer.valueOf(xr0Var.f390352e)) && n51.f.a(java.lang.Long.valueOf(this.f390353f), java.lang.Long.valueOf(xr0Var.f390353f)) && n51.f.a(java.lang.Long.valueOf(this.f390354g), java.lang.Long.valueOf(xr0Var.f390354g)) && n51.f.a(java.lang.Integer.valueOf(this.f390355h), java.lang.Integer.valueOf(xr0Var.f390355h)) && n51.f.a(java.lang.Integer.valueOf(this.f390356i), java.lang.Integer.valueOf(xr0Var.f390356i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f390351d);
            fVar.e(3, this.f390352e);
            fVar.h(4, this.f390353f);
            fVar.h(5, this.f390354g);
            fVar.e(6, this.f390355h);
            fVar.e(7, this.f390356i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f390351d) + b36.f.e(3, this.f390352e) + b36.f.h(4, this.f390353f) + b36.f.h(5, this.f390354g) + b36.f.e(6, this.f390355h) + b36.f.e(7, this.f390356i);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.xr0 xr0Var = (r45.xr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    xr0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                xr0Var.f390351d = aVar2.g(intValue);
                return 0;
            case 3:
                xr0Var.f390352e = aVar2.g(intValue);
                return 0;
            case 4:
                xr0Var.f390353f = aVar2.i(intValue);
                return 0;
            case 5:
                xr0Var.f390354g = aVar2.i(intValue);
                return 0;
            case 6:
                xr0Var.f390355h = aVar2.g(intValue);
                return 0;
            case 7:
                xr0Var.f390356i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
