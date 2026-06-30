package so2;

/* loaded from: classes2.dex */
public class n1 extends com.tencent.mm.plugin.finder.model.BaseFinderFeed {

    /* renamed from: d, reason: collision with root package name */
    public boolean f410490d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f410491e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f410492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.finder.storage.FinderItem feedObject) {
        super(feedObject);
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
    }

    public static /* synthetic */ boolean h2(so2.n1 n1Var, java.lang.Integer num, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeHolderShowEnableRecommendType");
        }
        if ((i17 & 1) != 0) {
            num = null;
        }
        return n1Var.g2(num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if ((r0 != null && r0.getInteger(2) == 1) != false) goto L34;
     */
    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, com.tencent.mm.plugin.finder.feed.model.internal.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.o.g(r7, r0)
            boolean r0 = r7 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            r1 = 0
            if (r0 == 0) goto Le
            r0 = r7
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r0
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L99
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r6.getFeedObject()
            int r2 = r2.getMediaType()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.getFeedObject()
            int r3 = r3.getMediaType()
            if (r2 != r3) goto L99
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.getFeedObject()
            int r2 = r2.getMediaType()
            r3 = 15
            if (r2 != r3) goto L99
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            r45.en2 r2 = r2.getPlace_holder_info()
            r3 = 2
            if (r2 == 0) goto L47
            int r2 = r2.getInteger(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L48
        L47:
            r2 = r1
        L48:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            r45.en2 r4 = r4.getPlace_holder_info()
            if (r4 == 0) goto L5e
            int r1 = r4.getInteger(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L5e:
            boolean r1 = kotlin.jvm.internal.o.b(r2, r1)
            if (r1 == 0) goto L99
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            r45.en2 r1 = r1.getPlace_holder_info()
            r2 = 1
            r4 = 0
            if (r1 == 0) goto L7d
            int r1 = r1.getInteger(r3)
            r5 = 7
            if (r1 != r5) goto L7d
            r1 = r2
            goto L7e
        L7d:
            r1 = r4
        L7e:
            if (r1 != 0) goto L98
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            r45.en2 r0 = r0.getPlace_holder_info()
            if (r0 == 0) goto L95
            int r0 = r0.getInteger(r3)
            if (r0 != r2) goto L95
            goto L96
        L95:
            r2 = r4
        L96:
            if (r2 == 0) goto L99
        L98:
            return r4
        L99:
            int r7 = super.d(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.n1.d(com.tencent.mm.plugin.finder.feed.model.internal.r0):int");
    }

    public final boolean f2() {
        return this.f410491e != null;
    }

    public final boolean g2(java.lang.Integer num) {
        r45.en2 place_holder_info = getFeedObject().getFeedObject().getPlace_holder_info();
        int integer = place_holder_info != null ? place_holder_info.getInteger(2) : 0;
        return num == null ? integer == 1 || integer == 7 : integer == num.intValue();
    }
}
