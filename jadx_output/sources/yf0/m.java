package yf0;

/* loaded from: classes12.dex */
public final class m implements wf0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final zf0.v0 f461586a;

    /* renamed from: b, reason: collision with root package name */
    public final yf0.j f461587b;

    /* renamed from: c, reason: collision with root package name */
    public final yf0.i f461588c;

    public m(zf0.v0 sendVideoTask) {
        kotlin.jvm.internal.o.g(sendVideoTask, "sendVideoTask");
        this.f461586a = sendVideoTask;
        this.f461587b = new yf0.j(this);
        this.f461588c = new yf0.i(this);
    }

    @Override // wf0.a2
    public boolean a(boolean z17, oi3.h videoMsgInfo, y15.d videoMsg) {
        kotlin.jvm.internal.o.g(videoMsgInfo, "videoMsgInfo");
        kotlin.jvm.internal.o.g(videoMsg, "videoMsg");
        if (z17) {
            y15.c n17 = videoMsg.n();
            if (com.tencent.mm.sdk.platformtools.t8.K0(n17.getString(n17.f458922d + 23))) {
                return false;
            }
        } else {
            y15.c n18 = videoMsg.n();
            if (com.tencent.mm.sdk.platformtools.t8.K0(n18.getString(n18.f458922d + 1))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0508 A[LOOP:0: B:36:0x0502->B:38:0x0508, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // wf0.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(boolean r23, boolean r24, java.lang.String r25, oi3.h r26, java.util.Map r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf0.m.b(boolean, boolean, java.lang.String, oi3.h, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    @Override // wf0.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(boolean r23, oi3.h r24, java.util.Map r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf0.m.c(boolean, oi3.h, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dn.m d(t21.v2 r5, boolean r6, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf0.m.d(t21.v2, boolean, java.lang.String, java.lang.String, boolean, java.lang.String):dn.m");
    }

    public final java.lang.String e() {
        return "{" + this.f461586a.id() + "}__{" + hashCode() + '}';
    }

    public java.lang.String f() {
        return "MicroMsg.VideoMsg.VideoCdnSendApi\"" + this.f461586a.id() + '\"';
    }
}
