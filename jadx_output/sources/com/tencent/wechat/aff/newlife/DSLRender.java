package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class DSLRender extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.DSLRender DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.DSLRender();
    public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl render = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.getDefaultInstance();

    public static com.tencent.wechat.aff.newlife.DSLRender create() {
        return new com.tencent.wechat.aff.newlife.DSLRender();
    }

    public static com.tencent.wechat.aff.newlife.DSLRender getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.DSLRender newBuilder() {
        return new com.tencent.wechat.aff.newlife.DSLRender();
    }

    public com.tencent.wechat.aff.newlife.DSLRender build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.DSLRender) && n51.f.a(this.render, ((com.tencent.wechat.aff.newlife.DSLRender) fVar).render);
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl getRender() {
        return this.render;
    }

    public com.tencent.wechat.aff.newlife.DSLRender mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.DSLRender();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl finderTabTipsDSLRenderTmpl = this.render;
            if (finderTabTipsDSLRenderTmpl != null) {
                fVar.i(1, finderTabTipsDSLRenderTmpl.computeSize());
                this.render.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl finderTabTipsDSLRenderTmpl2 = this.render;
            if (finderTabTipsDSLRenderTmpl2 != null) {
                return 0 + b36.f.i(1, finderTabTipsDSLRenderTmpl2.computeSize());
            }
            return 0;
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
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl finderTabTipsDSLRenderTmpl3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl();
            if (bArr != null && bArr.length > 0) {
                finderTabTipsDSLRenderTmpl3.parseFrom(bArr);
            }
            this.render = finderTabTipsDSLRenderTmpl3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.DSLRender setRender(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl finderTabTipsDSLRenderTmpl) {
        this.render = finderTabTipsDSLRenderTmpl;
        return this;
    }

    public com.tencent.wechat.aff.newlife.DSLRender mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.DSLRender parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.DSLRender) super.parseFrom(bArr);
    }
}
