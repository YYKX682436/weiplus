package r45;

/* loaded from: classes4.dex */
public class nw5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381714d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f381715e;

    /* renamed from: f, reason: collision with root package name */
    public long f381716f;

    static {
        new r45.nw5();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nw5)) {
            return false;
        }
        r45.nw5 nw5Var = (r45.nw5) fVar;
        return n51.f.a(this.BaseResponse, nw5Var.BaseResponse) && n51.f.a(this.f381714d, nw5Var.f381714d) && n51.f.a(this.f381715e, nw5Var.f381715e) && n51.f.a(java.lang.Long.valueOf(this.f381716f), java.lang.Long.valueOf(nw5Var.f381716f));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.nw5();
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
            java.lang.String str = this.f381714d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f381715e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f381715e.writeFields(fVar);
            }
            fVar.h(4, this.f381716f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f381714d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.cu5 cu5Var2 = this.f381715e;
            if (cu5Var2 != null) {
                i18 += b36.f.i(3, cu5Var2.computeSize());
            }
            return i18 + b36.f.h(4, this.f381716f);
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
                this.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f381714d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f381716f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            this.f381715e = cu5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.nw5) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
