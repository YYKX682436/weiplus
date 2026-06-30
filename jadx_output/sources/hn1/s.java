package hn1;

@j95.b
/* loaded from: classes11.dex */
public final class s extends i95.w implements kv.b0 {

    /* renamed from: d, reason: collision with root package name */
    public long f282482d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f282483e = jz5.h.b(hn1.f.f282450d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f282484f = jz5.h.b(hn1.g.f282451d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f282485g = jz5.h.b(hn1.j.f282455d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f282486h = jz5.h.b(hn1.i.f282454d);

    public void Ai(android.widget.ImageView imageView, java.lang.String str) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        Bi(imageView, str, null, 0.1f);
    }

    public void Bi(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, float f17) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        boolean z17 = true;
        if (str == null || r26.n0.N(str)) {
            return;
        }
        imageView.setTag(com.tencent.mm.R.id.h9z, "");
        com.tencent.mm.sdk.platformtools.r2 r2Var = hn1.e.f282449a;
        if (str != null) {
            if (str2 != null && !r26.n0.N(str2)) {
                z17 = false;
            }
            if (z17 && !com.tencent.mm.storage.z3.E4(str) && !r26.n0.B(str, "@", false) && !r26.i0.y(str, "gh_", false) && !kotlin.jvm.internal.o.b(str, "filehelper")) {
                java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
                kotlin.jvm.internal.o.d(stackTrace);
                hn1.e.f282449a.put(str, kz5.n0.g0(kz5.n0.K0(kz5.z.H(stackTrace, 2), 20), "\n", null, null, 0, null, hn1.d.f282448d, 30, null));
                com.tencent.mars.xlog.Log.i("MicroMsg.AvatarGetContactServiceHelper", "put stack into pool: ".concat(str));
            }
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable instanceof in1.e) {
                in1.e.c((in1.e) drawable, lifecycleScope, str, f17, false, str2, 8, null);
                imageView.invalidate();
            } else {
                in1.e eVar = new in1.e(lifecycleScope, str, f17, false, str2, 8, null);
                wi(eVar);
                imageView.setImageDrawable(eVar);
            }
        }
    }

