package te2;

/* loaded from: classes3.dex */
public final class b9 extends im2.w4 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.Presenter f417904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488993b01;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.O6()
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "KEY_HAS_NEXT_ACTION"
            r1 = 0
            boolean r8 = r8.getBooleanExtra(r0, r1)
            r45.fd2 r0 = new r45.fd2
            r0.<init>()
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r2 = "KEY_TAG_INFO"
            byte[] r1 = r1.getByteArrayExtra(r2)
            r2 = 0
            if (r1 != 0) goto L21
            goto L31
        L21:
            r0.parseFrom(r1)     // Catch: java.lang.Exception -> L25
            goto L32
        L25:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "safeParser"
            java.lang.String r3 = ""
            com.tencent.mm.sdk.platformtools.Log.a(r1, r3, r0)
        L31:
            r0 = r2
        L32:
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter r1 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter
            if (r0 == 0) goto L3c
            r3 = 2
            java.util.LinkedList r3 = r0.getList(r3)
            goto L3d
        L3c:
            r3 = r2
        L3d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 == 0) goto L5d
            java.util.Iterator r3 = r3.iterator()
        L48:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L5d
            java.lang.Object r5 = r3.next()
            r45.fd2 r5 = (r45.fd2) r5
            so2.u2 r6 = new so2.u2
            r6.<init>(r5)
            r4.add(r6)
            goto L48
        L5d:
            r1.<init>(r0, r4, r8)
            r7.f417904d = r1
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback r8 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback
            androidx.appcompat.app.AppCompatActivity r0 = r7.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            kotlin.jvm.internal.o.e(r0, r1)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.mm.ui.MMActivity) r0
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter r1 = r7.f417904d
            java.lang.String r3 = "presenter"
            if (r1 == 0) goto L84
            r8.<init>(r0, r1)
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter r0 = r7.f417904d
            if (r0 == 0) goto L80
            r0.c(r8)
            return
        L80:
            kotlin.jvm.internal.o.o(r3)
            throw r2
        L84:
            kotlin.jvm.internal.o.o(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.b9.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract.Presenter presenter = this.f417904d;
        if (presenter == null || presenter != null) {
            return;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
