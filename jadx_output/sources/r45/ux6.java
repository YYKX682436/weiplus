package r45;

/* loaded from: classes11.dex */
public class ux6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387722d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387723e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387724f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f387725g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f387726h;

    /* renamed from: i, reason: collision with root package name */
    public r45.du5 f387727i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f387728m;

    /* renamed from: n, reason: collision with root package name */
    public int f387729n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f387730o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f387731p;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 384;
        lVar.f70666c = "/cgi-bin/micromsg-bin/newverifypasswd";
        lVar.f70664a = this;
        lVar.f70665b = new r45.vx6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ux6)) {
            return false;
        }
        r45.ux6 ux6Var = (r45.ux6) fVar;
        return n51.f.a(this.BaseRequest, ux6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f387722d), java.lang.Integer.valueOf(ux6Var.f387722d)) && n51.f.a(this.f387723e, ux6Var.f387723e) && n51.f.a(this.f387724f, ux6Var.f387724f) && n51.f.a(this.f387725g, ux6Var.f387725g) && n51.f.a(this.f387726h, ux6Var.f387726h) && n51.f.a(this.f387727i, ux6Var.f387727i) && n51.f.a(this.f387728m, ux6Var.f387728m) && n51.f.a(java.lang.Integer.valueOf(this.f387729n), java.lang.Integer.valueOf(ux6Var.f387729n)) && n51.f.a(this.f387730o, ux6Var.f387730o) && n51.f.a(this.f387731p, ux6Var.f387731p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f387722d);
            java.lang.String str = this.f387723e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f387724f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.du5 du5Var = this.f387725g;
            if (du5Var != null) {
                fVar.i(5, du5Var.computeSize());
                this.f387725g.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f387726h;
            if (du5Var2 != null) {
                fVar.i(6, du5Var2.computeSize());
                this.f387726h.writeFields(fVar);
            }
            r45.du5 du5Var3 = this.f387727i;
            if (du5Var3 != null) {
                fVar.i(7, du5Var3.computeSize());
                this.f387727i.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f387728m;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.computeSize());
                this.f387728m.writeFields(fVar);
            }
            fVar.e(9, this.f387729n);
            r45.cu5 cu5Var2 = this.f387730o;
            if (cu5Var2 != null) {
                fVar.i(10, cu5Var2.computeSize());
                this.f387730o.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f387731p;
            if (cu5Var3 != null) {
                fVar.i(11, cu5Var3.computeSize());
                this.f387731p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f387722d);
            java.lang.String str3 = this.f387723e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f387724f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.du5 du5Var4 = this.f387725g;
            if (du5Var4 != null) {
                i18 += b36.f.i(5, du5Var4.computeSize());
            }
            r45.du5 du5Var5 = this.f387726h;
            if (du5Var5 != null) {
                i18 += b36.f.i(6, du5Var5.computeSize());
            }
            r45.du5 du5Var6 = this.f387727i;
            if (du5Var6 != null) {
                i18 += b36.f.i(7, du5Var6.computeSize());
            }
            r45.cu5 cu5Var4 = this.f387728m;
            if (cu5Var4 != null) {
                i18 += b36.f.i(8, cu5Var4.computeSize());
            }
            int e17 = i18 + b36.f.e(9, this.f387729n);
            r45.cu5 cu5Var5 = this.f387730o;
            if (cu5Var5 != null) {
                e17 += b36.f.i(10, cu5Var5.computeSize());
            }
            r45.cu5 cu5Var6 = this.f387731p;
            return cu5Var6 != null ? e17 + b36.f.i(11, cu5Var6.computeSize()) : e17;
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
        r45.ux6 ux6Var = (r45.ux6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    ux6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ux6Var.f387722d = aVar2.g(intValue);
                return 0;
            case 3:
                ux6Var.f387723e = aVar2.k(intValue);
                return 0;
            case 4:
                ux6Var.f387724f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var7 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var7.b(bArr2);
                    }
                    ux6Var.f387725g = du5Var7;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var8 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var8.b(bArr3);
                    }
                    ux6Var.f387726h = du5Var8;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var9.b(bArr4);
                    }
                    ux6Var.f387727i = du5Var9;
                }
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var7.b(bArr5);
                    }
                    ux6Var.f387728m = cu5Var7;
                }
                return 0;
            case 9:
                ux6Var.f387729n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var8.b(bArr6);
                    }
                    ux6Var.f387730o = cu5Var8;
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var9.b(bArr7);
                    }
                    ux6Var.f387731p = cu5Var9;
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
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "OpCode", java.lang.Integer.valueOf(this.f387722d), false);
            eVar.d(jSONObject, "Pwd1", this.f387723e, false);
            eVar.d(jSONObject, "Pwd2", this.f387724f, false);
            eVar.d(jSONObject, "ImgSid", this.f387725g, false);
            eVar.d(jSONObject, "ImgCode", this.f387726h, false);
            eVar.d(jSONObject, "ImgEncryptKey", this.f387727i, false);
            eVar.d(jSONObject, "KSid", this.f387728m, false);
            eVar.d(jSONObject, "Scence", java.lang.Integer.valueOf(this.f387729n), false);
            eVar.d(jSONObject, "WTLoginReqBuff", this.f387730o, false);
            eVar.d(jSONObject, "AutoAuthKey", this.f387731p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
