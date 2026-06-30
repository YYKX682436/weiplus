package gq5;

/* loaded from: classes5.dex */
public final class i extends gq5.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f274628m;

    /* renamed from: n, reason: collision with root package name */
    public long f274629n;

    /* renamed from: o, reason: collision with root package name */
    public long f274630o;

    /* renamed from: p, reason: collision with root package name */
    public int f274631p;

    /* renamed from: q, reason: collision with root package name */
    public r45.y77 f274632q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.vfs.r6 f274633r;

    /* renamed from: s, reason: collision with root package name */
    public java.io.OutputStream f274634s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f274635t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f274636u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f274628m = "MicroMsg.WeDrop.WeDropReceiveUIC";
        this.f274631p = -1;
        this.f274636u = jz5.h.b(gq5.h.f274627d);
    }

    @Override // gq5.e
    public java.lang.String T6() {
        return this.f274628m;
    }

    @Override // gq5.e
    public int U6() {
        aq5.a aVar;
        aq5.p0 p0Var = aq5.p0.f13273a;
        aq5.q0 callback = (aq5.q0) ((jz5.n) this.f274624i).getValue();
        kotlin.jvm.internal.o.g(callback, "callback");
        aq5.f fVar = aq5.p0.f13274b;
        if (fVar != null) {
            fVar.f13234d = callback;
        }
        if (fVar == null || (aVar = fVar.f13233c) == null) {
            aVar = aq5.a.f13217f;
        }
        com.tencent.mars.xlog.Log.i(this.f274628m, "init() called f2fStatus:" + aVar);
        return aVar.ordinal() != 0 ? 2 : 6;
    }

    @Override // gq5.e
    public void V6() {
        android.view.Window window;
        android.view.View decorView;
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.i(6));
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.performHapticFeedback(3);
            return;
        }
        android.os.VibrationEffect createPredefined = android.os.VibrationEffect.createPredefined(5);
        kotlin.jvm.internal.o.f(createPredefined, "createPredefined(...)");
        java.lang.Object systemService = activity != null ? activity.getSystemService("vibrator") : null;
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(createPredefined);
        }
    }

    @Override // gq5.e
    public void W6(int i17) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.i(this.f274635t ? 12 : 4));
        }
    }

    @Override // gq5.e
    public void X6(r45.b87 prepareSendRequest, int i17) {
        android.view.Window window;
        android.view.View decorView;
        eq5.h hVar;
        kotlin.jvm.internal.o.g(prepareSendRequest, "prepareSendRequest");
        if (i17 == 1) {
            j75.f Q6 = Q6();
            eq5.h hVar2 = Q6 != null ? (eq5.h) Q6.getState() : null;
            if (hVar2 != null) {
                hVar2.f255921o = true;
            }
            this.f274635t = true;
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new eq5.i(12));
                return;
            }
            return;
        }
        this.f274629n = prepareSendRequest.f370636f;
        j75.f Q63 = Q6();
        java.util.LinkedList content_infos = prepareSendRequest.f370635e;
        if (Q63 != null && (hVar = (eq5.h) Q63.getState()) != null) {
            hVar.f255920n = this.f274629n;
            kotlin.jvm.internal.o.f(content_infos, "content_infos");
            java.util.Iterator it = content_infos.iterator();
            while (it.hasNext()) {
                int i18 = ((r45.y77) it.next()).f390843d;
                if (i18 == 0) {
                    hVar.f255917h++;
                } else if (i18 == 1) {
                    hVar.f255918i++;
                } else if (i18 == 2) {
                    hVar.f255919m++;
                }
            }
            com.tencent.mars.xlog.Log.i(this.f274628m, "imgCount:" + hVar.f255917h + ", videoCount:" + hVar.f255918i + ", fileCount:" + hVar.f255919m);
        }
        j75.f Q64 = Q6();
        if (Q64 != null) {
            kotlin.jvm.internal.o.f(content_infos, "content_infos");
            java.util.LinkedList thumbnails = prepareSendRequest.f370637g;
            kotlin.jvm.internal.o.f(thumbnails, "thumbnails");
            Q64.B3(new eq5.j(new aq5.x0(content_infos, thumbnails)));
        }
        j75.f Q65 = Q6();
        if (Q65 != null) {
            Q65.B3(new eq5.i(8));
        }
        this.f274635t = true;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.performHapticFeedback(3);
    }

    @Override // gq5.e
    public void Z6(int i17, byte[] data, r45.y77 fileInfo) {
        android.view.Window window;
        android.view.View decorView;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(fileInfo, "fileInfo");
        if (this.f274631p != i17) {
            b7();
            this.f274631p = i17;
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6((com.tencent.mm.vfs.r6) ((jz5.n) this.f274636u).getValue(), "file_" + i17);
            this.f274633r = r6Var;
            r6Var.k();
            this.f274634s = com.tencent.mm.vfs.w6.H(r6Var);
            this.f274632q = fileInfo;
        }
        java.io.OutputStream outputStream = this.f274634s;
        if (outputStream != null) {
            outputStream.write(data);
        }
        this.f274630o += data.length;
        java.lang.String str = "onReceive index:" + this.f274631p + " offset:" + this.f274630o + " totalLen:" + this.f274629n;
        java.lang.String str2 = this.f274628m;
        com.tencent.mars.xlog.Log.i(str2, str);
        long j17 = this.f274630o;
        long j18 = this.f274629n;
        if (j17 != j18) {
            int i18 = (int) ((j17 * 100) / j18);
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new eq5.e(i18));
                return;
            }
            return;
        }
        b7();
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.B3(new eq5.i(10));
        }
        com.tencent.mars.xlog.Log.i(str2, "all file receive success, totalLen:" + this.f274629n);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.performHapticFeedback(3);
            return;
        }
        android.os.VibrationEffect createPredefined = android.os.VibrationEffect.createPredefined(0);
        kotlin.jvm.internal.o.f(createPredefined, "createPredefined(...)");
        java.lang.Object systemService = activity != null ? activity.getSystemService("vibrator") : null;
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(createPredefined);
        }
    }

    public final void b7() {
        java.lang.String o17;
        java.lang.String o18;
        java.lang.String o19;
        r45.y77 y77Var = this.f274632q;
        if (y77Var != null) {
            java.lang.String str = "exportFile index:" + this.f274631p + " type:" + y77Var.f390843d + ", name:" + y77Var.f390845f.f369832d;
            java.lang.String str2 = this.f274628m;
            com.tencent.mars.xlog.Log.i(str2, str);
            int i17 = y77Var.f390843d;
            java.lang.String str3 = "";
            if (i17 == 0) {
                zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                android.app.Activity context = getContext();
                com.tencent.mm.vfs.r6 r6Var = this.f274633r;
                if (r6Var != null && (o17 = r6Var.o()) != null) {
                    str3 = o17;
                }
                com.tencent.mm.vfs.r6 r6Var2 = this.f274633r;
                gq5.f fVar = new gq5.f(r6Var2 != null ? r6Var2.o() : null);
                ((yb0.g) b0Var).getClass();
                java.util.concurrent.Executor executor = com.tencent.mm.platformtools.ExportFileUtil.f72401a;
                com.tencent.mars.xlog.Log.i("MicroMsg.ExportFileUtil", "[+] Called exportImage, src: %s", str3);
                com.tencent.mm.platformtools.ExportFileUtil.c(context, str3, null, true, fVar);
            } else if (i17 == 1) {
                zb0.b0 b0Var2 = (zb0.b0) i95.n0.c(zb0.b0.class);
                android.app.Activity context2 = getContext();
                com.tencent.mm.vfs.r6 r6Var3 = this.f274633r;
                if (r6Var3 != null && (o18 = r6Var3.o()) != null) {
                    str3 = o18;
                }
                com.tencent.mm.vfs.r6 r6Var4 = this.f274633r;
                gq5.f fVar2 = new gq5.f(r6Var4 != null ? r6Var4.o() : null);
                ((yb0.g) b0Var2).getClass();
                com.tencent.mm.platformtools.ExportFileUtil.g(context2, str3, null, fVar2);
            } else if (i17 != 2) {
                com.tencent.mars.xlog.Log.e(str2, "exportFile: unknown type " + y77Var.f390843d);
            } else {
                zb0.b0 b0Var3 = (zb0.b0) i95.n0.c(zb0.b0.class);
                android.app.Activity context3 = getContext();
                com.tencent.mm.vfs.r6 r6Var5 = this.f274633r;
                if (r6Var5 != null && (o19 = r6Var5.o()) != null) {
                    str3 = o19;
                }
                java.lang.String str4 = y77Var.f390845f.f369832d;
                gq5.g gVar = new gq5.g(this);
                ((yb0.g) b0Var3).getClass();
                com.tencent.mm.platformtools.ExportFileUtil.e(context3, str3, str4, gVar);
            }
        }
        try {
            java.io.OutputStream outputStream = this.f274634s;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // gq5.e, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        jz5.g gVar = this.f274636u;
        if (((com.tencent.mm.vfs.r6) ((jz5.n) gVar).getValue()).m()) {
            ((com.tencent.mm.vfs.r6) ((jz5.n) gVar).getValue()).l();
        }
        ((com.tencent.mm.vfs.r6) ((jz5.n) gVar).getValue()).J();
    }

    @Override // gq5.e, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        try {
            java.io.OutputStream outputStream = this.f274634s;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
