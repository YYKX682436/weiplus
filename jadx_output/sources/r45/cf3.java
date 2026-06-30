package r45;

/* loaded from: classes9.dex */
public class cf3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371517d;

    /* renamed from: e, reason: collision with root package name */
    public int f371518e;

    /* renamed from: f, reason: collision with root package name */
    public int f371519f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f371520g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f371521h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f371522i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371523m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cf3)) {
            return false;
        }
        r45.cf3 cf3Var = (r45.cf3) fVar;
        return n51.f.a(this.BaseResponse, cf3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f371517d), java.lang.Integer.valueOf(cf3Var.f371517d)) && n51.f.a(java.lang.Integer.valueOf(this.f371518e), java.lang.Integer.valueOf(cf3Var.f371518e)) && n51.f.a(java.lang.Integer.valueOf(this.f371519f), java.lang.Integer.valueOf(cf3Var.f371519f)) && n51.f.a(this.f371520g, cf3Var.f371520g) && n51.f.a(this.f371521h, cf3Var.f371521h) && n51.f.a(java.lang.Integer.valueOf(this.f371522i), java.lang.Integer.valueOf(cf3Var.f371522i)) && n51.f.a(this.f371523m, cf3Var.f371523m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371521h;
        java.util.LinkedList linkedList2 = this.f371520g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f371517d);
            fVar.e(3, this.f371518e);
            fVar.e(4, this.f371519f);
            fVar.g(5, 2, linkedList2);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f371522i);
            java.lang.String str = this.f371523m;
            if (str != null) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f371517d) + b36.f.e(3, this.f371518e) + b36.f.e(4, this.f371519f) + b36.f.g(5, 2, linkedList2) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f371522i);
            java.lang.String str2 = this.f371523m;
            return str2 != null ? i18 + b36.f.j(8, str2) : i18;
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
        r45.cf3 cf3Var = (r45.cf3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    cf3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                cf3Var.f371517d = aVar2.g(intValue);
                return 0;
            case 3:
                cf3Var.f371518e = aVar2.g(intValue);
                return 0;
            case 4:
                cf3Var.f371519f = aVar2.g(intValue);
                return 0;
            case 5:
                cf3Var.f371520g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.hm0 hm0Var = new r45.hm0();
                    if (bArr3 != null && bArr3.length > 0) {
                        hm0Var.parseFrom(bArr3);
                    }
                    cf3Var.f371521h.add(hm0Var);
                }
                return 0;
            case 7:
                cf3Var.f371522i = aVar2.g(intValue);
                return 0;
            case 8:
                cf3Var.f371523m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
