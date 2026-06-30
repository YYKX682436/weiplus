package o33;

/* loaded from: classes2.dex */
public class b extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f342726d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f342727e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f342728f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f342729g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o33.b)) {
            return false;
        }
        o33.b bVar = (o33.b) fVar;
        return n51.f.a(this.BaseResponse, bVar.BaseResponse) && n51.f.a(this.f342726d, bVar.f342726d) && n51.f.a(this.f342727e, bVar.f342727e) && n51.f.a(this.f342728f, bVar.f342728f) && n51.f.a(java.lang.Boolean.valueOf(this.f342729g), java.lang.Boolean.valueOf(bVar.f342729g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f342727e;
        java.util.LinkedList linkedList2 = this.f342726d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f342728f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.a(5, this.f342729g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f342728f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            return i18 + b36.f.a(5, this.f342729g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        o33.b bVar = (o33.b) objArr[1];
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
                bVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                o33.f fVar2 = new o33.f();
                if (bArr3 != null && bArr3.length > 0) {
                    fVar2.parseFrom(bArr3);
                }
                bVar.f342726d.add(fVar2);
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                bVar.f342728f = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            bVar.f342729g = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            o33.f fVar3 = new o33.f();
            if (bArr4 != null && bArr4.length > 0) {
                fVar3.parseFrom(bArr4);
            }
            bVar.f342727e.add(fVar3);
        }
        return 0;
    }
}
