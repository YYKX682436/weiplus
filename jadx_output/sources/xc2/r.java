package xc2;

/* loaded from: classes2.dex */
public class r extends xc2.j {

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f453277g;

    /* renamed from: h, reason: collision with root package name */
    public xc2.p f453278h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f453280j;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453279i = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f453281k = new xc2.q(this);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(in5.s0 r16, android.view.View r17, xc2.p0 r18, xc2.p r19, java.lang.String r20) {
        /*
            r15 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.String r3 = "holder"
            kotlin.jvm.internal.o.g(r0, r3)
            java.lang.String r3 = "jumpView"
            r4 = r17
            kotlin.jvm.internal.o.g(r4, r3)
            java.lang.String r3 = "infoEx"
            kotlin.jvm.internal.o.g(r1, r3)
            java.lang.String r3 = "cache"
            kotlin.jvm.internal.o.g(r2, r3)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f453244f
            if (r3 == 0) goto L2b
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.getFeedObject()
            if (r3 == 0) goto L2b
            long r3 = r3.getId()
            goto L2d
        L2b:
            r3 = 0
        L2d:
            r6 = r3
            java.lang.String r3 = "reportExpose"
            r4 = r15
            r15.y(r3, r6, r2)
            java.lang.Class<com.tencent.mm.plugin.finder.report.o3> r3 = com.tencent.mm.plugin.finder.report.o3.class
            i95.m r3 = i95.n0.c(r3)
            r5 = r3
            com.tencent.mm.plugin.finder.report.o3 r5 = (com.tencent.mm.plugin.finder.report.o3) r5
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f453244f
            r8 = 0
            if (r3 == 0) goto L47
            java.lang.String r3 = r3.w()
            goto L48
        L47:
            r3 = r8
        L48:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r1.f453234a
            int r9 = r1.getExt_type()
            r10 = 1
            if (r9 == r10) goto L60
            r10 = 2
            if (r9 == r10) goto L57
            r1 = 0
        L55:
            r9 = r1
            goto L61
        L57:
            int r1 = r1.getJumpinfo_type()
            r9 = 7
            if (r1 != r9) goto L60
            r1 = 3
            goto L55
        L60:
            r9 = r10
        L61:
            r10 = 1
            r11 = 0
            r12 = 0
            cl0.g r1 = new cl0.g
            r1.<init>()
            java.lang.String r2 = r2.f453229h
            java.lang.String r13 = "uxinfo"
            r1.h(r13, r2)
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.o.f(r13, r1)
            android.content.Context r0 = r0.f293121e
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            boolean r1 = r0 instanceof com.tencent.mm.ui.MMFragmentActivity
            if (r1 == 0) goto L95
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.z r1 = pf5.z.f353948a
            pf5.v r0 = r1.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r1 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r0 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r0
            goto L96
        L95:
            r0 = r8
        L96:
            if (r0 == 0) goto L9e
            r45.qt2 r0 = r0.V6()
            r14 = r0
            goto L9f
        L9e:
            r14 = r8
        L9f:
            r8 = r3
            r5.Fk(r6, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.r.A(in5.s0, android.view.View, xc2.p0, xc2.p, java.lang.String):void");
    }

    @Override // xc2.j, xc2.z2
    public void a(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.a(infoEx);
        if (this.f453280j) {
            l();
        }
    }

    @Override // xc2.j, xc2.z2
    public void f(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.f(holder, jumpView, infoEx);
        this.f453162b = infoEx;
        this.f453161a = holder;
    }

    @Override // xc2.j, xc2.z2
    public void h(boolean z17, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.h(z17, holder, jumpView, infoEx);
        java.lang.String str = infoEx.f453247i;
        this.f453279i = str;
        if (z17) {
            this.f453277g = holder.f293121e;
            xc2.o0 o0Var = infoEx.f453246h;
            xc2.p pVar = o0Var instanceof xc2.p ? (xc2.p) o0Var : null;
            this.f453278h = pVar;
            if (pVar != null) {
                A(holder, jumpView, infoEx, pVar, str);
            } else {
                jumpView.removeCallbacks(this.f453281k);
            }
        }
    }

    @Override // xc2.j
    public void l() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPreload jumpInfoEx is null=");
        sb6.append(this.f453162b == null);
        com.tencent.mars.xlog.Log.i("FinderAdBaseJumperEventHandler", sb6.toString());
        xc2.p0 p0Var = this.f453162b;
        if (p0Var != null) {
            p0Var.f453262x = true;
            xc2.b bVar = this instanceof xc2.b ? (xc2.b) this : null;
            if (bVar != null && p0Var.f453263y == 0 && bVar.f453069m > 0) {
                p0Var.f453263y = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f453069m) / 1000);
            }
            v(p0Var);
            java.util.ArrayList arrayList = p0Var.U;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (!kotlin.jvm.internal.o.b(((xc2.p0) obj).f453234a, p0Var.f453234a)) {
                    arrayList2.add(obj);
                }
            }
            com.tencent.mars.xlog.Log.i("FinderAdBaseJumperEventHandler", "doPreload: jumpInfoEx.combineJumpInfoList, size=" + arrayList2.size());
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                v((xc2.p0) it.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0130  */
    @Override // xc2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(in5.s0 r19, android.view.View r20, xc2.p0 r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.r.r(in5.s0, android.view.View, xc2.p0):void");
    }

