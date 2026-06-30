package p33;

/* loaded from: classes4.dex */
public class o extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f351624d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f351625e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f351626f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f351627g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.o)) {
            return false;
        }
        p33.o oVar = (p33.o) fVar;
        return n51.f.a(this.BaseResponse, oVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f351624d), java.lang.Integer.valueOf(oVar.f351624d)) && n51.f.a(this.f351625e, oVar.f351625e) && n51.f.a(this.f351626f, oVar.f351626f) && n51.f.a(this.f351627g, oVar.f351627g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f351627g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f351624d);
            java.lang.String str = this.f351625e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f351626f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f351624d);
            java.lang.String str3 = this.f351625e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f351626f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        p33.o oVar = (p33.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                oVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            oVar.f351624d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            oVar.f351625e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            oVar.f351626f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            p33.e0 e0Var = new p33.e0();
            if (bArr3 != null && bArr3.length > 0) {
                e0Var.parseFrom(bArr3);
            }
            oVar.f351627g.add(e0Var);
        }
        return 0;
    }
}
