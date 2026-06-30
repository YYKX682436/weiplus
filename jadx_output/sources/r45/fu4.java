package r45;

/* loaded from: classes4.dex */
public class fu4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.v75 f374599d;

    static {
        new r45.fu4();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fu4)) {
            return false;
        }
        r45.fu4 fu4Var = (r45.fu4) fVar;
        return n51.f.a(this.BaseResponse, fu4Var.BaseResponse) && n51.f.a(this.f374599d, fu4Var.f374599d);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.fu4();
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
            r45.v75 v75Var = this.f374599d;
            if (v75Var != null) {
                fVar.i(2, v75Var.computeSize());
                this.f374599d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.v75 v75Var2 = this.f374599d;
            return v75Var2 != null ? i18 + b36.f.i(2, v75Var2.computeSize()) : i18;
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
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.v75 v75Var3 = new r45.v75();
            if (bArr2 != null && bArr2.length > 0) {
                v75Var3.parseFrom(bArr2);
            }
            this.f374599d = v75Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.fu4) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
