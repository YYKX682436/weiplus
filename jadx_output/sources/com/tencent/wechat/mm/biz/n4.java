package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
public class n4 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.n4 f218381h = new com.tencent.wechat.mm.biz.n4();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.m4 f218382d = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE;

    /* renamed from: e, reason: collision with root package name */
    public int f218383e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218384f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f218385g = 0;

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.n4 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.n4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.n4)) {
            return false;
        }
        com.tencent.wechat.mm.biz.n4 n4Var = (com.tencent.wechat.mm.biz.n4) fVar;
        return n51.f.a(this.f218382d, n4Var.f218382d) && n51.f.a(java.lang.Integer.valueOf(this.f218383e), java.lang.Integer.valueOf(n4Var.f218383e)) && n51.f.a(this.f218384f, n4Var.f218384f) && n51.f.a(java.lang.Long.valueOf(this.f218385g), java.lang.Long.valueOf(n4Var.f218385g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.n4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.wechat.mm.biz.m4 m4Var;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.biz.m4 m4Var2 = this.f218382d;
            if (m4Var2 != null) {
                fVar.e(1, m4Var2.f218354d);
            }
            fVar.e(2, this.f218383e);
            java.lang.String str = this.f218384f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f218385g);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.biz.m4 m4Var3 = this.f218382d;
            int e17 = (m4Var3 != null ? 0 + b36.f.e(1, m4Var3.f218354d) : 0) + b36.f.e(2, this.f218383e);
            java.lang.String str2 = this.f218384f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.h(4, this.f218385g);
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
            if (intValue == 2) {
                this.f218383e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                this.f218384f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f218385g = aVar2.i(intValue);
            return 0;
        }
        int g17 = aVar2.g(intValue);
        switch (g17) {
            case 1:
                m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE;
                break;
            case 2:
                m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_INTERACTION;
                break;
            case 3:
                m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_NOTIFY;
                break;
            case 4:
                m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_COMMENT;
                break;
            case 5:
                m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_LIKE;
                break;
            case 6:
                m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FOLLOW;
                break;
            default:
                switch (g17) {
                    case 99:
                        m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FANS_MSG;
                        break;
                    case 100:
                        m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CREATOR;
                        break;
                    case 101:
                        m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CONSUMER_NOTIFY;
                        break;
                    case 102:
                        m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_WORKS_ENTRY;
                        break;
                    case 103:
                        m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_PROFILE;
                        break;
                    case 104:
                        m4Var = com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_GREET_MSG;
                        break;
                    default:
                        m4Var = null;
                        break;
                }
        }
        this.f218382d = m4Var;
        return 0;
    }
}
