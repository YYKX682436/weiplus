package r45;

/* loaded from: classes4.dex */
public class yc4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.wc4 f390962d;

    /* renamed from: e, reason: collision with root package name */
    public r45.st4 f390963e;

    /* renamed from: f, reason: collision with root package name */
    public int f390964f;

    /* renamed from: g, reason: collision with root package name */
    public int f390965g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yc4)) {
            return false;
        }
        r45.yc4 yc4Var = (r45.yc4) fVar;
        return n51.f.a(this.BaseResponse, yc4Var.BaseResponse) && n51.f.a(this.f390962d, yc4Var.f390962d) && n51.f.a(this.f390963e, yc4Var.f390963e) && n51.f.a(java.lang.Integer.valueOf(this.f390964f), java.lang.Integer.valueOf(yc4Var.f390964f)) && n51.f.a(java.lang.Integer.valueOf(this.f390965g), java.lang.Integer.valueOf(yc4Var.f390965g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.wc4 wc4Var = this.f390962d;
            if (wc4Var != null) {
                fVar.i(2, wc4Var.computeSize());
                this.f390962d.writeFields(fVar);
            }
            r45.st4 st4Var = this.f390963e;
            if (st4Var != null) {
                fVar.i(3, st4Var.computeSize());
                this.f390963e.writeFields(fVar);
            }
            fVar.e(4, this.f390964f);
            fVar.e(5, this.f390965g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.wc4 wc4Var2 = this.f390962d;
            if (wc4Var2 != null) {
                i18 += b36.f.i(2, wc4Var2.computeSize());
            }
            r45.st4 st4Var2 = this.f390963e;
            if (st4Var2 != null) {
                i18 += b36.f.i(3, st4Var2.computeSize());
            }
            return i18 + b36.f.e(4, this.f390964f) + b36.f.e(5, this.f390965g);
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
        r45.yc4 yc4Var = (r45.yc4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                yc4Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.wc4 wc4Var3 = new r45.wc4();
                if (bArr2 != null && bArr2.length > 0) {
                    wc4Var3.parseFrom(bArr2);
                }
                yc4Var.f390962d = wc4Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                yc4Var.f390964f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            yc4Var.f390965g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.st4 st4Var3 = new r45.st4();
            if (bArr3 != null && bArr3.length > 0) {
                st4Var3.parseFrom(bArr3);
            }
            yc4Var.f390963e = st4Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "dict", this.f390962d, false);
            eVar.d(jSONObject, "network_dict", this.f390963e, false);
            eVar.d(jSONObject, "timeval_sec", java.lang.Integer.valueOf(this.f390964f), false);
            eVar.d(jSONObject, "second_box_height", java.lang.Integer.valueOf(this.f390965g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
