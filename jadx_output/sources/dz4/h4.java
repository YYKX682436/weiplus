package dz4;

/* loaded from: classes12.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f245283a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f245284b;

    /* renamed from: c, reason: collision with root package name */
    public final int f245285c;

    /* renamed from: d, reason: collision with root package name */
    public final long f245286d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f245287e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f245288f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f245289g;

    public h4(ih0.p holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f245283a = holder;
        this.f245284b = "MicroMsg.WeNoteFlutterShareSnsHelper";
        this.f245285c = 20;
        this.f245286d = 1000L;
        this.f245288f = kotlinx.coroutines.z0.b();
    }

    public static final void a(dz4.h4 h4Var) {
        android.app.Activity activity;
        java.lang.ref.WeakReference weakReference = ((ez4.u) h4Var.f245283a).f257944c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            return;
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
        e4Var.f211776c = activity.getString(com.tencent.mm.R.string.j3u);
        e4Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00de -> B:11:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0093 -> B:26:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(dz4.h4 r8, long r9, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.h4.b(dz4.h4, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e(this.f245284b, "jumpSnsPostUI context null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((ku5.t0) ku5.t0.f312615d).B(new dz4.e4(this));
            com.tencent.mars.xlog.Log.e(this.f245284b, "jumpSnsPostUI: failed xml empty");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_type", 15);
        intent.putExtra("need_result", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = context.getString(com.tencent.mm.R.string.l_l);
            kotlin.jvm.internal.o.d(str3);
        } else {
            kotlin.jvm.internal.o.d(str3);
        }
        intent.putExtra("fav_note_xml", str);
        intent.putExtra("Ksnsupload_title", str3);
        intent.putExtra("Ksnsupload_link", com.tencent.mm.ui.v2.f211101a);
        intent.putExtra("fav_note_link_description", "note description");
        intent.putExtra("Ksnsupload_imgbuf", com.tencent.mm.vfs.w6.N(str2, 0, -1));
        j45.l.n(context, "sns", ".ui.SnsUploadUI", intent, 4359);
        com.tencent.mars.xlog.Log.i(this.f245284b, "jumpSnsPostUI called");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        if (r10 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(dz4.g r10, com.tencent.wechat.aff.wcrte.h r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.h4.d(dz4.g, com.tencent.wechat.aff.wcrte.h):void");
    }
}
