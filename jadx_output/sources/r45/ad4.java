package r45;

/* loaded from: classes8.dex */
public class ad4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f369942d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f369943e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.bd4 f369944f;

    /* renamed from: g, reason: collision with root package name */
    public int f369945g;

    /* renamed from: h, reason: collision with root package name */
    public int f369946h;

    /* renamed from: i, reason: collision with root package name */
    public long f369947i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369948m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ad4)) {
            return false;
        }
        r45.ad4 ad4Var = (r45.ad4) fVar;
        return n51.f.a(this.f369942d, ad4Var.f369942d) && n51.f.a(this.f369943e, ad4Var.f369943e) && n51.f.a(this.f369944f, ad4Var.f369944f) && n51.f.a(java.lang.Integer.valueOf(this.f369945g), java.lang.Integer.valueOf(ad4Var.f369945g)) && n51.f.a(java.lang.Integer.valueOf(this.f369946h), java.lang.Integer.valueOf(ad4Var.f369946h)) && n51.f.a(java.lang.Long.valueOf(this.f369947i), java.lang.Long.valueOf(ad4Var.f369947i)) && n51.f.a(this.f369948m, ad4Var.f369948m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f369943e;
        java.util.LinkedList linkedList2 = this.f369942d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            r45.bd4 bd4Var = this.f369944f;
            if (bd4Var != null) {
                fVar.i(3, bd4Var.computeSize());
                this.f369944f.writeFields(fVar);
            }
            fVar.e(4, this.f369945g);
            fVar.e(5, this.f369946h);
            fVar.h(6, this.f369947i);
            java.lang.String str = this.f369948m;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
            r45.bd4 bd4Var2 = this.f369944f;
            if (bd4Var2 != null) {
                g17 += b36.f.i(3, bd4Var2.computeSize());
            }
            int e17 = g17 + b36.f.e(4, this.f369945g) + b36.f.e(5, this.f369946h) + b36.f.h(6, this.f369947i);
            java.lang.String str2 = this.f369948m;
            return str2 != null ? e17 + b36.f.j(7, str2) : e17;
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
        r45.ad4 ad4Var = (r45.ad4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.bd4 bd4Var3 = new r45.bd4();
                    if (bArr2 != null && bArr2.length > 0) {
                        bd4Var3.parseFrom(bArr2);
                    }
                    ad4Var.f369942d.add(bd4Var3);
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.bd4 bd4Var4 = new r45.bd4();
                    if (bArr3 != null && bArr3.length > 0) {
                        bd4Var4.parseFrom(bArr3);
                    }
                    ad4Var.f369943e.add(bd4Var4);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.bd4 bd4Var5 = new r45.bd4();
                    if (bArr4 != null && bArr4.length > 0) {
                        bd4Var5.parseFrom(bArr4);
                    }
                    ad4Var.f369944f = bd4Var5;
                }
                return 0;
            case 4:
                ad4Var.f369945g = aVar2.g(intValue);
                return 0;
            case 5:
                ad4Var.f369946h = aVar2.g(intValue);
                return 0;
            case 6:
                ad4Var.f369947i = aVar2.i(intValue);
                return 0;
            case 7:
                ad4Var.f369948m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.LinkedList linkedList = this.f369942d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "startPart", linkedList, false);
            eVar.d(jSONObject, "showPart", this.f369943e, false);
            eVar.d(jSONObject, "endPart", this.f369944f, false);
            eVar.d(jSONObject, "hasRealTitle", java.lang.Integer.valueOf(this.f369945g), false);
            eVar.d(jSONObject, "foldSolitaireCount", java.lang.Integer.valueOf(this.f369946h), false);
            eVar.d(jSONObject, "msgSvrId", java.lang.Long.valueOf(this.f369947i), false);
            eVar.d(jSONObject, "key", this.f369948m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
