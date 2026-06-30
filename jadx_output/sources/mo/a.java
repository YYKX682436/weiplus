package mo;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f330239d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f330240e;

    /* renamed from: f, reason: collision with root package name */
    public int f330241f;

    /* renamed from: g, reason: collision with root package name */
    public int f330242g;

    /* renamed from: h, reason: collision with root package name */
    public int f330243h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f330244i;

    /* renamed from: m, reason: collision with root package name */
    public int f330245m;

    /* renamed from: n, reason: collision with root package name */
    public int f330246n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof mo.a)) {
            return false;
        }
        mo.a aVar = (mo.a) fVar;
        return n51.f.a(this.f330239d, aVar.f330239d) && n51.f.a(java.lang.Integer.valueOf(this.f330240e), java.lang.Integer.valueOf(aVar.f330240e)) && n51.f.a(java.lang.Integer.valueOf(this.f330241f), java.lang.Integer.valueOf(aVar.f330241f)) && n51.f.a(java.lang.Integer.valueOf(this.f330242g), java.lang.Integer.valueOf(aVar.f330242g)) && n51.f.a(java.lang.Integer.valueOf(this.f330243h), java.lang.Integer.valueOf(aVar.f330243h)) && n51.f.a(this.f330244i, aVar.f330244i) && n51.f.a(java.lang.Integer.valueOf(this.f330245m), java.lang.Integer.valueOf(aVar.f330245m)) && n51.f.a(java.lang.Integer.valueOf(this.f330246n), java.lang.Integer.valueOf(aVar.f330246n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f330239d);
            fVar.e(2, this.f330240e);
            fVar.e(3, this.f330241f);
            fVar.e(4, this.f330242g);
            fVar.e(5, this.f330243h);
            java.lang.String str = this.f330244i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f330245m);
            fVar.e(8, this.f330246n);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f330239d) + 0 + b36.f.e(2, this.f330240e) + b36.f.e(3, this.f330241f) + b36.f.e(4, this.f330242g) + b36.f.e(5, this.f330243h);
            java.lang.String str2 = this.f330244i;
            if (str2 != null) {
                g17 += b36.f.j(6, str2);
            }
            return g17 + b36.f.e(7, this.f330245m) + b36.f.e(8, this.f330246n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f330239d.clear();
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
        mo.a aVar3 = (mo.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    mo.b bVar = new mo.b();
                    if (bArr2 != null && bArr2.length > 0) {
                        bVar.parseFrom(bArr2);
                    }
                    aVar3.f330239d.add(bVar);
                }
                return 0;
            case 2:
                aVar3.f330240e = aVar2.g(intValue);
                return 0;
            case 3:
                aVar3.f330241f = aVar2.g(intValue);
                return 0;
            case 4:
                aVar3.f330242g = aVar2.g(intValue);
                return 0;
            case 5:
                aVar3.f330243h = aVar2.g(intValue);
                return 0;
            case 6:
                aVar3.f330244i = aVar2.k(intValue);
                return 0;
            case 7:
                aVar3.f330245m = aVar2.g(intValue);
                return 0;
            case 8:
                aVar3.f330246n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.LinkedList linkedList = this.f330239d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "list", linkedList, false);
            eVar.d(jSONObject, "flag", java.lang.Integer.valueOf(this.f330240e), false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f330241f), false);
            eVar.d(jSONObject, "status", java.lang.Integer.valueOf(this.f330242g), false);
            eVar.d(jSONObject, "maxCount", java.lang.Integer.valueOf(this.f330243h), false);
            eVar.d(jSONObject, "upgrader", this.f330244i, false);
            eVar.d(jSONObject, "oldVer", java.lang.Integer.valueOf(this.f330245m), false);
            eVar.d(jSONObject, "newVer", java.lang.Integer.valueOf(this.f330246n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
