package r45;

/* loaded from: classes9.dex */
public class vn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388399d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388400e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f388401f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vn6)) {
            return false;
        }
        r45.vn6 vn6Var = (r45.vn6) fVar;
        return n51.f.a(this.f388399d, vn6Var.f388399d) && n51.f.a(this.f388400e, vn6Var.f388400e) && n51.f.a(this.f388401f, vn6Var.f388401f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388401f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388399d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388400e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f388399d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f388400e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, linkedList);
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
        r45.vn6 vn6Var = (r45.vn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vn6Var.f388399d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            vn6Var.f388400e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.ir0 ir0Var = new r45.ir0();
            if (bArr2 != null && bArr2.length > 0) {
                ir0Var.parseFrom(bArr2);
            }
            vn6Var.f388401f.add(ir0Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f388399d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "feedbackDetailWording", str, false);
            eVar.d(jSONObject, "feedbackDetailUrl", this.f388400e, false);
            eVar.d(jSONObject, "feedbackItemList", this.f388401f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
