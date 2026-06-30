package r45;

/* loaded from: classes11.dex */
public class vy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388657d;

    /* renamed from: f, reason: collision with root package name */
    public int f388659f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f388660g;

    /* renamed from: h, reason: collision with root package name */
    public int f388661h;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f388658e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f388662i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vy)) {
            return false;
        }
        r45.vy vyVar = (r45.vy) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388657d), java.lang.Integer.valueOf(vyVar.f388657d)) && n51.f.a(this.f388658e, vyVar.f388658e) && n51.f.a(java.lang.Integer.valueOf(this.f388659f), java.lang.Integer.valueOf(vyVar.f388659f)) && n51.f.a(this.f388660g, vyVar.f388660g) && n51.f.a(java.lang.Integer.valueOf(this.f388661h), java.lang.Integer.valueOf(vyVar.f388661h)) && n51.f.a(this.f388662i, vyVar.f388662i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388662i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388657d);
            fVar.g(2, 8, this.f388658e);
            fVar.e(3, this.f388659f);
            r45.du5 du5Var = this.f388660g;
            if (du5Var != null) {
                fVar.i(4, du5Var.computeSize());
                this.f388660g.writeFields(fVar);
            }
            fVar.e(5, this.f388661h);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388657d) + 0 + b36.f.g(2, 8, this.f388658e) + b36.f.e(3, this.f388659f);
            r45.du5 du5Var2 = this.f388660g;
            if (du5Var2 != null) {
                e17 += b36.f.i(4, du5Var2.computeSize());
            }
            return e17 + b36.f.e(5, this.f388661h) + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388658e.clear();
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
        r45.vy vyVar = (r45.vy) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vyVar.f388657d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.wy wyVar = new r45.wy();
                    if (bArr2 != null && bArr2.length > 0) {
                        wyVar.parseFrom(bArr2);
                    }
                    vyVar.f388658e.add(wyVar);
                }
                return 0;
            case 3:
                vyVar.f388659f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    vyVar.f388660g = du5Var3;
                }
                return 0;
            case 5:
                vyVar.f388661h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.az azVar = new r45.az();
                    if (bArr4 != null && bArr4.length > 0) {
                        azVar.parseFrom(bArr4);
                    }
                    vyVar.f388662i.add(azVar);
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f388657d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "MemberCount", valueOf, false);
            eVar.d(jSONObject, "ChatRoomMember", this.f388658e, false);
            eVar.d(jSONObject, "InfoMask", java.lang.Integer.valueOf(this.f388659f), false);
            eVar.d(jSONObject, "ChatRoomUserName", this.f388660g, false);
            eVar.d(jSONObject, "WatchMemberCount", java.lang.Integer.valueOf(this.f388661h), false);
            eVar.d(jSONObject, "WatchMembers", this.f388662i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
