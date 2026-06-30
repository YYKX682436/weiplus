package r45;

/* loaded from: classes7.dex */
public class he extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final r45.he f376076m = new r45.he();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376077d;

    /* renamed from: e, reason: collision with root package name */
    public int f376078e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376079f;

    /* renamed from: g, reason: collision with root package name */
    public int f376080g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376081h;

    /* renamed from: i, reason: collision with root package name */
    public int f376082i;

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.he parseFrom(byte[] bArr) {
        return (r45.he) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.he)) {
            return false;
        }
        r45.he heVar = (r45.he) fVar;
        return n51.f.a(this.f376077d, heVar.f376077d) && n51.f.a(java.lang.Integer.valueOf(this.f376078e), java.lang.Integer.valueOf(heVar.f376078e)) && n51.f.a(this.f376079f, heVar.f376079f) && n51.f.a(java.lang.Integer.valueOf(this.f376080g), java.lang.Integer.valueOf(heVar.f376080g)) && n51.f.a(this.f376081h, heVar.f376081h) && n51.f.a(java.lang.Integer.valueOf(this.f376082i), java.lang.Integer.valueOf(heVar.f376082i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f376077d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f376078e);
            com.tencent.mm.protobuf.g gVar2 = this.f376079f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.f376080g);
            com.tencent.mm.protobuf.g gVar3 = this.f376081h;
            if (gVar3 != null) {
                fVar.b(5, gVar3);
            }
            fVar.e(6, this.f376082i);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar4 = this.f376077d;
            int b17 = (gVar4 != null ? 0 + b36.f.b(1, gVar4) : 0) + b36.f.e(2, this.f376078e);
            com.tencent.mm.protobuf.g gVar5 = this.f376079f;
            if (gVar5 != null) {
                b17 += b36.f.b(3, gVar5);
            }
            int e17 = b17 + b36.f.e(4, this.f376080g);
            com.tencent.mm.protobuf.g gVar6 = this.f376081h;
            if (gVar6 != null) {
                e17 += b36.f.b(5, gVar6);
            }
            return e17 + b36.f.e(6, this.f376082i);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f376077d = aVar2.d(intValue);
                return 0;
            case 2:
                this.f376078e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f376079f = aVar2.d(intValue);
                return 0;
            case 4:
                this.f376080g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f376081h = aVar2.d(intValue);
                return 0;
            case 6:
                this.f376082i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.tencent.mm.protobuf.g gVar = this.f376077d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "SessionKey", gVar, false);
            eVar.d(jSONObject, "Uin", java.lang.Integer.valueOf(this.f376078e), false);
            eVar.d(jSONObject, "DeviceID", this.f376079f, false);
            eVar.d(jSONObject, "ClientVersion", java.lang.Integer.valueOf(this.f376080g), false);
            eVar.d(jSONObject, "DeviceType", this.f376081h, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f376082i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
