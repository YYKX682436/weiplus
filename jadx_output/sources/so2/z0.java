package so2;

/* loaded from: classes2.dex */
public class z0 extends so2.y0 {
    public final com.tencent.mm.plugin.finder.storage.FinderItem E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z0(com.tencent.mm.plugin.finder.storage.FinderItem r5) {
        /*
            r4 = this;
            java.lang.String r0 = "feed"
            kotlin.jvm.internal.o.g(r5, r0)
            com.tencent.mm.plugin.finder.storage.yj0 r0 = new com.tencent.mm.plugin.finder.storage.yj0
            r0.<init>()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r1 = r0.u0()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.setDisplayid(r2)
            r4.<init>(r0)
            r4.E = r5
            r5 = 1
            r4.F = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.z0.<init>(com.tencent.mm.plugin.finder.storage.FinderItem):void");
    }

    @Override // so2.y0, com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // so2.y0, in5.c
    public long getItemId() {
        return this.E.field_id;
    }

    @Override // so2.y0, in5.c
    public int h() {
        return 3;
    }

    @Override // so2.y0
    public java.lang.String i() {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = this.E.getFeedObject().getObjectDesc();
        if (objectDesc != null) {
            return objectDesc.getDescription();
        }
        return null;
    }
}
