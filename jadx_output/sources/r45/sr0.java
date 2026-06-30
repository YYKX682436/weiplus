package r45;

/* loaded from: classes2.dex */
public class sr0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f385933d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385934e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385935f;

    /* renamed from: g, reason: collision with root package name */
    public int f385936g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sr0)) {
            return false;
        }
        r45.sr0 sr0Var = (r45.sr0) fVar;
        return n51.f.a(this.BaseRequest, sr0Var.BaseRequest) && n51.f.a(this.f385933d, sr0Var.f385933d) && n51.f.a(this.f385934e, sr0Var.f385934e) && n51.f.a(this.f385935f, sr0Var.f385935f) && n51.f.a(java.lang.Integer.valueOf(this.f385936g), java.lang.Integer.valueOf(sr0Var.f385936g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.kv0 kv0Var = this.f385933d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f385933d.writeFields(fVar);
            }
            java.lang.String str = this.f385934e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f385935f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f385936g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f385933d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str3 = this.f385934e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f385935f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f385936g);
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
        r45.sr0 sr0Var = (r45.sr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                sr0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                sr0Var.f385934e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                sr0Var.f385935f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            sr0Var.f385936g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.kv0 kv0Var3 = new r45.kv0();
            if (bArr2 != null && bArr2.length > 0) {
                kv0Var3.parseFrom(bArr2);
            }
            sr0Var.f385933d = kv0Var3;
        }
        return 0;
    }
}
