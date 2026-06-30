package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class ic extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager f161153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager) {
        super(3);
        this.f161153d = settingsHearingAidAudioCardViewManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r4 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r1 = r0.f160413i.get(r3);
        kotlin.jvm.internal.o.f(r1, "get(...)");
        r1 = q26.h0.p(new n3.r1((android.view.ViewGroup) r1), com.tencent.mm.plugin.setting.ui.setting.hc.f161108d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r11 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r0.f160410f = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r10 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r10 = new q26.h((q26.i) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r10.hasNext() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        r11 = (com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (kotlin.jvm.internal.o.b(r11, r9) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r11.isPlaying == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        r11.b(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        return jz5.f0.f302826a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        if (r0.f160410f == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        r9 = new q26.h((q26.i) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        if (r9.hasNext() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        r10 = r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        if ((!((com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) r10).getHasPlayed()) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        r10 = (com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        if (r10 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
    
        r9 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView.f160392v;
        r10.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        r10 = null;
     */
    @Override // yz5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            android.view.View r9 = (android.view.View) r9
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.g(r9, r0)
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager r0 = r8.f161153d
            java.util.ArrayList r1 = r0.f160413i
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L1d:
            boolean r4 = r1.hasNext()
            r5 = 1
            if (r4 == 0) goto L56
            java.lang.Object r4 = r1.next()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r6 = r2
        L2b:
            int r7 = r4.getChildCount()
            if (r6 >= r7) goto L33
            r7 = r5
            goto L34
        L33:
            r7 = r2
        L34:
            if (r7 == 0) goto L4f
            int r7 = r6 + 1
            android.view.View r6 = r4.getChildAt(r6)
            if (r6 == 0) goto L49
            if (r6 != r9) goto L42
            r6 = r5
            goto L43
        L42:
            r6 = r2
        L43:
            if (r6 == 0) goto L47
            r4 = r5
            goto L50
        L47:
            r6 = r7
            goto L2b
        L49:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException
            r9.<init>()
            throw r9
        L4f:
            r4 = r2
        L50:
            if (r4 == 0) goto L53
            goto L57
        L53:
            int r3 = r3 + 1
            goto L1d
        L56:
            r3 = -1
        L57:
            java.util.ArrayList r1 = r0.f160413i
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r3 = "get(...)"
            kotlin.jvm.internal.o.f(r1, r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            n3.r1 r3 = new n3.r1
            r3.<init>(r1)
            com.tencent.mm.plugin.setting.ui.setting.hc r1 = com.tencent.mm.plugin.setting.ui.setting.hc.f161108d
            q26.n r1 = q26.h0.p(r3, r1)
            if (r11 == 0) goto L73
            r0.f160410f = r2
        L73:
            if (r10 == 0) goto L96
            q26.i r1 = (q26.i) r1
            q26.h r10 = new q26.h
            r10.<init>(r1)
        L7c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lc0
            java.lang.Object r11 = r10.next()
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView r11 = (com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) r11
            boolean r0 = kotlin.jvm.internal.o.b(r11, r9)
            if (r0 != 0) goto L7c
            boolean r0 = r11.isPlaying
            if (r0 == 0) goto L7c
            r11.b(r2)
            goto L7c
        L96:
            boolean r9 = r0.f160410f
            if (r9 == 0) goto Lc0
            q26.i r1 = (q26.i) r1
            q26.h r9 = new q26.h
            r9.<init>(r1)
        La1:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lb6
            java.lang.Object r10 = r9.next()
            r11 = r10
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView r11 = (com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) r11
            boolean r11 = r11.getHasPlayed()
            r11 = r11 ^ r5
            if (r11 == 0) goto La1
            goto Lb7
        Lb6:
            r10 = 0
        Lb7:
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView r10 = (com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) r10
            if (r10 == 0) goto Lc0
            int r9 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView.f160392v
            r10.a(r2)
        Lc0:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.ic.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
