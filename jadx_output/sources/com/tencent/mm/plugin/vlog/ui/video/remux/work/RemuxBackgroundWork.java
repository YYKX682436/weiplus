package com.tencent.mm.plugin.vlog.ui.video.remux.work;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/remux/work/RemuxBackgroundWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemuxBackgroundWork extends androidx.work.CoroutineWorker {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f176108o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemuxBackgroundWork(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(workerParameters, "workerParameters");
        this.f176108o = "MicroMsg.RemuxBackgroundWork";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jz5.l i(com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork r2, java.lang.String r3) {
        /*
            if (r3 == 0) goto Le
            r2.getClass()
            int r0 = r3.length()
            if (r0 != 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            java.lang.String r2 = r2.f176108o
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r3 = "before start work, workTagId is 0"
            com.tencent.mars.xlog.Log.e(r2, r3)
            jz5.l r2 = new jz5.l
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.<init>(r3, r1)
            goto L42
        L21:
            zp4.e r0 = zp4.e.f474954a
            dm.q0 r0 = r0.d(r3)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "no find work in db >> "
            java.lang.String r3 = r0.concat(r3)
            com.tencent.mars.xlog.Log.e(r2, r3)
            jz5.l r2 = new jz5.l
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.<init>(r3, r1)
            goto L42
        L3b:
            jz5.l r2 = new jz5.l
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.<init>(r3, r0)
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork.i(com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork, java.lang.String):jz5.l");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0184, code lost:
    
        if (r1 != 4009) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork r36, int r37, int r38, java.lang.String r39, dm.q0 r40) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork.j(com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork, int, int, java.lang.String, dm.q0):void");
    }

    public static final com.tencent.mm.modelcontrol.VideoTransPara k(com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork remuxBackgroundWork, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(remuxBackgroundWork.f176108o, "getVideoParamFromByte");
        android.os.Parcel obtain = android.os.Parcel.obtain();
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        com.tencent.mm.modelcontrol.VideoTransPara createFromParcel = com.tencent.mm.modelcontrol.VideoTransPara.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        kotlin.jvm.internal.o.d(createFromParcel);
        return createFromParcel;
    }

    @Override // androidx.work.CoroutineWorker
    public java.lang.Object h(kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new aq4.e(this, null), continuation);
    }
}
