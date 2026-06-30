package r45;

/* loaded from: classes4.dex */
public class nl extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381475d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381476e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f381477f;

    /* renamed from: g, reason: collision with root package name */
    public long f381478g;

    /* renamed from: h, reason: collision with root package name */
    public int f381479h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nl)) {
            return false;
        }
        r45.nl nlVar = (r45.nl) fVar;
        return n51.f.a(this.BaseResponse, nlVar.BaseResponse) && n51.f.a(this.f381475d, nlVar.f381475d) && n51.f.a(this.f381476e, nlVar.f381476e) && n51.f.a(java.lang.Boolean.valueOf(this.f381477f), java.lang.Boolean.valueOf(nlVar.f381477f)) && n51.f.a(java.lang.Long.valueOf(this.f381478g), java.lang.Long.valueOf(nlVar.f381478g)) && n51.f.a(java.lang.Integer.valueOf(this.f381479h), java.lang.Integer.valueOf(nlVar.f381479h));
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
            java.lang.String str = this.f381475d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381476e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f381477f);
            fVar.h(11, this.f381478g);
            fVar.e(15, this.f381479h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f381475d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f381476e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.a(4, this.f381477f) + b36.f.h(11, this.f381478g) + b36.f.e(15, this.f381479h);
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
        r45.nl nlVar = (r45.nl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                nlVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            nlVar.f381475d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            nlVar.f381476e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            nlVar.f381477f = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 11) {
            nlVar.f381478g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 15) {
            return -1;
        }
        nlVar.f381479h = aVar2.g(intValue);
        return 0;
    }
}
