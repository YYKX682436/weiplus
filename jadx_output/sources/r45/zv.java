package r45;

/* loaded from: classes9.dex */
public class zv extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f392381d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392382e;

    /* renamed from: f, reason: collision with root package name */
    public long f392383f;

    /* renamed from: g, reason: collision with root package name */
    public a36.c f392384g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zv)) {
            return false;
        }
        r45.zv zvVar = (r45.zv) fVar;
        return n51.f.a(this.BaseResponse, zvVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f392381d), java.lang.Integer.valueOf(zvVar.f392381d)) && n51.f.a(this.f392382e, zvVar.f392382e) && n51.f.a(java.lang.Long.valueOf(this.f392383f), java.lang.Long.valueOf(zvVar.f392383f)) && n51.f.a(this.f392384g, zvVar.f392384g);
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
            fVar.e(2, this.f392381d);
            java.lang.String str = this.f392382e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f392383f);
            a36.c cVar = this.f392384g;
            if (cVar != null) {
                fVar.i(5, cVar.computeSize());
                this.f392384g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f392381d);
            java.lang.String str2 = this.f392382e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int h17 = i18 + b36.f.h(4, this.f392383f);
            a36.c cVar2 = this.f392384g;
            return cVar2 != null ? h17 + b36.f.i(5, cVar2.computeSize()) : h17;
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
        r45.zv zvVar = (r45.zv) objArr[1];
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
                zvVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            zvVar.f392381d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            zvVar.f392382e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            zvVar.f392383f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            a36.c cVar3 = new a36.c();
            if (bArr2 != null && bArr2.length > 0) {
                cVar3.parseFrom(bArr2);
            }
            zvVar.f392384g = cVar3;
        }
        return 0;
    }
}
