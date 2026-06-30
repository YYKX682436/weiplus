package r45;

/* loaded from: classes4.dex */
public class o6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381969d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381970e;

    /* renamed from: f, reason: collision with root package name */
    public int f381971f;

    /* renamed from: g, reason: collision with root package name */
    public long f381972g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o6)) {
            return false;
        }
        r45.o6 o6Var = (r45.o6) fVar;
        return n51.f.a(this.BaseRequest, o6Var.BaseRequest) && n51.f.a(this.f381969d, o6Var.f381969d) && n51.f.a(this.f381970e, o6Var.f381970e) && n51.f.a(java.lang.Integer.valueOf(this.f381971f), java.lang.Integer.valueOf(o6Var.f381971f)) && n51.f.a(java.lang.Long.valueOf(this.f381972g), java.lang.Long.valueOf(o6Var.f381972g));
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
            java.lang.String str = this.f381969d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381970e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f381971f);
            fVar.h(5, this.f381972g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f381969d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f381970e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f381971f) + b36.f.h(5, this.f381972g);
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
        r45.o6 o6Var = (r45.o6) objArr[1];
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
                o6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            o6Var.f381969d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            o6Var.f381970e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            o6Var.f381971f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        o6Var.f381972g = aVar2.i(intValue);
        return 0;
    }
}
