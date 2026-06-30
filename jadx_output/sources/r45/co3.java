package r45;

/* loaded from: classes9.dex */
public class co3 extends r45.js5 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371706g;

    /* renamed from: h, reason: collision with root package name */
    public int f371707h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371708i;

    /* renamed from: n, reason: collision with root package name */
    public int f371710n;

    /* renamed from: o, reason: collision with root package name */
    public long f371711o;

    /* renamed from: p, reason: collision with root package name */
    public int f371712p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f371713q;

    /* renamed from: d, reason: collision with root package name */
    public int f371703d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371704e = "ok";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f371705f = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f371709m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.co3)) {
            return false;
        }
        r45.co3 co3Var = (r45.co3) fVar;
        return n51.f.a(this.BaseResponse, co3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f371703d), java.lang.Integer.valueOf(co3Var.f371703d)) && n51.f.a(this.f371704e, co3Var.f371704e) && n51.f.a(this.f371705f, co3Var.f371705f) && n51.f.a(this.f371706g, co3Var.f371706g) && n51.f.a(java.lang.Integer.valueOf(this.f371707h), java.lang.Integer.valueOf(co3Var.f371707h)) && n51.f.a(this.f371708i, co3Var.f371708i) && n51.f.a(this.f371709m, co3Var.f371709m) && n51.f.a(java.lang.Integer.valueOf(this.f371710n), java.lang.Integer.valueOf(co3Var.f371710n)) && n51.f.a(java.lang.Long.valueOf(this.f371711o), java.lang.Long.valueOf(co3Var.f371711o)) && n51.f.a(java.lang.Integer.valueOf(this.f371712p), java.lang.Integer.valueOf(co3Var.f371712p)) && n51.f.a(this.f371713q, co3Var.f371713q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371709m;
        java.util.LinkedList linkedList2 = this.f371705f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f371703d);
            java.lang.String str = this.f371704e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList2);
            java.lang.String str2 = this.f371706g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f371707h);
            java.lang.String str3 = this.f371708i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.g(8, 1, linkedList);
            fVar.e(9, this.f371710n);
            fVar.h(10, this.f371711o);
            fVar.e(11, this.f371712p);
            java.lang.String str4 = this.f371713q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f371703d);
            java.lang.String str5 = this.f371704e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList2);
            java.lang.String str6 = this.f371706g;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            int e17 = g17 + b36.f.e(6, this.f371707h);
            java.lang.String str7 = this.f371708i;
            if (str7 != null) {
                e17 += b36.f.j(7, str7);
            }
            int g18 = e17 + b36.f.g(8, 1, linkedList) + b36.f.e(9, this.f371710n) + b36.f.h(10, this.f371711o) + b36.f.e(11, this.f371712p);
            java.lang.String str8 = this.f371713q;
            return str8 != null ? g18 + b36.f.j(12, str8) : g18;
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
        r45.co3 co3Var = (r45.co3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    co3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                co3Var.f371703d = aVar2.g(intValue);
                return 0;
            case 3:
                co3Var.f371704e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.wv3 wv3Var = new r45.wv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        wv3Var.parseFrom(bArr3);
                    }
                    co3Var.f371705f.add(wv3Var);
                }
                return 0;
            case 5:
                co3Var.f371706g = aVar2.k(intValue);
                return 0;
            case 6:
                co3Var.f371707h = aVar2.g(intValue);
                return 0;
            case 7:
                co3Var.f371708i = aVar2.k(intValue);
                return 0;
            case 8:
                co3Var.f371709m.add(aVar2.k(intValue));
                return 0;
            case 9:
                co3Var.f371710n = aVar2.g(intValue);
                return 0;
            case 10:
                co3Var.f371711o = aVar2.i(intValue);
                return 0;
            case 11:
                co3Var.f371712p = aVar2.g(intValue);
                return 0;
            case 12:
                co3Var.f371713q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
