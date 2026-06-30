package r45;

/* loaded from: classes4.dex */
public class ss0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385959d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385960e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f385961f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f385962g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ss0)) {
            return false;
        }
        r45.ss0 ss0Var = (r45.ss0) fVar;
        return n51.f.a(this.BaseResponse, ss0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385959d), java.lang.Integer.valueOf(ss0Var.f385959d)) && n51.f.a(this.f385960e, ss0Var.f385960e) && n51.f.a(this.f385961f, ss0Var.f385961f) && n51.f.a(this.f385962g, ss0Var.f385962g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385962g;
        java.util.LinkedList linkedList2 = this.f385961f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385959d);
            java.lang.String str = this.f385960e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 1, linkedList2);
            fVar.g(5, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385959d);
            java.lang.String str2 = this.f385960e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.g(4, 1, linkedList2) + b36.f.g(5, 1, linkedList);
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
        r45.ss0 ss0Var = (r45.ss0) objArr[1];
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
                ss0Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ss0Var.f385959d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ss0Var.f385960e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ss0Var.f385961f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ss0Var.f385962g.add(aVar2.k(intValue));
        return 0;
    }
}
