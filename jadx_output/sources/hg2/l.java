package hg2;

/* loaded from: classes3.dex */
public final class l extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f281369m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f281370n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(hg2.l r6, int r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof hg2.j
            if (r0 == 0) goto L16
            r0 = r8
            hg2.j r0 = (hg2.j) r0
            int r1 = r0.f281363h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f281363h = r1
            goto L1b
        L16:
            hg2.j r0 = new hg2.j
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f281361f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f281363h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.f281360e
            java.lang.Object r6 = r0.f281359d
            hg2.l r6 = (hg2.l) r6
            goto L35
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
        L38:
            if (r7 <= 0) goto L57
            android.widget.TextView r8 = r6.f281370n
            if (r8 != 0) goto L3f
            goto L46
        L3f:
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r8.setText(r2)
        L46:
            int r7 = r7 + (-1)
            r0.f281359d = r6
            r0.f281360e = r7
            r0.f281363h = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = kotlinx.coroutines.k1.b(r4, r0)
            if (r8 != r1) goto L38
            goto L59
        L57:
            jz5.f0 r1 = jz5.f0.f302826a
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hg2.l.Z6(hg2.l, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        android.view.View S6 = S6(com.tencent.mm.R.id.qf7);
        android.view.ViewGroup viewGroup = S6 instanceof android.view.ViewGroup ? (android.view.ViewGroup) S6 : null;
        this.f281369m = viewGroup;
        this.f281370n = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.qdz) : null;
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f281369m = null;
        this.f281370n = null;
    }
}
