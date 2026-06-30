package r45;

/* loaded from: classes9.dex */
public class qr6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384231d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384232e;

    /* renamed from: f, reason: collision with root package name */
    public r45.b74 f384233f;

    /* renamed from: g, reason: collision with root package name */
    public r45.b74 f384234g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qr6)) {
            return false;
        }
        r45.qr6 qr6Var = (r45.qr6) fVar;
        return n51.f.a(this.f384231d, qr6Var.f384231d) && n51.f.a(this.f384232e, qr6Var.f384232e) && n51.f.a(this.f384233f, qr6Var.f384233f) && n51.f.a(this.f384234g, qr6Var.f384234g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384231d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384232e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.b74 b74Var = this.f384233f;
            if (b74Var != null) {
                fVar.i(3, b74Var.computeSize());
                this.f384233f.writeFields(fVar);
            }
            r45.b74 b74Var2 = this.f384234g;
            if (b74Var2 != null) {
                fVar.i(4, b74Var2.computeSize());
                this.f384234g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f384231d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f384232e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.b74 b74Var3 = this.f384233f;
            if (b74Var3 != null) {
                j17 += b36.f.i(3, b74Var3.computeSize());
            }
            r45.b74 b74Var4 = this.f384234g;
            return b74Var4 != null ? j17 + b36.f.i(4, b74Var4.computeSize()) : j17;
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
        r45.qr6 qr6Var = (r45.qr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qr6Var.f384231d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qr6Var.f384232e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.b74 b74Var5 = new r45.b74();
                if (bArr != null && bArr.length > 0) {
                    b74Var5.parseFrom(bArr);
                }
                qr6Var.f384233f = b74Var5;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.b74 b74Var6 = new r45.b74();
            if (bArr2 != null && bArr2.length > 0) {
                b74Var6.parseFrom(bArr2);
            }
            qr6Var.f384234g = b74Var6;
        }
        return 0;
    }
}
