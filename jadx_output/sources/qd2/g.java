package qd2;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f361727a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f361728b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f361729c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f361730d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f361731e;

    /* renamed from: f, reason: collision with root package name */
    public wt3.h0 f361732f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f361733g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f361734h;

    /* renamed from: i, reason: collision with root package name */
    public dn.m f361735i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f361736j;

    public g(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, yz5.p doPostCallback) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(doPostCallback, "doPostCallback");
        this.f361727a = activity;
        this.f361728b = finderItem;
        this.f361729c = doPostCallback;
        this.f361734h = jz5.h.b(qd2.f.f361723d);
        this.f361736j = new qd2.a(this);
        activity.mo133getLifecycle().a(new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.finder.helper.FinderAudioExtractor$1
            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                kotlin.jvm.internal.o.g(source, "source");
                kotlin.jvm.internal.o.g(event, "event");
                if (event == androidx.lifecycle.m.ON_DESTROY) {
                    qd2.g gVar = qd2.g.this;
                    dn.m mVar = gVar.f361735i;
                    if (mVar != null) {
                        c50.y0 y0Var = (c50.y0) ((jz5.n) gVar.f361734h).getValue();
                        java.lang.String field_mediaId = mVar.field_mediaId;
                        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                        ((mn2.q0) y0Var).c(field_mediaId);
                    }
                    pm0.v.C(gVar.f361736j);
                }
            }
        });
    }

    public final java.lang.String a() {
        java.lang.String str = this.f361733g;
        if (str != null) {
            return str;
        }
        wt3.h0 h0Var = this.f361732f;
        java.lang.String str2 = h0Var != null ? ((com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) h0Var).f155715i : null;
        return str2 == null ? "" : str2;
    }

    public final boolean b(java.lang.String str) {
        return o35.a.b(str) && o35.a.g(str) > 0;
    }

    public final void c(boolean z17) {
        java.lang.String a17 = a();
        if (z17 && b(a17)) {
            try {
                i95.m c17 = i95.n0.c(m40.k0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((c61.p7) ((m40.k0) c17)).fj(a17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("FinderAudioExtractor", "[onResult] insertOrUpdateMusicDownloaded fail:" + th6.getMessage());
            }
        }
        pm0.v.X(new qd2.d(this, z17, a17));
    }

    public final void d(r45.zi2 zi2Var) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f361728b;
        if (finderItem == null) {
            com.tencent.mars.xlog.Log.e("FinderAudioExtractor", "preloadAudioFile: feed is null");
            return;
        }
        if (finderItem.getMediaType() == 4) {
            com.tencent.mm.protocal.protobuf.FinderObject feedObject = finderItem.getFeedObject();
            long id6 = feedObject.getId();
            java.lang.String u17 = pm0.v.u(id6);
            i95.m c17 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String aj6 = ((qs2.q) ((w40.e) c17)).aj(id6);
            if (!b(aj6)) {
                this.f361735i = c50.y0.a((c50.y0) ((jz5.n) this.f361734h).getValue(), feedObject, 0, null, new qd2.c(u17, this), 6, null);
                return;
            }
            this.f361733g = aj6;
            this.f361730d = true;
            java.lang.String str = this.f361733g;
            if (str != null) {
                if (!(str.length() == 0)) {
                    r4 = true;
                }
            }
            c(r4);
            com.tencent.mars.xlog.Log.i("FinderAudioExtractor", "[downloadVideo] audio existed feedId:" + u17 + " destPath:" + aj6);
            return;
        }
        if (zi2Var == null) {
            com.tencent.mars.xlog.Log.e("FinderAudioExtractor", "preloadAudioFile: musicInfo is null");
            return;
        }
        java.lang.String string = zi2Var.getString(5);
        if (string == null || string.length() == 0) {
            this.f361732f = null;
            this.f361730d = true;
            pm0.v.X(new qd2.e(this));
            com.tencent.mars.xlog.Log.i("FinderAudioExtractor", "[downloadImgBgm] music url is null");
            return;
        }
        ((pc0.k2) ((qc0.i1) i95.n0.c(qc0.i1.class))).getClass();
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
        audioCacheInfo.f155711e = (int) java.lang.System.currentTimeMillis();
        audioCacheInfo.f155712f = zi2Var.getString(5);
        audioCacheInfo.f155715i = com.tencent.mm.plugin.finder.assist.e9.f102132a.c(zi2Var);
        this.f361732f = audioCacheInfo;
        com.tencent.mars.xlog.Log.i("FinderAudioExtractor", "[downloadImgBgm] musicUrl=" + audioCacheInfo.f155712f + " path=" + audioCacheInfo.f155715i + " downloadFinish=" + this.f361730d);
        ((pc0.k2) ((qc0.i1) i95.n0.c(qc0.i1.class))).wi(this.f361727a, audioCacheInfo, new qd2.b(this, audioCacheInfo));
    }

    public final boolean e(android.content.Context context) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f361730d) {
            return false;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f361731e;
        if (u3Var2 == null) {
            this.f361731e = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.cxo), true, 2, null);
        } else {
            if ((u3Var2.isShowing() ? false : true) && (u3Var = this.f361731e) != null) {
                u3Var.show();
            }
        }
        pm0.v.C(this.f361736j);
        pm0.v.U(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.W7).getValue()).r()).longValue() * 1000, this.f361736j);
        return true;
    }
}
