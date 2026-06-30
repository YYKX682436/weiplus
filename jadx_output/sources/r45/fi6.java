package r45;

/* loaded from: classes4.dex */
public class fi6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f374387d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374388e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374389f;

    /* renamed from: g, reason: collision with root package name */
    public r45.h40 f374390g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fi6)) {
            return false;
        }
        r45.fi6 fi6Var = (r45.fi6) fVar;
        return n51.f.a(this.f374387d, fi6Var.f374387d) && n51.f.a(this.f374388e, fi6Var.f374388e) && n51.f.a(this.f374389f, fi6Var.f374389f) && n51.f.a(this.f374390g, fi6Var.f374390g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f374387d);
            com.tencent.mm.protobuf.g gVar = this.f374388e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f374389f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.h40 h40Var = this.f374390g;
            if (h40Var != null) {
                fVar.i(4, h40Var.computeSize());
                this.f374390g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f374387d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f374388e;
            if (gVar2 != null) {
                g17 += b36.f.b(2, gVar2);
            }
            java.lang.String str2 = this.f374389f;
            if (str2 != null) {
                g17 += b36.f.j(3, str2);
            }
            r45.h40 h40Var2 = this.f374390g;
            return h40Var2 != null ? g17 + b36.f.i(4, h40Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f374387d.clear();
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
        r45.fi6 fi6Var = (r45.fi6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.di6 di6Var = new r45.di6();
                if (bArr2 != null && bArr2.length > 0) {
                    di6Var.parseFrom(bArr2);
                }
                fi6Var.f374387d.add(di6Var);
            }
            return 0;
        }
        if (intValue == 2) {
            fi6Var.f374388e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            fi6Var.f374389f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.h40 h40Var3 = new r45.h40();
            if (bArr3 != null && bArr3.length > 0) {
                h40Var3.parseFrom(bArr3);
            }
            fi6Var.f374390g = h40Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.LinkedList linkedList = this.f374387d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Items", linkedList, false);
            eVar.d(jSONObject, "DebugInfo", this.f374388e, false);
            eVar.d(jSONObject, "ExtInfo", this.f374389f, false);
            eVar.d(jSONObject, "ClientCtrlInfo", this.f374390g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
