package r45;

/* loaded from: classes2.dex */
public class xp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390298d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pp f390299e;

    /* renamed from: f, reason: collision with root package name */
    public r45.op f390300f;

    /* renamed from: g, reason: collision with root package name */
    public long f390301g;

    /* renamed from: h, reason: collision with root package name */
    public r45.vp f390302h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zp f390303i;

    /* renamed from: m, reason: collision with root package name */
    public r45.up f390304m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xp)) {
            return false;
        }
        r45.xp xpVar = (r45.xp) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390298d), java.lang.Integer.valueOf(xpVar.f390298d)) && n51.f.a(this.f390299e, xpVar.f390299e) && n51.f.a(this.f390300f, xpVar.f390300f) && n51.f.a(java.lang.Long.valueOf(this.f390301g), java.lang.Long.valueOf(xpVar.f390301g)) && n51.f.a(this.f390302h, xpVar.f390302h) && n51.f.a(this.f390303i, xpVar.f390303i) && n51.f.a(this.f390304m, xpVar.f390304m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390298d);
            r45.pp ppVar = this.f390299e;
            if (ppVar != null) {
                fVar.i(2, ppVar.computeSize());
                this.f390299e.writeFields(fVar);
            }
            r45.op opVar = this.f390300f;
            if (opVar != null) {
                fVar.i(3, opVar.computeSize());
                this.f390300f.writeFields(fVar);
            }
            fVar.h(4, this.f390301g);
            r45.vp vpVar = this.f390302h;
            if (vpVar != null) {
                fVar.i(5, vpVar.computeSize());
                this.f390302h.writeFields(fVar);
            }
            r45.zp zpVar = this.f390303i;
            if (zpVar != null) {
                fVar.i(6, zpVar.computeSize());
                this.f390303i.writeFields(fVar);
            }
            r45.up upVar = this.f390304m;
            if (upVar != null) {
                fVar.i(7, upVar.computeSize());
                this.f390304m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390298d) + 0;
            r45.pp ppVar2 = this.f390299e;
            if (ppVar2 != null) {
                e17 += b36.f.i(2, ppVar2.computeSize());
            }
            r45.op opVar2 = this.f390300f;
            if (opVar2 != null) {
                e17 += b36.f.i(3, opVar2.computeSize());
            }
            int h17 = e17 + b36.f.h(4, this.f390301g);
            r45.vp vpVar2 = this.f390302h;
            if (vpVar2 != null) {
                h17 += b36.f.i(5, vpVar2.computeSize());
            }
            r45.zp zpVar2 = this.f390303i;
            if (zpVar2 != null) {
                h17 += b36.f.i(6, zpVar2.computeSize());
            }
            r45.up upVar2 = this.f390304m;
            return upVar2 != null ? h17 + b36.f.i(7, upVar2.computeSize()) : h17;
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
        r45.xp xpVar = (r45.xp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xpVar.f390298d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.pp ppVar3 = new r45.pp();
                    if (bArr != null && bArr.length > 0) {
                        ppVar3.parseFrom(bArr);
                    }
                    xpVar.f390299e = ppVar3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.op opVar3 = new r45.op();
                    if (bArr2 != null && bArr2.length > 0) {
                        opVar3.parseFrom(bArr2);
                    }
                    xpVar.f390300f = opVar3;
                }
                return 0;
            case 4:
                xpVar.f390301g = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.vp vpVar3 = new r45.vp();
                    if (bArr3 != null && bArr3.length > 0) {
                        vpVar3.parseFrom(bArr3);
                    }
                    xpVar.f390302h = vpVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.zp zpVar3 = new r45.zp();
                    if (bArr4 != null && bArr4.length > 0) {
                        zpVar3.parseFrom(bArr4);
                    }
                    xpVar.f390303i = zpVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.up upVar3 = new r45.up();
                    if (bArr5 != null && bArr5.length > 0) {
                        upVar3.parseFrom(bArr5);
                    }
                    xpVar.f390304m = upVar3;
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f390298d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Type", valueOf, false);
            eVar.d(jSONObject, "ContactItem", this.f390299e, false);
            eVar.d(jSONObject, "CommonItem", this.f390300f, false);
            eVar.d(jSONObject, "DocID", java.lang.Long.valueOf(this.f390301g), false);
            eVar.d(jSONObject, "ProductItem", this.f390302h, false);
            eVar.d(jSONObject, "SnsItem", this.f390303i, false);
            eVar.d(jSONObject, "POIItem", this.f390304m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
