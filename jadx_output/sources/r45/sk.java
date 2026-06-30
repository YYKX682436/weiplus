package r45;

/* loaded from: classes2.dex */
public class sk extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385804d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385805e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sk)) {
            return false;
        }
        r45.sk skVar = (r45.sk) fVar;
        return n51.f.a(this.BaseResponse, skVar.BaseResponse) && n51.f.a(this.f385804d, skVar.f385804d) && n51.f.a(this.f385805e, skVar.f385805e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385805e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f385804d;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f385804d;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.g(4, 1, linkedList);
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
        r45.sk skVar = (r45.sk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 3) {
                skVar.f385804d = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            skVar.f385805e.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr2 = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr2 != null && bArr2.length > 0) {
                ieVar3.parseFrom(bArr2);
            }
            skVar.BaseResponse = ieVar3;
        }
        return 0;
    }
}
