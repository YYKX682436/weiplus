package com.tencent.mm.plugin.mv.ui.free;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFreeMakerPreviewUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvFreeMakerPreviewUI extends com.tencent.mm.plugin.mv.ui.BaseMusicMvUI {

    /* renamed from: e, reason: collision with root package name */
    public final r45.ss4 f150894e = new r45.ss4();

    /* renamed from: f, reason: collision with root package name */
    public boolean f150895f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c4w;
    }

    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.mv.ui.uic.h6.class, mm3.n.class, com.tencent.mm.plugin.mv.ui.uic.k6.class, com.tencent.mm.plugin.mv.ui.uic.x6.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 7 && i18 == -1) {
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r6 = this;
            pf5.z r0 = pf5.z.f353948a
            pf5.v r0 = r0.a(r6)
            java.lang.Class<mm3.n> r1 = mm3.n.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm3.n r0 = (mm3.n) r0
            boolean r1 = r0.f329659m
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L43
            boolean r1 = r0.f329660n
            if (r1 != 0) goto L43
            boolean r1 = r0.f329662p
            if (r1 == 0) goto L1d
            goto L43
        L1d:
            java.util.LinkedList r1 = r0.f329657h
            if (r1 == 0) goto L3c
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.next()
            r45.jf2 r4 = (r45.jf2) r4
            r5 = 10
            java.lang.String r4 = r4.getString(r5)
            if (r4 == 0) goto L25
            goto L43
        L3a:
            r1 = 0
            goto L44
        L3c:
            java.lang.String r0 = "trackList"
            kotlin.jvm.internal.o.o(r0)
            throw r2
        L43:
            r1 = r3
        L44:
            if (r1 == 0) goto L91
            com.tencent.mm.ui.widget.dialog.k0 r1 = new com.tencent.mm.ui.widget.dialog.k0
            androidx.appcompat.app.AppCompatActivity r4 = r0.getActivity()
            r1.<init>(r4, r3, r3)
            r1.t(r3)
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2131772242(0x7f104352, float:1.9175838E38)
            java.lang.String r3 = r3.getString(r4)
            android.content.res.Resources r4 = r0.getResources()
            r5 = 2131165989(0x7f070325, float:1.794621E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r5 = 17
            r1.r(r3, r5, r4, r2)
            android.app.Activity r2 = r0.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099862(0x7f0600d6, float:1.781209E38)
            int r2 = r2.getColor(r3)
            r1.l(r2)
            mm3.k r2 = new mm3.k
            r2.<init>(r0)
            r1.f211872n = r2
            mm3.l r2 = new mm3.l
            r2.<init>(r0, r1)
            r1.f211881s = r2
            r1.v()
            goto L98
        L91:
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            r0.finish()
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI.onBackPressed():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012f A[LOOP:1: B:32:0x00eb->B:46:0x012f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ll3.z0.a(ll3.z0.f319264a, false, 1, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f150895f) {
            return;
        }
        this.f150895f = false;
    }
}
