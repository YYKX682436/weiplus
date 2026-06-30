package r45;

/* loaded from: classes4.dex */
public class cu6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371843d;

    /* renamed from: e, reason: collision with root package name */
    public int f371844e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371845f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371846g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371847h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cu6)) {
            return false;
        }
        r45.cu6 cu6Var = (r45.cu6) fVar;
        return n51.f.a(this.BaseResponse, cu6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f371843d), java.lang.Integer.valueOf(cu6Var.f371843d)) && n51.f.a(java.lang.Integer.valueOf(this.f371844e), java.lang.Integer.valueOf(cu6Var.f371844e)) && n51.f.a(this.f371845f, cu6Var.f371845f) && n51.f.a(this.f371846g, cu6Var.f371846g) && n51.f.a(this.f371847h, cu6Var.f371847h);
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
            fVar.e(2, this.f371843d);
            fVar.e(3, this.f371844e);
            java.lang.String str = this.f371845f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f371846g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f371847h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f371843d) + b36.f.e(3, this.f371844e);
            java.lang.String str4 = this.f371845f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f371846g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f371847h;
            return str6 != null ? i18 + b36.f.j(6, str6) : i18;
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
        r45.cu6 cu6Var = (r45.cu6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    cu6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                cu6Var.f371843d = aVar2.g(intValue);
                return 0;
            case 3:
                cu6Var.f371844e = aVar2.g(intValue);
                return 0;
            case 4:
                cu6Var.f371845f = aVar2.k(intValue);
                return 0;
            case 5:
                cu6Var.f371846g = aVar2.k(intValue);
                return 0;
            case 6:
                cu6Var.f371847h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
