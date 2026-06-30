package gx0;

/* loaded from: classes5.dex */
public final class ha implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.d f276506e;

    public ha(gx0.ac acVar, cw0.d dVar) {
        this.f276505d = acVar;
        this.f276506e = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    @Override // androidx.lifecycle.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onChanged(java.lang.Object r11) {
        /*
            r10 = this;
            com.tencent.maas.model.time.MJTime r11 = (com.tencent.maas.model.time.MJTime) r11
            gx0.ac r0 = r10.f276505d
            gx0.bf r1 = r0.c8()
            androidx.lifecycle.g0 r1 = r1.f276255v
            java.lang.Object r1 = r1.getValue()
            gx0.fd r2 = gx0.fd.f276432h
            if (r1 == r2) goto L14
            goto Lbc
        L14:
            kotlin.jvm.internal.o.d(r11)
            r0.g8(r11)
            ex0.a0 r1 = r0.e8()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L69
            boolean r4 = r11.isValid()
            if (r4 != 0) goto L29
            goto L64
        L29:
            boolean r4 = r1.C(r11)
            if (r4 != 0) goto L64
            ex0.v r1 = r1.f257097g
            java.util.List r1 = r1.f257179g
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L41
            r4 = r1
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L41
            goto L5f
        L41:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r1.next()
            ex0.q r4 = (ex0.q) r4
            com.tencent.maas.model.time.MJTimeRange r4 = r4.l()
            boolean r4 = r4.containsTime(r11)
            if (r4 == 0) goto L47
            r1 = r3
            goto L60
        L5f:
            r1 = r2
        L60:
            if (r1 != 0) goto L64
            r1 = r3
            goto L65
        L64:
            r1 = r2
        L65:
            if (r1 != r3) goto L69
            r1 = r3
            goto L6a
        L69:
            r1 = r2
        L6a:
            if (r1 != 0) goto Lbc
            uu0.c r1 = uu0.c.e()
            boolean r1 = r1.f431207b
            if (r1 == 0) goto Lbc
            kotlinx.coroutines.y0 r4 = r0.getMainScope()
            r5 = 0
            r6 = 0
            gx0.ga r7 = new gx0.ga
            r1 = 0
            r7.<init>(r0, r1)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.l.d(r4, r5, r6, r7, r8, r9)
            cw0.d r1 = r10.f276506e
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice.MCVoiceInputLayout r1 = r1.getNarrationLayout$plugin_mj_template_release()
            r4 = 2
            r1.performHapticFeedback(r2, r4)
            r1.B(r2)
            ex0.a0 r1 = r0.e8()
            if (r1 == 0) goto L9f
            boolean r11 = r1.C(r11)
            if (r11 != r3) goto L9f
            r2 = r3
        L9f:
            if (r2 == 0) goto Lbc
            android.app.Activity r11 = r0.getContext()
            int r1 = com.tencent.mm.ui.widget.dialog.f4.f211790n
            com.tencent.mm.ui.widget.dialog.e4 r1 = new com.tencent.mm.ui.widget.dialog.e4
            r1.<init>(r11)
            android.app.Activity r11 = r0.getContext()
            r0 = 2131771494(0x7f104066, float:1.917432E38)
            java.lang.String r11 = r11.getString(r0)
            r1.f211776c = r11
            r1.c()
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.ha.onChanged(java.lang.Object):void");
    }
}