    @Override // xc2.j
    public boolean u() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0 A[Catch: JSONException -> 0x014c, TryCatch #2 {JSONException -> 0x014c, blocks: (B:30:0x00c6, B:37:0x00e6, B:39:0x00f0, B:42:0x00f9, B:45:0x0102, B:61:0x013a, B:65:0x0133, B:70:0x011a, B:78:0x00de, B:32:0x00cd, B:36:0x00d8, B:47:0x0106, B:51:0x0111, B:55:0x0124, B:59:0x012d), top: B:29:0x00c6, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(xc2.p0 r20) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.r.v(xc2.p0):void");
    }

    public void w() {
    }

    public final java.lang.String x(android.content.Context context, java.lang.String str, java.lang.String uxInfo, java.lang.String str2) {
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(uxInfo, "uxInfo");
        java.lang.String encode = java.net.URLEncoder.encode(uxInfo, com.tencent.mapsdk.internal.rv.f51270c);
        int L = str != null ? r26.n0.L(str, "#", 0, false, 6, null) : -1;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.Qa;
        java.lang.CharSequence charSequence3 = "";
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) gVar).getValue()).r()).booleanValue() || L <= 0) {
            charSequence = str;
        } else if (str == null || (charSequence = str.subSequence(0, L)) == null) {
            charSequence = "";
        }
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) gVar).getValue()).r()).booleanValue() || L <= 0 || str == null || (charSequence2 = str.subSequence(L, str.length())) == null) {
            charSequence2 = "";
        }
        int i17 = 1;
        if (!(charSequence == null || charSequence.length() == 0)) {
            if (!r26.n0.D(charSequence, "?", false, 2, null)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append((java.lang.Object) charSequence);
                sb6.append('?');
                charSequence3 = sb6.toString();
            } else if (r26.n0.F(charSequence, "?", false, 2, null) || r26.n0.F(charSequence, "&", false, 2, null)) {
                charSequence3 = charSequence;
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append((java.lang.Object) charSequence);
                sb7.append('&');
                charSequence3 = sb7.toString();
            }
        }
        java.lang.String str3 = ((java.lang.Object) charSequence3) + "uxinfo=" + encode;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        java.lang.String string = nyVar != null ? nyVar.V6().getString(1) : null;
        if (!(string == null || string.length() == 0)) {
            str3 = str3 + "&context_id=" + string;
        }
        if (kotlin.jvm.internal.o.b(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str2)) {
            i17 = 2;
        } else if (kotlin.jvm.internal.o.b("TWO_FLOW", str2)) {
            i17 = 4;
        } else if (kotlin.jvm.internal.o.b("single_comment", str2)) {
            i17 = 5;
        }
        java.lang.String str4 = (str3 + "&pos=" + i17) + ((java.lang.Object) charSequence2);
        com.tencent.mars.xlog.Log.i("FinderAdBaseJumperEventHandler", "loadUrl: " + str4);
        return str4;
    }

    public final void y(java.lang.String action, long j17, xc2.p cache) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(cache, "cache");
        com.tencent.mars.xlog.Log.i("FinderAdBaseJumperEventHandler", action + " feedId:" + pm0.v.u(j17) + ", title:" + ((java.lang.Object) cache.f453219a) + ", desc:" + ((java.lang.Object) cache.f453220b) + ", iconUrl:" + cache.f453221c + ", aid:" + cache.f453230i + ", posId:" + cache.f453231j + ", canvasId:" + cache.f453232k + ", uxinfo:" + cache.f453229h);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(in5.s0 r21, android.view.View r22, xc2.p0 r23, xc2.p r24, int r25, int r26, java.lang.String r27) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            r3 = r24
            java.lang.String r4 = "holder"
            kotlin.jvm.internal.o.g(r1, r4)
            java.lang.String r4 = "jumpView"
            r5 = r22
            kotlin.jvm.internal.o.g(r5, r4)
            java.lang.String r4 = "infoEx"
            kotlin.jvm.internal.o.g(r2, r4)
            java.lang.String r4 = "cache"
            kotlin.jvm.internal.o.g(r3, r4)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r2.f453244f
            r6 = 0
            if (r4 == 0) goto L30
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.getFeedObject()
            if (r4 == 0) goto L30
            long r8 = r4.getId()
            r11 = r8
            goto L31
        L30:
            r11 = r6
        L31:
            java.lang.String r4 = "reportClick"
            r0.y(r4, r11, r3)
            r4 = 2131305034(0x7f09224a, float:1.8228227E38)
            android.view.View r1 = r1.p(r4)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) r1
            if (r1 == 0) goto L45
            long r6 = r1.getCurrentPosMs()
        L45:
            r4 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r4
            long r6 = r6 / r8
            int r4 = (int) r6
            r6 = 0
            if (r1 == 0) goto L54
            int r1 = r1.getVideoDurationSec()
            r17 = r1
            goto L56
        L54:
            r17 = r6
        L56:
            boolean r1 = r0.f453166f
            if (r1 == 0) goto L5d
            r16 = r17
            goto L5f
        L5d:
            r16 = r4
        L5f:
            java.lang.Class<com.tencent.mm.plugin.finder.report.o3> r1 = com.tencent.mm.plugin.finder.report.o3.class
            i95.m r1 = i95.n0.c(r1)
            r10 = r1
            com.tencent.mm.plugin.finder.report.o3 r10 = (com.tencent.mm.plugin.finder.report.o3) r10
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r2.f453244f
            r4 = 0
            if (r1 == 0) goto L73
            java.lang.String r1 = r1.w()
            r13 = r1
            goto L74
        L73:
            r13 = r4
        L74:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r2.f453234a
            int r2 = r1.getExt_type()
            r7 = 1
            if (r2 == r7) goto L8c
            r7 = 2
            if (r2 == r7) goto L82
            r14 = r6
            goto L8d
        L82:
            int r1 = r1.getJumpinfo_type()
            r2 = 7
            if (r1 != r2) goto L8c
            r1 = 3
            r14 = r1
            goto L8d
        L8c:
            r14 = r7
        L8d:
            r15 = 2
            cl0.g r1 = new cl0.g
            r1.<init>()
            java.lang.String r2 = r3.f453229h
            java.lang.String r3 = "uxinfo"
            r1.h(r3, r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            android.content.Context r2 = r22.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            boolean r3 = r2 instanceof com.tencent.mm.ui.MMFragmentActivity
            if (r3 == 0) goto Lc1
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            pf5.z r3 = pf5.z.f353948a
            pf5.v r2 = r3.a(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r3 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r2 = r2.a(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r2
            goto Lc2
        Lc1:
            r2 = r4
        Lc2:
            if (r2 == 0) goto Lcb
            r45.qt2 r2 = r2.V6()
            r19 = r2
            goto Lcd
        Lcb:
            r19 = r4
        Lcd:
            r18 = r1
            r10.Fk(r11, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.r.z(in5.s0, android.view.View, xc2.p0, xc2.p, int, int, java.lang.String):void");
    }
}
