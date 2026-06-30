package r45;

/* loaded from: classes2.dex */
public class mb1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380319d;

    /* renamed from: e, reason: collision with root package name */
    public r45.kv0 f380320e;

    /* renamed from: f, reason: collision with root package name */
    public int f380321f;

    /* renamed from: g, reason: collision with root package name */
    public int f380322g;

    /* renamed from: h, reason: collision with root package name */
    public long f380323h;

    /* renamed from: i, reason: collision with root package name */
    public long f380324i;

    /* renamed from: m, reason: collision with root package name */
    public r45.y13 f380325m;

    /* renamed from: n, reason: collision with root package name */
    public long f380326n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mb1)) {
            return false;
        }
        r45.mb1 mb1Var = (r45.mb1) fVar;
        return n51.f.a(this.BaseRequest, mb1Var.BaseRequest) && n51.f.a(this.f380319d, mb1Var.f380319d) && n51.f.a(this.f380320e, mb1Var.f380320e) && n51.f.a(java.lang.Integer.valueOf(this.f380321f), java.lang.Integer.valueOf(mb1Var.f380321f)) && n51.f.a(java.lang.Integer.valueOf(this.f380322g), java.lang.Integer.valueOf(mb1Var.f380322g)) && n51.f.a(java.lang.Long.valueOf(this.f380323h), java.lang.Long.valueOf(mb1Var.f380323h)) && n51.f.a(java.lang.Long.valueOf(this.f380324i), java.lang.Long.valueOf(mb1Var.f380324i)) && n51.f.a(this.f380325m, mb1Var.f380325m) && n51.f.a(java.lang.Long.valueOf(this.f380326n), java.lang.Long.valueOf(mb1Var.f380326n));
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
            java.lang.String str = this.f380319d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.kv0 kv0Var = this.f380320e;
            if (kv0Var != null) {
                fVar.i(3, kv0Var.computeSize());
                this.f380320e.writeFields(fVar);
            }
            fVar.e(4, this.f380321f);
            fVar.e(5, this.f380322g);
            fVar.h(62, this.f380323h);
            fVar.h(72, this.f380324i);
            r45.y13 y13Var = this.f380325m;
            if (y13Var != null) {
                fVar.i(8, y13Var.computeSize());
                this.f380325m.writeFields(fVar);
            }
            fVar.h(9, this.f380326n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f380319d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.kv0 kv0Var2 = this.f380320e;
            if (kv0Var2 != null) {
                i18 += b36.f.i(3, kv0Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f380321f) + b36.f.e(5, this.f380322g) + b36.f.h(62, this.f380323h) + b36.f.h(72, this.f380324i);
            r45.y13 y13Var2 = this.f380325m;
            if (y13Var2 != null) {
                e17 += b36.f.i(8, y13Var2.computeSize());
            }
            return e17 + b36.f.h(9, this.f380326n);
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
        r45.mb1 mb1Var = (r45.mb1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                mb1Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mb1Var.f380319d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.kv0 kv0Var3 = new r45.kv0();
                if (bArr2 != null && bArr2.length > 0) {
                    kv0Var3.parseFrom(bArr2);
                }
                mb1Var.f380320e = kv0Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            mb1Var.f380321f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            mb1Var.f380322g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 8) {
            if (intValue == 9) {
                mb1Var.f380326n = aVar2.i(intValue);
                return 0;
            }
            if (intValue == 62) {
                mb1Var.f380323h = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 72) {
                return -1;
            }
            mb1Var.f380324i = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.y13 y13Var3 = new r45.y13();
            if (bArr3 != null && bArr3.length > 0) {
                y13Var3.parseFrom(bArr3);
            }
            mb1Var.f380325m = y13Var3;
        }
        return 0;
    }
}
