package r45;

/* loaded from: classes2.dex */
public class fc5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374205d;

    /* renamed from: e, reason: collision with root package name */
    public r45.k80 f374206e;

    /* renamed from: f, reason: collision with root package name */
    public r45.f04 f374207f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fc5)) {
            return false;
        }
        r45.fc5 fc5Var = (r45.fc5) fVar;
        return n51.f.a(this.BaseResponse, fc5Var.BaseResponse) && n51.f.a(this.f374205d, fc5Var.f374205d) && n51.f.a(this.f374206e, fc5Var.f374206e) && n51.f.a(this.f374207f, fc5Var.f374207f);
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
            com.tencent.mm.protobuf.g gVar = this.f374205d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            r45.k80 k80Var = this.f374206e;
            if (k80Var != null) {
                fVar.i(3, k80Var.computeSize());
                this.f374206e.writeFields(fVar);
            }
            r45.f04 f04Var = this.f374207f;
            if (f04Var != null) {
                fVar.i(100, f04Var.computeSize());
                this.f374207f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f374205d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            r45.k80 k80Var2 = this.f374206e;
            if (k80Var2 != null) {
                i18 += b36.f.i(3, k80Var2.computeSize());
            }
            r45.f04 f04Var2 = this.f374207f;
            return f04Var2 != null ? i18 + b36.f.i(100, f04Var2.computeSize()) : i18;
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
        r45.fc5 fc5Var = (r45.fc5) objArr[1];
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
                fc5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            fc5Var.f374205d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.k80 k80Var3 = new r45.k80();
                if (bArr2 != null && bArr2.length > 0) {
                    k80Var3.parseFrom(bArr2);
                }
                fc5Var.f374206e = k80Var3;
            }
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.f04 f04Var3 = new r45.f04();
            if (bArr3 != null && bArr3.length > 0) {
                f04Var3.parseFrom(bArr3);
            }
            fc5Var.f374207f = f04Var3;
        }
        return 0;
    }
}
