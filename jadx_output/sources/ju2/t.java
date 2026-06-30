package ju2;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f301840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderThanksUpdateEvent f301842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ju2.v f301843g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j17, java.lang.String str, com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent, ju2.v vVar) {
        super(0);
        this.f301840d = j17;
        this.f301841e = str;
        this.f301842f = finderThanksUpdateEvent;
        this.f301843g = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0.f7338b == true) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "thank recommend UpdateListener event objectID:"
            r0.<init>(r1)
            long r1 = r5.f301840d
            r0.append(r1)
            java.lang.String r1 = " wxUsername:"
            r0.append(r1)
            java.lang.String r1 = r5.f301841e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderThanksButtonViewModel"
            com.tencent.mars.xlog.Log.i(r1, r0)
            com.tencent.mm.autogen.events.FinderThanksUpdateEvent r0 = r5.f301842f
            am.md r0 = r0.f54333g
            if (r0 == 0) goto L2c
            boolean r0 = r0.f7338b
            r1 = 1
            if (r0 != r1) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            ju2.v r0 = r5.f301843g
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r0.f301850c
            if (r2 != 0) goto L34
            goto L37
        L34:
            r2.setThank_flag(r1)
        L37:
            so2.f1 r2 = r0.f301851d
            if (r2 == 0) goto L3e
            r45.md1 r2 = r2.f410336d
            goto L3f
        L3e:
            r2 = 0
        L3f:
            if (r2 != 0) goto L42
            goto L4b
        L42:
            r3 = 15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.set(r3, r4)
        L4b:
            r0.f301853f = r1
            java.lang.ref.WeakReference r0 = r0.f301852e
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r0.get()
            ju2.w r0 = (ju2.w) r0
            if (r0 == 0) goto L5e
            com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton r0 = (com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton) r0
            r0.I()
        L5e:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ju2.t.invoke():java.lang.Object");
    }
}
