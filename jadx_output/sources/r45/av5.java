package r45;

/* loaded from: classes2.dex */
public class av5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370277d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370278e;

    /* renamed from: f, reason: collision with root package name */
    public int f370279f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370280g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.av5)) {
            return false;
        }
        r45.av5 av5Var = (r45.av5) fVar;
        return n51.f.a(this.BaseResponse, av5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370277d), java.lang.Integer.valueOf(av5Var.f370277d)) && n51.f.a(this.f370278e, av5Var.f370278e) && n51.f.a(java.lang.Integer.valueOf(this.f370279f), java.lang.Integer.valueOf(av5Var.f370279f)) && n51.f.a(this.f370280g, av5Var.f370280g);
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
            fVar.e(2, this.f370277d);
            java.lang.String str = this.f370278e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f370279f);
            java.lang.String str2 = this.f370280g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f370277d);
            java.lang.String str3 = this.f370278e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f370279f);
            java.lang.String str4 = this.f370280g;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
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
        r45.av5 av5Var = (r45.av5) objArr[1];
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
                av5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            av5Var.f370277d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            av5Var.f370278e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            av5Var.f370279f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        av5Var.f370280g = aVar2.k(intValue);
        return 0;
    }
}
