package r45;

/* loaded from: classes8.dex */
public class js extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378077d;

    /* renamed from: e, reason: collision with root package name */
    public int f378078e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378079f;

    /* renamed from: g, reason: collision with root package name */
    public int f378080g;

    /* renamed from: h, reason: collision with root package name */
    public int f378081h;

    /* renamed from: i, reason: collision with root package name */
    public int f378082i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.js)) {
            return false;
        }
        r45.js jsVar = (r45.js) fVar;
        return n51.f.a(this.BaseRequest, jsVar.BaseRequest) && n51.f.a(this.f378077d, jsVar.f378077d) && n51.f.a(java.lang.Integer.valueOf(this.f378078e), java.lang.Integer.valueOf(jsVar.f378078e)) && n51.f.a(this.f378079f, jsVar.f378079f) && n51.f.a(java.lang.Integer.valueOf(this.f378080g), java.lang.Integer.valueOf(jsVar.f378080g)) && n51.f.a(java.lang.Integer.valueOf(this.f378081h), java.lang.Integer.valueOf(jsVar.f378081h)) && n51.f.a(java.lang.Integer.valueOf(this.f378082i), java.lang.Integer.valueOf(jsVar.f378082i));
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
            com.tencent.mm.protobuf.g gVar = this.f378077d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f378078e);
            com.tencent.mm.protobuf.g gVar2 = this.f378079f;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            fVar.e(5, this.f378080g);
            fVar.e(6, this.f378081h);
            fVar.e(7, this.f378082i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar3 = this.f378077d;
            if (gVar3 != null) {
                i18 += b36.f.b(2, gVar3);
            }
            int e17 = i18 + b36.f.e(3, this.f378078e);
            com.tencent.mm.protobuf.g gVar4 = this.f378079f;
            if (gVar4 != null) {
                e17 += b36.f.b(4, gVar4);
            }
            return e17 + b36.f.e(5, this.f378080g) + b36.f.e(6, this.f378081h) + b36.f.e(7, this.f378082i);
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
        r45.js jsVar = (r45.js) objArr[1];
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
                    jsVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                jsVar.f378077d = aVar2.d(intValue);
                return 0;
            case 3:
                jsVar.f378078e = aVar2.g(intValue);
                return 0;
            case 4:
                jsVar.f378079f = aVar2.d(intValue);
                return 0;
            case 5:
                jsVar.f378080g = aVar2.g(intValue);
                return 0;
            case 6:
                jsVar.f378081h = aVar2.g(intValue);
                return 0;
            case 7:
                jsVar.f378082i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
