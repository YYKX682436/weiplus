package com.tencent.wechat.aff.wenote;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wechat.aff.wenote.e f217684f = new com.tencent.wechat.aff.wenote.e();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.wenote.d f217685d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f217686e = new boolean[2];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.wenote.e) && n51.f.a(this.f217685d, ((com.tencent.wechat.aff.wenote.e) fVar).f217685d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.wenote.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217686e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.wenote.d dVar = this.f217685d;
            if (dVar != null && zArr[1]) {
                fVar.e(1, dVar.f217683d);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.wenote.d dVar2 = this.f217685d;
            if (dVar2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.e(1, dVar2.f217683d);
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
        if (intValue != 1) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f217685d = g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.aff.wenote.d.WeNoteFlutterPageState_PageExit : com.tencent.wechat.aff.wenote.d.WeNoteFlutterPageState_WillDisappear;
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.wenote.e) super.parseFrom(bArr);
    }
}
