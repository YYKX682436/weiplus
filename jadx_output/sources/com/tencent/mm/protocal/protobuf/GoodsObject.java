package com.tencent.mm.protocal.protobuf;

/* loaded from: classes9.dex */
public class GoodsObject extends com.tencent.mm.protobuf.f {
    public float center_x;
    public float center_y;
    public int maxx;
    public int maxy;
    public int minx;
    public int miny;
    public float obj_h;
    public float obj_w;
    public float relative_maxx;
    public float relative_maxy;
    public float relative_minx;
    public float relative_miny;
    public float score;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.GoodsObject)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.GoodsObject goodsObject = (com.tencent.mm.protocal.protobuf.GoodsObject) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.relative_minx), java.lang.Float.valueOf(goodsObject.relative_minx)) && n51.f.a(java.lang.Float.valueOf(this.relative_miny), java.lang.Float.valueOf(goodsObject.relative_miny)) && n51.f.a(java.lang.Float.valueOf(this.relative_maxx), java.lang.Float.valueOf(goodsObject.relative_maxx)) && n51.f.a(java.lang.Float.valueOf(this.relative_maxy), java.lang.Float.valueOf(goodsObject.relative_maxy)) && n51.f.a(java.lang.Float.valueOf(this.score), java.lang.Float.valueOf(goodsObject.score)) && n51.f.a(java.lang.Integer.valueOf(this.minx), java.lang.Integer.valueOf(goodsObject.minx)) && n51.f.a(java.lang.Integer.valueOf(this.miny), java.lang.Integer.valueOf(goodsObject.miny)) && n51.f.a(java.lang.Integer.valueOf(this.maxx), java.lang.Integer.valueOf(goodsObject.maxx)) && n51.f.a(java.lang.Integer.valueOf(this.maxy), java.lang.Integer.valueOf(goodsObject.maxy)) && n51.f.a(java.lang.Float.valueOf(this.center_x), java.lang.Float.valueOf(goodsObject.center_x)) && n51.f.a(java.lang.Float.valueOf(this.center_y), java.lang.Float.valueOf(goodsObject.center_y)) && n51.f.a(java.lang.Float.valueOf(this.obj_w), java.lang.Float.valueOf(goodsObject.obj_w)) && n51.f.a(java.lang.Float.valueOf(this.obj_h), java.lang.Float.valueOf(goodsObject.obj_h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.relative_minx);
            fVar.d(2, this.relative_miny);
            fVar.d(3, this.relative_maxx);
            fVar.d(4, this.relative_maxy);
            fVar.d(5, this.score);
            fVar.e(11, this.minx);
            fVar.e(12, this.miny);
            fVar.e(13, this.maxx);
            fVar.e(14, this.maxy);
            fVar.d(21, this.center_x);
            fVar.d(22, this.center_y);
            fVar.d(23, this.obj_w);
            fVar.d(24, this.obj_h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.relative_minx) + 0 + b36.f.d(2, this.relative_miny) + b36.f.d(3, this.relative_maxx) + b36.f.d(4, this.relative_maxy) + b36.f.d(5, this.score) + b36.f.e(11, this.minx) + b36.f.e(12, this.miny) + b36.f.e(13, this.maxx) + b36.f.e(14, this.maxy) + b36.f.d(21, this.center_x) + b36.f.d(22, this.center_y) + b36.f.d(23, this.obj_w) + b36.f.d(24, this.obj_h);
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
        com.tencent.mm.protocal.protobuf.GoodsObject goodsObject = (com.tencent.mm.protocal.protobuf.GoodsObject) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            goodsObject.relative_minx = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            goodsObject.relative_miny = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            goodsObject.relative_maxx = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 4) {
            goodsObject.relative_maxy = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 5) {
            goodsObject.score = aVar2.f(intValue);
            return 0;
        }
        switch (intValue) {
            case 11:
                goodsObject.minx = aVar2.g(intValue);
                return 0;
            case 12:
                goodsObject.miny = aVar2.g(intValue);
                return 0;
            case 13:
                goodsObject.maxx = aVar2.g(intValue);
                return 0;
            case 14:
                goodsObject.maxy = aVar2.g(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 21:
                        goodsObject.center_x = aVar2.f(intValue);
                        return 0;
                    case 22:
                        goodsObject.center_y = aVar2.f(intValue);
                        return 0;
                    case 23:
                        goodsObject.obj_w = aVar2.f(intValue);
                        return 0;
                    case 24:
                        goodsObject.obj_h = aVar2.f(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
