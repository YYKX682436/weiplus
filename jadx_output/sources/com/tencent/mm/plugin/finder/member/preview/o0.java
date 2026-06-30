package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class o0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.preview.n0 f121266d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.preview.n0 f121267e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.preview.n0 f121268f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onBackPressed() {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.member.preview.n0 r0 = r4.f121266d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            gx2.q r3 = r0.f121261d
            if (r3 == 0) goto Ld
            boolean r3 = r3.isDrawerOpen
            goto Le
        Ld:
            r3 = r1
        Le:
            if (r3 != r2) goto L12
            r3 = r2
            goto L13
        L12:
            r3 = r1
        L13:
            if (r3 == 0) goto L1b
            if (r0 == 0) goto L1a
            r0.a()
        L1a:
            return r2
        L1b:
            com.tencent.mm.plugin.finder.member.preview.n0 r0 = r4.f121267e
            if (r0 == 0) goto L2a
            gx2.q r3 = r0.f121261d
            if (r3 == 0) goto L26
            boolean r3 = r3.isDrawerOpen
            goto L27
        L26:
            r3 = r1
        L27:
            if (r3 != r2) goto L2a
            r1 = r2
        L2a:
            if (r1 == 0) goto L32
            if (r0 == 0) goto L31
            r0.a()
        L31:
            return r2
        L32:
            boolean r0 = super.onBackPressed()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.member.preview.o0.onBackPressed():boolean");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f121266d = new com.tencent.mm.plugin.finder.member.preview.n0(getActivity(), com.tencent.mm.R.id.eh6, 0);
        this.f121267e = new com.tencent.mm.plugin.finder.member.preview.n0(getActivity(), com.tencent.mm.R.id.f484520eh5, 1);
        this.f121268f = new com.tencent.mm.plugin.finder.member.preview.n0(getActivity(), com.tencent.mm.R.id.f484518qf3, 6);
        new com.tencent.mm.plugin.finder.member.preview.n0(getActivity(), com.tencent.mm.R.id.f484519qf4, 7);
    }
}
