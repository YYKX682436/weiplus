package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class wd extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC f124326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
        super(1);
        this.f124326d = finderProfileReplayLiveUIC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if ((!r0.isEmpty()) == true) goto L8;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse r5 = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) r5
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.g(r5, r0)
            java.util.List r0 = r5.getIncrementList()
            if (r0 == 0) goto L16
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            r0 = 2
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC r2 = r4.f124326d
            r3 = 0
            if (r1 == 0) goto L23
            com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$State r1 = com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADED
            com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(r2, r1, r3, r0, r3)
            goto L28
        L23:
            com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$State r1 = com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.EMPTY
            com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(r2, r1, r3, r0, r3)
        L28:
            android.app.Activity r0 = r2.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.o.g(r0, r1)
            pf5.z r1 = pf5.z.f353948a
            boolean r2 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r2 == 0) goto L5e
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.v r0 = r1.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.profile.uic.p2> r1 = com.tencent.mm.plugin.finder.profile.uic.p2.class
            pf5.b0 r0 = r0.e(r1)
            com.tencent.mm.plugin.finder.profile.uic.p2 r0 = (com.tencent.mm.plugin.finder.profile.uic.p2) r0
            if (r0 == 0) goto L5b
            int r1 = r5.getErrCode()
            java.lang.Object r5 = r5.getCgiProfile()
            boolean r2 = r5 instanceof az2.g
            if (r2 == 0) goto L56
            r3 = r5
            az2.g r3 = (az2.g) r3
        L56:
            r5 = 5870(0x16ee, float:8.226E-42)
            r0.Q6(r5, r1, r3)
        L5b:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        L5e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.uic.wd.invoke(java.lang.Object):java.lang.Object");
    }
}
