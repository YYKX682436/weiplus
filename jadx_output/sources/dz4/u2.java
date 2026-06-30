package dz4;

/* loaded from: classes12.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f245426a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f245427b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f245428c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f245429d;

    public u2(ih0.p holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f245426a = holder;
        this.f245428c = kotlinx.coroutines.z0.b();
    }

    public static final void a(dz4.u2 u2Var, android.app.Activity activity, java.lang.String str) {
        u2Var.getClass();
        try {
            ih0.p pVar = u2Var.f245426a;
            dz4.g2 g2Var = new dz4.g2(activity, pVar, ((ez4.u) pVar).f257942a, str, null);
            dz4.h2.f245280a.a(g2Var).a(g2Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterForwardChatHelper", "executeForward failed", e17);
            db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.cck));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00c5 -> B:11:0x00c8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0081 -> B:26:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(dz4.u2 r7, long r8, boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.u2.b(dz4.u2, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
