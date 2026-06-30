package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public class f extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b implements ev3.d {

    /* renamed from: h, reason: collision with root package name */
    public final int f156218h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f156219i;

    /* renamed from: m, reason: collision with root package name */
    public final sv3.a f156220m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f156221n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f156222o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e f156223p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status, int i17) {
        super(parent, status);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f156218h = i17;
        this.f156219i = "MicroMsg.MusicCallbackComponent";
        this.f156220m = new sv3.a(0, null, 3, null);
        this.f156221n = new java.util.LinkedHashMap();
        this.f156223p = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e(this);
    }

    public static void v(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f fVar, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar;
        java.util.ArrayList<wt3.h> arrayList;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onToggleLyricsCallback");
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        fVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onToggleLyricsCallback: ");
        sb6.append(z17);
        sb6.append(", currentMusicKey:");
        sv3.a aVar2 = fVar.f156220m;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = aVar2.f413388b;
        sb6.append(audioCacheInfo != null ? audioCacheInfo.a() : null);
        com.tencent.mars.xlog.Log.i(fVar.f156219i, sb6.toString());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar3 = fVar.f156222o;
        if (aVar3 != null) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = aVar2.f413388b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (audioCacheInfo2 != null && (arrayList = audioCacheInfo2.f155713g) != null) {
                for (wt3.h hVar : arrayList) {
                    r45.ge4 ge4Var = new r45.ge4();
                    ge4Var.f375167d = hVar.f449421a;
                    ge4Var.f375168e = hVar.f449422b;
                    arrayList2.add(ge4Var);
                }
            }
            aVar3.c(z17, arrayList2);
        }
        if (z18 && (aVar = fVar.f156222o) != null) {
            aVar.toggleLyrics(z17);
        }
        if (z17 && z19) {
            fVar.s(aVar2.f413388b, aVar2.f413387a);
        }
    }

    @Override // ev3.d
    public void a() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = this.f156222o;
        if (aVar != null) {
            aVar.a();
        }
        sv3.a aVar2 = this.f156220m;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = aVar2.f413388b;
        if (audioCacheInfo == null) {
            return;
        }
        int i17 = aVar2.f413387a;
        java.lang.String a17 = audioCacheInfo.a();
        java.util.Iterator it = o(audioCacheInfo, i17).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f156221n).get(java.lang.Integer.valueOf(intValue));
            if (cVar != null) {
                cVar.S(intValue, a17);
            }
        }
    }

    @Override // ev3.d
    public void c(int i17, ev3.c cVar) {
        this.f156221n.put(java.lang.Integer.valueOf(i17), cVar);
    }

    @Override // ev3.d
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo d() {
        return this.f156220m.f413388b;
    }

    @Override // ev3.d
    public com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f() {
        return this.f156222o;
    }

    @Override // ev3.d
    public void g() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = this.f156222o;
        if (aVar != null) {
            aVar.s(false, null);
        }
        t(null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // ev3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r8, int r9, android.view.View r10, boolean r11, boolean r12, android.os.Bundle r13) {
        /*
            r7 = this;
            if (r8 == 0) goto L37
            int r0 = r8.f155719p
            if (r0 > 0) goto L7
            goto L37
        L7:
            com.tencent.mm.plugin.vlog.model.h0 r0 = com.tencent.mm.plugin.vlog.model.j0.f175632a
            r0.getClass()
            r0 = 1
            if (r9 == r0) goto L28
            r0 = 2
            if (r9 == r0) goto L25
            r0 = 3
            if (r9 == r0) goto L22
            r0 = 14
            if (r9 == r0) goto L1f
            switch(r9) {
                case 7: goto L28;
                case 8: goto L28;
                case 9: goto L25;
                case 10: goto L22;
                default: goto L1c;
            }
        L1c:
            java.lang.String r9 = ""
            goto L2a
        L1f:
            java.lang.String r9 = "recently_played"
            goto L2a
        L22:
            java.lang.String r9 = "search"
            goto L2a
        L25:
            java.lang.String r9 = "like"
            goto L2a
        L28:
            java.lang.String r9 = "recommend"
        L2a:
            r2 = r9
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$a r0 = r7.f156222o
            if (r0 == 0) goto L37
            r1 = r8
            r3 = r10
            r4 = r12
            r5 = r11
            r6 = r13
            r0.k(r1, r2, r3, r4, r5, r6)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f.k(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, int, android.view.View, boolean, boolean, android.os.Bundle):void");
    }

    @Override // ev3.d
    public void l(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18, boolean z19) {
        if (z17) {
            if (audioCacheInfo != null) {
                y(i17, audioCacheInfo, z18);
                wv3.b.f450048a.c(audioCacheInfo, z19, i17);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSelectMusic: false, same=");
        sv3.a aVar = this.f156220m;
        sb6.append(kotlin.jvm.internal.o.b(aVar.f413388b, audioCacheInfo));
        com.tencent.mars.xlog.Log.i(this.f156219i, sb6.toString());
        if (audioCacheInfo == null || !kotlin.jvm.internal.o.b(aVar.f413388b, audioCacheInfo)) {
            return;
        }
        t(null, false);
        t(aVar.f413388b, false);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_boolean", true);
        this.f266982d.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156253p, bundle);
    }

    public java.util.List o(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, int i17) {
        boolean z17 = true;
        java.util.List k17 = kz5.c0.k(java.lang.Integer.valueOf(i17));
        int i18 = this.f156218h;
        if (i17 != i18) {
            k17.add(java.lang.Integer.valueOf(i18));
        } else {
            java.lang.Integer valueOf = audioCacheInfo != null ? java.lang.Integer.valueOf(audioCacheInfo.f155719p) : null;
            if (valueOf != null && valueOf.intValue() == 10) {
                k17.add(2);
            } else if (valueOf != null && valueOf.intValue() == 11) {
                k17.add(3);
            } else if (valueOf != null && valueOf.intValue() == 12) {
                k17.add(9);
            } else {
                if ((valueOf == null || valueOf.intValue() != 13) && (valueOf == null || valueOf.intValue() != 14)) {
                    z17 = false;
                }
                if (z17) {
                    k17.add(10);
                }
            }
        }
        return k17;
    }

    public boolean q(int i17) {
        return false;
    }

    public final void r(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, int i17) {
        java.lang.String a17;
        if (audioCacheInfo == null || (a17 = audioCacheInfo.a()) == null) {
            return;
        }
        java.util.Iterator it = o(audioCacheInfo, i17).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f156221n).get(java.lang.Integer.valueOf(intValue));
            if (cVar != null) {
                cVar.J(intValue, a17);
            }
        }
    }

    public final void s(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, int i17) {
        java.lang.String a17;
        if (audioCacheInfo == null || (a17 = audioCacheInfo.a()) == null) {
            return;
        }
        java.util.Iterator it = o(audioCacheInfo, i17).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f156221n).get(java.lang.Integer.valueOf(intValue));
            if (cVar != null) {
                cVar.y(intValue, a17);
            }
        }
    }

    public void t(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2;
        java.lang.String a17;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo3;
        java.lang.String a18;
        sv3.a aVar = this.f156220m;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo4 = aVar.f413388b;
        java.lang.String a19 = audioCacheInfo != null ? audioCacheInfo.a() : null;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo5 = aVar.f413388b;
        kotlin.jvm.internal.o.b(a19, audioCacheInfo5 != null ? audioCacheInfo5.a() : null);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar2 = this.f156222o;
        if (aVar2 != null) {
            aVar2.m(audioCacheInfo);
        }
        int i17 = aVar.f413387a;
        java.util.Map map = this.f156221n;
        if (audioCacheInfo == null && (audioCacheInfo3 = aVar.f413388b) != null && audioCacheInfo3 != null && (a18 = audioCacheInfo3.a()) != null) {
            java.util.Iterator it = o(audioCacheInfo3, i17).iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(intValue));
                if (cVar != null) {
                    cVar.S(intValue, a18);
                }
            }
        }
        if (audioCacheInfo != null) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo6 = aVar.f413388b;
            if (kotlin.jvm.internal.o.b(audioCacheInfo6 != null ? audioCacheInfo6.a() : null, audioCacheInfo.a())) {
                s(aVar.f413388b, i17);
            }
        }
        if (!z17 || audioCacheInfo != null || (audioCacheInfo2 = aVar.f413388b) == null || (a17 = audioCacheInfo2.a()) == null) {
            return;
        }
        java.util.Iterator it6 = o(audioCacheInfo2, i17).iterator();
        while (it6.hasNext()) {
            int intValue2 = ((java.lang.Number) it6.next()).intValue();
            ev3.c cVar2 = (ev3.c) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(intValue2));
            if (cVar2 != null) {
                cVar2.K(intValue2, a17);
            }
        }
    }

    public void u() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = this.f156222o;
        if (aVar != null) {
            aVar.q(null);
        }
    }

    public ev3.d w() {
        return this;
    }

    public final void x(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        boolean z17 = false;
        if (audioCacheInfo != null && audioCacheInfo.f155721r) {
            java.util.ArrayList arrayList = audioCacheInfo.f155713g;
            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                z17 = true;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_boolean", z17);
        this.f266982d.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156254q, bundle);
    }

    public void y(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17) {
        sv3.a aVar = this.f156220m;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = aVar.f413388b;
        if (!kotlin.jvm.internal.o.b(audioCacheInfo2 != null ? audioCacheInfo2.a() : null, audioCacheInfo != null ? audioCacheInfo.a() : null)) {
            r(aVar.f413388b, aVar.f413387a);
        }
        int i18 = this.f156218h;
        if (i17 != i18 && !q(i17)) {
            ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f156221n).get(java.lang.Integer.valueOf(i18));
            if (cVar != null) {
                cVar.o(i17, audioCacheInfo, z17, true, i18, true);
            }
        }
        z(i17, audioCacheInfo);
        t(aVar.f413388b, false);
        x(audioCacheInfo);
    }

    public final void z(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCurrentSelectDataOnAudioSelect「");
        sb6.append(audioCacheInfo != null ? audioCacheInfo.f155723t : null);
        sb6.append("」, ");
        sb6.append(audioCacheInfo != null ? audioCacheInfo.a() : null);
        com.tencent.mars.xlog.Log.i(this.f156219i, sb6.toString());
        sv3.a aVar = this.f156220m;
        aVar.f413388b = audioCacheInfo;
        aVar.f413387a = i17;
    }
}
