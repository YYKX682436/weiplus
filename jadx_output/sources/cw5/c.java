package cw5;

/* loaded from: classes11.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final cw5.c f224331g = new cw5.c();

    /* renamed from: d, reason: collision with root package name */
    public cw5.b f224332d;

    /* renamed from: e, reason: collision with root package name */
    public int f224333e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f224334f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof cw5.c)) {
            return false;
        }
        cw5.c cVar = (cw5.c) fVar;
        return n51.f.a(this.f224332d, cVar.f224332d) && n51.f.a(java.lang.Integer.valueOf(this.f224333e), java.lang.Integer.valueOf(cVar.f224333e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new cw5.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f224334f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            cw5.b bVar = this.f224332d;
            if (bVar != null && zArr[1]) {
                fVar.e(1, bVar.f224330d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f224333e);
            }
            return 0;
        }
        if (i17 == 1) {
            cw5.b bVar2 = this.f224332d;
            if (bVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bVar2.f224330d);
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f224333e) : i18;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            this.f224332d = g17 != 1 ? g17 != 2 ? null : cw5.b.BOX_TYPE_SERVER_ASSIGN : cw5.b.BOX_TYPE_LASTED_MSG;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f224333e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (cw5.c) super.parseFrom(bArr);
    }
}
