package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes.dex */
public class FriendPreference extends com.tencent.mm.ui.base.preference.Preference implements kv.e0 {
    public android.widget.TextView L;

    public FriendPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // kv.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.Class<kv.c0> r0 = kv.c0.class
            i95.m r1 = i95.n0.c(r0)
            kv.c0 r1 = (kv.c0) r1
            com.tencent.mm.feature.avatar.w r1 = (com.tencent.mm.feature.avatar.w) r1
            r1.getClass()
            boolean r1 = com.tencent.mm.storage.z3.s4(r11)
            r2 = 0
            java.lang.String r3 = "@"
            r4 = -1
            if (r1 != 0) goto L19
            goto L24
        L19:
            java.lang.String[] r1 = r11.split(r3)
            r1 = r1[r2]     // Catch: java.lang.Exception -> L24
            long r6 = com.tencent.mm.sdk.platformtools.t8.V(r1, r4)     // Catch: java.lang.Exception -> L24
            goto L25
        L24:
            r6 = r4
        L25:
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L3d
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L3d
            i95.m r1 = i95.n0.c(r0)
            kv.c0 r1 = (kv.c0) r1
            com.tencent.mm.feature.avatar.w r1 = (com.tencent.mm.feature.avatar.w) r1
            r1.getClass()
            com.tencent.mm.modelavatar.g.a(r11)
        L3d:
            com.tencent.mm.sdk.platformtools.r2 r1 = com.tencent.mm.storage.z3.M2
            if (r11 == 0) goto L4b
            java.lang.String r1 = "@fb"
            boolean r1 = r11.endsWith(r1)
            if (r1 == 0) goto L4b
            r1 = 1
            goto L4c
        L4b:
            r1 = r2
        L4c:
            if (r1 != 0) goto L4f
            goto L59
        L4f:
            java.lang.String[] r1 = r11.split(r3)
            r1 = r1[r2]     // Catch: java.lang.Exception -> L59
            long r4 = com.tencent.mm.sdk.platformtools.t8.V(r1, r4)     // Catch: java.lang.Exception -> L59
        L59:
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L6b
            i95.m r0 = i95.n0.c(r0)
            kv.c0 r0 = (kv.c0) r0
            com.tencent.mm.feature.avatar.w r0 = (com.tencent.mm.feature.avatar.w) r0
            r0.getClass()
            com.tencent.mm.modelavatar.g.a(r11)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.FriendPreference.U(java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public java.lang.CharSequence n() {
        return this.L.getText().toString();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        this.L = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ns9);
        super.t(view);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bzf, viewGroup2);
        return u17;
    }

    public FriendPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
        this.H = com.tencent.mm.R.layout.f489294c10;
    }
}
