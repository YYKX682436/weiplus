package r45;

/* loaded from: classes4.dex */
public class f4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374000d;

    /* renamed from: e, reason: collision with root package name */
    public int f374001e;

    /* renamed from: f, reason: collision with root package name */
    public long f374002f;

    /* renamed from: g, reason: collision with root package name */
    public int f374003g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374004h;

    /* renamed from: i, reason: collision with root package name */
    public int f374005i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f4)) {
            return false;
        }
        r45.f4 f4Var = (r45.f4) fVar;
        return n51.f.a(this.BaseResponse, f4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f374000d), java.lang.Integer.valueOf(f4Var.f374000d)) && n51.f.a(java.lang.Integer.valueOf(this.f374001e), java.lang.Integer.valueOf(f4Var.f374001e)) && n51.f.a(java.lang.Long.valueOf(this.f374002f), java.lang.Long.valueOf(f4Var.f374002f)) && n51.f.a(java.lang.Integer.valueOf(this.f374003g), java.lang.Integer.valueOf(f4Var.f374003g)) && n51.f.a(this.f374004h, f4Var.f374004h) && n51.f.a(java.lang.Integer.valueOf(this.f374005i), java.lang.Integer.valueOf(f4Var.f374005i));
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
            fVar.e(2, this.f374000d);
            fVar.e(3, this.f374001e);
            fVar.h(4, this.f374002f);
            fVar.e(5, this.f374003g);
            java.lang.String str = this.f374004h;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f374005i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f374000d) + b36.f.e(3, this.f374001e) + b36.f.h(4, this.f374002f) + b36.f.e(5, this.f374003g);
            java.lang.String str2 = this.f374004h;
            if (str2 != null) {
                i18 += b36.f.j(6, str2);
            }
            return i18 + b36.f.e(7, this.f374005i);
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
        r45.f4 f4Var = (r45.f4) objArr[1];
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
                    f4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                f4Var.f374000d = aVar2.g(intValue);
                return 0;
            case 3:
                f4Var.f374001e = aVar2.g(intValue);
                return 0;
            case 4:
                f4Var.f374002f = aVar2.i(intValue);
                return 0;
            case 5:
                f4Var.f374003g = aVar2.g(intValue);
                return 0;
            case 6:
                f4Var.f374004h = aVar2.k(intValue);
                return 0;
            case 7:
                f4Var.f374005i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