    public void Di(android.widget.ImageView imageView, java.lang.String str) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        if ((str == null || r26.n0.N(str)) || (lifecycleScope = gm0.j1.b().f273245h.f273145e) == null) {
            return;
        }
        if (this.f282482d == 0) {
            this.f282482d = c01.id.c();
        }
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable instanceof in1.e) {
            if (c01.id.c() - this.f282482d > 30000) {
                in1.e.c((in1.e) drawable, lifecycleScope, str, 0.1f, false, null, 24, null);
            } else {
                in1.e.c((in1.e) drawable, lifecycleScope, str, 0.1f, true, null, 16, null);
            }
            imageView.invalidate();
            return;
        }
        if (c01.id.c() - this.f282482d > 30000) {
            in1.e eVar = new in1.e(lifecycleScope, str, 0.1f, false, null, 24, null);
            wi(eVar);
            imageView.setImageDrawable(eVar);
        } else {
            in1.e eVar2 = new in1.e(lifecycleScope, str, 0.1f, true, null, 16, null);
            wi(eVar2);
            imageView.setImageDrawable(eVar2);
        }
    }

    public java.lang.String Ni(java.lang.String str, int i17, gk0.k options) {
        kotlin.jvm.internal.o.g(options, "options");
        return "key_" + str + '_' + i17 + '_' + options.f272433d + '_' + options.f272432c;
    }

    public android.graphics.Bitmap Ri(float f17) {
        boolean z17 = f17 == 0.1f;
        jz5.g gVar = this.f282483e;
        if (z17) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(bitmap, "<get-_defaultAvatarBitmap>(...)");
            return bitmap;
        }
        if (f17 == 0.5f) {
            android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) ((jz5.n) this.f282484f).getValue();
            kotlin.jvm.internal.o.f(bitmap2, "<get-_defaultRoundAvatarBitmap>(...)");
            return bitmap2;
        }
        android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0((android.graphics.Bitmap) ((jz5.n) gVar).getValue(), false, f17 * ((android.graphics.Bitmap) ((jz5.n) gVar).getValue()).getWidth());
        kotlin.jvm.internal.o.f(s07, "getRoundedCornerBitmap(...)");
        return s07;
    }

    public android.graphics.Bitmap Ui(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        return com.tencent.mm.modelavatar.d1.Ai().l(str);
    }

    public final java.lang.String Vi() {
        return "AvatarImageLoader@" + (java.lang.System.currentTimeMillis() % 4);
    }

    public java.lang.String Zi(java.lang.String str, float f17) {
        gk0.k kVar = new gk0.k(156, 156);
        kVar.f272433d = f17;
        return Ni(str, 0, kVar);
    }

    public com.tencent.mm.vfs.r6 aj(java.lang.String str) {
        byte[] bArr;
        if (str != null) {
            bArr = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        java.lang.String g17 = kk.k.g(bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.String) ((jz5.n) this.f282485g).getValue());
        kotlin.jvm.internal.o.d(g17);
        java.lang.String substring = g17.substring(0, 2);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append('/');
        java.lang.String substring2 = g17.substring(2, 4);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        sb6.append(substring2);
        sb6.append('/');
        sb6.append(g17);
        sb6.append('/');
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(sb6.toString());
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var;
    }

    public boolean bj(java.lang.String str) {
        if (str == null || !fp.h.c(28)) {
            return false;
        }
        if (r26.n0.B(str, "@", false)) {
            return com.tencent.mm.storage.z3.R4(str) || com.tencent.mm.storage.z3.m4(str) || com.tencent.mm.storage.z3.E4(str) || com.tencent.mm.storage.z3.L4(str);
        }
        return true;
    }

    public void cj(java.lang.String str, java.util.Map map) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        if (bj(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarImageLoaderFeatureService", "javaTriggerUpdate " + str);
            gm0.b bVar = gm0.j1.b().f273245h;
            if (bVar == null || (lifecycleScope = bVar.f273145e) == null) {
                return;
            }
            v65.i.b(lifecycleScope, null, new hn1.k(str, map, null), 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fj(java.lang.String r9, float r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn1.s.fj(java.lang.String, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object hj(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof hn1.m
            if (r0 == 0) goto L13
            r0 = r10
            hn1.m r0 = (hn1.m) r0
            int r1 = r0.f282464f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f282464f = r1
            goto L18
        L13:
            hn1.m r0 = new hn1.m
            r0.<init>(r8, r10)
        L18:
            r7 = r0
            java.lang.Object r10 = r7.f282462d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f282464f
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lbe
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = 0
            if (r9 == 0) goto L40
            boolean r1 = r26.n0.N(r9)
            if (r1 == 0) goto L3e
            goto L40
        L3e:
            r1 = r10
            goto L41
        L40:
            r1 = r2
        L41:
            if (r1 == 0) goto L45
            r9 = 0
            return r9
        L45:
            r1 = 7
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<jn1.h> r3 = jn1.h.class
            r1[r10] = r3
            java.lang.Class<jn1.a> r10 = jn1.a.class
            r1[r2] = r10
            r10 = 2
            java.lang.Class<jn1.a0> r3 = jn1.a0.class
            r1[r10] = r3
            r10 = 3
            java.lang.Class<jn1.j> r3 = jn1.j.class
            r1[r10] = r3
            r10 = 4
            java.lang.Class<jn1.u> r3 = jn1.u.class
            r1[r10] = r3
            r10 = 5
            java.lang.Class<jn1.d0> r3 = jn1.d0.class
            r1[r10] = r3
            r10 = 6
            java.lang.Class<jn1.w> r3 = jn1.w.class
            r1[r10] = r3
            java.util.List r10 = kz5.c0.k(r1)
            gk0.k r1 = new gk0.k
            int r3 = kv.f0.a()
            int r4 = kv.f0.a()
            r1.<init>(r3, r4)
            java.lang.String r1 = r8.Ni(r9, r2, r1)
            java.lang.Class<kv.b0> r3 = kv.b0.class
            i95.m r3 = i95.n0.c(r3)
            kv.b0 r3 = (kv.b0) r3
            hn1.s r3 = (hn1.s) r3
            com.tencent.mm.vfs.r6 r3 = r3.aj(r9)
            g75.z r4 = new g75.z
            r4.<init>()
            java.lang.String r5 = "Common_ImageKey"
            r4.l(r5, r1)
            java.lang.String r1 = "Common_TempFolder"
            r4.l(r1, r3)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r2)
            java.lang.String r3 = "Avatar_HdFlag"
            r4.l(r3, r1)
            java.lang.String r1 = "Avatar_Username"
            r4.l(r1, r9)
            g75.k r1 = g75.r.f269391p
            java.lang.String r9 = r8.Vi()
            r5 = 30000(0x7530, double:1.4822E-319)
            r7.f282464f = r2
            r2 = r10
            r3 = r4
            r4 = r9
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r7)
            if (r10 != r0) goto Lbe
            return r0
        Lbe:
            g75.x r10 = (g75.x) r10
            g75.z r9 = r10.f269405b
            java.lang.String r10 = "Avatar_HdImgPath"
            java.lang.String r0 = ""
            java.lang.String r9 = r9.j(r10, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hn1.s.hj(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.Object ij(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
        if (n07 == null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            byte[] s17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().s(str);
            if (s17 != null) {
                com.tencent.mm.protobuf.f parseFrom = new r45.tn4().parseFrom(s17);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModContact");
                n07 = com.tencent.mm.modelavatar.g.e(str, (r45.tn4) parseFrom, n17);
            }
        }
        if (n07 != null) {
            return n07.c();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mj(java.lang.String r11, java.lang.String r12, float r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn1.s.mj(java.lang.String, java.lang.String, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object nj(java.lang.String r11, java.lang.String r12, float r13, java.util.Map r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn1.s.nj(java.lang.String, java.lang.String, float, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.Object oj(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
        if (n07 == null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            byte[] s17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().s(str);
            if (s17 != null) {
                com.tencent.mm.protobuf.f parseFrom = new r45.tn4().parseFrom(s17);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModContact");
                n07 = com.tencent.mm.modelavatar.g.e(str, (r45.tn4) parseFrom, n17);
            }
        }
        if (n07 != null) {
            return n07.d();
        }
        return null;
    }

    public void pj(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return;
        }
        com.tencent.mm.modelavatar.d1.Ai().getClass();
        com.tencent.mm.modelavatar.z.f70577d.f70422a.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object qj(java.lang.String r11, java.lang.String r12, float r13, java.util.Map r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn1.s.qj(java.lang.String, java.lang.String, float, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void rj(java.lang.String str, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        if (str == null || r26.n0.N(str)) {
            return;
        }
        com.tencent.mm.modelavatar.d1.Ai().s(str, bitmap);
    }

    public void wi(hn1.z callbackApi) {
        kotlin.jvm.internal.o.g(callbackApi, "callbackApi");
        pm0.v.O("notifyAvatarCallback", new hn1.h(this, callbackApi));
    }
}
