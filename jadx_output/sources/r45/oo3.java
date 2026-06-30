package r45;

/* loaded from: classes4.dex */
public class oo3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382393d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f382394e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public long f382395f;

    static {
        new r45.oo3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.oo3 parseFrom(byte[] bArr) {
        return (r45.oo3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oo3)) {
            return false;
        }
        r45.oo3 oo3Var = (r45.oo3) fVar;
        return n51.f.a(this.BaseResponse, oo3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382393d), java.lang.Integer.valueOf(oo3Var.f382393d)) && n51.f.a(this.f382394e, oo3Var.f382394e) && n51.f.a(java.lang.Long.valueOf(this.f382395f), java.lang.Long.valueOf(oo3Var.f382395f));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.oo3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382394e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f382393d);
            fVar.g(3, 8, linkedList);
            fVar.h(4, this.f382395f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f382393d) + b36.f.g(3, 8, linkedList) + b36.f.h(4, this.f382395f);
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                this.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f382393d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f382395f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.yj0 yj0Var = new r45.yj0();
            if (bArr2 != null && bArr2.length > 0) {
                yj0Var.parseFrom(bArr2);
            }
            linkedList.add(yj0Var);
        }
        return 0;
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
