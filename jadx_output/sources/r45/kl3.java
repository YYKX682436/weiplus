package r45;

/* loaded from: classes4.dex */
public class kl3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378808f;

    /* renamed from: g, reason: collision with root package name */
    public float f378809g;

    /* renamed from: h, reason: collision with root package name */
    public float f378810h;

    /* renamed from: i, reason: collision with root package name */
    public float f378811i;

    /* renamed from: m, reason: collision with root package name */
    public int f378812m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kl3)) {
            return false;
        }
        r45.kl3 kl3Var = (r45.kl3) fVar;
        return n51.f.a(this.BaseResponse, kl3Var.BaseResponse) && n51.f.a(this.f378806d, kl3Var.f378806d) && n51.f.a(this.f378807e, kl3Var.f378807e) && n51.f.a(this.f378808f, kl3Var.f378808f) && n51.f.a(java.lang.Float.valueOf(this.f378809g), java.lang.Float.valueOf(kl3Var.f378809g)) && n51.f.a(java.lang.Float.valueOf(this.f378810h), java.lang.Float.valueOf(kl3Var.f378810h)) && n51.f.a(java.lang.Float.valueOf(this.f378811i), java.lang.Float.valueOf(kl3Var.f378811i)) && n51.f.a(java.lang.Integer.valueOf(this.f378812m), java.lang.Integer.valueOf(kl3Var.f378812m));
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
            java.lang.String str = this.f378806d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378807e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378808f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.d(5, this.f378809g);
            fVar.d(6, this.f378810h);
            fVar.d(7, this.f378811i);
            fVar.e(8, this.f378812m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f378806d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f378807e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f378808f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.d(5, this.f378809g) + b36.f.d(6, this.f378810h) + b36.f.d(7, this.f378811i) + b36.f.e(8, this.f378812m);
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
        r45.kl3 kl3Var = (r45.kl3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    kl3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                kl3Var.f378806d = aVar2.k(intValue);
                return 0;
            case 3:
                kl3Var.f378807e = aVar2.k(intValue);
                return 0;
            case 4:
                kl3Var.f378808f = aVar2.k(intValue);
                return 0;
            case 5:
                kl3Var.f378809g = aVar2.f(intValue);
                return 0;
            case 6:
                kl3Var.f378810h = aVar2.f(intValue);
                return 0;
            case 7:
                kl3Var.f378811i = aVar2.f(intValue);
                return 0;
            case 8:
                kl3Var.f378812m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
