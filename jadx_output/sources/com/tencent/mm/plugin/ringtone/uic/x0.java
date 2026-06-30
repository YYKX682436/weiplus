package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class x0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f158536d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f158537e;

    /* renamed from: f, reason: collision with root package name */
    public int f158538f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f158539g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f158540h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158536d = new java.util.ArrayList();
        this.f158537e = true;
        this.f158538f = -1;
        this.f158539g = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (((kotlinx.coroutines.a) r8).a() == true) goto L14;
     */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateAfter(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreateAfter(r8)
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "ringtone_finder_username"
            java.lang.String r8 = r8.getStringExtra(r0)
            if (r8 != 0) goto L11
            java.lang.String r8 = ""
        L11:
            r7.f158539g = r8
            boolean r8 = r7.f158537e
            if (r8 != 0) goto L32
            androidx.appcompat.app.AppCompatActivity r8 = r7.getActivity()
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.g(r8, r0)
            pf5.z r0 = pf5.z.f353948a
            pf5.v r8 = r0.a(r8)
            java.lang.Class<com.tencent.mm.plugin.ringtone.uic.g> r0 = com.tencent.mm.plugin.ringtone.uic.g.class
            androidx.lifecycle.c1 r8 = r8.a(r0)
            com.tencent.mm.plugin.ringtone.uic.g r8 = (com.tencent.mm.plugin.ringtone.uic.g) r8
            r8.O6()
            goto L57
        L32:
            kotlinx.coroutines.r2 r8 = r7.f158540h
            if (r8 == 0) goto L40
            kotlinx.coroutines.a r8 = (kotlinx.coroutines.a) r8
            boolean r8 = r8.a()
            r0 = 1
            if (r8 != r0) goto L40
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L57
            kotlinx.coroutines.y0 r1 = r7.getLifecycleScope()
            r2 = 0
            r3 = 0
            com.tencent.mm.plugin.ringtone.uic.w0 r4 = new com.tencent.mm.plugin.ringtone.uic.w0
            r8 = 0
            r4.<init>(r7, r8)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.r2 r8 = kotlinx.coroutines.l.d(r1, r2, r3, r4, r5, r6)
            r7.f158540h = r8
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ringtone.uic.x0.onCreateAfter(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        kotlinx.coroutines.r2 r2Var = this.f158540h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f158536d.clear();
    }
}
