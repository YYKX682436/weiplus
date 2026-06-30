package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public final class d extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.topstory.ui.home.c f174947h = new com.tencent.mm.plugin.topstory.ui.home.c(null);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f174948i = jz5.h.b(com.tencent.mm.plugin.topstory.ui.home.b.f174935d);

    /* renamed from: d, reason: collision with root package name */
    public r45.in6 f174949d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f174950e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vs2 f174951f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xs2 f174952g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6(r45.in6 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "homeContext"
            kotlin.jvm.internal.o.g(r6, r0)
            r5.f174949d = r6
            com.tencent.mm.protobuf.g r6 = r6.H
            r0 = 0
            if (r6 == 0) goto L10
            byte[] r6 = r6.f192156a
            goto L11
        L10:
            r6 = r0
        L11:
            java.lang.String r1 = "MicroMsg.TopStoryDataUIC"
            r2 = 0
            if (r6 == 0) goto L28
            r45.vs2 r3 = new r45.vs2     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            r3.parseFrom(r6)     // Catch: java.lang.Throwable -> L1f
            goto L29
        L1f:
            r6 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "parse redDotInfo err"
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r6, r4, r3)
        L28:
            r3 = r0
        L29:
            r5.f174951f = r3
            if (r3 == 0) goto L34
            com.tencent.mm.protobuf.g r6 = r3.f388488f
            if (r6 == 0) goto L34
            byte[] r6 = r6.f192156a
            goto L35
        L34:
            r6 = r0
        L35:
            if (r6 == 0) goto L4a
            r45.xs2 r3 = new r45.xs2     // Catch: java.lang.Throwable -> L41
            r3.<init>()     // Catch: java.lang.Throwable -> L41
            r3.parseFrom(r6)     // Catch: java.lang.Throwable -> L41
            r0 = r3
            goto L4a
        L41:
            r6 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "parse redDotExtInfo err"
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r6, r3, r2)
        L4a:
            r5.f174952g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.topstory.ui.home.d.O6(r45.in6):void");
    }
}
