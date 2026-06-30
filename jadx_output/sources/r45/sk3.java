package r45;

/* loaded from: classes8.dex */
public class sk3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385806d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385807e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f385808f;

    /* renamed from: g, reason: collision with root package name */
    public int f385809g;

    /* renamed from: h, reason: collision with root package name */
    public int f385810h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sk3)) {
            return false;
        }
        r45.sk3 sk3Var = (r45.sk3) fVar;
        return n51.f.a(this.BaseResponse, sk3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385806d), java.lang.Integer.valueOf(sk3Var.f385806d)) && n51.f.a(this.f385807e, sk3Var.f385807e) && n51.f.a(java.lang.Integer.valueOf(this.f385808f), java.lang.Integer.valueOf(sk3Var.f385808f)) && n51.f.a(java.lang.Integer.valueOf(this.f385809g), java.lang.Integer.valueOf(sk3Var.f385809g)) && n51.f.a(java.lang.Integer.valueOf(this.f385810h), java.lang.Integer.valueOf(sk3Var.f385810h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385807e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385806d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f385808f);
            fVar.e(5, this.f385809g);
            fVar.e(6, this.f385810h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385806d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f385808f) + b36.f.e(5, this.f385809g) + b36.f.e(6, this.f385810h);
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
        r45.sk3 sk3Var = (r45.sk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    sk3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                sk3Var.f385806d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.n35 n35Var = new r45.n35();
                    if (bArr3 != null && bArr3.length > 0) {
                        n35Var.parseFrom(bArr3);
                    }
                    sk3Var.f385807e.add(n35Var);
                }
                return 0;
            case 4:
                sk3Var.f385808f = aVar2.g(intValue);
                return 0;
            case 5:
                sk3Var.f385809g = aVar2.g(intValue);
                return 0;
            case 6:
                sk3Var.f385810h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
