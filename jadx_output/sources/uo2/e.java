package uo2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView f429609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f429611f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView, java.lang.String str, boolean z17) {
        super(0);
        this.f429609d = finderFollowTopicHeaderView;
        this.f429610e = str;
        this.f429611f = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r0.isShowing() == true) goto L14;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f429610e
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r1 = r3.f429609d
            r1.setAudioPath(r0)
            boolean r0 = r3.f429611f
            if (r0 == 0) goto L1a
            java.lang.String r0 = r1.getFilePath()
            boolean r0 = r1.C(r0)
            r1.setDownloadFinish(r0)
        L1a:
            com.tencent.mm.ui.widget.dialog.u3 r0 = r1.getDialog()
            if (r0 == 0) goto L28
            boolean r0 = r0.isShowing()
            r2 = 1
            if (r0 != r2) goto L28
            goto L29
        L28:
            r2 = 0
        L29:
            if (r2 == 0) goto L37
            com.tencent.mm.ui.widget.dialog.u3 r0 = r1.getDialog()
            if (r0 == 0) goto L34
            r0.dismiss()
        L34:
            r1.D()
        L37:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uo2.e.invoke():java.lang.Object");
    }
}
