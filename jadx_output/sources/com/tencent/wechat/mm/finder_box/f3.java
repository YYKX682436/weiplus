package com.tencent.wechat.mm.finder_box;

/* loaded from: classes4.dex */
public class f3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.e3 f219418d = com.tencent.wechat.mm.finder_box.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE;

    /* renamed from: e, reason: collision with root package name */
    public int f219419e = 0;

    static {
        new com.tencent.wechat.mm.finder_box.f3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.f3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.f3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.f3)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.f3 f3Var = (com.tencent.wechat.mm.finder_box.f3) fVar;
        return n51.f.a(this.f219418d, f3Var.f219418d) && n51.f.a(java.lang.Integer.valueOf(this.f219419e), java.lang.Integer.valueOf(f3Var.f219419e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.f3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.wechat.mm.finder_box.e3 e3Var;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.finder_box.e3 e3Var2 = this.f219418d;
            if (e3Var2 != null) {
                fVar.e(1, e3Var2.f219403d);
            }
            fVar.e(2, this.f219419e);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.finder_box.e3 e3Var3 = this.f219418d;
            return (e3Var3 != null ? 0 + b36.f.e(1, e3Var3.f219403d) : 0) + b36.f.e(2, this.f219419e);
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
            if (intValue != 2) {
                return -1;
            }
            this.f219419e = aVar2.g(intValue);
            return 0;
        }
        int g17 = aVar2.g(intValue);
        switch (g17) {
            case 1:
                e3Var = com.tencent.wechat.mm.finder_box.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE;
                break;
            case 2:
                e3Var = com.tencent.wechat.mm.finder_box.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_INTERACTION;
                break;
            case 3:
                e3Var = com.tencent.wechat.mm.finder_box.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_NOTIFY;
                break;
            case 4:
                e3Var = com.tencent.wechat.mm.finder_box.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_COMMENT;
                break;
            case 5:
                e3Var = com.tencent.wechat.mm.finder_box.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_LIKE;
                break;
            case 6:
                e3Var = com.tencent.wechat.mm.finder_box.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FOLLOW;
                break;
            default:
                switch (g17) {
                    case 99:
                        e3Var = com.tencent.wechat.mm.finder_box.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FANS_MSG;
                        break;
                    case 100:
                        e3Var = com.tencent.wechat.mm.finder_box.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CREATOR;
                        break;
                    case 101:
                        e3Var = com.tencent.wechat.mm.finder_box.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CONSUMER_NOTIFY;
                        break;
                    default:
                        e3Var = null;
                        break;
                }
        }
        this.f219418d = e3Var;
        return 0;
    }
}
