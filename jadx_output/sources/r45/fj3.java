package r45;

/* loaded from: classes4.dex */
public class fj3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374394d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f374395e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f374396f;

    /* renamed from: g, reason: collision with root package name */
    public int f374397g;

    /* renamed from: h, reason: collision with root package name */
    public int f374398h;

    /* renamed from: i, reason: collision with root package name */
    public int f374399i;

    /* renamed from: m, reason: collision with root package name */
    public int f374400m;

    /* renamed from: n, reason: collision with root package name */
    public long f374401n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fj3)) {
            return false;
        }
        r45.fj3 fj3Var = (r45.fj3) fVar;
        return n51.f.a(this.BaseRequest, fj3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f374394d), java.lang.Integer.valueOf(fj3Var.f374394d)) && n51.f.a(this.f374395e, fj3Var.f374395e) && n51.f.a(this.f374396f, fj3Var.f374396f) && n51.f.a(java.lang.Integer.valueOf(this.f374397g), java.lang.Integer.valueOf(fj3Var.f374397g)) && n51.f.a(java.lang.Integer.valueOf(this.f374398h), java.lang.Integer.valueOf(fj3Var.f374398h)) && n51.f.a(java.lang.Integer.valueOf(this.f374399i), java.lang.Integer.valueOf(fj3Var.f374399i)) && n51.f.a(java.lang.Integer.valueOf(this.f374400m), java.lang.Integer.valueOf(fj3Var.f374400m)) && n51.f.a(java.lang.Long.valueOf(this.f374401n), java.lang.Long.valueOf(fj3Var.f374401n));
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
            fVar.e(2, this.f374394d);
            r45.du5 du5Var = this.f374395e;
            if (du5Var != null) {
                fVar.i(3, du5Var.computeSize());
                this.f374395e.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f374396f;
            if (du5Var2 != null) {
                fVar.i(4, du5Var2.computeSize());
                this.f374396f.writeFields(fVar);
            }
            fVar.e(5, this.f374397g);
            fVar.e(6, this.f374398h);
            fVar.e(7, this.f374399i);
            fVar.e(8, this.f374400m);
            fVar.h(9, this.f374401n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f374394d);
            r45.du5 du5Var3 = this.f374395e;
            if (du5Var3 != null) {
                i18 += b36.f.i(3, du5Var3.computeSize());
            }
            r45.du5 du5Var4 = this.f374396f;
            if (du5Var4 != null) {
                i18 += b36.f.i(4, du5Var4.computeSize());
            }
            return i18 + b36.f.e(5, this.f374397g) + b36.f.e(6, this.f374398h) + b36.f.e(7, this.f374399i) + b36.f.e(8, this.f374400m) + b36.f.h(9, this.f374401n);
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
        r45.fj3 fj3Var = (r45.fj3) objArr[1];
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
                    fj3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                fj3Var.f374394d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var5.b(bArr2);
                    }
                    fj3Var.f374395e = du5Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var6.b(bArr3);
                    }
                    fj3Var.f374396f = du5Var6;
                }
                return 0;
            case 5:
                fj3Var.f374397g = aVar2.g(intValue);
                return 0;
            case 6:
                fj3Var.f374398h = aVar2.g(intValue);
                return 0;
            case 7:
                fj3Var.f374399i = aVar2.g(intValue);
                return 0;
            case 8:
                fj3Var.f374400m = aVar2.g(intValue);
                return 0;
            case 9:
                fj3Var.f374401n = aVar2.i(intValue);
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
            eVar.d(jSONObject, "MsgId", java.lang.Integer.valueOf(this.f374394d), false);
            eVar.d(jSONObject, "FromUserName", this.f374395e, false);
            eVar.d(jSONObject, "ToUserName", this.f374396f, false);
            eVar.d(jSONObject, "TotalLen", java.lang.Integer.valueOf(this.f374397g), false);
            eVar.d(jSONObject, "StartPos", java.lang.Integer.valueOf(this.f374398h), false);
            eVar.d(jSONObject, "DataLen", java.lang.Integer.valueOf(this.f374399i), false);
            eVar.d(jSONObject, "CompressType", java.lang.Integer.valueOf(this.f374400m), false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f374401n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
